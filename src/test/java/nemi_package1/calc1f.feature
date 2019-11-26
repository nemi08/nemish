Feature: Test Calculator
	This file describes calculator functionality
Scenario: Add two number
	Given I enter 50 in calculator
	And I press add
	And I have entered 50 in calculator
	When I press equal symbol