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
			//Selección de la primer lista
			solo.clickInList(1);
			solo.sleep(5000);
			//Selección de la prmiera canción de la lista
			solo.clickInList(1);
			solo.sleep(10000);
			Log.d("TAG", "Selección de Lista");
			//Abrir reproductor completo
			solo.clickInList(4);
			//Tiempr de reproduccion de 3:16 segundos 
			solo.sleep(190000);
			//Adelantar Canción
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_player_opened_proxima) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.btn_player_opened_proxima",
							20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_player_opened_proxima"));
			solo.sleep(10000);
			
			//Atras Canción
			assertTrue(
					"Wait for image (id: com.telcel.imk:id/btn_player_opened_voltar) failed.",
					solo.waitForImageById(
							"com.telcel.imk:id/btn_player_opened_voltar",
							20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk:id/btn_player_opened_voltar"));
			solo.sleep(10000);
			//Pausar
			assertTrue(
					"Wait for image (id: com.telcel.imk:id/btn_player_opened_play_pause) failed.",
					solo.waitForImageById(
							"com.telcel.imk:id/btn_player_opened_play_pause",
							5000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk:id/btn_player_opened_play_pause"));
			solo.sleep(5000);
			
			//Repetir Lista
			assertTrue(
					"Wait for image (id: com.telcel.imk:id/btn_player_opened_repeat) failed.",
					solo.waitForImageById(
							"com.telcel.imk:id/btn_player_opened_repeat",
							5000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk:id/btn_player_opened_repeat"));
			solo.sleep(5000);
			
			//Repetir Canción
			assertTrue(
					"Wait for image (id: com.telcel.imk:id/btn_player_opened_repeat) failed.",
					solo.waitForImageById(
							"com.telcel.imk:id/btn_player_opened_repeat",
							5000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk:id/btn_player_opened_repeat"));
			solo.sleep(5000);
			
			//Shuffle
			assertTrue(
					"Wait for image (id: com.telcel.imk:id/btn_player_opened_shuffle) failed.",
					solo.waitForImageById(
							"com.telcel.imk:id/btn_player_opened_shuffle",
							5000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk:id/btn_player_opened_shuffle"));
			solo.sleep(5000);
			
			//Adelantar Canción
			assertTrue(
					"Wait for image (id: com.telcel.imk.R.id.btn_player_opened_proxima) failed.",
					solo.waitForImageById(
							"com.telcel.imk.R.id.btn_player_opened_proxima",
							20000));
			solo.clickOnImage((ImageView) solo
					.findViewById("com.telcel.imk.R.id.btn_player_opened_proxima"));
			solo.sleep(10000);
			
			
			
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
