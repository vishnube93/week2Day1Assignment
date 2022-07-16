package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// launch the Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/contro/login");
		// Maximize the browser
		driver.manage().window().maximize();
		// Add the wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Enter Username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click leads
		driver.findElement(By.linkText("Leads")).click();
		// Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		// Enter First name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishnu");
		// Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangappan");
		// Enter FirstName(Local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vishnu");
		// Enter Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		// Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead was sourced by Employee");
		// Enter email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vishnudreams7@gmail.com");
		// Select State/Province as NewYork Using Visible Text
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop1 = new Select(state);
		drop1.selectByVisibleText("New York");
		// Click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		// Get the Title of Resulting Page
		String title = driver.getTitle();
		System.out.println(title);
		// Click on Duplicate Lead button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		// Clear the CompanyName Field using .clear() And Enter new CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Automation");
		// Clear the FirstName Field using .clear() And Enter new FirstName
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shiva");
		// Click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		// Get the Title of Resulting Page
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

}
