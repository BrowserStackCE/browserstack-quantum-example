package com.quantum.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.quantum.utils.DriverUtils;
import com.quantum.utils.ReportUtils;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class WikipediaPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "org.wikipedia.alpha:id/search_container")
	private QAFExtendedWebElement searchBar;

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub

	}

	public void click_on_search_box() {
		QAFExtendedWebElement ele = new QAFExtendedWebElement(By.id("org.wikipedia.alpha:id/search_container"));
		try {
			ele.click();
		} catch (Exception e) {
		}

	}

	public void is_searched(String wikiSearch) {
		QAFExtendedWebElement ele = new QAFExtendedWebElement(By.id("org.wikipedia.alpha:id/search_src_text"));
		try {
			ele.sendKeys(wikiSearch);
		} catch (Exception e) {
		}
	}
}
