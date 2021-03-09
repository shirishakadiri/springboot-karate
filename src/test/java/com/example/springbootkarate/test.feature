Feature:

  Scenario: simple get
    Given url 'http://localhost:8080'
    When method GET
    Then match $ == 'hello world'

  Scenario: get with name
    Given url 'http://localhost:8080/by-name'
    And params {name: 'Shirisha Reddy'}
    When method GET
    Then match $ == 'hello Shirisha Reddy'

  Scenario: save test
    Given url 'http://localhost:8080'
    And request {name: 'test'}
    When method POST
    Then status 201