package com.qyf.dubbowechat.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 出差申请表
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@TableName("businesstravel")
public class Businesstravel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 出差申请单号
     */
    @TableId("numid")
	private String numid;
    /**
     * 出差申请人
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
     * 出差类别
     */
	@TableField("type")
	private String type;
    /**
     * 出差项目
     */
	@TableField("project")
	private String project;
    /**
     * 出差原因
     */
	@TableField("reason")
	private String reason;
    /**
     * 出差天数
     */
	@TableField("days")
	private Integer days;
    /**
     * 申请费用
     */
	@TableField("applyfee")
	private Float applyfee;
    /**
     * 费用类型
     */
	@TableField("feetype")
	private String feetype;
    /**
     * 费用说明
     */
	@TableField("Instruct")
	private String Instruct;
    /**
     * 是否定机票，0是1否
     */
	@TableField("isPlaneticket")
	private Integer isPlaneticket;
    /**
     * 机票金额
     */
	@TableField("planefee")
	private Float planefee;
    /**
     * 状态
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

	public Businesstravel setNumid(String numid) {
		this.numid = numid;
		return this;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public Businesstravel setApplyuser(String applyuser) {
		this.applyuser = applyuser;
		return this;
	}

	public String getApplydate() {
		return applydate;
	}

	public Businesstravel setApplydate(String applydate) {
		this.applydate = applydate;
		return this;
	}

	public String getName() {
		return name;
	}

	public Businesstravel setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public Businesstravel setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getType() {
		return type;
	}

	public Businesstravel setType(String type) {
		this.type = type;
		return this;
	}

	public String getProject() {
		return project;
	}

	public Businesstravel setProject(String project) {
		this.project = project;
		return this;
	}

	public String getReason() {
		return reason;
	}

	public Businesstravel setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public Integer getDays() {
		return days;
	}

	public Businesstravel setDays(Integer days) {
		this.days = days;
		return this;
	}

	public Float getApplyfee() {
		return applyfee;
	}

	public Businesstravel setApplyfee(Float applyfee) {
		this.applyfee = applyfee;
		return this;
	}

	public String getFeetype() {
		return feetype;
	}

	public Businesstravel setFeetype(String feetype) {
		this.feetype = feetype;
		return this;
	}

	public String getInstruct() {
		return Instruct;
	}

	public Businesstravel setInstruct(String Instruct) {
		this.Instruct = Instruct;
		return this;
	}

	public Integer getIsPlaneticket() {
		return isPlaneticket;
	}

	public Businesstravel setIsPlaneticket(Integer isPlaneticket) {
		this.isPlaneticket = isPlaneticket;
		return this;
	}

	public Float getPlanefee() {
		return planefee;
	}

	public Businesstravel setPlanefee(Float planefee) {
		this.planefee = planefee;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public Businesstravel setState(Integer state) {
		this.state = state;
		return this;
	}

	public String getProcessid() {
		return processid;
	}

	public Businesstravel setProcessid(String processid) {
		this.processid = processid;
		return this;
	}

	public String getProcessname() {
		return processname;
	}

	public Businesstravel setProcessname(String processname) {
		this.processname = processname;
		return this;
	}

	@Override
	public String toString() {
		return "Businesstravel{" +
			", numid=" + numid +
			", applyuser=" + applyuser +
			", applydate=" + applydate +
			", name=" + name +
			", deptid=" + deptid +
			", type=" + type +
			", project=" + project +
			", reason=" + reason +
			", days=" + days +
			", applyfee=" + applyfee +
			", feetype=" + feetype +
			", Instruct=" + Instruct +
			", isPlaneticket=" + isPlaneticket +
			", planefee=" + planefee +
			", state=" + state +
			", processid=" + processid +
			", processname=" + processname +
			"}";
	}
}
