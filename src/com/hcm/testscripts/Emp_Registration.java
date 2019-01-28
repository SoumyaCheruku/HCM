package com.hcm.testscripts;
import org.testng.annotations.Test;
import com.hcm.lib.*;

public class Emp_Registration {
	
	
	@Test//(invocationCount = 3)
	public void empRegistration() throws InterruptedException{
		
		General g = new General();
		Thread.sleep(1000);
		g.hrLogin();
		//g.rmLogin();
		Thread.sleep(2000);
		g.empReg(); //reg emp already exist msg is displayed
		Thread.sleep(1000);
		//g.navigateToDashboard();
		Thread.sleep(1000);
		//g.applyLeave();
		//g.applyPermission();
		//g.applyMissPunch();
		//g.applyOnDuty();//Onduty type drop down values are not available
		//g.applyCancellation();
		//g.applyExpences();	
		//g.addLeaveType();
		//g.addLeaveType();//issue in the script
		//g.approveLeave();
		//g.approvePermission();
		//g.approveMissPunch();
		//g.approveExpenses();
		//g.hrExpensesApproval();
		//g.addWeekOff();
		//g.deleteWeekOffType();
		//g.addHoliday();
		//g.deleteHoliday();
		//g.addRestrictedDay();
		//g.deleteRestrictedDay();
		//g.addPermission();
		//g.deletePermission();
		//g.addShift();
		//g.deleteShift();
		//g.addBreak();
		//g.deleteBreak();
		//g.addDeductions();
		//g.deleteDeductions();
		//g.addPF();
		//g.deletePF();
		//g.logout();
	
		
		
	}
	
}
