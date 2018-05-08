package com.qyf.dubbowechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author qyf
 * @since 2018-05-07
 */
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId("userid")
	private String userid;
    /**
     * 用户姓名
     */
	@TableField("name")
	private String name;
    /**
     * 年龄
     */
	@TableField("age")
	private Integer age;
    /**
     * 职位
     */
	@TableField("post")
	private String post;
    /**
     * 性别
     */
	@TableField("sex")
	private String sex;
    /**
     * 上级
     */
	@TableField("higher")
	private String higher;
    /**
     * 薪资
     */
	@TableField("salary")
	private Float salary;
    /**
     * 手机号
     */
	@TableField("phone")
	private String phone;
    /**
     * 邮箱
     */
	@TableField("email")
	private String email;
    /**
     * 部门编号
     */
	@TableField("deptid")
	private String deptid;
    /**
     * 角色编号
     */
	@TableField("rolesid")
	private String rolesid;
    /**
     * 状态，0表示使用，1表示停用
     */
	@TableField("state")
	private Integer state;


	public String getUserid() {
		return userid;
	}

	public User setUserid(String userid) {
		this.userid = userid;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getAge() {
		return age;
	}

	public User setAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getPost() {
		return post;
	}

	public User setPost(String post) {
		this.post = post;
		return this;
	}

	public String getSex() {
		return sex;
	}

	public User setSex(String sex) {
		this.sex = sex;
		return this;
	}

	public String getHigher() {
		return higher;
	}

	public User setHigher(String higher) {
		this.higher = higher;
		return this;
	}

	public Float getSalary() {
		return salary;
	}

	public User setSalary(Float salary) {
		this.salary = salary;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public User setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public User setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getRolesid() {
		return rolesid;
	}

	public User setRolesid(String rolesid) {
		this.rolesid = rolesid;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public User setState(Integer state) {
		this.state = state;
		return this;
	}

	@Override
	public String toString() {
		return "User{" +
			", userid=" + userid +
			", name=" + name +
			", age=" + age +
			", post=" + post +
			", sex=" + sex +
			", higher=" + higher +
			", salary=" + salary +
			", phone=" + phone +
			", email=" + email +
			", deptid=" + deptid +
			", rolesid=" + rolesid +
			", state=" + state +
			"}";
	}
}
