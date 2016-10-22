package com.google.android.apps.hangouts.peoplelistv2.impl;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import ba;
import dcl;
import ed;
import eht;
import gai;
import gwb;
import jcu;

public class PeopleSearchActivity extends dcl {
    public PeopleSearchActivity() {
        new jcu(this, this.F).a(this.E);
        new gai((Activity) this, this.F).b(this.E);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.hn);
        ed J_ = J_();
        eht eht = (eht) J_.a(ba.dW);
        if (eht == null) {
            eht = new eht();
            J_.a().a(ba.dW, eht, PeopleSearchActivity.class.getName()).a();
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        findViewById(ba.dX);
        eht.a(layoutInflater, this.q);
        g().b(true);
    }
}
