package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MoviePage;

public class Steps {
	public WebDriver driver;
	public MoviePage mp;

	@Given("user opens browser")
	public void user_opens_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		mp = new MoviePage(driver);
		driver = new ChromeDriver();
	}
	

	@When("user opens url {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@Then("user can search movie tittle as {string}")
	public void user_can_search_movie_tittle_as(String movieTitle) {
		mp.search_movie_title(movieTitle);
	}

	@Then("user can select the suggestions muvie")
	public void user_can_select_the_suggestions_muvie() {
		mp.selectSeggestionsMovie();
	}

	@Then("title of movie should be {string}")
	public void title_of_movie_should_be(String title) { // String expected=title;
		System.out.println(title);

	}

	@Then("movie top cast should be")
	public void movie_top_cast_should_be() {
		mp.getTheTopMovieCast();
	}

	@Then("movie details page is")
	public void movie_details_page_is() {

	}

	@Then("close brouser")
	public void close_brouser() {
		driver.quit();
	}
	
}
