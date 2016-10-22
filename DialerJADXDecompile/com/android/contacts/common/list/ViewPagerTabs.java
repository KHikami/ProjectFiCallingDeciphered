package com.android.contacts.common.list;

import abw;
import aew;
import aex;
import aey;
import aez;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import buf;
import cob;
import kg;
import lm;

/* compiled from: PG */
public class ViewPagerTabs extends HorizontalScrollView implements lm {
    private static final ViewOutlineProvider d;
    private static final int[] e;
    public ViewPager a;
    public int[] b;
    public int[] c;
    private int f;
    private ColorStateList g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private aew l;

    static {
        e = new int[]{16842901, 16842903, 16842904, 16843660};
        if (abw.h()) {
            d = new aex();
        } else {
            d = null;
        }
    }

    public ViewPagerTabs(Context context) {
        this(context, null);
    }

    public ViewPagerTabs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerTabs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = -1;
        setFillViewport(true);
        this.k = (int) (getResources().getDisplayMetrics().density * 10.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
        this.h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f = obtainStyledAttributes.getInt(1, 0);
        this.g = obtainStyledAttributes.getColorStateList(2);
        this.i = obtainStyledAttributes.getBoolean(3, false);
        this.l = new aew(context);
        addView(this.l, new LayoutParams(-2, -1));
        obtainStyledAttributes.recycle();
        if (abw.h()) {
            setOutlineProvider(d);
        }
    }

    public final void a(ViewPager viewPager) {
        this.a = viewPager;
        kg kgVar = this.a.b;
        this.l.removeAllViews();
        int a = kgVar.a();
        for (int i = 0; i < a; i++) {
            a(kgVar.c(i), i);
        }
    }

    public final void a(int i, int i2) {
        if (this.c != null && i2 < this.c.length) {
            this.c[i2] = i;
        }
    }

    private final void a(CharSequence charSequence, int i) {
        View textView;
        if (this.b == null || i >= this.b.length) {
            textView = new TextView(getContext());
            textView.setText(charSequence);
            textView.setBackgroundResource(buf.dh);
            if (this.f > 0) {
                textView.setTypeface(textView.getTypeface(), this.f);
            }
            if (this.h > 0) {
                textView.setTextSize(0, (float) this.h);
            }
            if (this.g != null) {
                textView.setTextColor(this.g);
            }
            textView.setAllCaps(this.i);
            textView.setGravity(17);
        } else {
            View inflate = LayoutInflater.from(getContext()).inflate(buf.dx, null);
            View findViewById = inflate.findViewById(cob.M);
            findViewById.setBackgroundResource(this.b[i]);
            findViewById.setContentDescription(charSequence);
            TextView textView2 = (TextView) inflate.findViewById(cob.C);
            if (this.c == null || this.c[i] <= 0) {
                textView2.setVisibility(4);
                findViewById.setContentDescription(charSequence);
            } else {
                textView2.setText(Integer.toString(this.c[i]));
                textView2.setVisibility(0);
                findViewById.setContentDescription(getResources().getQuantityString(buf.dz, this.c[i], new Object[]{charSequence.toString(), Integer.valueOf(this.c[i])}));
            }
            textView = inflate;
        }
        textView.setOnClickListener(new aey(this, i));
        textView.setOnLongClickListener(new aez(this, i));
        textView.setPadding(this.k, 0, this.k, 0);
        this.l.addView(textView, i, new LinearLayout.LayoutParams(-2, -1, 1.0f));
        if (i == 0) {
            this.j = 0;
            textView.setSelected(true);
        }
    }

    public final void c(int i) {
        View childAt = this.l.getChildAt(i);
        if (childAt != null) {
            this.l.removeView(childAt);
        }
    }

    public final void d(int i) {
        c(i);
        if (i < this.a.b.a()) {
            a(this.a.b.c(i), i);
        }
    }

    public final void a(int i, float f, int i2) {
        int e = e(i);
        int childCount = this.l.getChildCount();
        if (childCount != 0 && e >= 0 && e < childCount) {
            aew aew = this.l;
            aew.a = e;
            aew.b = f;
            aew.invalidate();
        }
    }

    public final void a(int i) {
        int e = e(i);
        int childCount = this.l.getChildCount();
        if (childCount != 0 && e >= 0 && e < childCount) {
            if (this.j >= 0 && this.j < childCount) {
                this.l.getChildAt(this.j).setSelected(false);
            }
            View childAt = this.l.getChildAt(e);
            childAt.setSelected(true);
            smoothScrollTo(childAt.getLeft() - ((getWidth() - childAt.getWidth()) / 2), 0);
            this.j = e;
        }
    }

    public final void a_(int i) {
    }

    public final int e(int i) {
        if (getLayoutDirection() == 1) {
            return (this.l.getChildCount() - 1) - i;
        }
        return i;
    }
}
