package com.ge.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestPalindrome.class,TestStringReverse.class})
public class AllTests {

}
