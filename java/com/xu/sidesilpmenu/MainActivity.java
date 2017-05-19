package com.xu.sidesilpmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

import com.xu.sidesilpmenu.ui.SlideMenu;

public class MainActivity extends Activity implements OnClickListener{

    private SlideMenu sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        sm = (SlideMenu) findViewById(R.id.sm);
        findViewById(R.id.ib_back).setOnClickListener(this);

    }

    public void onTabClick(View view){

    }

    @Override
    public void onClick(View v) {
        sm.switchState();
    }

}

