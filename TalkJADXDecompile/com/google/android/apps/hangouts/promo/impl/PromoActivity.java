package com.google.android.apps.hangouts.promo.impl;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import ba;
import ed;
import esb;
import esh;
import esm;
import ew;
import glk;
import gwb;
import jcb;
import jcc;

public class PromoActivity extends esb implements jcc {
    private static final esh t;
    private esm o;
    private int r;
    private int s;

    public PromoActivity() {
        this.n.a(this);
    }

    static {
        t = new esh();
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            this.o = (esm) this.p.a(esm.class);
            this.o.a((Context) this);
            if (this.o.b((Context) this) == 0) {
                finish();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("current_item", this.r);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = (esm) this.p.a(esm.class);
        if (bundle != null) {
            this.o.a((Context) this);
            this.r = this.o.a(this, bundle.getInt("current_item") - 1);
        } else {
            this.r = this.o.a(this, -1);
        }
        if (this.r == -1) {
            finish();
            return;
        }
        this.s = getResources().getColor(this.o.a(this.r).b());
        setContentView(gwb.ub);
        ed J_ = J_();
        if (J_.a(gwb.tZ) == null) {
            ew a = J_.a();
            a.b(gwb.tZ, this.o.a(this.r).a());
            a.a();
            this.s = getResources().getColor(this.o.a(this.r).b());
        }
        ((FrameLayout) findViewById(gwb.tZ)).setBackgroundColor(this.s);
    }

    public void g() {
        int i = this.r;
        this.r = this.o.a(this, i);
        if (this.r != -1) {
            int i2 = this.r;
            ew a = J_().a();
            if (i < i2) {
                a.a(ba.mq, ba.mr);
            } else {
                a.a(ba.mp, ba.ms);
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt((FrameLayout) findViewById(gwb.tZ), "backgroundColor", new int[]{getResources().getColor(this.o.a(i).b()), getResources().getColor(this.o.a(i2).b())});
            ofInt.setEvaluator(t);
            ofInt.setDuration((long) getResources().getInteger(gwb.ua));
            ofInt.start();
            a.b(gwb.tZ, this.o.a(i2).a());
            a.a();
            return;
        }
        finish();
    }

    public void onBackPressed() {
        if (this.r == -1) {
            glk.c("Babel", "PromoActivity ignoring back button due to NO_MORE_PROMOS", new Object[0]);
        } else if (this.o.b(this.r)) {
            super.onBackPressed();
        }
    }
}
