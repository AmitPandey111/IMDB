package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviePage {
	public WebDriver ldriver;

	public MoviePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "suggestion-search")
	WebElement search_box;

	@FindBy(id = "suggestion-search-button")
	WebElement btn_search;
	@FindBy(xpath = "//span[contains(text(),'Loki')]")
	WebElement movie_title;

	@FindBy(xpath = "//a[contains(text(),'Tom Hiddleston')]")
	WebElement item_cast;

	@FindBy(xpath = "//tr[@class='findResult odd']/child::td[2]/a[1]")
	WebElement header_link;

	@FindBy(xpath = "//a[contains(text(),'Cast & crew')]")
	WebElement cast_link;

	@FindBy(css = ".show_more")
	WebElement show_more;

	@FindBy(xpath = "//h1[contains(text(),'Full Cast & Crew')]")
	WebElement header_fullCast;

	@FindBy(xpath = "//h4[text()='Storyline']")
	WebElement text_storyLine;

	public void search_movie_title(String username) {
		search_box.sendKeys(username);
	}

	public void clickOnSearchBtn() {
		btn_search.click();
	}

	public void clickOnFirstLinkOfMovieTitle() {
		header_link.click();
	}

	public void clickOnCastLink() {
		cast_link.click();
	}

	public void clickOnShowMore() {
		show_more.click();
	}

	public String getMovieTitle() {
		return header_link.getText();
	}

	public String getCastAndCrewText() {
		return cast_link.getText();
	}

	public String verifyHeaderOfterClickingCast() {
		return header_fullCast.getText();
	}

	public String getStoryLine() {
		return text_storyLine.getText();
	}
}
