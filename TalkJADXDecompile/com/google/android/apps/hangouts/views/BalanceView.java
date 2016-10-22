package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba;
import bc;
import fde;
import gnd;
import gne;
import gnf;
import jca;
import jcf;
import jcm;
import jyn;

public class BalanceView extends LinearLayout {
    public boolean a;
    public final jca b;
    private final jcm c;
    private TextView d;
    private final jcf e;

    public BalanceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new gnd(this);
        this.e = (jcf) jyn.a(getContext(), jcf.class);
        this.b = (jca) jyn.a(getContext(), jca.class);
        a(false);
        setOnClickListener(new gne(this));
        post(new gnf(this));
    }

    public BalanceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new gnd(this);
        this.e = (jcf) jyn.a(getContext(), jcf.class);
        this.b = (jca) jyn.a(getContext(), jca.class);
        a(false);
        setOnClickListener(new gne(this));
        post(new gnf(this));
    }

    public BalanceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new gnd(this);
        this.e = (jcf) jyn.a(getContext(), jcf.class);
        this.b = (jca) jyn.a(getContext(), jca.class);
        a(false);
        setOnClickListener(new gne(this));
        post(new gnf(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = true;
        this.e.a(this.c);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a = false;
        this.e.b(this.c);
    }

    public void a() {
        if (this.b.b() && this.e.c(this.b.a())) {
            a(fde.e(this.b.a()).K());
        } else {
            a("");
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.d = (TextView) findViewById(ba.fN);
        a();
    }

    public void a(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.d.setText("");
            this.d.setContentDescription(getResources().getString(bc.dN));
            return;
        }
        this.d.setText(str);
        this.d.setContentDescription(getResources().getString(bc.dS, new Object[]{str}));
    }
}
