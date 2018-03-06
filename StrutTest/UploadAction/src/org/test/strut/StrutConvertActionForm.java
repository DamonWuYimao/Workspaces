package org.test.strut;

import java.sql.Date;

import org.apache.struts.action.ActionForm;

public class StrutConvertActionForm extends ActionForm {
	private int integer;
    private double doubles;
    private boolean booleans;
    private Date sqldates;
	public int getInteger() {
		return integer;
	}
	public void setInteger(int integer) {
		this.integer = integer;
	}
	public double getDoubles() {
		return doubles;
	}
	public void setDoubles(double doubles) {
		this.doubles = doubles;
	}
	public boolean isBooleans() {
		return booleans;
	}
	public void setBooleans(boolean booleans) {
		this.booleans = booleans;
	}
	public Date getSqldates() {
		return sqldates;
	}
	public void setSqldates(Date sqldates) {
		this.sqldates = sqldates;
	}
    
}
