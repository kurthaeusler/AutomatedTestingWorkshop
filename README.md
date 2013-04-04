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
