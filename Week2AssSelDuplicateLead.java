package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2AssSelDuplicateLead {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 WebElement userNameElement = driver.findElement(By.id("username"));
		 userNameElement.sendKeys("Demosalesmanager");
		 
		 WebElement passwordElement = driver.findElement(By.name("PASSWORD"));
		 passwordElement.sendKeys("crmsfa");
		 	  
		 WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		 loginButton.click();
		 
		 WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));;
		 crmsfaElement.click();
				  
		 WebElement leadElement = driver.findElement(By.linkText("Leads"));
		 leadElement.click();
		 
		 WebElement myLeadElement = driver.findElement(By.linkText("Create Lead"));
		 myLeadElement.click();
		 
		 WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));;
		 companyNameElement.sendKeys("ABC Company");
		 
		 WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		 firstName.sendKeys("Nithik");
		 
		 WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
		 lastNameElement.sendKeys("D");
		 
		 WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		 firstNameLocalElement.sendKeys("Mahi");
		 
		 WebElement departmentElement = driver.findElement(By.id("createLeadForm_departmentName"));
		 departmentElement.sendKeys("Production");
		 
		 WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
		 descriptionElement.sendKeys("Test");
		 
		 WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
		 emailElement.sendKeys("hi@gmail.com");
		 
		 WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select state = new Select(stateElement);
		 state.selectByVisibleText("New York");
		 
		 WebElement createLeadElement = driver.findElement(By.className("smallSubmit"));
		 createLeadElement.click();
		 
		 System.out.println("The page title is : "+ driver.getTitle());
		 
		 WebElement duplicateLeadElement = driver.findElement(By.linkText("Duplicate Lead"));
		 duplicateLeadElement.click();
		 
		 WebElement dcompanyNameElement = driver.findElement(By.id("createLeadForm_companyName"));;
		 dcompanyNameElement.clear();
		 dcompanyNameElement.sendKeys("XYZ Company");
		 
		 WebElement dfirstName = driver.findElement(By.id("createLeadForm_firstName"));
		 dfirstName.clear();
		 dfirstName.sendKeys("Deena");
		 
		 WebElement dcreateLeadElement = driver.findElement(By.className("smallSubmit"));
		 dcreateLeadElement.click();
		 
		 System.out.println("The page title is : "+ driver.getTitle()); 
	 
 }
}
