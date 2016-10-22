package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ba;
import gwb;

public class HangoutsToolbar extends Toolbar {
    private ViewGroup g;
    private View h;
    private TextView i;
    private TextView j;
    private int k;
    private float l;
    private CharSequence m;

    public HangoutsToolbar(Context context) {
        this(context, null);
    }

    public HangoutsToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HangoutsToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = 0;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.g = (ViewGroup) findViewById(ba.ad);
        this.h = findViewById(ba.fO);
        this.i = (TextView) findViewById(ba.fM);
        this.j = (TextView) findViewById(ba.fz);
        if (VERSION.SDK_INT >= 21) {
            this.l = z();
        }
    }

    public TextView x() {
        return this.i;
    }

    public TextView y() {
        return this.j;
    }

    public void b(CharSequence charSequence) {
        this.i.setText(charSequence);
        B();
        A();
    }

    public void c(CharSequence charSequence) {
        this.j.setText(charSequence);
        e(charSequence);
        A();
    }

    public int getVisibility() {
        return this.k;
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (i == 8) {
                setScaleY(0.0f);
                if (VERSION.SDK_INT >= 21) {
                    a(0.0f);
                }
                this.k = i;
                return;
            }
            f(i);
            setScaleY(1.0f);
            if (VERSION.SDK_INT >= 21) {
                a(this.l);
            }
            this.k = i;
        }
    }

    public void f(int i) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            getChildAt(childCount).setVisibility(i);
        }
    }

    public float z() {
        return getElevation();
    }

    public void a(float f) {
        setElevation(f);
    }

    private void A() {
        if (TextUtils.isEmpty(this.j.getText())) {
            this.i.setTextSize(0, getResources().getDimension(gwb.fo));
            this.j.setVisibility(8);
            return;
        }
        this.i.setTextSize(0, getResources().getDimension(gwb.eX));
        this.j.setTextSize(0, getResources().getDimension(gwb.fp));
        this.j.setVisibility(0);
    }

    public void e(CharSequence charSequence) {
        this.m = charSequence;
        B();
    }

    private void B() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.i.getText());
        if (!TextUtils.isEmpty(this.m)) {
            stringBuilder.append(", ");
            stringBuilder.append(this.m);
        }
        this.h.setContentDescription(stringBuilder.toString());
    }

    public void a(View view) {
        this.g.addView(view);
    }
}
