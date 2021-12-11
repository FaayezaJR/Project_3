package Org.Maven;
	import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import com.Pom.Add_Cart;
    import com.Pom.Checkout;
    import com.Pom.Checkout_1;
import com.Pom.Checkout_2;
import com.Pom.Checkout_3;
import com.Pom.Checkout_4;
import com.Pom.Checkout_5;
import com.Pom.Frame;
    import com.Pom.Home_Page;
	import com.Pom.Login_Page;
	import com.Pom.T_Shirts;
	import com.Pom.Tshirt_Img;
public class Runner_Class extends Base_Class {
		public static WebDriver driver = getBrowser("chrome");
		public static Home_Page hp = new Home_Page(driver);
		public static Login_Page lp = new Login_Page(driver);
		public static T_Shirts T = new T_Shirts(driver);	
		public static Tshirt_Img Ti = new Tshirt_Img(driver);
		public static Frame f = new Frame(driver);
		public static Add_Cart A = new Add_Cart(driver);
		public static Checkout pc = new Checkout(driver);
		public static Checkout_1 pc1 = new Checkout_1(driver);
		public static Checkout_2 pc2 = new Checkout_2(driver);
		public static Checkout_3 pc3 = new Checkout_3(driver);
		public static Checkout_4 pc4 = new Checkout_4(driver);
		public static Checkout_5 pc5 = new Checkout_5(driver);
 public static void main(String args[]) throws InterruptedException, IOException{
		   	url("http://automationpractice.com/index.php");
			clickOnWebElement(hp.getSign_in());
			inputValueElement(lp.getEmail(),"faayezaJR@gmail.com");
			inputValueElement(lp.getPassword(),"JR29021603");
			clickOnWebElement(lp.getSign_btn());
			clickOnWebElement(T.getTshirts());
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,550);");
			clickOnWebElement(Ti.getTshirt_Img());
			driver.switchTo().frame(f.getFrame());
			clickOnWebElement(A.getAdd_Cart());
			driver.switchTo().defaultContent();
			Thread.sleep(10000);
			clickOnWebElement(pc.getCheckout());
			Thread.sleep(8000);
			clickOnWebElement(pc1.getCheckout_1());
		    js.executeScript("window.scrollBy(0,850);");
			clickOnWebElement(pc2.getCheckout_2());
			clickOnWebElement(pc3.getCheckout_3());
			clickOnWebElement(pc3.getCheckout_11());
		    Thread.sleep(3000);
			clickOnWebElement(pc4.getCheckout_4());
		    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0,850);");
		clickOnWebElement(pc5.getCheckout_5());
	    js.executeScript("window.scrollBy(0,350);");
	    Thread.sleep(3000);
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    File destination = new File("C:\\Users\\faayeza\\eclipse-workspace\\Selenium_Testing\\screenshots//pic6.png");
	    FileUtils.copyFile(source, destination);
		}
		}