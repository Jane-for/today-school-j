package com.qingxun.pub.generate.dao;

import com.qingxun.pub.generate.pojo.AppCarousel;
import com.qingxun.pub.generate.pojo.AppCarouselExample.Criteria;
import com.qingxun.pub.generate.pojo.AppCarouselExample.Criterion;
import com.qingxun.pub.generate.pojo.AppCarouselExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AppCarouselSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_carousel
     *
     * @mbg.generated
     */
    public String countByExample(AppCarouselExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("app_carousel");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_carousel
     *
     * @mbg.generated
     */
    public String deleteByExample(AppCarouselExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("app_carousel");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_carousel
     *
     * @mbg.generated
     */
    public String insertSelective(AppCarousel record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("app_carousel");
        
        if (record.getId() != null) {
            sql.VALUES("_id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getCarId() != null) {
            sql.VALUES("car_id", "#{carId,jdbcType=INTEGER}");
        }
        
        if (record.getCarImgurl() != null) {
            sql.VALUES("car_imgurl", "#{carImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getCarContent() != null) {
            sql.VALUES("car_content", "#{carContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCarActivity() != null) {
            sql.VALUES("car_activity", "#{carActivity,jdbcType=VARCHAR}");
        }
        
        if (record.getCarTime() != null) {
            sql.VALUES("car_time", "#{carTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_carousel
     *
     * @mbg.generated
     */
    public String selectByExample(AppCarouselExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("_id");
        } else {
            sql.SELECT("_id");
        }
        sql.SELECT("car_id");
        sql.SELECT("car_imgurl");
        sql.SELECT("car_content");
        sql.SELECT("car_activity");
        sql.SELECT("car_time");
        sql.FROM("app_carousel");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_carousel
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        AppCarousel record = (AppCarousel) parameter.get("record");
        AppCarouselExample example = (AppCarouselExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("app_carousel");
        
        if (record.getId() != null) {
            sql.SET("_id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCarId() != null) {
            sql.SET("car_id = #{record.carId,jdbcType=INTEGER}");
        }
        
        if (record.getCarImgurl() != null) {
            sql.SET("car_imgurl = #{record.carImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getCarContent() != null) {
            sql.SET("car_content = #{record.carContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCarActivity() != null) {
            sql.SET("car_activity = #{record.carActivity,jdbcType=VARCHAR}");
        }
        
        if (record.getCarTime() != null) {
            sql.SET("car_time = #{record.carTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_carousel
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("app_carousel");
        
        sql.SET("_id = #{record.id,jdbcType=INTEGER}");
        sql.SET("car_id = #{record.carId,jdbcType=INTEGER}");
        sql.SET("car_imgurl = #{record.carImgurl,jdbcType=VARCHAR}");
        sql.SET("car_content = #{record.carContent,jdbcType=VARCHAR}");
        sql.SET("car_activity = #{record.carActivity,jdbcType=VARCHAR}");
        sql.SET("car_time = #{record.carTime,jdbcType=TIMESTAMP}");
        
        AppCarouselExample example = (AppCarouselExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_carousel
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(AppCarousel record) {
        SQL sql = new SQL();
        sql.UPDATE("app_carousel");
        
        if (record.getCarImgurl() != null) {
            sql.SET("car_imgurl = #{carImgurl,jdbcType=VARCHAR}");
        }
        
        if (record.getCarContent() != null) {
            sql.SET("car_content = #{carContent,jdbcType=VARCHAR}");
        }
        
        if (record.getCarActivity() != null) {
            sql.SET("car_activity = #{carActivity,jdbcType=VARCHAR}");
        }
        
        if (record.getCarTime() != null) {
            sql.SET("car_time = #{carTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("_id = #{id,jdbcType=INTEGER}");
        sql.WHERE("car_id = #{carId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_carousel
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, AppCarouselExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}