package Com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import Com.hrms.utility.Log;

public class General4 extends Global4 {
	public void openappln4() {
		driver=new FirefoxDriver();
	driver.navigate().to(url);
		System.out.println("open application");
		Reporter.log("Appln open");
		Log.info("open appln");
	}
	public void Enterframe4() {
		driver.switchTo().frame("rightMenu");
	}


	public void login() throws Exception {
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.name(txt_un)).sendKeys(un);
		driver.findElement(By.name(txt_pw)).sendKeys(pw);
		Thread.sleep(1000);
		driver.findElement(By.name(loginbtn)).click();
		Thread.sleep(1000);
		Reporter.log("login Appln");
		Log.info("login appln");

	}
	public void Add4() throws Exception{
		//driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(addbtn4)).click();
		Thread.sleep(1000);
		driver.findElement(By.name(lntbx4)).sendKeys(ln);
		driver.findElement(By.name(fntbx4)).sendKeys(fn);
		Thread.sleep(1000);
		driver.findElement(By.id(savebtn4)).click();	
		//driver.switchTo().defaultContent();
		Log.info("Add appln");

		}
	public void Edit4() throws Exception{
		//driver.switchTo().frame("rightMenu");
		driver.findElement(By.name(editbtne)).click();
		driver.findElement(By.name(Efntbx4)).clear();
		Thread.sleep(1000);
		driver.findElement(By.name(Efntbx4)).sendKeys(Efn);
		driver.findElement(By.name(Elntbx4)).clear();
		Thread.sleep(1000);
		driver.findElement(By.name(Elntbx4)).sendKeys(Eln);
		driver.findElement(By.name(savebtnE4)).click();	
		Thread.sleep(1000);
		//driver.findElement(By.name("Editbtn5")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath(Backbtn4)).click();	
		//driver.switchTo().defaultContent();
		Log.info("Edit appln");

	}
	public void Delete4() {
		//driver.switchTo().frame("rightMenu");
		Select st=new Select(driver.findElement(By.name(searchdropdown5)));
		st.selectByVisibleText(empid4);
		driver.findElement(By.name(checkbx4)).click();
		driver.findElement(By.name(searchbx4)).sendKeys(empidno);
		
		driver.findElement(By.xpath(searchbtn4)).click();
		driver.findElement(By.name(checkbx4)).click();
		driver.findElement(By.xpath(deletebtn4)).click();
		//driver.switchTo().defaultContent();
	}
	public void outframe4() {
		driver.switchTo().defaultContent();
	}
	public void logout4() {
		driver.findElement(By.linkText(logoutbtn)).click();
		Reporter.log("logout Appln");
		Log.info("logout appln");

	}

	public void closeappln4() {
		driver.close();
		Log.info("closeappln");

	}
	

	}
