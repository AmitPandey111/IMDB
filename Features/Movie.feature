Feature: Movie Enthusiast

  Scenario Outline: 
  
    Given user opens browser
    When user opens url "https://www.imdb.com/"
    Then user can search movie tittle as "Loki"
    Then user can select the suggestions muvie
    Then movie top cast should be "Tom Hiddleston"
    Then movie details page is 
    Then close brouser
