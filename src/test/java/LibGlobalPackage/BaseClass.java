package LibGlobalPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert l;
	public static Select s;
	public static WebDriverWait w;

	// launch Chrome browser

	// //public static void openChrome() {
	//
	// //WebDriverManager.chromedriver().setup();
	// //ChromeOptions options = new ChromeOptions();
	// //options.addArguments("--remote-allow-origins=*");
	// //disableImageChrome(options);
	// // driver = new ChromeDriver(options);
	//
	//
	// public static ChromeOptions disableImageChrome(ChromeOptions options) {
	// HashMap<String, Object> images=new HashMap<String, Object>();
	// images.put("image", 2);
	// HashMap<String, Object> profile=new HashMap<String, Object>();
	// profile.put("profile",images);
	// options.setExperimentalOption("prefs", profile);
	// return options;
	//
	//     }

	// launch Firefox browser

	public static void openFirefox() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	// launch Edge browser

	public static void openEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	// closeBrower

	public static void closeBrowser() {
		driver.quit();
	}

	// closeCurrentTab

	public static void closeCurrentTab() {
		driver.close();
	}

	// maxWindow

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	// toRefresh

	public static void toRefresh() {
		driver.navigate().refresh();
	}

	// launchUrl

	public static void launchUrl(String url) {
		driver.get(url);
	}

	// sendKeys

	public static void toFillTextbox(WebElement element, String data) {
		element.sendKeys(data);
	}

	// clickButton

	public static void toClickButton(WebElement element) {
		element.click();
	}

	// getText value

	public static void textValue(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// getAttribute value

	public static String attributeValue(WebElement element, String Name) {
		String value = element.getAttribute(Name);
		System.out.println(value);
		return value;
	}

	// getTitle

	public static void toFetchTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);
	}

	// getCurrentUrl

	public static String toFetchUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return currentUrl;
	}

	// drag and drop

	public static void dragDrop(WebElement sr, WebElement dn) {
		a.dragAndDrop(sr, dn).perform();
	}

	// mouseHovering

	public static void mouseHovering(WebElement element) {
		a.moveToElement(element).perform();
	}

	// doubleClick

	public static void toDoubleClick(WebElement element) {
		a.doubleClick(element).perform();
	}

	// rightClick

	public static void toRightClick(WebElement element) {
		a.contextClick(element).perform();
	}

	// 16.copy the text

	public static void copy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	// 17.paste the text

	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	// press Down key

	public static void pressDownKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// press Enter key

	public static void pressEnterKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// press Tab key

	public static void pressTabKey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	// select all text

	public static void selectAllText() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
	}

	// use JavascriptExecutor method replaced by click

	public static void replaceClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	// ScrollDown

	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	// ScrollUp

	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	// to pass thread sleep value

	public static void toThreadSleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}

	// acceptAlert

	public static void acceptAlert() {
		l = driver.switchTo().alert();
		l.accept();
	}
	// dismissAlert

	public static void dismissAlert() {
		l = driver.switchTo().alert();
		l.dismiss();
	}

	// switch into other Window with String windowsId

	public static void switchToWindow(int i) {
		Set<String> allWindowsId = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(allWindowsId);
		driver.switchTo().window(l.get(i));
	}
	// select dropDown by visible text

	public static void toSelectVisibleText(WebElement element, String visibleText) {
		s = new Select(element);
		s.selectByVisibleText(visibleText);
	}

	// select dropDown by value

	public static void toSelectValue(WebElement element, String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	// select dropDown by index

	public static void toSelectIndex(WebElement element, int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	// get current date

	public static String getCurrentDate() {

		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		String date1 = dateFormat.format(date);
		return date1;

	}

	public static void openChrome() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		disableImageChrome(options);
		driver = new ChromeDriver(options);
	}

	public static ChromeOptions disableImageChrome(ChromeOptions options) {
		HashMap<String, Object> images = new HashMap<String, Object>();
		images.put("image", 2);
		HashMap<String, Object> profile = new HashMap<String, Object>();
		profile.put("profile", images);
		options.setExperimentalOption("prefs", profile);
		return options;
	}

	public static void toSelectAndFill(WebElement element, String data) throws AWTException {

		Actions b = new Actions(driver);

		b.doubleClick(element).perform();

		selectAllText();

		element.sendKeys(data);

	}

	public static String plusday(int daysCount) {

		LocalDate date = LocalDate.now();

		LocalDate day = date.plusDays(daysCount);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");

		String formattedDate = day.format(dateTimeFormatter);

		return formattedDate;

	}

}
