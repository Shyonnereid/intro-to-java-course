package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Basic Test Suite")
public class AppTest {

    // Create an instance of the FizzBuzz class to test
    final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    @DisplayName("prints Fizz")
    public void printsFizz() {
        assertEquals("Fizz", FizzBuzz.get(3));
    }
    }
