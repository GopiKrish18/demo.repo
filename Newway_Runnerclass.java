package bom.pojo;
import org.openqa.selenium.WebDriver;
import com.bom.Methodsbackup;
import com.pom.Bookingpage;
import com.pom.Homepage;
import com.pom.Loginpage;
import com.pom.Paymentpage;
public class Newway_Runnerclass extends Methodsbackup {				//RunnerClass
public static WebDriver driver = Methodsbackup.browser("chrome");	//Chrome Browser
	public static Loginpage log = new Loginpage(driver);			//Loginpageclass	
	public static Homepage home = new Homepage(driver);				//Homepageclass
	public static Bookingpage book = new Bookingpage(driver);		//Bookingpageclass
	public static Paymentpage pay = new Paymentpage(driver);		//Paymentpageclass
	public static void main(String[] args) throws Throwable {		//Main Method									
		web("https://adactinhotelapp.com/");						//Webdriver - Method Maximize Wait						
		input(log.getUsername(),"gopikrish");						//WebElement sendkeys
		input(log.getPassword(),"Krish18*");						//WebElement sendkeys
		jsclick(log.getLogin());									//JavaScriptExecutor (click + alert)
		alertaccept();												//Alert            
		dropdown(home.getSelectlocation(),"byindex","5");			//Select from dropdown(byindex)
		dropdown(home.getSelecthotel(),"byvalue","Hotel Sunshine"); //Select from dropdown(byvalue)
		dropdown(home.getSelectroomtype(),"bytext","Super Deluxe"); //Select from dropdown(bytext)
		actions(home.getLinksearch());								//Actions(mouse click)
		submit(book.getChoose());									//WebElement click
		actions(book.getBook());									//Actions(mouse click)
		input(pay.getFirstname(),"GOPI");							//WebElement sendkeys
		next("tab");												//Keyboard(TAB to move next field) 		
		input(pay.getLastname(),"KRISHNA");							//WebElement sendkeys
		next("tab");												//Keyboard(TAB to move next field)		
		next("down");												//Keyboard(DOWN to move down field)		
		snap();														//TakesScreenshot	
		windowid("loginID");            							//Output(WindowID detail)
		driver.quit();												//The END...
	}
}
