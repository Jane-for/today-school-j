package com.qingxun.pub.generate.pojo;

public class CommodityType1 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_type1._id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_type1.type1_id
     *
     * @mbg.generated
     */
    private Integer type1Id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_type1.mer_id
     *
     * @mbg.generated
     */
    private Integer merId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column commodity_type1.type1_name
     *
     * @mbg.generated
     */
    private String type1Name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_type1._id
     *
     * @return the value of commodity_type1._id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_type1._id
     *
     * @param id the value for commodity_type1._id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_type1.type1_id
     *
     * @return the value of commodity_type1.type1_id
     *
     * @mbg.generated
     */
    public Integer getType1Id() {
        return type1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_type1.type1_id
     *
     * @param type1Id the value for commodity_type1.type1_id
     *
     * @mbg.generated
     */
    public void setType1Id(Integer type1Id) {
        this.type1Id = type1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_type1.mer_id
     *
     * @return the value of commodity_type1.mer_id
     *
     * @mbg.generated
     */
    public Integer getMerId() {
        return merId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_type1.mer_id
     *
     * @param merId the value for commodity_type1.mer_id
     *
     * @mbg.generated
     */
    public void setMerId(Integer merId) {
        this.merId = merId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commodity_type1.type1_name
     *
     * @return the value of commodity_type1.type1_name
     *
     * @mbg.generated
     */
    public String getType1Name() {
        return type1Name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commodity_type1.type1_name
     *
     * @param type1Name the value for commodity_type1.type1_name
     *
     * @mbg.generated
     */
    public void setType1Name(String type1Name) {
        this.type1Name = type1Name == null ? null : type1Name.trim();
    }
}