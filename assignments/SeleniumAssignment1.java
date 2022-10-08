package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement loginUserName = driver.findElement(By.id("username"));
		loginUserName.sendKeys("Demosalesmanager");
		
		WebElement loginPassword = driver.findElement(By.id("password"));
		loginPassword.sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
	    loginButton.click();
	    
	    WebElement clickLink = driver.findElement(By.partialLinkText("CRM/SFA"));
	    clickLink.click();
	    
	    WebElement clickLead = driver.findElement(By.linkText("Leads"));
	    clickLead.click();
	    
	    WebElement clickCreateLead = driver.findElement(By.linkText("Create Lead"));
	    clickCreateLead.click();
	    
	    WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
	    companyName.sendKeys("CTS");
	    
	    WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
	    firstName.sendKeys("Mohamed");
	    
	    WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
	    lastName.sendKeys("Fazil");
	    
	    WebElement firstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	    firstNameLocal.sendKeys("Fazil");
	    
	    WebElement department = driver.findElement(By.name("departmentName"));
	    department.sendKeys("Testing");
	    
	    WebElement description = driver.findElement(By.id("createLeadForm_description"));
	    description.sendKeys("Testing description");
	    
	    WebElement emailId = driver.findElement(By.id("createLeadForm_primaryEmail"));
	    emailId.sendKeys("fazi@test.com");
	    
	    WebElement createButton = driver.findElement(By.className("smallSubmit"));
	    createButton.click();
	    
	    String title = driver.getTitle();
	    System.out.println("The title of the webpage is "+title);
	    
	    if(title.contains("Lead")) {
	    	System.out.println("The testcase is paased");
	    }
	    else {
	    	System.out.println("Different title is showing");
	    }
	    
	    driver.close();
	 }
		

	

}


