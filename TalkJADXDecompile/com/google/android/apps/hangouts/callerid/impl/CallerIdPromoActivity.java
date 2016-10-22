package com.google.android.apps.hangouts.callerid.impl;

import android.os.Bundle;
import bfr;
import esb;
import ew;
import gwb;

public class CallerIdPromoActivity extends esb {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.jd);
        ew a = J_().a();
        a.a(gwb.iW, bfr.a(getIntent().getBooleanExtra("callerid_from_promo_flow", false), getIntent().getStringExtra("callerid_current_sim_number")));
        a.a();
    }
}
