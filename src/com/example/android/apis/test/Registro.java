package com.example.android.apis.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;
import com.bitbar.recorder.extensions.ExtSolo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Registro extends ActivityInstrumentationTestCase2<Activity> {

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
	public Registro() {
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
					solo.waitForSpinner(0, 20000));
			solo.pressSpinnerItem(0, 1);
			solo.waitForActivity("ViewProfileLoginPostActivity");
			solo.sleep(3800);
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_alert_cancel) failed.",
					solo.waitForButtonById(
							"com.telcel.imk.R.id.btn_alert_cancel", 20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_alert_cancel"));
			solo.sleep(1200);
			assertTrue(
					"Wait for view (id: com.telcel.imk.R.id.btn_lnt_register) failed.",
					solo.waitForViewById(
							"com.telcel.imk.R.id.btn_lnt_register", 20000));
			solo.clickOnView(solo
					.findViewById("com.telcel.imk.R.id.btn_lnt_register"));
			solo.sleep(4000);
			assertTrue(
					"Wait for edit text (id: com.telcel.imk.R.id.edt_register_name) failed.",
					solo.waitForEditTextById(
							"com.telcel.imk.R.id.edt_register_name", 20000));
			solo.enterText((EditText) solo
					.findViewById("com.telcel.imk.R.id.edt_register_name"),
					"Elias");
			assertTrue(
					"Wait for view (id: com.telcel.imk.R.id.btn_lnt_register) failed.",
					solo.waitForViewById(
							"com.telcel.imk.R.id.btn_lnt_register", 20000));
			solo.clickOnView(solo
					.findViewById("com.telcel.imk.R.id.btn_lnt_register"));
			solo.sleep(1400);
			assertTrue(
					"Wait for view (id: com.telcel.imk.R.id.btn_lnt_register) failed.",
					solo.waitForViewById(
							"com.telcel.imk.R.id.btn_lnt_register", 20000));
			solo.clickOnView(solo
					.findViewById("com.telcel.imk.R.id.btn_lnt_register"));
			solo.sleep(1600);
			solo.drag(solo.toScreenX(0.789f), solo.toScreenX(0.843f),
					solo.toScreenY(0.730f), solo.toScreenY(0.521f), 34);
			solo.sleep(7600);
			assertTrue(
					"Wait for edit text (id: com.telcel.imk.R.id.edt_register_surname) failed.",
					solo.waitForEditTextById(
							"com.telcel.imk.R.id.edt_register_surname", 20000));
			solo.enterText((EditText) solo
					.findViewById("com.telcel.imk.R.id.edt_register_surname"),
					"P\u00E9rez ");
			solo.sleep(5100);
			solo.drag(solo.toScreenX(0.710f), solo.toScreenX(0.772f),
					solo.toScreenY(0.716f), solo.toScreenY(0.554f), 50);
			solo.sleep(5200);
			assertTrue(
					"Wait for edit text (id: com.telcel.imk.R.id.edt_register_email) failed.",
					solo.waitForEditTextById(
							"com.telcel.imk.R.id.edt_register_email", 20000));
			solo.enterText((EditText) solo
					.findViewById("com.telcel.imk.R.id.edt_register_email"),
					"claromusicatest1@gmail.com");
			solo.sleep(5000);
			assertTrue(
					"Wait for edit text (id: com.telcel.imk.R.id.edt_register_email_confirm) failed.",
					solo.waitForEditTextById(
							"com.telcel.imk.R.id.edt_register_email_confirm", 20000));
			solo.enterText((EditText) solo
					.findViewById("com.telcel.imk.R.id.edt_register_email_confirm"),
					"claromusicatest1@gmail.com");
			solo.sleep(5000);
			assertTrue(
					"Wait for edit text (id: com.telcel.imk.R.id.edt_register_senha) failed.",
					solo.waitForEditTextById(
							"com.telcel.imk.R.id.edt_register_senha", 20000));
			solo.enterText((EditText) solo
					.findViewById("com.telcel.imk.R.id.edt_register_senha"),
					"ClaroMusica");
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_register) failed.",
					solo.waitForButtonById("com.telcel.imk.R.id.btn_register",
							20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_register"));
			solo.waitForActivity("StartingActivity");
			solo.waitForActivity("ResponsiveUIFixedActivity");
			solo.sleep(6200);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_alert_cancel) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.btn_alert_cancel", 20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_alert_cancel"));
		} catch (AssertionFailedError e) {
			solo.fail(
					"com.example.android.apis.test.Registro.testRecorded_scr_fail",
					e);
			throw e;
		} catch (Exception e) {
			solo.fail(
					"com.example.android.apis.test.Registro.testRecorded_scr_fail",
					e);
			throw e;
		}
	}

}
