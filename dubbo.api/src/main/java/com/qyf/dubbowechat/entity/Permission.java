package com.qyf.dubbowechat.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 角色权限表
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@TableName("permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("pid")
	private String pid;
    /**
     * 角色编号
     */
	@TableField("roleid")
	private String roleid;
    /**
     * 用户id
     */
	@TableField("userid")
	private String userid;
    /**
     * 用户名字
     */
	@TableField("uname")
	private String uname;
    /**
     * 部门id
     */
	@TableField("deptId")
	private String deptId;
    /**
     * 部门名称
     */
	@TableField("dept")
	private String dept;


	public String getPid() {
		return pid;
	}

	public Permission setPid(String pid) {
		this.pid = pid;
		return this;
	}

	public String getRoleid() {
		return roleid;
	}

	public Permission setRoleid(String roleid) {
		this.roleid = roleid;
		return this;
	}

	public String getUserid() {
		return userid;
	}

	public Permission setUserid(String userid) {
		this.userid = userid;
		return this;
	}

	public String getUname() {
		return uname;
	}

	public Permission setUname(String uname) {
		this.uname = uname;
		return this;
	}

	public String getDeptId() {
		return deptId;
	}

	public Permission setDeptId(String deptId) {
		this.deptId = deptId;
		return this;
	}

	public String getDept() {
		return dept;
	}

	public Permission setDept(String dept) {
		this.dept = dept;
		return this;
	}

	@Override
	public String toString() {
		return "Permission{" +
			", pid=" + pid +
			", roleid=" + roleid +
			", userid=" + userid +
			", uname=" + uname +
			", deptId=" + deptId +
			", dept=" + dept +
			"}";
	}
}
