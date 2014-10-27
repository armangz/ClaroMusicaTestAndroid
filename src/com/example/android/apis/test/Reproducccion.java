package com.example.android.apis.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;
import com.bitbar.recorder.extensions.ExtSolo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.regex.Pattern;

public class Reproducccion extends ActivityInstrumentationTestCase2<Activity> {

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
	public Reproducccion() {
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
			solo.waitForActivity("StartingActivity");
			solo.waitForActivity("ResponsiveUIFixedActivity");
			//Inicia Lista
			solo.sleep(5000);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.txts_playlists) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.txts_playlists", 5000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.txts_playlists"));
			//Selecciona Cancion
			solo.sleep(10000);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.txt_list_item_title) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.txt_list_item_title", 5000));
			solo.clickOnText((TextView) solo
					.findViewById("com.telcel.imk.R.id.txt_list_item_title"));
			solo.sleep(8000);
			//Siguiente Canción
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_player_proxima) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.btn_player_proxima", 5000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_player_proxima"));
			solo.sleep(25000);
			
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