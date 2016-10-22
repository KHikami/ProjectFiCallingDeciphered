package com.google.android.apps.hangouts.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ba;
import bbw;
import dug;
import gmt;
import gns;
import gnt;

public class ConversationListItemWrapper extends LinearLayout implements dug {
    public View a;
    final Runnable b;
    private int c;
    private View d;
    private View e;
    private View f;

    public ConversationListItemWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        this.b = new gns(this);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = findViewById(ba.ae);
        this.e = findViewById(ba.af);
        this.f = findViewById(ba.ag);
    }

    public void a(View view) {
        ((FrameLayout) findViewById(ba.ah)).addView(view);
        this.a = view;
    }

    public View a() {
        return e();
    }

    public View e() {
        return this.a;
    }

    public boolean b() {
        return this.a instanceof gmt;
    }

    public void c() {
        Runnable runnable = this.b;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "animatedHeight", new int[]{getMeasuredHeight(), 0});
        ofInt.setInterpolator(new bbw());
        ofInt.setDuration(200);
        ofInt.addListener(new gnt(this, runnable));
        ofInt.start();
    }

    public void f() {
        this.c = -1;
        this.a.setTranslationX(0.0f);
        this.a.setAlpha(1.0f);
        setAlpha(1.0f);
        d();
    }

    public void setAnimatedHeight(int i) {
        this.c = i;
        requestLayout();
    }

    public void a(int i) {
        int i2;
        int i3 = 8;
        this.d.setVisibility(0);
        View view = this.e;
        if (i < 0) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        View view2 = this.f;
        if (i <= 0) {
            i3 = 0;
        }
        view2.setVisibility(i3);
    }

    public void d() {
        this.d.setVisibility(8);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.c == -1) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            setMeasuredDimension(getMeasuredWidth(), this.c);
        }
    }
}
