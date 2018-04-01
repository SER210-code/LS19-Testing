package edu.quinnipiac.ser210.ls19_unittest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Created by relkharboutly on 3/16/2018.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    private static final String STRING_TO_BE_TYPED = "Ian";

    @Test
    public void sayHello() throws Exception {
      /*  onView(withId(R.id.editText)).perform(typeText("Alex"), closeSoftKeyboard()); //line 1
        onView(withText("Say hello!")).perform(click());
        String expected_text = "Hello, Alex !";
        onView(withId(R.id.textView)).check(matches(withText(expected_text)));
*/
        onView(withId(R.id.editText)).perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard()); //line 1

        onView(withText("Say hello!")).perform(click()); //line 2

        String expectedText = "Hello, Ian!";
        onView(withId(R.id.textView)).check(matches(withText(expectedText))); //line 3

    }

}