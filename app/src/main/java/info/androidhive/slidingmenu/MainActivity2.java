package info.androidhive.slidingmenu;

import android.os.Bundle;
import android.widget.Toast;

import info.androidhive.slidingmenu.model.BaseActivity;

/**
 * Created by lenovo on 08-03-2016.
 */
public class MainActivity2 extends BaseActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      //  getLayoutInflater().inflate(R.layout.fragment_find_people, frameLayout);

        Toast.makeText(this, "Main Activity 2", Toast.LENGTH_LONG).show();

        mDrawerList.setOnItemClickListener(new SlideMenuClickListener());

    }

}
