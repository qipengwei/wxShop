package com.hcsp.wxshop.generate;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.id
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.name
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.tel
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.avatar_url
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.create_at
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER.update_at
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    private Date updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.id
     *
     * @return the value of USER.id
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.id
     *
     * @param id the value for USER.id
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.name
     *
     * @return the value of USER.name
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.name
     *
     * @param name the value for USER.name
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.tel
     *
     * @return the value of USER.tel
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.tel
     *
     * @param tel the value for USER.tel
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.avatar_url
     *
     * @return the value of USER.avatar_url
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.avatar_url
     *
     * @param avatarUrl the value for USER.avatar_url
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.create_at
     *
     * @return the value of USER.create_at
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.create_at
     *
     * @param createAt the value for USER.create_at
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER.update_at
     *
     * @return the value of USER.update_at
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER.update_at
     *
     * @param updateAt the value for USER.update_at
     *
     * @mbg.generated Fri Feb 12 21:14:31 CST 2021
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}