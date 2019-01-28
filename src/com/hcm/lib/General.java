package com.hcm.lib;

import java.util.concurrent.TimeUnit;


import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class General extends Global{
	
	public void hrLogin() {
		System.setProperty("webdriver.chrome.driver",
				"//home//sbv6//Downloads//chromedriver");
		d1 = new ChromeDriver();
		d1.navigate().to(url);
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//*[@id='employeecode']")).sendKeys("1000");
		d1.findElement(By.xpath("//*[@id='password']")).sendKeys("Kishan@29");
		d1.findElement(By.xpath("//*[@id='loginid']/h4")).click();	
		
	}
	public void rmLogin(){
		System.setProperty("webdriver.chrome.driver",
				"//home//sbv6//Downloads//chromedriver");
		d1 = new ChromeDriver();
		d1.navigate().to(url);
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//*[@id='employeecode']")).sendKeys("2000");
		d1.findElement(By.xpath("//*[@id='password']")).sendKeys("Kishan@29");
		d1.findElement(By.xpath("//*[@id='loginid']/h4")).click();	
		
	}
	public void logout() throws InterruptedException
	{
		d1.findElement(By.xpath("//*[@id='imgid']")).click();
		Thread.sleep(1000);
		//d1.findElement(By.linkText("logout")).click();
		d1.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/ul/li/ul/li[5]/a")).click();
	}
	
	
	public void empReg() throws InterruptedException
	{
		Actions action = new Actions(d1);
		WebElement we = d1.findElement(By.xpath("//*[@id='eregistrationtab']/a/div[1]/img"));
		action.moveToElement(we).build().perform();
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id='eregistrationtab']/ul/li/a/div[1]/img")).click();
		System.out.println("working");
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div[1]/div/a/img")).click();
		Thread.sleep(1000);
		d1.findElement(By.id("txtpassword")).sendKeys("Kishan@29");
		d1.findElement(By.id("txtemailforpasswordreecovery")).sendKeys("soumy.ch@gmail.com");
		d1.findElement(By.xpath("//*[@id='ddlOrganizationUnit_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlOrganizationUnit_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='ddlLocation_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlLocation_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='txtEmployeeCode']")).sendKeys("3160");
		d1.findElement(By.id("txtfirstname")).sendKeys("test");
		d1.findElement(By.id("txtlastname")).sendKeys("Test");
		d1.findElement(By.xpath("//*[@id='datepicker']")).click();
		d1.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")).click();
		d1.findElement(By.xpath("//*[@id='ddlGender_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlGender_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='ddlBloodGroup_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlBloodGroup_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='ddlMaritalStatus_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlMaritalStatus_chzn_o_1']")).click();
		d1.findElement(By.id("txtMobileNumber")).sendKeys("9632587415");
		d1.findElement(By.id("txtEmail")).sendKeys("soumya.ch@gmail.com");
		d1.findElement(By.xpath("//*[@id='ddlEmplyeeCategory_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlEmplyeeCategory_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='datepicker2']")).click();
		d1.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[3]/a")).click();
		d1.findElement(By.xpath("//*[@id='ddlJoiningStatus_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlJoiningStatus_chzn_o_3']")).click();
		d1.findElement(By.xpath("//*[@id='ddlSourceOfRecruitment_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlSourceOfRecruitment_chzn_o_1']")).click();
		d1.findElement(By.id("txtProbationPeriod")).sendKeys("6months");
		d1.findElement(By.xpath("//*[@id='ddlposition_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlposition_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='ddlnextcarrerchangetype_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlnextcarrerchangetype_chzn_o_1']")).click();
		((JavascriptExecutor) d1).executeScript("scroll(0, -250);");
		d1.findElement(By.xpath("//*[@id='ddlDepartment_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlDepartment_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='ddlSubDept_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlSubDept_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='ddlEmploymentStatus_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlEmploymentStatus_chzn_o_3']")).click();
		d1.findElement(By.xpath("//*[@id='ddlDesignation_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlDesignation_chzn_o_2']")).click();
		d1.findElement(By.xpath("//*[@id='ddlGrade_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlGrade_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='ddlCostCenter_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlCostCenter_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='datepicker3']")).click();
		d1.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();
		((JavascriptExecutor) d1).executeScript("scroll(0,250);");
		d1.findElement(By.id("uploadPhotofileName")).sendKeys("/home/sbv6/Pictures/Screenshot from 2018-01-29 15-19-25.png");
		d1.findElement(By.id("btnsave")).click();
		Thread.sleep(3000);
		d1.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/button[2]")).click();
		Thread.sleep(1000);
		//d1.findElement(By.id("btnsave")).click();
		//Thread.sleep(2000);
		//d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
		//Thread.sleep(1000);
		//d1.findElement(By.id("btnsave")).click();
		
	}
	
	public void navigateToDashboard()
	{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[1]/a/div[1]/img")).click();
	}
	//@BeforeClass
	//@Test(invocationCount = 3)
	public void applyLeave() throws InterruptedException
	{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='applyleaveformid']/a")).click();
		d1.findElement(By.xpath("/html/body/div[5]/button")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='leavetypeid_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='leavetypeid_chzn_o_1']")).click();
		d1.findElement(By.xpath("//*[@id='fromdateid']")).click();
		d1.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[2]/a")).click();
		Thread.sleep(2000);
		Boolean ispresent=d1.findElements(By.xpath("/html/body/div[11]/div/div/div[2]/button[2]")).size()>0;
		
		if (ispresent==true) {
			Thread.sleep(2000);
			d1.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/button[2]")).click();
			Thread.sleep(2000);
			d1.findElement(By.id("todateid")).click();
			Thread.sleep(1000);
			d1.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[4]/a")).click();
			Thread.sleep(3000);			

		}
		 if (ispresent==true) {
			Thread.sleep(2000);
			d1.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/button[2]")).click();						
			Thread.sleep(2000);
						
		}
		 else
		 {
			 d1.findElement(By.id("todateid")).click();
			 d1.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[4]/a")).click();
			 
		 }
		 d1.findElement(By.xpath("//*[@id='input_17']")).sendKeys("To attend function");
		 d1.findElement(By.xpath("//*[@id='btnsave']")).click();
		 Thread.sleep(2000);
		 d1.findElement(By.xpath("/html/body/div[11]/div/div/div[2]/button[2]")).click();		
		
	}
	//@AfterClass
	public void applyPermission() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='applypermissionformid']/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='applybtnid']")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='datepicker']")).click();
		d1.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[3]/a")).click();	
		Thread.sleep(1000);
		Boolean ispresent=d1.findElements(By.xpath("/html/body/div[10]/div/div/div[2]/button")).size()>0;
		Thread.sleep(1000);
		if(ispresent==true){
			d1.findElement(By.xpath("/html/body/div[10]/div/div/div[2]/button")).click();
		}
			
		Thread.sleep(1000);
		WebElement mySelectElement = d1
				.findElement(By
						.xpath("//*[@id='PermissionTypeid']"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByIndex(1);
		
		WebElement mySelectElement1 = d1
				.findElement(By
						.xpath("//*[@id='NonReturnablePermission']"));
		Select dropdown1= new Select(mySelectElement1);
		dropdown1.selectByIndex(2);
		
		WebElement mySelectElement2 = d1
				.findElement(By
						.xpath("//*[@id='ddlpermissionextendstonextday']"));
		Select dropdown2= new Select(mySelectElement2);
		dropdown2.selectByIndex(2);
		
		d1.findElement(By.id("reason")).sendKeys("Personal work");
		d1.findElement(By.id("savebtn")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[10]/div/div/div[2]/button[2]")).click();		
		
	}
	
	public void applyMissPunch() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='applymissedpunchid']/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div[2]/div[1]/div/button")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='datepicker']")).click();
		d1.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button")).click();
		WebElement mySelectElement2 = d1
				.findElement(By
						.xpath("//*[@id='forgotPunchType']"));
		Select dropdown2= new Select(mySelectElement2);
		dropdown2.selectByIndex(2);
		
		WebElement mySelectElement3 = d1.findElement(By.id("ddlTechnicalissue"));
				
		Select dropdown3= new Select(mySelectElement3);
		dropdown3.selectByIndex(1);
		d1.findElement(By.name("remarks")).sendKeys("Forgot");
		d1.findElement(By.xpath("//*[@id='btnsave']")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
		
	}
	
	public void applyOnDuty() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='applyondutyid']/a")).click();
		d1.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button")).click();
		Thread.sleep(1000);
		WebElement mySelectElement1 = d1
				.findElement(By
						.xpath("//*[@id='ddlApplicationType']"));
		Select dropdown1= new Select(mySelectElement1);
		dropdown1.selectByIndex(2);
		
		((JavascriptExecutor)d1).executeScript ("document.getElementById('fromdateid').removeAttribute('readonly',0);"); // Enables the from date box

		WebElement fromDateBox= d1.findElement(By.id("fromdateid"));
		fromDateBox.clear();
		fromDateBox.sendKeys("8-7-2018");
		fromDateBox.sendKeys(Keys.TAB);
		
		((JavascriptExecutor)d1).executeScript ("document.getElementById('todateid').removeAttribute('readonly',0);"); // Enables the from date box

		WebElement toDateBox= d1.findElement(By.id("todateid"));
		toDateBox.clear();
		toDateBox.sendKeys("10-7-2018");
		toDateBox.sendKeys(Keys.TAB);
		
		WebElement ele1=d1.findElement(By.xpath("//*[@id='fromtimeid']"));
		ele1.sendKeys("09:00 AM");
		ele1.sendKeys(Keys.TAB);
		d1.findElement(By.id("totimeid")).sendKeys("06:00 PM");
		
		d1.findElement(By.id("WorkLocationid123")).sendKeys("Hyderabad");
		d1.findElement(By.id("imprestcashid")).sendKeys("8000");
		d1.findElement(By.xpath("//*[@id='descriptionid']")).sendKeys("Regular Visit");
		
		WebElement mySelectElement2 = d1
				.findElement(By
						.xpath("//*[@id='ddlLeaveType']"));
		Select dropdown2= new Select(mySelectElement2);
		dropdown2.selectByIndex(1);
		
		d1.findElement(By.xpath("//*[@id='btnsave']")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();			
		
	}
	public void applyExpences() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='applyexpenseid']/a")).click();
		((JavascriptExecutor)d1).executeScript ("document.getElementById('datepicker').removeAttribute('readonly',0);"); // Enables the from date box

		WebElement toDateBox= d1.findElement(By.id("datepicker"));
		toDateBox.clear();
		toDateBox.sendKeys("10-8-2018");
		toDateBox.sendKeys(Keys.TAB);
		d1.findElement(By.id("txtpurpose")).sendKeys("Client Visit");
		d1.findElement(By.id("txtplace")).sendKeys("Hyderabad");
		d1.findElement(By.id("txtkmtravelled0")).sendKeys("45");
		Thread.sleep(4000);
		WebElement mySelectElement2 = d1
				.findElement(By
						.xpath("//*[@id='travelid0']"));
		Select dropdown2= new Select(mySelectElement2);
		dropdown2.selectByIndex(1);
		d1.findElement(By.xpath("//*[@id='txtmiscellaneouscharges0']")).sendKeys("50");
		d1.findElement(By.xpath("//*[@id='btnsave']")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
	}
	public void applyCancellation() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("/html/body/div[5]/div/div/div/div/div/div/div[1]/div[2]/div/div[2]/div[2]/ul/li[5]/a")).click();
		WebElement mySelectElement2 = d1
				.findElement(By
						.xpath("//*[@id='applicationtypeid']"));
		Select dropdown2= new Select(mySelectElement2);
		dropdown2.selectByIndex(3);
		d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr/td[1]/td/input")).click();
		d1.findElement(By.id("cancelApp")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();		
		
	}
	
	public void approveLeave() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='leavedashboardid']/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='approvalid']")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
	}
	public void approvePermission() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='permissionapprovaldiv']/a")).click();
		Thread.sleep(1000);
		Boolean ispresent=d1.findElements(By.xpath("//*[@id='checkIN']/tbody/tr/td[9]/input")).size()>0;
		Thread.sleep(1000);
		if(ispresent==true)
		{
			Thread.sleep(1000);
			d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr/td[9]/input")).click();
			Thread.sleep(2000);
			WebElement mySelectElement2 = d1
					.findElement(By
							.xpath("//*[@id='reportingmanagerstatusId']"));
			Select dropdown2= new Select(mySelectElement2);
			dropdown2.selectByIndex(1);
			d1.findElement(By.xpath("//*[@id='updatebtn']")).click();
			Thread.sleep(1000);
			d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
		}
		System.out.println("Permissions not available");
	
	}
	public void approveMissPunch() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='missedpunchid']/a")).click();
		Thread.sleep(1000);
		Boolean ispresent=d1.findElements(By.xpath("//*[@id='checkIN1']/tbody/tr/td[9]/input")).size()>0;
		Thread.sleep(2000);
		if(ispresent==true)		
		{
			Thread.sleep(1000);
			d1.findElement(By.xpath("//*[@id='checkIN1']/tbody/tr/td[9]/input")).click();
			Thread.sleep(1000);
			d1.findElement(By.id("btnapprove")).click();
			Thread.sleep(2000);
			d1.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[2]")).click();
			
		}
		System.out.println("No Data available");
	}
	public void approveExpenses() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		d1.findElement(By.xpath("//*[@id='Employeeexpensediv']/a")).click();
		Thread.sleep(1000);
		Boolean ispresent=d1.findElements(By.xpath("//*[@id='checkIN']/tbody/tr/td[12]/input")).size()>0;
		Thread.sleep(2000);
		if(ispresent==true)		
		{
			d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr/td[12]/input")).click();
			Thread.sleep(1000);
			WebElement mySelectElement2 = d1
					.findElement(By
							.xpath("//*[@id='modelstatus']"));
			Select dropdown2= new Select(mySelectElement2);
			dropdown2.selectByIndex(1);
			Thread.sleep(2000);
			((JavascriptExecutor) d1).executeScript("scroll(0,250);");
			Thread.sleep(1000);
			d1.findElement(By.xpath("//*[@id='updateid']")).click();
			Thread.sleep(1000);
			d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
		}
		System.out.println("Expenses aprrovals not available");
		
	}
	public void hrExpensesApproval() throws InterruptedException{
		d1.findElement(By.xpath("/html/body/div[2]/div[1]/nav/ul/li[3]/a/div[1]/img")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id='hrtransportid']/a")).click();
		Thread.sleep(1000);
		Boolean ispresent=d1.findElements(By.xpath("//*[@id='checkIN']/tbody/tr/td[13]/input")).size()>0;
		Thread.sleep(2000);
		if(ispresent==true)		
		{
			d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr/td[13]/input")).click();
			Thread.sleep(2000);
			WebElement mySelectElement2 = d1
					.findElement(By
							.xpath("//*[@id='modelstatus']"));
			Select dropdown2= new Select(mySelectElement2);
			dropdown2.selectByIndex(1);
			Thread.sleep(2000);
			d1.findElement(By.xpath("//*[@id='updateid']")).click();
			Thread.sleep(2000);
			d1.findElement(By.xpath("/html/body/div[10]/div/div/div[2]/button[2]")).click();
			
		}
	}
	

	public void addLeaveType() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button/img")).click();
		Thread.sleep(1000);
		d1.findElement(By.id("ddlLeaveTypeName")).sendKeys("Paternal Leave");
		Thread.sleep(5000);
		  
		d1.findElement(By.xpath("//*[@id='ddlLeaveStatus_chzn']/a/span"));
		d1.findElement(By.xpath("//*[@id='ddlLeaveStatus_chzn_o_1']")).click();
		d1.findElement(By.id("ddlDescription")).sendKeys("Parent needs");
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
		
	}
	public void addWeekOff() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[2]/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='savem']/div[2]/div[1]/button/img")).click();
		Thread.sleep(2000);
		d1.findElement(By.id("txtWeeklyoffname")).sendKeys("Friday");
		WebElement mySelectElement2 = d1
				.findElement(By
						.xpath("//*[@id='ddlweeklyoff']"));
		Select dropdown2= new Select(mySelectElement2);
		dropdown2.selectByIndex(1);
		d1.findElement(By.id("txtDescription")).sendKeys("Special off");
		d1.findElement(By.id("btnsave")).click();
		
		WebElement mySelectElement3 = d1
				.findElement(By
						.xpath("//*[@id='ddlweekname']"));
		Select dropdown3= new Select(mySelectElement3);
		dropdown3.selectByIndex(6);
		
		WebElement mySelectElement4 = d1
				.findElement(By
						.xpath("//*[@id='ddlhalfdaytype']"));
		Select dropdown4= new Select(mySelectElement4);
		dropdown4.selectByIndex(1);
		
		WebElement mySelectElement5 = d1
				.findElement(By
						.xpath("//*[@id='ddlforevery']"));
		Select dropdown5= new Select(mySelectElement5);
		dropdown5.selectByIndex(1);
		
		WebElement mySelectElement6 = d1
				.findElement(By
						.xpath("//*[@id='ddlforeverydaterange']"));
		Select dropdown6= new Select(mySelectElement6);
		dropdown6.selectByIndex(1);
		d1.findElement(By.id("btnsave")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[2]")).click();	
		
	}
	
	public void deleteWeekOffType() throws InterruptedException{
		
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id='weeklyOff']/tbody/tr/td[5]/a")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
		
	}		
	
	public void addHoliday() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[3]/a")).click();
		d1.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button")).click();
		Thread.sleep(1000);
		d1.findElement(By.id("ddlholidayname")).sendKeys("Test");
		Thread.sleep(2000);
		WebElement mySelectElement6 = d1
				.findElement(By
						.xpath("//*[@id='ddlholidaystatus']"));
		Select dropdown6= new Select(mySelectElement6);
		dropdown6.selectByIndex(1);
		Thread.sleep(1000);
		d1.findElement(By.id("ddldescription")).sendKeys("For test");
		Thread.sleep(1000);
		d1.findElement(By.id("btnsave")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
		
	}
	public void deleteHoliday() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[3]/a")).click();
		d1.findElement(By.xpath("//*[@id='checkIN_last']")).click();
		Thread.sleep(3000);
		d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr[4]/td[5]/a")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[2]")).click();
	}
	
	public void addRestrictedDay() throws InterruptedException{
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[4]/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button")).click();
		Thread.sleep(1000);
		WebElement ele1= d1.findElement(By.id("ddlrestricteddayname"));
		ele1.sendKeys("Test");
		ele1.sendKeys(Keys.TAB);
		
		WebElement ele2=d1.findElement(By.id("ddlassignedcolor"));
		ele2.clear();
		ele2.sendKeys("7AE4FF");
		WebElement mySelectElement6 = d1
				.findElement(By
						.xpath("//*[@id='ddlrestricteddaystatus']"));
		Select dropdown6= new Select(mySelectElement6);
		dropdown6.selectByIndex(1);
		Thread.sleep(1000);
		d1.findElement(By.id("btnsave")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
		
	}
	public void deleteRestrictedDay() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[4]/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr[3]/td[5]/a")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[2]")).click();
		
	}
	
	public void addPermission() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[5]/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button/img")).click();
		Thread.sleep(1000);
		d1.findElement(By.id("pemissiontypenameId")).sendKeys("Test");
		Thread.sleep(1000);
		WebElement mySelectElement6 = d1
				.findElement(By
						.xpath("//*[@id='ddlstatus']"));
		Select dropdown6= new Select(mySelectElement6);
		dropdown6.selectByIndex(1);
		Thread.sleep(1000);
		d1.findElement(By.id("descriptionId")).sendKeys("For test");
		d1.findElement(By.xpath("//*[@id='btnsave']")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/button[2]")).click();
		
	}
	public void deletePermission() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[5]/a")).click();
		d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr[5]/td[5]/a")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/button[2]")).click();
		
	}
	
	public void addShift() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[6]/a")).click();
		d1.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button/img")).click();
		Thread.sleep(1000);
		d1.findElement(By.id("ddlshiftname")).sendKeys("Test");
		d1.findElement(By.id("ddlshortname")).sendKeys("Test");
		WebElement mySelectElement6 = d1
				.findElement(By
						.xpath("//*[@id='ddlshiftstatus']"));
		Select dropdown6= new Select(mySelectElement6);
		dropdown6.selectByIndex(1);
		Thread.sleep(1000);
		d1.findElement(By.id("ddldescription")).sendKeys("For test");
		d1.findElement(By.xpath("//*[@id='btnsave']")).click();
		Thread.sleep(5000);
		d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
	}
	public void deleteShift() throws InterruptedException{
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/a")).click();
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='navbar-collapse-1']/ul/li[1]/ul/li[1]/ul/li[6]/a")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='checkIN_last']")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr[3]/td[6]/a")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/button[2]")).click();
	}
	public void addBreak() throws InterruptedException{
		d1.get("http://192.168.2.140:8282/thcm/BreakMaster");
		d1.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button")).click();
		d1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		d1.findElement(By.id("ddlbreakname")).sendKeys("Snacks");
		WebElement ele1 = d1.findElement(By.xpath("//*[@id='ddlassignedcolour']"));
		ele1.click();
		ele1.clear();
		ele1.sendKeys("7AFFC6");
		Thread.sleep(1000);
		ele1.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body")).click();
		WebElement mySelectElement6 = d1
				.findElement(By
						.xpath("//*[@id='ddlbreakstatus']"));
		Select dropdown6= new Select(mySelectElement6);
		dropdown6.selectByIndex(1);
		d1.findElement(By.id("ddldescription")).sendKeys("For snacks");
		d1.findElement(By.id("btnsave")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
		
	}
	public void deleteBreak() throws InterruptedException{
		d1.get("http://192.168.2.140:8282/thcm/BreakMaster");
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr[3]/td[5]/a")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/button[2]")).click();
		
	}
	public void addDeductions() throws InterruptedException{
		d1.get("http://192.168.2.140:8282/thcm/earningdeductionmaster");
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='tableid']/div[2]/div[1]/div/button")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id='ddednames_chzn']/a/span")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='ddednames_chzn_o_2']")).click();
		d1.findElement(By.xpath("//*[@id='edcomponenttxt0']")).sendKeys("Test");
		d1.findElement(By.xpath("//*[@id='shortnametxt0']")).sendKeys("Test");
		d1.findElement(By.id("btnsave")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();		
		
	}
	public void deleteDeductions() throws InterruptedException{
		d1.get("http://192.168.2.140:8282/thcm/earningdeductionmaster");
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='checkIN']/tbody/tr[5]/td[4]/a")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/button[2]")).click();
	}
	public void addPF() throws InterruptedException{
		Thread.sleep(1000);
		d1.get("http://192.168.2.140:8282/thcm/professionaltaxmaster");
		Thread.sleep(1000);
		d1.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div[1]/div/button")).click();
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='ddlstate_chzn']/a/span")).click();
		d1.findElement(By.xpath("//*[@id='ddlstate_chzn_o_1']")).click();
		d1.findElement(By.id("txtfromsalary")).sendKeys("2017");
		d1.findElement(By.id("txttosalary")).sendKeys("2018");
		d1.findElement(By.id("txtamount")).sendKeys("2000");
		d1.findElement(By.id("btnsave")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
	}
	
	public void deletePF() throws InterruptedException{
		d1.get("http://192.168.2.140:8282/thcm/professionaltaxmaster");
		Thread.sleep(1000);
		d1.findElement(By.xpath("//*[@id='proftaxmastertblid']/tbody/tr[2]/td[5]/a")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/button[2]")).click();
		
	}
	

}
