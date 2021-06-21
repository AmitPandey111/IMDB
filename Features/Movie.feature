Feature: Movie Enthusiast

  Scenario: 
  
    Given user opens browser
    When user opens url "https://www.imdb.com/"
    Then user can search movie tittle as "Loki" and click search button
    Then user can click first link of movie title
    Then click on cast link and verify movie cast section 
    Then verify movie plot section 
    
