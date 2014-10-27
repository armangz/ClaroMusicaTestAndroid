package com.example.android.apis.test;

import android.test.ActivityInstrumentationTestCase2;
import android.app.Activity;
import junit.framework.AssertionFailedError;
import com.bitbar.recorder.extensions.ExtSolo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Listas extends ActivityInstrumentationTestCase2<Activity> {

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
	public Listas() {
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

	private void gestureGroup_1() throws Exception {
		float points[][] = { { 0.0542f, 0.6375f }, { 0.1667f, 0.6273f },
				{ 0.2181f, 0.6234f }, { 0.2417f, 0.6234f },
				{ 0.2542f, 0.6234f }, { 0.2694f, 0.6234f },
				{ 0.2819f, 0.6242f }, { 0.2917f, 0.6258f },
				{ 0.3014f, 0.6266f }, { 0.3083f, 0.6281f },
				{ 0.3194f, 0.6297f }, { 0.3292f, 0.6313f },
				{ 0.3403f, 0.6328f }, { 0.3486f, 0.6344f },
				{ 0.3569f, 0.6359f }, { 0.3653f, 0.6367f },
				{ 0.3736f, 0.6383f }, { 0.3847f, 0.6398f },
				{ 0.3972f, 0.6406f }, { 0.4097f, 0.6422f },
				{ 0.4208f, 0.6438f }, { 0.4292f, 0.6453f },
				{ 0.4375f, 0.6469f }, { 0.4486f, 0.6484f },
				{ 0.4583f, 0.6492f }, { 0.4694f, 0.6508f },
				{ 0.4792f, 0.6516f }, { 0.4847f, 0.6516f },
				{ 0.4903f, 0.6516f }, { 0.4931f, 0.6516f },
				{ 0.4944f, 0.6516f }, { 0.4931f, 0.6508f },
				{ 0.4903f, 0.6500f }, { 0.4875f, 0.6500f },
				{ 0.4847f, 0.6492f }, { 0.4819f, 0.6492f },
				{ 0.4792f, 0.6484f }, { 0.4764f, 0.6469f },
				{ 0.4722f, 0.6453f }, { 0.4694f, 0.6445f },
				{ 0.4653f, 0.6445f }, { 0.4611f, 0.6445f },
				{ 0.4583f, 0.6445f }, { 0.4556f, 0.6438f },
				{ 0.4500f, 0.6430f }, { 0.4458f, 0.6430f },
				{ 0.4361f, 0.6430f }, { 0.4250f, 0.6430f },
				{ 0.4153f, 0.6430f }, { 0.4083f, 0.6422f },
				{ 0.4000f, 0.6422f }, { 0.3889f, 0.6414f },
				{ 0.3778f, 0.6414f }, { 0.3653f, 0.6406f },
				{ 0.3514f, 0.6406f }, { 0.3403f, 0.6398f },
				{ 0.3292f, 0.6391f }, { 0.3194f, 0.6391f },
				{ 0.3097f, 0.6391f }, { 0.3014f, 0.6391f },
				{ 0.2931f, 0.6391f }, { 0.2847f, 0.6383f },
				{ 0.2764f, 0.6383f }, { 0.2708f, 0.6375f },
				{ 0.2639f, 0.6367f }, { 0.2583f, 0.6367f },
				{ 0.2542f, 0.6367f }, { 0.2486f, 0.6367f },
				{ 0.2444f, 0.6367f }, { 0.2417f, 0.6352f },
				{ 0.2389f, 0.6359f }, { 0.2361f, 0.6359f },
				{ 0.2347f, 0.6359f }, { 0.2319f, 0.6359f },
				{ 0.2292f, 0.6359f }, { 0.2264f, 0.6359f },
				{ 0.2236f, 0.6352f }, { 0.2208f, 0.6352f },
				{ 0.2181f, 0.6352f }, { 0.2153f, 0.6352f },
				{ 0.2125f, 0.6352f }, { 0.2097f, 0.6352f },
				{ 0.2069f, 0.6352f }, { 0.2042f, 0.6352f },
				{ 0.2014f, 0.6352f }, { 0.1986f, 0.6352f },
				{ 0.1972f, 0.6352f }, { 0.1944f, 0.6352f },
				{ 0.1889f, 0.6352f }, { 0.1833f, 0.6352f },
				{ 0.1778f, 0.6352f }, { 0.1736f, 0.6352f },
				{ 0.1694f, 0.6352f }, { 0.1653f, 0.6352f },
				{ 0.1625f, 0.6352f }, { 0.1597f, 0.6352f },
				{ 0.1569f, 0.6352f }, { 0.1542f, 0.6336f },
				{ 0.1514f, 0.6336f }, { 0.1403f, 0.6336f },
				{ 0.1361f, 0.6328f }, { 0.1361f, 0.6320f },
				{ 0.1333f, 0.6320f }, { 0.1306f, 0.6320f },
				{ 0.1292f, 0.6320f }, { 0.1278f, 0.6320f },
				{ 0.1250f, 0.6305f }, { 0.1222f, 0.6297f },
				{ 0.1222f, 0.6305f }, { 0.1222f, 0.6305f } };
		solo.multiDrag(points);
	}

	public void testRecorded() throws Exception {
		try {
			solo.waitForActivity("MainActivity");
			solo.waitForActivity("ViewStoreActivity");
			solo.sleep(11400);
			assertTrue("Wait for spinner (index: 0) failed.",
					solo.waitForSpinner(0, 20000));
			solo.pressSpinnerItem(0, 1);
			solo.waitForActivity("ViewProfileLoginPostActivity");
			solo.sleep(5300);
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_alert_cancel) failed.",
					solo.waitForButtonById(
							"com.telcel.imk.R.id.btn_alert_cancel", 20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_alert_cancel"));
			solo.sleep(2500);
			assertTrue(
					"Wait for view (id: com.telcel.imk.R.id.btn_lnt_login) failed.",
					solo.waitForViewById("com.telcel.imk.R.id.btn_lnt_login",
							20000));
			solo.clickOnView(solo
					.findViewById("com.telcel.imk.R.id.btn_lnt_login"));
			solo.sleep(39300);
			assertTrue(
					"Wait for edit text (id: com.telcel.imk.R.id.edt_password) failed.",
					solo.waitForEditTextById(
							"com.telcel.imk.R.id.edt_password", 20000));
			solo.enterText((EditText) solo
					.findViewById("com.telcel.imk.R.id.edt_password"),
					"ClaroMusicaAMCO");
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_login) failed.",
					solo.waitForButtonById("com.telcel.imk.R.id.btn_login",
							20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_login"));
			solo.sleep(9200);
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_login) failed.",
					solo.waitForButtonById("com.telcel.imk.R.id.btn_login",
							20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_login"));
			solo.waitForActivity("StartingActivity");
			solo.waitForActivity("ResponsiveUIFixedActivity");
			solo.sleep(27800);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_alert_cancel) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.btn_alert_cancel", 20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_alert_cancel"));
			solo.sleep(47700);
			assertTrue("Wait for view (index: 74) failed.",
					solo.waitForView(74, 20000));
			solo.clickOnView(74);
			solo.sleep(5600);
			assertTrue("Wait for view (index: 77) failed.",
					solo.waitForView(77, 20000));
			solo.clickOnView(77);
			solo.sleep(5300);
			assertTrue("Wait for view (index: 80) failed.",
					solo.waitForView(80, 20000));
			solo.clickOnView(80);
			solo.sleep(4100);
			assertTrue("Wait for view (index: 83) failed.",
					solo.waitForView(83, 20000));
			solo.clickOnView(83);
			solo.sleep(8300);
			assertTrue("Wait for view (index: 77) failed.",
					solo.waitForView(77, 20000));
			solo.clickOnView(77);
			solo.sleep(10300);
			assertTrue("Wait for list (index: 2) failed.",
					solo.waitForList(2, 20000));
			solo.scrollListToLine(2, 10);
			solo.sleep(25300);
			solo.drag(solo.toScreenX(0.243f), solo.toScreenX(0.171f),
					solo.toScreenY(0.585f), solo.toScreenY(0.482f), 6);
			solo.sleep(3300);
			assertTrue("Wait for list (index: 2) failed.",
					solo.waitForList(2, 20000));
			solo.scrollListToLine(2, 14);
			solo.sleep(9600);
			solo.drag(solo.toScreenX(0.231f), solo.toScreenX(0.754f),
					solo.toScreenY(0.653f), solo.toScreenY(0.672f), 18);
			solo.sleep(3500);
			solo.drag(solo.toScreenX(0.951f), solo.toScreenX(0.228f),
					solo.toScreenY(0.714f), solo.toScreenY(0.639f), 32);
			solo.sleep(7300);
			solo.drag(solo.toScreenX(0.563f), solo.toScreenX(0.881f),
					solo.toScreenY(0.647f), solo.toScreenY(0.670f), 6);
			solo.sleep(12400);
			gestureGroup_1();
			solo.sleep(5000);
			solo.drag(solo.toScreenX(0.143f), solo.toScreenX(0.932f),
					solo.toScreenY(0.625f), solo.toScreenY(0.656f), 17);
			solo.sleep(38600);
			solo.drag(solo.toScreenX(0.226f), solo.toScreenX(0.068f),
					solo.toScreenY(0.721f), solo.toScreenY(0.475f), 53);
			solo.sleep(36100);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_playlist_opcoes) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.btn_playlist_opcoes", 20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_playlist_opcoes"));
			solo.sleep(5900);
			assertTrue(
					"Wait for button (id: com.telcel.imk.R.id.btn_alert_cancel) failed.",
					solo.waitForButtonById(
							"com.telcel.imk.R.id.btn_alert_cancel", 20000));
			solo.clickOnButton((Button) solo
					.findViewById("com.telcel.imk.R.id.btn_alert_cancel"));
			solo.sleep(29300);
			solo.drag(solo.toScreenX(0.514f), solo.toScreenX(0.568f),
					solo.toScreenY(0.502f), solo.toScreenY(0.000f), 9);
			solo.sleep(4900);
			assertTrue(
					"Wait for view (id: com.telcel.imk.R.id.condensedContent) failed.",
					solo.waitForViewById(
							"com.telcel.imk.R.id.condensedContent", 20000));
			solo.clickOnView(solo
					.findViewById("com.telcel.imk.R.id.condensedContent"));
			solo.sleep(3200);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_player_opened_open_lista_reprod) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.btn_player_opened_open_lista_reprod",
							20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_player_opened_open_lista_reprod"));
			solo.waitForActivity("PlayerListActivity");
			solo.sleep(18500);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.img_lista_reproducao_icon) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.img_lista_reproducao_icon",
							20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.img_lista_reproducao_icon"));
			solo.waitForActivity("ResponsiveUIFixedActivity");
			solo.sleep(4900);
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_menu_left) failed.",
					solo.waitForImageById("com.telcel.imk.R.id.btn_menu_left",
							20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_menu_left"));
		} catch (AssertionFailedError e) {
			solo.fail(
					"com.example.android.apis.test.Listas.testRecorded_scr_fail",
					e);
			throw e;
		} catch (Exception e) {
			solo.fail(
					"com.example.android.apis.test.Listas.testRecorded_scr_fail",
					e);
			throw e;
		}
	}

}
