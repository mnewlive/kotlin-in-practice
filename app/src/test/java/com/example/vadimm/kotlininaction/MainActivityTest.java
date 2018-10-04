package com.example.vadimm.kotlininaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {

    @Test
    public void shouldNotBeNull() throws Exception {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(activity);
    }
}