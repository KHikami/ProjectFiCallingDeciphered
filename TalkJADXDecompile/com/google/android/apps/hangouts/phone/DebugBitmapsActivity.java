package com.google.android.apps.hangouts.phone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import ba;
import eli;
import gwb;

public class DebugBitmapsActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gg);
        ((ExpandableListView) findViewById(ba.N)).setAdapter(new eli(this));
    }
}
