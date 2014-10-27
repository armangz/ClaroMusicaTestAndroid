package com.example.android.apis.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;
import com.bitbar.recorder.extensions.ExtSolo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import java.util.regex.Pattern;

public class Login_Email extends ActivityInstrumentationTestCase2<Activity> {

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
	public Login_Email() {
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
			//Selección de Spinner "México" 
			solo.sleep(5000);
			assertTrue("Wait for spinner (index: 0) failed.",
					solo.waitForSpinner(0, 2000));
			solo.pressSpinnerItem(0, 1);
			solo.waitForActivity("ViewProfileLoginPostActivity");
			solo.sleep(5300);
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_alert_cancel) failed.",
					solo.waitForButtonById(
							"com.telcel.imk.R.id.btn_alert_cancel", 5000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_alert_cancel"));
			solo.sleep(1500);
			assertTrue(
					"Wait for view (id: com.telcel.imk.R.id.btn_lnt_login) failed.",
					solo.waitForViewById("com.telcel.imk.R.id.btn_lnt_login",
							5000));
			solo.clickOnView(solo
					.findViewById("com.telcel.imk.R.id.btn_lnt_login"));
			solo.sleep(5000);
			assertTrue(
					"Wait for edit text (id: com.telcel.imk.R.id.edt_user) failed.",
					solo.waitForEditTextById("com.telcel.imk.R.id.edt_user",
							5000));
			solo.enterText((EditText) solo
					.findViewById("com.telcel.imk.R.id.edt_user"),
					"claromusicatest@gmail.com");
			solo.sleep(3000);
			assertTrue(
					"Wait for edit text (id: com.telcel.imk.R.id.edt_password) failed.",
					solo.waitForEditTextById(
							"com.telcel.imk.R.id.edt_password", 5000));
			solo.enterText((EditText) solo
					.findViewById("com.telcel.imk.R.id.edt_password"),
					"ClaroMusicaAMCO");
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_login) failed.",
					solo.waitForButtonById("com.telcel.imk.R.id.btn_login",
							5000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_login"));
			solo.waitForActivity("StartingActivity");
			solo.waitForActivity("ResponsiveUIFixedActivity");
			solo.sleep(2100);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_alert_cancel) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.btn_alert_cancel", 2000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_alert_cancel"));
			solo.sleep(10000);
			
		} catch (AssertionFailedError e) {
			solo.fail(
					"com.example.android.apis.test.Test.testRecorded_scr_fail",
					e);
			throw e;
		} catch (Exception e) {
			solo.fail(
					"com.example.android.apis.test.Test.testRecorded_scr_fail",
					e);
			throw e;
		}
	}

}
