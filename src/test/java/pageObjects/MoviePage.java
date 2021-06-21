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

	@FindBy(xpath = "//img[@class='ipc-image' and @alt='Loki']")
	WebElement img_link;

	@FindBy(xpath = "//a[text()='Cast & crew']")
	WebElement cast_link;

	@FindBy(xpath = "//h1[text()='Loki']")
	WebElement movie_title;

	@FindBy(xpath = "//a[contains(text(),'Tom Hiddleston')]")
	WebElement item_cast;

	public void search_movie_title(String username) {
		search_box.sendKeys(username);
	}

	public void selectSeggestionsMovie() {
		img_link.click();
	}

	public void getMovieTitle() {
		movie_title.getText();
	}

	public void getTheTopMovieCast() {
		item_cast.getText();
	}
}
