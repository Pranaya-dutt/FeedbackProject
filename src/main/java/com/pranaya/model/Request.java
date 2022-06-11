package com.pranaya.model;

public class Request {
	
	private int rid;
	private String rname;
	private String remail;
	private String rmessage;
	private boolean rstatus;
	
	
	
	public int getRid() {
		return rid;
	}



	public void setRid(int rid) {
		this.rid = rid;
	}



	public Request() {
		super();
	}

	

	public Request(int rid) {
		super();
		this.rid = rid;
	}



	@Override
	public String toString() {
		return "Request [rname=" + rname + ", remail=" + remail + ", rmessage=" + rmessage + ", rstatus=" + rstatus
				+ "]";
	}



	public Request(String rname, String remail, String rmessage) {
		super();
		this.rname = rname;
		this.remail = remail;
		this.rmessage = rmessage;
	}



	public String getRname() {
		return rname;
	}



	public void setRname(String rname) {
		this.rname = rname;
	}



	public String getRemail() {
		return remail;
	}



	public void setRemail(String remail) {
		this.remail = remail;
	}



	public String getRmessage() {
		return rmessage;
	}



	public void setRmessage(String rmessage) {
		this.rmessage = rmessage;
	}



	public boolean isRstatus() {
		return rstatus;
	}



	public void setRstatus(boolean rstatus) {
		this.rstatus = rstatus;
	}

	
	
	
	
	
}
