package info.androidhive.slidingmenu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

/**
 * Created by lenovo on 08-03-2016.
 */
public class MainOption extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("MAIN","************* From Main option");

        setContentView(R.layout.mainoption);
    }

    public void gotoMain1(View view) {

        Intent intent= new Intent(MainOption.this,MainActivity.class);
        startActivity(intent);
    }

    public void gotoMain2(View view) {

        Intent intent= new Intent(MainOption.this,MainActivity2.class);
        startActivity(intent);
    }
}
