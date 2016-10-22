package com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import clz;
import cma;
import cmb;
import cmc;
import np;
import pc;

public class SlidingTabLayout extends HorizontalScrollView {
    public ViewPager a;
    public pc b;
    public final cmc c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private SparseArray<String> h;

    public SlidingTabLayout(Context context) {
        this(context, null);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new SparseArray();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        this.d = (int) (24.0f * getResources().getDisplayMetrics().density);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, clz.ai, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(clz.aj, 0);
            this.c = new cmc(context, integer);
            addView(this.c, -1, -2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public View a(int i) {
        if (this.c == null || i >= this.c.getChildCount()) {
            return null;
        }
        return this.c.getChildAt(i);
    }

    public void b(int i) {
        if (this.d != i) {
            this.d = i;
            if (this.a != null) {
                b(this.a.c(), 0);
            }
        }
    }

    public void a(boolean z) {
        this.g = true;
    }

    public void a(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public void a(ViewPager viewPager) {
        this.c.removeAllViews();
        this.a = viewPager;
        if (viewPager != null) {
            viewPager.a(new cma(this));
            np b = this.a.b();
            OnClickListener cmb = new cmb(this);
            if (b != null) {
                for (int i = 0; i < b.a(); i++) {
                    View inflate;
                    TextView textView;
                    TextView textView2;
                    if (this.e != 0) {
                        inflate = LayoutInflater.from(getContext()).inflate(this.e, this.c, false);
                        textView = (TextView) inflate.findViewById(this.f);
                    } else {
                        textView = null;
                        inflate = null;
                    }
                    if (inflate == null) {
                        inflate = a(getContext());
                    }
                    if (textView == null && TextView.class.isInstance(inflate)) {
                        textView2 = (TextView) inflate;
                    } else {
                        textView2 = textView;
                    }
                    if (this.g) {
                        LayoutParams layoutParams = (LayoutParams) inflate.getLayoutParams();
                        layoutParams.width = 0;
                        layoutParams.weight = 1.0f;
                    }
                    textView2.setText(b.c(i));
                    inflate.setOnClickListener(cmb);
                    String str = (String) this.h.get(i, null);
                    if (str != null) {
                        inflate.setContentDescription(str);
                    }
                    this.c.addView(inflate);
                    if (i == this.a.c()) {
                        inflate.setSelected(true);
                    }
                }
            }
        }
    }

    protected TextView a(Context context) {
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setTextSize(2, 12.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LayoutParams(-2, -2));
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        textView.setBackgroundResource(typedValue.resourceId);
        textView.setAllCaps(true);
        int i = (int) (16.0f * getResources().getDisplayMetrics().density);
        textView.setPadding(i, i, i, i);
        return textView;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            b(this.a.c(), 0);
        }
    }

    public void b(int i, int i2) {
        int childCount = this.c.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            View childAt = this.c.getChildAt(i);
            if (childAt != null) {
                childCount = childAt.getLeft() + i2;
                if (i > 0 || i2 > 0) {
                    childCount -= this.d;
                }
                scrollTo(childCount, 0);
            }
        }
    }
}
