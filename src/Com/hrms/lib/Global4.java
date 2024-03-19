package Com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global4 {
	WebDriver driver;
	
	//****TEST DATA****
	//LOGIN
		public String url = "http://183.82.103.245/nareshit/login.php";
		public String un = "nareshit";
		public String pw = "nareshit";
	//Add
		public String ln="Maharastra";
		public String fn="Nanded";
	//Edit
		public String Eln="Selenium";
		public String Efn="Testing";
	//Delete
		public String empidno="4101";
		
		
	//object
		//login
		public String txt_un="txtUserName";
		public String txt_pw="txtPassword";
		//public String untbx = "txtUserName";
		//public String pwtbx ="txtPassword";
		public String loginbtn="Submit";
		public String logoutbtn ="Logout";
	  //Add
	    public String addbtn4="//input[@value='Add']";
	    public String lntbx4="txtEmpLastName";
	    public String fntbx4="txtEmpFirstName";
	    public String savebtn4="btnEdit"; //id
	 //Edit
	    public String editbtne="EditMain";
	    public String Elntbx4="txtEmpLastName";
	    public String Efntbx4="txtEmpFirstName";
	    //public String Editbtn5="EditMain";
	    public String savebtnE4="EditMain";
	    public String Backbtn4="//input[@value='Back']";
	 //Delete
	    public String searchdropdown5="loc_code";
	    public String empid4="Emp. ID";
	    public String checkbx4="chkLocID[]";
	    public String searchbx4="loc_name";
	    public String searchbtn4="//input[@value='Search']";
	    public String deletebtn4="//input[@value='Delete']";
	    
	    
	}
