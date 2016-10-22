package com.google.android.apps.hangouts.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabContentFactory;
import android.widget.TabWidget;
import ba;
import com.google.android.apps.hangouts.views.MainViewPager;
import gkx;
import gky;
import gkz;
import goy;
import goz;
import gwb;
import jca;
import jyn;
import pc;

public class TabHostEx extends TabHost {
    public MainViewPager a;
    public jca b;
    public final OnTabChangeListener c;
    private boolean d;
    private TabWidget e;
    private final TabContentFactory f;
    private final pc g;

    public TabHostEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = getTabWidget();
        this.f = new gkx(this);
        this.g = new gky(this);
        this.c = new gkz(this);
    }

    public TabHostEx(Context context) {
        super(context);
        this.e = getTabWidget();
        this.f = new gkx(this);
        this.g = new gky(this);
        this.c = new gkz(this);
    }

    public void setup() {
        super.setup();
        this.e = getTabWidget();
        this.b = (jca) jyn.b(getContext()).a(jca.class);
    }

    public void a(MainViewPager mainViewPager) {
        this.a = mainViewPager;
        this.a.b(this.g);
    }

    public void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            a();
        }
    }

    private void a() {
        int i = (this.d || this.e.getTabCount() <= 1) ? 8 : 0;
        if (VERSION.SDK_INT >= 21) {
            setElevation(i == 0 ? getResources().getDimension(gwb.fr) : 0.0f);
        }
        this.e.setVisibility(i);
    }

    public void onTouchModeChanged(boolean z) {
    }

    public void a(int i) {
        if (VERSION.SDK_INT < 21) {
            for (int i2 = 0; i2 < this.e.getChildCount(); i2++) {
                ImageView imageView = (ImageView) this.e.getChildAt(i2).findViewById(ba.fB);
                if (imageView != null) {
                    int i3;
                    TypedValue typedValue = new TypedValue();
                    Resources resources = getResources();
                    if (i2 == i) {
                        i3 = gwb.ex;
                    } else {
                        i3 = gwb.ew;
                    }
                    resources.getValue(i3, typedValue, true);
                    imageView.setAlpha(typedValue.getFloat());
                }
            }
        }
    }

    public void a(LayoutInflater layoutInflater) {
        setOnTabChangedListener(null);
        clearAllTabs();
        goz h = this.a.h();
        int a = h.a();
        for (int i = 0; i < a; i++) {
            goy d = h.d(i);
            View inflate = layoutInflater.inflate(gwb.hz, null);
            ImageView imageView = (ImageView) inflate.findViewById(ba.fB);
            imageView.setContentDescription(getResources().getString(d.a));
            imageView.setImageResource(d.b);
            addTab(newTabSpec(d.d).setIndicator(inflate).setContent(this.f));
        }
        if (a > 0) {
            int c = this.a.c();
            setCurrentTab(c);
            a(c);
        }
        a();
        setOnTabChangedListener(this.c);
    }
}
