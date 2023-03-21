Feature: check availibility to went from main page to site section

  Scenario Template: User went from main page to other sections of site
    Given User open main page
    When User click on "<sectionButton>"
    Then User relocate to "<targetSection>"
    Examples:
      | sectionButton | targetSection    |
      | FormsCategory | FormsPageService |
