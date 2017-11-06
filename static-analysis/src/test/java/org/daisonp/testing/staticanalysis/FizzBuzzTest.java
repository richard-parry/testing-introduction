package org.daisonp.testing.staticanalysis;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest {

  @Parameters(name = "Input = {0}, Expect={1}")
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] { 
      { 1, "1" }, 
      { 3, "Fizz" }, 
      { 5, "Buzz" }, 
      { 15, "FizzBuzz" } 
     });
  }

  @Parameter
  public int input;

  @Parameter(1)
  public String expected;

  @Test
  public void run_test() {
    assertEquals(expected,  FizzBuzz.run(input));
  }

}
