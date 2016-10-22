package com.google.android.apps.hangouts.conversation.peopleandoptions.impl;

import android.os.Bundle;
import android.view.MenuItem;
import dcl;
import gwb;
import jcu;
import tp;

public class PeopleAndOptionsActivity extends dcl {
    public PeopleAndOptionsActivity() {
        new jcu(this, this.F).a(this.E);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.la);
        tp g = g();
        g.b(true);
        g.a(gwb.lc);
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
