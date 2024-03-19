package Com.hrms.TestScript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import Com.hrms.lib.General4;

public class TC001 extends General4 {
	@Test
	
	public void Testng12()throws Exception {
                         //public static void main(String[] args) throws Exception {
		DOMConfigurator.configure("Log4j.xml");

	General4 obj=new General4();

	obj.openappln4();
	obj.login();
	obj.Enterframe4();
	obj.Add4();
	obj.Edit4();
	Thread.sleep(2000);
	obj.Delete4();
	obj.outframe4();
	obj.logout4();
	obj.closeappln4();
	
}
}
