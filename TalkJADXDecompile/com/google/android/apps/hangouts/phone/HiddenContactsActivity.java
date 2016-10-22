package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import android.view.MenuItem;
import dcl;
import gwb;
import jcu;

public class HiddenContactsActivity extends dcl {
    public HiddenContactsActivity() {
        new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gN);
        g().b(true);
    }

    protected boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.a(menuItem);
        }
    }
}
