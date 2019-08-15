package com.qingxun.app.userapi.token;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;

import com.qingxun.pub.generate.pojo.UserUser;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;


@Service
public class TokenService {

    /**
     * 获取生成的token
     * @param user
     * @return
     */
    public String getToken(UserUser user) {
        String token="";
        token= JWT.create().withAudience(user.getUserOpenid())
                .sign(Algorithm.HMAC256(user.getUserImgurl()));
        return token;
    }

    /**
     * 获取网络请求的token
     * @param httpServletRequest
     * @return
     */
    public String getUserToken(HttpServletRequest httpServletRequest){
        String token = httpServletRequest.getHeader("user_token");// 从 http 请求头中取出 token
        return token;
    }

    /**
     * 通过网络请求的token直接返回当前有效的操作者id
     * @param httpServletRequest
     * @return
     */
    public String getUserIdByToken(HttpServletRequest httpServletRequest){
        String userToken = getUserToken(httpServletRequest);
        String userId;
        try {
            userId = JWT.decode(userToken).getAudience().get(0);
        } catch (JWTDecodeException j) {
            throw new RuntimeException("401");
        }

        return userId;
    }
}
