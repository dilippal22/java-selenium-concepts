package com.dgsl.selenium.waitconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomWaitUtility {

	public static WebElement isElementPresnt(WebDriver driver, String xpath, int time) {

		WebElement element = null;

		for (int i = 0; i < time; i++) {
			try {
				element = driver.findElement(By.xpath(xpath));
				break;
			} catch (Exception e) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					System.out.println("Waiting for element to appear on DOM");
				}
			}

		}
		return element;

	}

}
