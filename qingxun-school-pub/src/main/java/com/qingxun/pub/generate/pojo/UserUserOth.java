package com.qingxun.pub.generate.pojo;

public class UserUserOth extends UserUserOthKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_user_oth.oth_phone
     *
     * @mbg.generated
     */
    private String othPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_user_oth.oth_suue
     *
     * @mbg.generated
     */
    private String othSuue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_user_oth.oth_school
     *
     * @mbg.generated
     */
    private String othSchool;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_user_oth.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_user_oth.oth_phone
     *
     * @return the value of user_user_oth.oth_phone
     *
     * @mbg.generated
     */
    public String getOthPhone() {
        return othPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_user_oth.oth_phone
     *
     * @param othPhone the value for user_user_oth.oth_phone
     *
     * @mbg.generated
     */
    public void setOthPhone(String othPhone) {
        this.othPhone = othPhone == null ? null : othPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_user_oth.oth_suue
     *
     * @return the value of user_user_oth.oth_suue
     *
     * @mbg.generated
     */
    public String getOthSuue() {
        return othSuue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_user_oth.oth_suue
     *
     * @param othSuue the value for user_user_oth.oth_suue
     *
     * @mbg.generated
     */
    public void setOthSuue(String othSuue) {
        this.othSuue = othSuue == null ? null : othSuue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_user_oth.oth_school
     *
     * @return the value of user_user_oth.oth_school
     *
     * @mbg.generated
     */
    public String getOthSchool() {
        return othSchool;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_user_oth.oth_school
     *
     * @param othSchool the value for user_user_oth.oth_school
     *
     * @mbg.generated
     */
    public void setOthSchool(String othSchool) {
        this.othSchool = othSchool == null ? null : othSchool.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_user_oth.user_id
     *
     * @return the value of user_user_oth.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_user_oth.user_id
     *
     * @param userId the value for user_user_oth.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}