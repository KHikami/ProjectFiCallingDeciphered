package com.google.android.apps.hangouts.conversation.messagelist.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class LinearLayoutEx extends LinearLayout {
    private boolean a;
    private boolean b;

    public LinearLayoutEx(Context context) {
        super(context);
    }

    public LinearLayoutEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LinearLayoutEx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LinearLayoutEx(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void a(boolean z) {
        this.a = z;
    }

    public void b(boolean z) {
        this.b = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.b) {
            this.b = false;
            return true;
        } else if (this.a && (motionEvent.getAction() == 0 || motionEvent.getAction() == 1)) {
            return true;
        } else {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }
}
