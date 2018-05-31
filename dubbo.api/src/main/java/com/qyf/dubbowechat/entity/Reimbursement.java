package com.qyf.dubbowechat.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * <p>
 * 差旅报销表
 * </p>
 *
 * @author qyf
 * @since 2018-05-30
 */
@TableName("reimbursement")
public class Reimbursement implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 报销申请单号
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
     * 申请人职位
     */
	@TableField("post")
	private String post;
    /**
     * 出差申请单号
     */
	@TableField("bnumid")
	private String bnumid;
    /**
     * 申请费用总额
     */
	@TableField("applytotal")
	private Float applytotal;
    /**
     * 费用报销总额
     */
	@TableField("retotal")
	private Float retotal;
    /**
     * 收款户名
     */
	@TableField("coname")
	private String coname;
    /**
     * 收款账户
     */
	@TableField("accountnum")
	private String accountnum;
    /**
     * 开户银行
     */
	@TableField("bank")
	private String bank;
    /**
     * 身份证号
     */
	@TableField("IDnum")
	private String IDnum;
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

	public Reimbursement setNumid(String numid) {
		this.numid = numid;
		return this;
	}

	public String getApplyuser() {
		return applyuser;
	}

	public Reimbursement setApplyuser(String applyuser) {
		this.applyuser = applyuser;
		return this;
	}

	public String getApplydate() {
		return applydate;
	}

	public Reimbursement setApplydate(String applydate) {
		this.applydate = applydate;
		return this;
	}

	public String getName() {
		return name;
	}

	public Reimbursement setName(String name) {
		this.name = name;
		return this;
	}

	public String getDeptid() {
		return deptid;
	}

	public Reimbursement setDeptid(String deptid) {
		this.deptid = deptid;
		return this;
	}

	public String getPost() {
		return post;
	}

	public Reimbursement setPost(String post) {
		this.post = post;
		return this;
	}

	public String getBnumid() {
		return bnumid;
	}

	public Reimbursement setBnumid(String bnumid) {
		this.bnumid = bnumid;
		return this;
	}

	public Float getApplytotal() {
		return applytotal;
	}

	public Reimbursement setApplytotal(Float applytotal) {
		this.applytotal = applytotal;
		return this;
	}

	public Float getRetotal() {
		return retotal;
	}

	public Reimbursement setRetotal(Float retotal) {
		this.retotal = retotal;
		return this;
	}

	public String getConame() {
		return coname;
	}

	public Reimbursement setConame(String coname) {
		this.coname = coname;
		return this;
	}

	public String getAccountnum() {
		return accountnum;
	}

	public Reimbursement setAccountnum(String accountnum) {
		this.accountnum = accountnum;
		return this;
	}

	public String getBank() {
		return bank;
	}

	public Reimbursement setBank(String bank) {
		this.bank = bank;
		return this;
	}

	public String getIDnum() {
		return IDnum;
	}

	public Reimbursement setIDnum(String IDnum) {
		this.IDnum = IDnum;
		return this;
	}

	public Integer getState() {
		return state;
	}

	public Reimbursement setState(Integer state) {
		this.state = state;
		return this;
	}

	public String getProcessid() {
		return processid;
	}

	public Reimbursement setProcessid(String processid) {
		this.processid = processid;
		return this;
	}

	public String getProcessname() {
		return processname;
	}

	public Reimbursement setProcessname(String processname) {
		this.processname = processname;
		return this;
	}

	@Override
	public String toString() {
		return "Reimbursement{" +
			", numid=" + numid +
			", applyuser=" + applyuser +
			", applydate=" + applydate +
			", name=" + name +
			", deptid=" + deptid +
			", post=" + post +
			", bnumid=" + bnumid +
			", applytotal=" + applytotal +
			", retotal=" + retotal +
			", coname=" + coname +
			", accountnum=" + accountnum +
			", bank=" + bank +
			", IDnum=" + IDnum +
			", state=" + state +
			", processid=" + processid +
			", processname=" + processname +
			"}";
	}
}
