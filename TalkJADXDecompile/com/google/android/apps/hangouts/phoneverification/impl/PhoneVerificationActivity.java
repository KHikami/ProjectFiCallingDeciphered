package com.google.android.apps.hangouts.phoneverification.impl;

import android.os.Bundle;
import bn;
import epw;
import eqf;
import ew;
import gwb;
import jcu;
import jzp;

public class PhoneVerificationActivity extends jzp {
    public PhoneVerificationActivity() {
        new jcu(this, this.q).a(this.p);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.tA);
        if (bundle == null) {
            eqf eqf = new eqf((epw) getIntent().getSerializableExtra("source_activity"));
            ew a = J_().a();
            a.a(bn.e, eqf.a());
            a.a();
        }
    }
}
