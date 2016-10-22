package com.google.android.apps.hangouts.peoplelistv2.impl;

import aeh;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import gwb;

public class FastScrollingRecyclerView extends RecyclerView {
    public int D;
    public int E;
    public int F;

    public FastScrollingRecyclerView(Context context) {
        super(context);
        a(new aeh());
        this.D = getResources().getDimensionPixelSize(gwb.ss);
    }

    public FastScrollingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(new aeh());
        this.D = getResources().getDimensionPixelSize(gwb.ss);
    }

    public FastScrollingRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(new aeh());
        this.D = getResources().getDimensionPixelSize(gwb.ss);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.E = i;
        this.F = i2;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.RecyclerView");
    }
}
