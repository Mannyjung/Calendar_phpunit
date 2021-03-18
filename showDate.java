import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class showDate {

//	@Test
//		void TC1001() throws InterruptedException {
//			WebDriver driver = null;
//			String browser = "firefox";
//			
//		 if(browser.equalsIgnoreCase("firefox")) {
//				System.setProperty("webdriver.gecko.driver", "C:/Users/Manny/Desktop/geckodriver.exe");
//				driver = new FirefoxDriver();
//			}
//		 driver.get("http://localhost/phpunit/view.php");
//		    driver.manage().window().setSize(new Dimension(1936, 1056));
//		    driver.findElement(By.id("inputState")).click();
//		    {
//		      WebElement dropdown = driver.findElement(By.id("inputState"));
//		      dropdown.findElement(By.xpath("//option[. = 'February']")).click();
//		    }
//		    driver.findElement(By.id("inputState")).click();
//		    driver.findElement(By.name("Day")).click();
//		    {
//		      WebElement dropdown = driver.findElement(By.name("Day"));
//		      dropdown.findElement(By.xpath("//option[. = '3']")).click();
//		    }
//		    driver.findElement(By.name("Day")).click();
//		    driver.findElement(By.cssSelector(".btn")).click();	 
//		    String result1 = driver.findElement(By.id("date")).getText();
//		    Thread.sleep(2000);
//		    assertEquals("Wednesday",result1); 
//		    driver.close();
//		}
//		
//	@Test
//	void TC1002() throws InterruptedException {
//		WebDriver driver = null;
//		String browser = "firefox";
//		
//	 if(browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "C:/Users/Manny/Desktop/geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
//	 driver.get("http://localhost/phpunit/view.php");
//	    driver.manage().window().setSize(new Dimension(1936, 1056));
//	    driver.findElement(By.id("inputState")).click();
//	    {
//	      WebElement dropdown = driver.findElement(By.id("inputState"));
//	      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
//	    }
//	    driver.findElement(By.id("inputState")).click();
//	    driver.findElement(By.name("Day")).click();
//	    {
//	      WebElement dropdown = driver.findElement(By.name("Day"));
//	      dropdown.findElement(By.xpath("//option[. = '15']")).click();
//	    }
//	    driver.findElement(By.name("Day")).click();
//	    driver.findElement(By.cssSelector(".btn")).click();	 
//	    String result2 = driver.findElement(By.id("date")).getText();
//	    Thread.sleep(2000);
//	    assertEquals("Friday",result2);
//	    driver.close();
//	}
//	
//	@Test
//	void TC1003() throws InterruptedException {
//		WebDriver driver = null;
//		String browser = "firefox";
//		
//	 if(browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "C:/Users/Manny/Desktop/geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
//	 driver.get("http://localhost/phpunit/view.php");
//	    driver.manage().window().setSize(new Dimension(1936, 1056));
//	    driver.findElement(By.id("inputState")).click();
//	    {
//	      WebElement dropdown = driver.findElement(By.id("inputState"));
//	      dropdown.findElement(By.xpath("//option[. = 'April']")).click();
//	    }
//	    driver.findElement(By.id("inputState")).click();
//	    driver.findElement(By.name("Day")).click();
//	    {
//	      WebElement dropdown = driver.findElement(By.name("Day"));
//	      dropdown.findElement(By.xpath("//option[. = '20']")).click();
//	    }
//	    driver.findElement(By.name("Day")).click();
//	    driver.findElement(By.cssSelector(".btn")).click();	 
//	    String result3 = driver.findElement(By.id("date")).getText();
//	    Thread.sleep(2000);
//	    assertEquals("Tuesday",result3);
//	    driver.close();
//	}
	@Test
	void testdata1() {
        WebDriver driver = null;
        String browser = "firefox";
        if(browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "C:/Users/Manny/Desktop/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get("http://localhost/phpunit/view.php");
        driver.findElement(By.id("month")).click();
        {
          WebElement dropdown = driver.findElement(By.id("inputState"));
          dropdown.findElement(By.xpath("//option[. = 'March']")).click();
        }
        driver.findElement(By.id("inputState")).click();
        driver.findElement(By.id("Day")).sendKeys("02");
        driver.findElement(By.cssSelector(".btn")).click();	 
        String result = driver.findElement(By.id("date")).getText();
        assertEquals("Wednesday", result);
    }

}
