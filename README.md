# Testing-Playground

This Repostory should be an eviroment to test and expirment around with various things

## Testing with JUnit

### Best Practice & Naming Conventions

Nameing a test a certian way can lead to a readable and understandable test code.

| Use Case             | Convention                                              | Example                            |
| -------------------- | ------------------------------------------------------- | ---------------------------------- |
| Methods, Class-names | `MethodName_StateUnderTest_ExpectedBehavior`            | `isAdult_AgeLessThan18_False`      |
| Class-name           | `Test*.java` `Test.java` `*Tests.java` `*TestCase.java` | `isAdult_AgeLessThan18_False_Test` |

### Testing Methods

Testing Methods are used to expect a certain value as a result a unit part on an application.

#### Assertions

| Method           | Usage                                                                        |
| ---------------- | ---------------------------------------------------------------------------- |
| `assertEquals()` | Used for testing an expected result, can be repeated with `@RepeatedTest(5)` |
| `assertTrue()`   | Used to test if the result of a methode is true.                             |
| `assertFalse()`  | Used to test if the result of a methode is false.                            |
| `assertAll()`    | Tests multiple methodes at one result.                                       |

#### Assumptions

Used to assume that a current state is happening.

| Method                  | Usage                                                                         |
| ----------------------- | ----------------------------------------------------------------------------- |
| `assumeTrue()`          | Tests if a circumstance is true. If not the test is skipped, else it is true. |
| `assumingThat(, () {})` | Runs test inside Lambda function whenever the assumtion is true.              |

#### Useful Annotations

Maybe useful later.

| Annotation          | Usage                                                                                                                                                                                     |
| ------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `@Tag`              | Define a Tag for a Test.                                                                                                                                                                  |
| `@Order(1)`         | Test Excution Order manipulation                                                                                                                                                          |
| `@Nested`           | Nests in the Test Class written before.                                                                                                                                                   |
| `@RepeatedTest(2)`  | Repeats the test a numeric amount of time.                                                                                                                                                |
| `@ParamterizedTest` | Can run an array of test cases given as parameter, make sure to use this annotation without `@Test` and make sure to use the same or at least a lower than your engine version in pom.xml |
