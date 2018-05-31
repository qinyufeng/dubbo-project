package com.qyf.dubbowechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 离职申请表
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@TableName("quit")
public class Quit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 离职申请单号
     */
    @TableId("numid")
	private String numid;
    /**
     * 申请日期
     */
	@TableField("applydate")
	private String applydate;
    /**
     * 申请人
     */
	@TableField("applyuser")
	private String applyuser;
	@TableField("name")
	private String name;
	@TableField("deptid")
	private String deptid;
	@TableField("deptopinion")
	private String deptopinion;
	@TableField("hropinion")
	private String hropinion;
    /**
     * 状态，0:待部门审批；1部门已审批，待人事审批；2人事已审批
     */
	@TableField("state")
	private Integer state;
    /**
     * 流程编号
     */
	@TableField("processid")
	private String processid;
    /**
     * 流程名称
     */
	@TableField("processname")
	private String processname;


	public String getNumid() {
		return numid;
	}

	public Quit setNumid(String numid) {
		this.numid = numid;
		return this;
	}

	public String getApplydate() {
		return applydate;
	}

	public Quit setApplydate(String applydate) {
		this.applydate = applydate;
		return this;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public Quit setApplyuser(String applyuser) {
		this.applyuser = applyuser;
		return this;
	}

	public String getName() {
		return name;
	}

	public Quit setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public Quit setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getDeptopinion() {
		return deptopinion;
	}

	public Quit setDeptopinion(String deptopinion) {
		this.deptopinion = deptopinion;
		return this;
	}

	public String getHropinion() {
		return hropinion;
	}

	public Quit setHropinion(String hropinion) {
		this.hropinion = hropinion;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public Quit setState(Integer state) {
		this.state = state;
		return this;
	}

	public String getProcessid() {
		return processid;
	}

	public Quit setProcessid(String processid) {
		this.processid = processid;
		return this;
	}

	public String getProcessname() {
		return processname;
	}

	public Quit setProcessname(String processname) {
		this.processname = processname;
		return this;
	}

	@Override
	public String toString() {
		return "Quit{" +
			", numid=" + numid +
			", applydate=" + applydate +
			", applyuser=" + applyuser +
			", name=" + name +
			", deptid=" + deptid +
			", deptopinion=" + deptopinion +
			", hropinion=" + hropinion +
			", state=" + state +
			", processid=" + processid +
			", processname=" + processname +
			"}";
	}
}
