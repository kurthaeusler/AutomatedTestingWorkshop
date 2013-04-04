AutomatedTestingWorkshop
========================

A simple calculator developed with ATDD / BDD and TDD.

## What will be covered? ##

- Introduction to the ATDD / BDD cycle and the TDD cycle
- Setting up FitNesse and writing a FitNesse Test
- Setting up JBehave and writing a JBehave specification
- Using JUnit and TDD to develop the functionality to make the ATDD test pass and satisfy the BDD specification.

## What will not be covered? ##

- ATDD and BDD tests across a service interface
- Continuous Integration
- Mocking
- Dependency Inversion

## Setting up FitNesse ##

1. Place  `fitnesse-standalone.jar` in a directory.
2. Start FitNesse (and unpack its resources) with this command: `java.exe -jar fitnesse-standalone.jar` This command line could be optimized! These files (in FitNesseRoot) probably don’t belong in source control: `files     FrontPage   PageHeader  updateDoNotCopyOverList FitNesse  PageFooter  properties  updateList`
3. Type `http://localhost/CalculatorSuite` in the address bar to create a new page with the default contents in it.
4. This directory (`FitNesseRoot/CalculatorSuite`) will need to go in source control. I recommend fitnesse-standalone.jar belongs in source control but it is optional
5. Add this to the top of CalculatorSuite, before the !contents (leave contents there)
```
!define TEST_SYSTEM {slim}
!path fitnesse-standalone.jar
!path ../target/test-classes
!path ../target/classes
```

6. Go to Add, then click Test Page. We will use the script table style for simulating the way we want to use our calculator. There are other table styles available. PageName: InitialState. Replace the !contents with:
```
!|import|
|com.kurt.atw.fixtures|
```
```
!|script|CalculatorFixture|
|check|display should be|0.|
```

7. Click test – it should fail. FitNesse also created `FitNesseRoot/ErrorLogs` and `FitNesseRoot/RecentChanges` we probably don’t need them in source control
8. Now create a Java project in the existing directory (Lets make it a Maven project, it simplifies installing JBehave later, but for FitNesse it doesn’t matter). Create a new class (in `src/test/java`) like:

```java
package com.kurt.atw.fixtures;

public class CalculatorFixture {
	public String displayShouldBe()
	{
		return "0.";
	}
}
```
9. On InitialState click Test, and our test is (or should be) green!

## Setting up JBehave ##

1. Create a specification file (call it `basic_display.story`) in `src/test/resources/com/kurt/atw/bdd/specification/` containing:

```cucumber
Feature: A story is a collection of scenarios

Narrative:
In order to start using the calculator
As a user
I want to see the default state

Scenario: A scenario is a collection of executable steps of different type

Given that the calulator exists
When the calculator is turned on
Then the display should read 0.

Scenario: Display changes to reflect button pushes

Given that the calculator is reset
When a <button push> occurs
Then the display should read <display>

Examples:
|button push|display|
|1|1.|
|5|5.|
|9|9.|
```
2. The next file we need is the story runner. This can be done for a single story, or a collection of stories. We will do it for a single story. It is a subclass of a JUnit Test, and can be run in the IDE with normal JUnit test runners. Simply copy the `BasicDisplay.java` file to the appropriate place.
3. Infrastructure files `CalcStory.java` and `StoryConfig.java` can also be copied over.
4. We can install JBehave with the following POM snippet:
```xml
<dependency>
  		<groupId>org.jbehave</groupId>
  		<artifactId>jbehave-core</artifactId>
  		<scope>test</scope>
		<version>LATEST</version>
</dependency>
```
