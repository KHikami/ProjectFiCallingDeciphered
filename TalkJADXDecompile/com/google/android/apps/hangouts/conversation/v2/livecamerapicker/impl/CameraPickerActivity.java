package com.google.android.apps.hangouts.conversation.v2.livecamerapicker.impl;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import gwb;
import jca;
import jcu;
import jzc;

public class CameraPickerActivity extends jzc {
    private final jca n;

    public CameraPickerActivity() {
        this.n = new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.na);
        Toolbar toolbar = (Toolbar) findViewById(gwb.mQ);
        a(toolbar);
        g().b(true);
        g().c(false);
        setTitle("");
        toolbar.bringToFront();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                super.onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
