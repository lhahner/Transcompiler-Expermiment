# Testing-Playground

This Repostory should be an eviroment to test and expirment around with various things

## Testing with JUnit

### Best Practice & Naming Conventions

Nameing a test a certian way can lead to a readable and understandable test code.

| Use Case of Conventions | Convention                                              | Example                            |
| :---------------------- | :------------------------------------------------------ | :--------------------------------- |
| Methods                 | `MethodName_StateUnderTest_ExpectedBehavior`            | `isAdult_AgeLessThan18_False`      |
| Class-name              | `Test*.java` `Test.java` `*Tests.java` `*TestCase.java` | `isAdult_AgeLessThan18_False_Test` |

### Testing Methods

Testing Methods are used to expect a certain value as a result a unit part on an application.

#### Assertions

Assertions in JUnit provide a mechanism for developers to define specific conditions or expectations within test methods, serving as checkpoints to verify that certain aspects of the code under test behave as intended, thereby enhancing the reliability and correctness of software implementations.

| Functions        | Usage                                                                                                                     |
| :--------------- | :------------------------------------------------------------------------------------------------------------------------ |
| `assertEquals()` | Used for testing an expected result, can be repeated with `@RepeatedTest(5)`                                              |
| `assertTrue()`   | Used to test if the result of a methode is true.                                                                          |
| `assertFalse()`  | Used to test if the result of a methode is false.                                                                         |
| `assertAll()`    | Tests multiple methodes at one result.                                                                                    |
| `assertThrows()` | Expects the unit/methode to through the given Exception. <br> If not test fails. Also possible to test custom Exceptions. |

#### Assumptions

Assumptions in JUnit are conditional statements that allow tests to be skipped based on certain conditions not being met, providing a flexible way to manage test execution and handle scenarios where prerequisites or environmental factors are not satisfied.

| Functions               | Usage                                                                         |
| :---------------------- | :---------------------------------------------------------------------------- |
| `assumeTrue()`          | Tests if a circumstance is true. If not the test is skipped, else it is true. |
| `assumingThat(, () {})` | Runs test inside Lambda function whenever the assumtion is true.              |

#### Useful Annotations

Annotations in JUnit are special markers prefixed with the '@' symbol that provide metadata to the JUnit framework, specifying how methods should be treated during testing, including indicating test methods, setup and teardown methods, expected exceptions, and more.

| Annotations         | Usage                                                                                                                                                                                          |
| :------------------ | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `@Tag`              | Define a Tag for a Test.                                                                                                                                                                       |
| `@Order(1)`         | Test Excution Order manipulation                                                                                                                                                               |
| `@Nested`           | Nests in the Test Class written before.                                                                                                                                                        |
| `@RepeatedTest(2)`  | Repeats the test a numeric amount of time.                                                                                                                                                     |
|                     | <br>                                                                                                                                                                                           |
| `@ParamterizedTest` | Can run an array of test cases given as parameter, make sure to use this annotation without <br> `@Test` and make sure to use the same or at least a lower than your engine version in pom.xml |
|                     | <br>                                                                                                                                                                                           |
| `@Timeout(5)`       | Used to wait a given amount of time for a test to start                                                                                                                                        |

## Best Practices and Guidelines

### Statements to make sure regarding the test

In various educational and technical materials, there exist divergent sets of guidelines pertaining to a multitude of subjects. Here, we offer a condensed synthesis of several such guidelines, drawing from diverse sources to provide a comprehensive overview of the topic at hand.

| Mantra                                  | Explanation                                                                                                                                                          |
| :-------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Does It Do What I Want?                 | You want the code to prove to you that it's doing exactly what you think it should.                                                                                  |
| Does It Do What I Want All of the Time? | Make sure the code does what you want all fo the time, even when the winds are high, <br> the parameters are suspect, the disk is full, and the network is sluggish. |
| Can I Depend On It?                     | Know for certain both its strengths and its limitations                                                                                                              |
| Does it Document my Intent?             | Tests can be a executable documentation of the code.                                                                                                                 |
| Right                                   | Are the results **right**? What would the user expect from the code and does it change through the lifetime.                                                         |
| Boundary                                | Are all the **boundary** conditions correct? **CORRECT** Framework: <br>                                                                                             |
|                                         | <br>                                                                                                                                                                 |
|                                         | _**C**onformance_ - Does the value conform to an expected format?                                                                                                    |
|                                         | _**O**dering_ - Is the set of values ordered or unordered as appropiate?                                                                                             |
|                                         | _**R**ange_ - Is the value within reasonable minimum and maximum values?                                                                                             |
|                                         | _**R**eference_ - Does the code reference anything external that isn't under direct control of the code itself?                                                      |
|                                         | _**E**xistence_ - Does the value exist (e.g., is non-null, non-zero, persent in a set, etc.)?                                                                        |
|                                         | _**C**ardinality_ - Are there enough values?                                                                                                                         |
|                                         | _**T**ime_ - Is everything happening in order? At the right time? In time? <br>                                                                                      |
|                                         | <br>                                                                                                                                                                 |
| Inverse                                 | Can you check **inverse** relationsships?                                                                                                                            |
| Cross-check                             | Can you **cross-check** results using other means?                                                                                                                   |
| Error conditions                        | Can you force **error** conditions to happen?                                                                                                                        |
| Performance                             | Are **performance** characteristics within bounds?                                                                                                                   |

### Follow-up on how to thinks about testing

1. Before Developing the Unit, think of possible test cases that should work
2. After pointed out possible "failures", start developing the unit
3. Write the tests accordingly to step 1.
4. Run test's and redesign if needed
