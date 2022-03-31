Feature: feature to test login fucntionality of testproject

//scenario outline has fixed values, outline has paramatarized values
@testproject
	Scenario Outline: 
		Given new tab is opened
		And user is on login page of test project
		When user enters <username> and <password>
		And user clicks on login button of test project
		Then user is navigated to the home page of the test project
		
		Examples: |
			|username | password |
			|'Nick' | '12345' |
			|'Daniel' | '12345' |
			|'Jon' | '1234' |
			|'jonny' | '4321' |