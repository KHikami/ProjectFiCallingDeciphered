package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba;
import dgf;
import dgg;
import dht;
import dhu;
import itg;

public final class BroadcastOverlayView extends LinearLayout implements dht {
    public final dgg a;
    public TextView b;
    private final itg c;
    private TextView d;

    public BroadcastOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new dgf(this);
        this.a = dgg.a();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(ba.bB);
        this.d = (TextView) findViewById(ba.bD);
    }

    public void a(dhu dhu) {
        this.a.a(this.c);
    }

    public void y_() {
        this.a.b(this.c);
    }

    public void a(int i) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }
}
