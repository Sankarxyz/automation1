package com.mindtree.uistore;

import org.openqa.selenium.By;

public class HomeUi {

	public static By findFlights = By.xpath("//button[@class='product-tile-button flight selected']");
	public static By origin = By.xpath("//input[@id='home-origin-autocomplete-heatmap']");
	public static By destination = By.xpath("//input[@id='home-destination-autocomplete-heatmap']");
	public static By departDate = By.xpath("//input[@id='home-depart-date-heatmap']");
	public static By search = By.xpath("//button[contains(text(),' Search ')]");
	public static By oneway = By.xpath("(//div[@class='radiobuttons'])[2]/child::label[contains(text(),'One way')]");
	public static By confirm = By.xpath("//button[@class='calendar-button']");
	public static By login = By.xpath("//span[@id='loginModal']");
}
