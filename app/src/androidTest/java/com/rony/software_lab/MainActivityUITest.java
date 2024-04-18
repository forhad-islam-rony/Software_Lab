package com.rony.software_lab;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testButton1Click() {

        onView(withId(R.id.btn1)).perform(click());


        onView(withId(R.id.txt1)).check(matches(withText("Forhad Islam Rony")));
    }

    @Test
    public void testButton2Click() {

        onView(withId(R.id.btn2)).perform(click());


        onView(withId(R.id.txt1)).check(matches(withText("KUET")));
    }
}
