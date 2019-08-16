package com.qingxun.pub.generate.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserMerchantExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public UserMerchantExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNull() {
            addCriterion("mer_id is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("mer_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(Integer value) {
            addCriterion("mer_id =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(Integer value) {
            addCriterion("mer_id <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(Integer value) {
            addCriterion("mer_id >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mer_id >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(Integer value) {
            addCriterion("mer_id <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(Integer value) {
            addCriterion("mer_id <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<Integer> values) {
            addCriterion("mer_id in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<Integer> values) {
            addCriterion("mer_id not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(Integer value1, Integer value2) {
            addCriterion("mer_id between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mer_id not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNull() {
            addCriterion("mer_name is null");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNotNull() {
            addCriterion("mer_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEqualTo(String value) {
            addCriterion("mer_name =", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotEqualTo(String value) {
            addCriterion("mer_name <>", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThan(String value) {
            addCriterion("mer_name >", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("mer_name >=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThan(String value) {
            addCriterion("mer_name <", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThanOrEqualTo(String value) {
            addCriterion("mer_name <=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLike(String value) {
            addCriterion("mer_name like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotLike(String value) {
            addCriterion("mer_name not like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameIn(List<String> values) {
            addCriterion("mer_name in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotIn(List<String> values) {
            addCriterion("mer_name not in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameBetween(String value1, String value2) {
            addCriterion("mer_name between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotBetween(String value1, String value2) {
            addCriterion("mer_name not between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerInfoIsNull() {
            addCriterion("mer_info is null");
            return (Criteria) this;
        }

        public Criteria andMerInfoIsNotNull() {
            addCriterion("mer_info is not null");
            return (Criteria) this;
        }

        public Criteria andMerInfoEqualTo(String value) {
            addCriterion("mer_info =", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoNotEqualTo(String value) {
            addCriterion("mer_info <>", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoGreaterThan(String value) {
            addCriterion("mer_info >", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("mer_info >=", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoLessThan(String value) {
            addCriterion("mer_info <", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoLessThanOrEqualTo(String value) {
            addCriterion("mer_info <=", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoLike(String value) {
            addCriterion("mer_info like", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoNotLike(String value) {
            addCriterion("mer_info not like", value, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoIn(List<String> values) {
            addCriterion("mer_info in", values, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoNotIn(List<String> values) {
            addCriterion("mer_info not in", values, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoBetween(String value1, String value2) {
            addCriterion("mer_info between", value1, value2, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerInfoNotBetween(String value1, String value2) {
            addCriterion("mer_info not between", value1, value2, "merInfo");
            return (Criteria) this;
        }

        public Criteria andMerImgurlIsNull() {
            addCriterion("mer_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andMerImgurlIsNotNull() {
            addCriterion("mer_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andMerImgurlEqualTo(String value) {
            addCriterion("mer_imgurl =", value, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlNotEqualTo(String value) {
            addCriterion("mer_imgurl <>", value, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlGreaterThan(String value) {
            addCriterion("mer_imgurl >", value, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("mer_imgurl >=", value, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlLessThan(String value) {
            addCriterion("mer_imgurl <", value, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlLessThanOrEqualTo(String value) {
            addCriterion("mer_imgurl <=", value, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlLike(String value) {
            addCriterion("mer_imgurl like", value, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlNotLike(String value) {
            addCriterion("mer_imgurl not like", value, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlIn(List<String> values) {
            addCriterion("mer_imgurl in", values, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlNotIn(List<String> values) {
            addCriterion("mer_imgurl not in", values, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlBetween(String value1, String value2) {
            addCriterion("mer_imgurl between", value1, value2, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerImgurlNotBetween(String value1, String value2) {
            addCriterion("mer_imgurl not between", value1, value2, "merImgurl");
            return (Criteria) this;
        }

        public Criteria andMerSturtsIsNull() {
            addCriterion("mer_sturts is null");
            return (Criteria) this;
        }

        public Criteria andMerSturtsIsNotNull() {
            addCriterion("mer_sturts is not null");
            return (Criteria) this;
        }

        public Criteria andMerSturtsEqualTo(Integer value) {
            addCriterion("mer_sturts =", value, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsNotEqualTo(Integer value) {
            addCriterion("mer_sturts <>", value, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsGreaterThan(Integer value) {
            addCriterion("mer_sturts >", value, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsGreaterThanOrEqualTo(Integer value) {
            addCriterion("mer_sturts >=", value, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsLessThan(Integer value) {
            addCriterion("mer_sturts <", value, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsLessThanOrEqualTo(Integer value) {
            addCriterion("mer_sturts <=", value, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsIn(List<Integer> values) {
            addCriterion("mer_sturts in", values, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsNotIn(List<Integer> values) {
            addCriterion("mer_sturts not in", values, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsBetween(Integer value1, Integer value2) {
            addCriterion("mer_sturts between", value1, value2, "merSturts");
            return (Criteria) this;
        }

        public Criteria andMerSturtsNotBetween(Integer value1, Integer value2) {
            addCriterion("mer_sturts not between", value1, value2, "merSturts");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_merchant
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_merchant
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}