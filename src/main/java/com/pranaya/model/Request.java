package com.pranaya.model;

public class Request {
	
	private String rname;
	private String remail;
	private String rmessage;
	private boolean rstatus;
	
	
	
	public Request() {
		super();
	}

	public Request(String fname, String femail, String fmessage) {
		super();
		this.rname = fname;
		this.remail = femail;
		this.rmessage = fmessage;
	}
	
	public String getFname() {
		return rname;
	}
	public void setFname(String fname) {
		this.rname = fname;
	}
	public String getFemail() {
		return remail;
	}
	public void setFemail(String femail) {
		this.remail = femail;
	}
	public String getFmessage() {
		return rmessage;
	}
	public void setFmessage(String fmessage) {
		this.rmessage = fmessage;
	}
	public boolean isFstatus() {
		return rstatus;
	}
	public void setFstatus(boolean fstatus) {
		this.rstatus = fstatus;
	}
	
	
	
}
