package edu.quinnipiac.ser210.ls19_unittest;

import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by relkharboutly on 4/3/2018.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule  = new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void sayHello() throws Exception {
        onView(withId(R.id.editText)).perform(typeText("Kyle"),
        closeSoftKeyboard());
        onView(withText("Say hello!")).perform(click());

        String expected = "Hello, Kyle!";
        onView(withId(R.id.textView)).check(matches(withText(expected)));

    }

}