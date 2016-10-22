package com.android.contacts.common.widget;

import add;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: PG */
public class ActivityTouchLinearLayout extends LinearLayout {
    public ActivityTouchLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            add.a.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return false;
    }
}
