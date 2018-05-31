package com.qyf.dubbowechat.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 岗位调动申请表
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@TableName("JobTransfer")
public class JobTransfer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 岗位调动申请单号
     */
    @TableId("numid")
	private String numid;
    /**
     * 申请人
     */
	@TableField("applyuser")
	private String applyuser;
    /**
     * 申请日期
     */
	@TableField("applydate")
	private String applydate;
    /**
     * 申请人姓名
     */
	@TableField("name")
	private String name;
    /**
     * 部门编号
     */
	@TableField("deptid")
	private String deptid;
    /**
     * 调动原因
     */
	@TableField("reason")
	private String reason;
    /**
     * 调动类型，0升职1降职
     */
	@TableField("type")
	private String type;
    /**
     * 调动前部门
     */
	@TableField("startdeptid")
	private String startdeptid;
    /**
     * 调动后部门
     */
	@TableField("enddeptid")
	private String enddeptid;
    /**
     * 调动前上级
     */
	@TableField("startleader")
	private String startleader;
    /**
     * 调动后上级
     */
	@TableField("endleader")
	private String endleader;
    /**
     * 调动前薪资
     */
	@TableField("startsalary")
	private Float startsalary;
    /**
     * 调动后薪资
     */
	@TableField("endsalary")
	private Float endsalary;
    /**
     * 状态
     */
	@TableField("state")
	private String state;
    /**
     * 执行日期
     */
	@TableField("executedate")
	private String executedate;
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

	public JobTransfer setNumid(String numid) {
		this.numid = numid;
		return this;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public JobTransfer setApplyuser(String applyuser) {
		this.applyuser = applyuser;
		return this;
	}

	public String getApplydate() {
		return applydate;
	}

	public JobTransfer setApplydate(String applydate) {
		this.applydate = applydate;
		return this;
	}

	public String getName() {
		return name;
	}

	public JobTransfer setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public JobTransfer setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getReason() {
		return reason;
	}

	public JobTransfer setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public String getType() {
		return type;
	}

	public JobTransfer setType(String type) {
		this.type = type;
		return this;
	}

	public String getStartdeptid() {
		return startdeptid;
	}

	public JobTransfer setStartdeptid(String startdeptid) {
		this.startdeptid = startdeptid;
		return this;
	}

	public String getEnddeptid() {
		return enddeptid;
	}

	public JobTransfer setEnddeptid(String enddeptid) {
		this.enddeptid = enddeptid;
		return this;
	}

	public String getStartleader() {
		return startleader;
	}

	public JobTransfer setStartleader(String startleader) {
		this.startleader = startleader;
		return this;
	}

	public String getEndleader() {
		return endleader;
	}

	public JobTransfer setEndleader(String endleader) {
		this.endleader = endleader;
		return this;
	}

	public Float getStartsalary() {
		return startsalary;
	}

	public JobTransfer setStartsalary(Float startsalary) {
		this.startsalary = startsalary;
		return this;
	}

	public Float getEndsalary() {
		return endsalary;
	}

	public JobTransfer setEndsalary(Float endsalary) {
		this.endsalary = endsalary;
		return this;
	}

	public String getState() {
		return state;
	}

	public JobTransfer setState(String state) {
		this.state = state;
		return this;
	}

	public String getExecutedate() {
		return executedate;
	}

	public JobTransfer setExecutedate(String executedate) {
		this.executedate = executedate;
		return this;
	}

	public String getProcessid() {
		return processid;
	}

	public JobTransfer setProcessid(String processid) {
		this.processid = processid;
		return this;
	}

	public String getProcessname() {
		return processname;
	}

	public JobTransfer setProcessname(String processname) {
		this.processname = processname;
		return this;
	}

	@Override
	public String toString() {
		return "JobTransfer{" +
			", numid=" + numid +
			", applyuser=" + applyuser +
			", applydate=" + applydate +
			", name=" + name +
			", deptid=" + deptid +
			", reason=" + reason +
			", type=" + type +
			", startdeptid=" + startdeptid +
			", enddeptid=" + enddeptid +
			", startleader=" + startleader +
			", endleader=" + endleader +
			", startsalary=" + startsalary +
			", endsalary=" + endsalary +
			", state=" + state +
			", executedate=" + executedate +
			", processid=" + processid +
			", processname=" + processname +
			"}";
	}
}
