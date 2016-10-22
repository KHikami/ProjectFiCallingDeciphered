package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import dye;
import dyf;

public class AttachmentViewContainerFrameLayout extends FrameLayout implements dyf {
    public AttachmentViewContainerFrameLayout(Context context) {
        super(context);
    }

    public AttachmentViewContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttachmentViewContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(dye dye) {
        removeAllViews();
        addView((View) dye);
    }

    public dye e() {
        return (dye) getChildAt(0);
    }

    public void p_() {
        e().p_();
    }

    public void b_() {
        e().b_();
    }

    public void c_() {
        e().c_();
    }

    public void d_() {
        e().d_();
    }

    public void a(String str) {
        e().a(str);
    }
}
