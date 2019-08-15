package com.qingxun.app.userapi.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;


import com.auth0.jwt.interfaces.DecodedJWT;
import com.qingxun.pub.generate.dao.UserUserMapper;
import com.qingxun.pub.generate.pojo.UserUser;
import com.qingxun.pub.user.UserUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class AuthenticationInterceptor implements HandlerInterceptor {
    @Autowired
    UserUserDAO userStuDAO;

    @Autowired
    TokenService tokenService;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object object) throws Exception {
        String token = tokenService.getUserToken(httpServletRequest);
        // 如果不是映射到方法直接通过
        if (!(object instanceof HandlerMethod)) {
            return true;
        }
        HandlerMethod handlerMethod = (HandlerMethod) object;
        Method method = handlerMethod.getMethod();
        //检查是否有passtoken注释，有则跳过认证
        if (method.isAnnotationPresent(PassToken.class)) {
            PassToken passToken = method.getAnnotation(PassToken.class);
            if (passToken.required()) {
                return true;
            }
        }
        //检查有没有需要用户权限的注解
        if (method.isAnnotationPresent(UserLoginToken.class)) {
            UserLoginToken userLoginToken = method.getAnnotation(UserLoginToken.class);
            if (userLoginToken.required()) {
                // 执行认证
                if (token == null) {
                    throw new RuntimeException("无token");
                }
                // 获取 token 中的 user id
                String openid = tokenService.getUserIdByToken(httpServletRequest);
                UserUser user = userStuDAO.selectByPrimaryKey(openid);
                if (user == null) {
                    throw new RuntimeException("用户不存在");
                }
                System.out.println(user.getUserImgurl());

                // 验证 token
                JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(user.getUserImgurl())).build();


//               String token1= JWT.create().withAudience(user.getUserOpenid())
//                        .sign(Algorithm.HMAC256(user.getUserImgurl()));
                try {

//                System.out.println(token);
//                System.out.println(token1);
//                if (token.equals(token1)) {
//                    return true;
//                }else{
//                    throw new RuntimeException("失败");
//                }
                DecodedJWT verify = jwtVerifier.verify(token);
                System.out.println(verify.getClaims());
//
                } catch (JWTVerificationException e) {
                    throw new RuntimeException("401");
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest,
                           HttpServletResponse httpServletResponse,
                           Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest,
                                HttpServletResponse httpServletResponse,
                                Object o, Exception e) throws Exception {
    }
}