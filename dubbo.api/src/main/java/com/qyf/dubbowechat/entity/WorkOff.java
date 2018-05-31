package com.qyf.dubbowechat.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 调休申请表 
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@TableName("workOff")
public class WorkOff implements Serializable {

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
     * 申请人
     */
	@TableField("applyuser")
	private String applyuser;
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
     * 申请原因
     */
	@TableField("reason")
	private String reason;
    /**
     * 调休天数
     */
	@TableField("days")
	private Integer days;
    /**
     * 计划工作日期
     */
	@TableField("workday")
	private String workday;
    /**
     * 计划休息日期
     */
	@TableField("restday")
	private String restday;
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

	public WorkOff setNumid(String numid) {
		this.numid = numid;
		return this;
	}

	public String getApplydate() {
		return applydate;
	}

	public WorkOff setApplydate(String applydate) {
		this.applydate = applydate;
		return this;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public WorkOff setApplyuser(String applyuser) {
		this.applyuser = applyuser;
		return this;
	}

	public String getName() {
		return name;
	}

	public WorkOff setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public WorkOff setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getReason() {
		return reason;
	}

	public WorkOff setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public Integer getDays() {
		return days;
	}

	public WorkOff setDays(Integer days) {
		this.days = days;
		return this;
	}

	public String getWorkday() {
		return workday;
	}

	public WorkOff setWorkday(String workday) {
		this.workday = workday;
		return this;
	}

	public String getRestday() {
		return restday;
	}

	public WorkOff setRestday(String restday) {
		this.restday = restday;
		return this;
	}

	public String getDeptopinion() {
		return deptopinion;
	}

	public WorkOff setDeptopinion(String deptopinion) {
		this.deptopinion = deptopinion;
		return this;
	}

	public String getHropinion() {
		return hropinion;
	}

	public WorkOff setHropinion(String hropinion) {
		this.hropinion = hropinion;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public WorkOff setState(Integer state) {
		this.state = state;
		return this;
	}

	public String getProcessid() {
		return processid;
	}

	public WorkOff setProcessid(String processid) {
		this.processid = processid;
		return this;
	}

	public String getProcessname() {
		return processname;
	}

	public WorkOff setProcessname(String processname) {
		this.processname = processname;
		return this;
	}

	@Override
	public String toString() {
		return "WorkOff{" +
			", numid=" + numid +
			", applydate=" + applydate +
			", applyuser=" + applyuser +
			", name=" + name +
			", deptid=" + deptid +
			", reason=" + reason +
			", days=" + days +
			", workday=" + workday +
			", restday=" + restday +
			", deptopinion=" + deptopinion +
			", hropinion=" + hropinion +
			", state=" + state +
			", processid=" + processid +
			", processname=" + processname +
			"}";
	}
}
