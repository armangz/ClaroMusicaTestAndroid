package com.example.android.apis.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;
import com.bitbar.recorder.extensions.ExtSolo;
import android.widget.Button;

public class LoginFacebook extends ActivityInstrumentationTestCase2<Activity> {

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
	public LoginFacebook() {
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
			solo.waitForActivity("MainActivity");
			solo.waitForActivity("ViewStoreActivity");
			solo.sleep(5000);
			assertTrue("Wait for spinner (index: 0) failed.",
					solo.waitForSpinner(0, 5000));
			solo.pressSpinnerItem(0, 1);
			solo.waitForActivity("ViewProfileLoginPostActivity");
			solo.sleep(6800);
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_alert_cancel) failed.",
					solo.waitForButtonById(
							"com.telcel.imk.R.id.btn_alert_cancel", 5000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_alert_cancel"));
			solo.sleep(2500);
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.login_button) failed.",
					solo.waitForButtonById("com.telcel.imk.R.id.login_button",
							5000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.login_button"));
			solo.waitForActivity("StartingActivity");
			solo.waitForActivity("ResponsiveUIFixedActivity");
			solo.sleep(30000);
			
		} catch (AssertionFailedError e) {
			solo.fail(
					"com.example.android.apis.test.LoginFacebook.testRecorded_scr_fail",
					e);
			throw e;
		} catch (Exception e) {
			solo.fail(
					"com.example.android.apis.test.LoginFacebook.testRecorded_scr_fail",
					e);
			throw e;
		}
	}

}
