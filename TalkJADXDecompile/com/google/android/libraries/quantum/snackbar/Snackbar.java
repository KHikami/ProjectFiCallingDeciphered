package com.google.android.libraries.quantum.snackbar;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import gwb;
import jbm;
import jbn;
import jbw;
import jbx;
import jby;

public class Snackbar extends LinearLayout implements jbm {
    public final jbn a;
    private final TextView b;
    private final TextView c;
    private int d;

    public Snackbar(Context context) {
        this(context, null);
    }

    public Snackbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.yj);
    }

    public Snackbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new jbn(this);
        this.d = 1;
        LayoutInflater.from(context).inflate(gwb.ym, this);
        this.b = (TextView) findViewById(gwb.yl);
        this.c = (TextView) findViewById(gwb.yk);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jbw.aj, i, gwb.yn);
        Drawable drawable = obtainStyledAttributes.getDrawable(jbw.al);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(jbw.am);
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(jbw.ak);
        obtainStyledAttributes.recycle();
        setOrientation(0);
        setBackgroundDrawable(drawable);
        if (colorStateList != null) {
            a(colorStateList);
        }
        if (colorStateList2 != null) {
            b(colorStateList2);
        }
    }

    public boolean c() {
        return getVisibility() != 0;
    }

    public void a(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    public void b(ColorStateList colorStateList) {
        this.c.setTextColor(colorStateList);
    }

    public void a(CharSequence charSequence) {
        a(charSequence, null, null);
    }

    public void a(CharSequence charSequence, String str, OnClickListener onClickListener) {
        this.b.setText(charSequence);
        this.c.setText(str);
        this.c.setOnClickListener(onClickListener);
        this.c.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        this.b.requestLayout();
    }

    public int d() {
        return this.d;
    }

    public void a() {
        jbn jbn = this.a;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationY", new float[]{(float) getHeight(), 0.0f});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2});
        ofPropertyValuesHolder.addListener(new jbx(this));
        jbn.a(ofPropertyValuesHolder);
    }

    public void b() {
        jbn jbn = this.a;
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationY", new float[]{0.0f, (float) getHeight()});
        Animator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[]{ofFloat, ofFloat2});
        ofPropertyValuesHolder.addListener(new jby(this));
        jbn.b(ofPropertyValuesHolder);
    }

    public static void a(Snackbar snackbar) {
        CharSequence trim = snackbar.b.getText().toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            Context context = snackbar.getContext();
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager.isEnabled()) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain(32);
                obtain.setClassName(Snackbar.class.getName());
                obtain.setPackageName(context.getPackageName());
                obtain.getText().add(trim);
                obtain.setEnabled(true);
                trim = snackbar.c.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    obtain.getText().add(trim);
                }
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
    }
}
