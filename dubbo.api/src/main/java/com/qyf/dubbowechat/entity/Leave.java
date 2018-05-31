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
 * @since 2018-05-30
 */
@TableName("leave")
public class Leave implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 申请单号
     */
    @TableId("numid")
	private String numid;
    /**
     * 申请日期
     */
	@TableField("applydate")
	private String applydate;
    /**
     * 用户编号
     */
	@TableField("applyuser")
	private String applyuser;
    /**
     * 请假人姓名
     */
	@TableField("name")
	private String name;
    /**
     * 部门编号
     */
	@TableField("deptid")
	private String deptid;
    /**
     * 请假原因
     */
	@TableField("reason")
	private String reason;
    /**
     * 请假开始日期
     */
	@TableField("startdate")
	private String startdate;
    /**
     * 请假结束时间
     */
	@TableField("enddate")
	private String enddate;
    /**
     * 请假天数
     */
	@TableField("days")
	private Integer days;
    /**
     * 部门审批意见
     */
	@TableField("deptopinion")
	private String deptopinion;
    /**
     * 人事审批意见
     */
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

	public Leave setNumid(String numid) {
		this.numid = numid;
		return this;
	}

	public String getApplydate() {
		return applydate;
	}

	public Leave setApplydate(String applydate) {
		this.applydate = applydate;
		return this;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public Leave setApplyuser(String applyuser) {
		this.applyuser = applyuser;
		return this;
	}

	public String getName() {
		return name;
	}

	public Leave setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public Leave setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getReason() {
		return reason;
	}

	public Leave setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public String getStartdate() {
		return startdate;
	}

	public Leave setStartdate(String startdate) {
		this.startdate = startdate;
		return this;
	}

	public String getEnddate() {
		return enddate;
	}

	public Leave setEnddate(String enddate) {
		this.enddate = enddate;
		return this;
	}

	public Integer getDays() {
		return days;
	}

	public Leave setDays(Integer days) {
		this.days = days;
		return this;
	}

	public String getDeptopinion() {
		return deptopinion;
	}

	public Leave setDeptopinion(String deptopinion) {
		this.deptopinion = deptopinion;
		return this;
	}

	public String getHropinion() {
		return hropinion;
	}

	public Leave setHropinion(String hropinion) {
		this.hropinion = hropinion;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public Leave setState(Integer state) {
		this.state = state;
		return this;
	}

	public String getProcessid() {
		return processid;
	}

	public Leave setProcessid(String processid) {
		this.processid = processid;
		return this;
	}

	public String getProcessname() {
		return processname;
	}

	public Leave setProcessname(String processname) {
		this.processname = processname;
		return this;
	}

	@Override
	public String toString() {
		return "Leave{" +
			", numid=" + numid +
			", applydate=" + applydate +
			", applyuser=" + applyuser +
			", name=" + name +
			", deptid=" + deptid +
			", reason=" + reason +
			", startdate=" + startdate +
			", enddate=" + enddate +
			", days=" + days +
			", deptopinion=" + deptopinion +
			", hropinion=" + hropinion +
			", state=" + state +
			", processid=" + processid +
			", processname=" + processname +
			"}";
	}
}
