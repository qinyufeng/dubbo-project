package com.qyf.dubbowechat.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * <p>
 * 转正申请表
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@TableName("regularworker")
public class Regularworker implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 转正申请单号
     */
	@TableField("numid")
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
     * 职位
     */
	@TableField("post")
	private String post;
    /**
     * 工作简评
     */
	@TableField("evaluation")
	private String evaluation;
	@TableField("deptopinion")
	private String deptopinion;
	@TableField("hropinion")
	private String hropinion;
    /**
     * 状态，0:待部门审批；1部门已审批，待人事审批；2人事已审批'
     */
	@TableField("state")
	private String state;
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

	public Regularworker setNumid(String numid) {
		this.numid = numid;
		return this;
	}

	public String getApplydate() {
		return applydate;
	}

	public Regularworker setApplydate(String applydate) {
		this.applydate = applydate;
		return this;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public Regularworker setApplyuser(String applyuser) {
		this.applyuser = applyuser;
		return this;
	}

	public String getName() {
		return name;
	}

	public Regularworker setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public Regularworker setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getPost() {
		return post;
	}

	public Regularworker setPost(String post) {
		this.post = post;
		return this;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public Regularworker setEvaluation(String evaluation) {
		this.evaluation = evaluation;
		return this;
	}

	public String getDeptopinion() {
		return deptopinion;
	}

	public Regularworker setDeptopinion(String deptopinion) {
		this.deptopinion = deptopinion;
		return this;
	}

	public String getHropinion() {
		return hropinion;
	}

	public Regularworker setHropinion(String hropinion) {
		this.hropinion = hropinion;
		return this;
	}

	public String getState() {
		return state;
	}

	public Regularworker setState(String state) {
		this.state = state;
		return this;
	}

	public String getProcessid() {
		return processid;
	}

	public Regularworker setProcessid(String processid) {
		this.processid = processid;
		return this;
	}

	public String getProcessname() {
		return processname;
	}

	public Regularworker setProcessname(String processname) {
		this.processname = processname;
		return this;
	}

	@Override
	public String toString() {
		return "Regularworker{" +
			", numid=" + numid +
			", applydate=" + applydate +
			", applyuser=" + applyuser +
			", name=" + name +
			", deptid=" + deptid +
			", post=" + post +
			", evaluation=" + evaluation +
			", deptopinion=" + deptopinion +
			", hropinion=" + hropinion +
			", state=" + state +
			", processid=" + processid +
			", processname=" + processname +
			"}";
	}
}
