# Applitools Cross Browser Testing Hackathon 2020
In this framework are used Selenium WebDriver with Java and test assertion library - TestNG.
Test code is organized using the Page Object Model

#### The Hackathon App:
[Version 1](https://demo.applitools.com/gridHackathonV1.html)

[Version 2](https://demo.applitools.com/gridHackathonV2.html)


## Prerequisites:
* Java JDK 11 or higher
* Apache Maven 3.6.3 or higher (Path must be set in in the system environment variables)
* Selenium WebDriver Java 3.164.0
* Applitools Eyes Selenium Java 3.164.0
* TestNG 7.1.0
* WebDriver Manager 4.0.0
* Add your Applitools API key to an environment variable *APPLITOOLS_API_KEY*

#### Required Browsers:
* Chrome 83
* Microsoft Edge 83 
* Firefox 76

## Execute the project:
* To run traditional tests against APP V1: `mvn test -PTraditionalSuiteV1`
* To run traditional tests against APP V2: `mvn test -PTraditionalSuiteV2`
* To run modern tests against V1: `mvn test -PModernSuiteV1`
* To run modern tests against V2: `mvn test -PModernSuiteV2`
