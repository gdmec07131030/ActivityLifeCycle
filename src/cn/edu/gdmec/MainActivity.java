package cn.edu.gdmec;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {
	 private static final String TAG = "LIFECYCLE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	protected void onDestroy() {
		Log.i(TAG, "The activity state---->onDestroy");
		super.onDestroy();
	}


	@Override
	protected void onPause() {
		Log.i(TAG, "The activity state---->onPause");
		super.onPause();
	}


	@Override
	protected void onRestart() {
		Log.i(TAG, "The activity state---->onReatart");
		super.onRestart();
	}


	@Override
	protected void onResume() {
		Log.i(TAG, "The activity state---->onResume");
		super.onResume();
	}


	@Override
	protected void onStart() {
		Log.i(TAG, "The activity state---->onStart");
		super.onStart();
	}


	@Override
	protected void onStop() {
		Log.i(TAG, "The activity state---->onStop");
		super.onStop();
	}
    
}
