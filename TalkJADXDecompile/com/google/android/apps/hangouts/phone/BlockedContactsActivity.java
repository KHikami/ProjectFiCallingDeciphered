package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import android.view.MenuItem;
import dcl;
import gwb;
import jcu;

public class BlockedContactsActivity extends dcl {
    public BlockedContactsActivity() {
        new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.fM);
        g().b(true);
    }

    public boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.a(menuItem);
        }
    }
}
