package com.qyf.dubbowechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 考勤补卡表
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@TableName("supplementcard")
public class Supplementcard implements Serializable {

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
     * 补卡时间
     */
	@TableField("supplementdate")
	private String supplementdate;
    /**
     * 补卡原因
     */
	@TableField("reason")
	private String reason;
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

	public Supplementcard setNumid(String numid) {
		this.numid = numid;
		return this;
	}

	public String getApplydate() {
		return applydate;
	}

	public Supplementcard setApplydate(String applydate) {
		this.applydate = applydate;
		return this;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public Supplementcard setApplyuser(String applyuser) {
		this.applyuser = applyuser;
		return this;
	}

	public String getName() {
		return name;
	}

	public Supplementcard setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public Supplementcard setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getSupplementdate() {
		return supplementdate;
	}

	public Supplementcard setSupplementdate(String supplementdate) {
		this.supplementdate = supplementdate;
		return this;
	}

	public String getReason() {
		return reason;
	}

	public Supplementcard setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public String getDeptopinion() {
		return deptopinion;
	}

	public Supplementcard setDeptopinion(String deptopinion) {
		this.deptopinion = deptopinion;
		return this;
	}

	public String getHropinion() {
		return hropinion;
	}

	public Supplementcard setHropinion(String hropinion) {
		this.hropinion = hropinion;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public Supplementcard setState(Integer state) {
		this.state = state;
		return this;
	}

	public String getProcessid() {
		return processid;
	}

	public Supplementcard setProcessid(String processid) {
		this.processid = processid;
		return this;
	}

	public String getProcessname() {
		return processname;
	}

	public Supplementcard setProcessname(String processname) {
		this.processname = processname;
		return this;
	}

	@Override
	public String toString() {
		return "Supplementcard{" +
			", numid=" + numid +
			", applydate=" + applydate +
			", applyuser=" + applyuser +
			", name=" + name +
			", deptid=" + deptid +
			", supplementdate=" + supplementdate +
			", reason=" + reason +
			", deptopinion=" + deptopinion +
			", hropinion=" + hropinion +
			", state=" + state +
			", processid=" + processid +
			", processname=" + processname +
			"}";
	}
}
