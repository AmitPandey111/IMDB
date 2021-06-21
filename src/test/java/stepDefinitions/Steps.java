package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;				
import org.junit.Test;	

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MoviePage;

public class Steps {
	public WebDriver driver;
	public MoviePage mp;

	@Given("^user opens browser$")
	public void user_opens_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		mp = new MoviePage(driver);
	}

	@When("^user opens url \"([^\"]*)\"$")
	public void user_opens_url(String url) {
		driver.get(url);

	}

	@Then("user can search movie tittle as \"([^\"]*)\" and click search button")
	public void user_can_search_movie_tittle_as_and_click_search_button(String movieTitle) {
		mp.search_movie_title(movieTitle);
		mp.clickOnSearchBtn();
		String actualValue=mp.getMovieTitle();
		String axpectedValue="Loki";
		assertEquals(actualValue, axpectedValue);

	}

	@Then("user can click first link of movie title")
	public void user_can_click_first_link_of_movie_title() {
		mp.clickOnFirstLinkOfMovieTitle();
		String actualValue=mp.getCastAndCrewText();
		String axpectedValue="Cast & crew";
		assertEquals(actualValue, axpectedValue);
	}

	@Then("click on cast link and verify movie cast section")
	public void click_on_cast_link_and_verify_movie_cast_section() throws InterruptedException {
		//wait(5);
		mp.clickOnCastLink();
		String actualValue=mp.verifyHeaderOfterClickingCast();
		String axpectedValue="Full Cast & Crew";
		assertEquals(actualValue, axpectedValue);
	}

	@Then("verify movie plot section")
	public void verify_movie_plot_section() {
		mp.clickOnShowMore();
		String actualValue=mp.getStoryLine();
		String axpectedValue="Storyline";
		assertEquals(actualValue, axpectedValue);
	}

}
