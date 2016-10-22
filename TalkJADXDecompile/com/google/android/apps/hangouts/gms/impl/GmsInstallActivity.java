package com.google.android.apps.hangouts.gms.impl;

import android.content.Intent;
import android.os.Bundle;
import dcl;
import dfp;
import gwb;
import jzp;

public final class GmsInstallActivity extends jzp {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int a = new dfp(this).a(false);
        if (a == 0) {
            g();
            return;
        }
        gwb.d(a, 1001).a(J_().a(), "gmscore dialog");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1001:
                g();
            default:
        }
    }

    private void g() {
        dcl.p = false;
        boolean z = getIntent().getExtras().getBoolean("from_main_launcher");
        Intent g = gwb.g(null);
        if (z) {
            g.setAction("android.intent.action.MAIN");
        }
        g.addFlags(32768);
        startActivity(g);
        finish();
    }
}
