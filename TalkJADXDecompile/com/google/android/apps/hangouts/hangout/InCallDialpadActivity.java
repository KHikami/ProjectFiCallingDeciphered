package com.google.android.apps.hangouts.hangout;

import android.os.Bundle;
import dgg;
import dio;
import dw;
import gwb;

public final class InCallDialpadActivity extends dw {
    private final dgg n;
    private dio o;

    public InCallDialpadActivity() {
        this.n = dgg.a();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(gwb.gQ);
    }

    protected void onStart() {
        super.onStart();
        this.o = new dio(this);
        this.n.a(this.o);
    }

    protected void onStop() {
        super.onStop();
        this.n.b(this.o);
    }
}
