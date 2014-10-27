package com.example.android.apis.test;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.app.Activity;
import junit.framework.AssertionFailedError;
import com.bitbar.recorder.extensions.ExtSolo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Reproducir extends ActivityInstrumentationTestCase2<Activity> {

	private static final String LAUNCHER_ACTIVITY_CLASSNAME = "com.telcel.imk.activities.MainActivity";
	private static Class<?> launchActivityClass;
	static {
		try {
			launchActivityClass = Class.forName(LAUNCHER_ACTIVITY_CLASSNAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	private ExtSolo solo; // ExtSolo is an extension of Robotium Solo that helps collecting better test execution data during test runs

	@SuppressWarnings("unchecked")
	public Reproducir() {
		super((Class<Activity>) launchActivityClass);
	}

	@Override
	public void setUp() throws Exception {
		super.setUp();
		solo = new ExtSolo(getInstrumentation(), getActivity(), this.getClass()
				.getCanonicalName(), getName());
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
		solo.tearDown();
		super.tearDown();
	}

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("ResponsiveUIFixedActivity");
			
			solo.clickInList(1);
			solo.sleep(5000);
			Log.d("TAG", "Selección de Lista");
			
			solo.clickInList(1);
			solo.sleep(10000);
			Log.d("TAG", "Selección de Lista");
			
			solo.clickInList(4);
			solo.sleep(190000);

			
		} catch (AssertionFailedError e) {
			solo.fail(
					"com.example.android.apis.test.Reproducir.testRecorded_scr_fail",
					e);
			throw e;
		} catch (Exception e) {
			solo.fail(
					"com.example.android.apis.test.Reproducir.testRecorded_scr_fail",
					e);
			throw e;
		}
	}

}
