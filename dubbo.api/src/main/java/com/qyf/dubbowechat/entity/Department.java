package com.qyf.dubbowechat.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author lesso
 * @since 2018-05-31
 */
@TableName("department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 部门名称
     */
	@TableField("dept")
	private String dept;
    /**
     * 部门编号
     */
    @TableId("deptId")
	private String deptId;
    /**
     * 部门层级
     */
	@TableField("level")
	private Integer level;
    /**
     * 部门领导
     */
	@TableField("leader")
	private String leader;
    /**
     * 使用状态
     */
	@TableField("state")
	private Integer state;
    /**
     * 创建时间
     */
	@TableField("created")
	private String created;
    /**
     * 修改时间
     */
	@TableField("updated")
	private String updated;
    /**
     * 创建人
     */
	@TableField("creator")
	private String creator;
    /**
     * 修改人
     */
	@TableField("mender")
	private String mender;


	public String getDept() {
		return dept;
	}

	public Department setDept(String dept) {
		this.dept = dept;
		return this;
	}

	public String getDeptId() {
		return deptId;
	}

	public Department setDeptId(String deptId) {
		this.deptId = deptId;
		return this;
	}

	public Integer getLevel() {
		return level;
	}

	public Department setLevel(Integer level) {
		this.level = level;
		return this;
	}

	public String getLeader() {
		return leader;
	}

	public Department setLeader(String leader) {
		this.leader = leader;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public Department setState(Integer state) {
		this.state = state;
		return this;
	}

	public String getCreated() {
		return created;
	}

	public Department setCreated(String created) {
		this.created = created;
		return this;
	}

	public String getUpdated() {
		return updated;
	}

	public Department setUpdated(String updated) {
		this.updated = updated;
		return this;
	}

	public String getCreator() {
		return creator;
	}

	public Department setCreator(String creator) {
		this.creator = creator;
		return this;
	}

	public String getMender() {
		return mender;
	}

	public Department setMender(String mender) {
		this.mender = mender;
		return this;
	}

	@Override
	public String toString() {
		return "Department{" +
			", dept=" + dept +
			", deptId=" + deptId +
			", level=" + level +
			", leader=" + leader +
			", state=" + state +
			", created=" + created +
			", updated=" + updated +
			", creator=" + creator +
			", mender=" + mender +
			"}";
	}
}
