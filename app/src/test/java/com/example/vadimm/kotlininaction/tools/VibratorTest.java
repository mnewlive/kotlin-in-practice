package com.example.vadimm.kotlininaction.tools;

import static com.example.vadimm.kotlininaction.tools.VibrationToolsKt.getVibratePattern;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.robolectric.Shadows.shadowOf;

import android.content.Context;
import android.os.Vibrator;

import com.example.vadimm.kotlininaction.BuildConfig;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class VibratorTest {

    private Vibrator vibrator;

    @Before
    public void before() {
        vibrator = (Vibrator) RuntimeEnvironment.application.getSystemService(Context.VIBRATOR_SERVICE);
    }

    @Test
    public void hasVibrator() {
        assertTrue(vibrator.hasVibrator());

        shadowOf(vibrator).setHasVibrator(false);

        assertFalse(vibrator.hasVibrator());
    }

    @Test
    public void vibrateMilliseconds() {
        vibrator.vibrate(5000);

        assertTrue(shadowOf(vibrator).isVibrating());
        assertThat(shadowOf(vibrator).getMilliseconds(), equalTo(5000L));

        Robolectric.getForegroundThreadScheduler().advanceToNextPostedRunnable();

        assertFalse(shadowOf(vibrator).isVibrating());
    }

    @Test
    public void vibratePattern() {
        long[] pattern = getVibratePattern();
        vibrator.vibrate(pattern, 1);

        assertTrue(shadowOf(vibrator).isVibrating());
        assertThat(shadowOf(vibrator).getPattern(), equalTo(pattern));
        assertThat(shadowOf(vibrator).getRepeat(), equalTo(1));
    }

    @Test
    public void cancelled() {
        vibrator.vibrate(5000);

        assertTrue(shadowOf(vibrator).isVibrating());
        assertFalse(shadowOf(vibrator).isCancelled());

        vibrator.cancel();

        assertFalse(shadowOf(vibrator).isVibrating());
        assertTrue(shadowOf(vibrator).isCancelled());
    }
}