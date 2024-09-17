package Tasca4.Nivell2ENG.n2exercici1.test;

import org.hamcrest.FeatureMatcher;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class ExerciciTest {

	@Test
	void testLength() {
		String str = "Mordor";
		assertThat(str, length(equalTo(8)));
	}
	
	
	Matcher<String> length(Matcher<? super Integer> matcher) {
	    return new FeatureMatcher<String, Integer>(matcher,
	            "a String with length", "length") {
	    	
	        @Override
	        protected Integer featureValueOf(String str) {
	            return str.length();
	        }
	    };
	}
}
