$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Movie.feature");
formatter.feature({
  "line": 1,
  "name": "Movie Enthusiast",
  "description": "",
  "id": "movie-enthusiast",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "movie-enthusiast;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user opens url \"https://www.imdb.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user can search movie tittle as \"Loki\" and click search button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user can click first link of movie title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "click on cast link and verify movie cast section",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify movie plot section",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_opens_browser()"
});
formatter.result({
  "duration": 2676655800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.imdb.com/",
      "offset": 16
    }
  ],
  "location": "Steps.user_opens_url(String)"
});
formatter.result({
  "duration": 6183021500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Loki",
      "offset": 33
    }
  ],
  "location": "Steps.user_can_search_movie_tittle_as_and_click_search_button(String)"
});
formatter.result({
  "duration": 3886879300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_can_click_first_link_of_movie_title()"
});
formatter.result({
  "duration": 5216783000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.click_on_cast_link_and_verify_movie_cast_section()"
});
formatter.result({
  "duration": 3957710500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_movie_plot_section()"
});
formatter.result({
  "duration": 140677100,
  "status": "passed"
});
});