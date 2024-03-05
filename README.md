# Entrata.com Selenium Automation Project

## Overview
This repository contains Selenium automation scripts written in Java programming language to test the functionality of the demo site located at https://www.entrata.com/

## Prerequisites
- Java
- Maven
- WebDriver (e.g., ChromeDriver)
- TestNg

## Setup Instructions

Use link to clone the repository: https://github.com/PallaviKadamZ/PallaviAssess.git
Required dependancies are mentioned in the pom.xml file


## Running Tests
-you can usually right-click on your TestNG XML file and select "Run" or "Run As TestNG Suite."
-If you want to run TestNG from the command line, you can use the following Maven command:
mvn clean test -DsuiteXmlFile=testng.xml


## Steps to generate Emailable Report:

-Execute Test class and refresh the project. 

-You will get test-output folder.

-In That folder Right click on the "emailable-report.html" and select the option Open with the web browser or double click on it.
