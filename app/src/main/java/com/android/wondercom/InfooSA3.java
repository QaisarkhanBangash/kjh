package com.android.wondercom;

import android.app.Activity;
import android.os.Bundle;

public class InfooSA3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoo_sa3);

        getActionBar().setTitle("   Information");
        getActionBar().setHomeAsUpIndicator(R.drawable.back);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
