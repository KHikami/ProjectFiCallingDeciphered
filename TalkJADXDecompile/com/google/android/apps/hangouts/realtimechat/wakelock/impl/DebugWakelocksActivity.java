package com.google.android.apps.hangouts.realtimechat.wakelock.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import fmk;
import fml;
import fmm;
import fmn;
import fmt;
import gwb;
import jyn;

public class DebugWakelocksActivity extends Activity {
    public fmt a;
    public ListView b;
    public final Runnable c;
    private LinearLayout d;

    public DebugWakelocksActivity() {
        this.c = new fml(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = (fmt) jyn.a((Context) this, fmk.class);
        this.b = new fmm(this, this);
        this.d = new fmn(this, this);
        setContentView(this.d);
    }

    public void onResume() {
        super.onResume();
        this.c.run();
    }

    public void onPause() {
        super.onPause();
        gwb.b(this.c);
    }
}
