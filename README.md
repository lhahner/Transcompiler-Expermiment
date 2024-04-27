# Testing-Playground

This Repostory should be an eviroment to test and expirment around with various things

## Testing

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
