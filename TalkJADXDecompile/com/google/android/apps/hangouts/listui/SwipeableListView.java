package com.google.android.apps.hangouts.listui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;
import dua;
import duf;
import dug;
import duh;

public class SwipeableListView extends ListView implements duf {
    private dua a;
    private boolean b;
    private boolean c;
    private int d;
    private duh e;

    public SwipeableListView(Context context) {
        super(context);
        this.b = false;
        this.c = false;
        a(context);
    }

    public SwipeableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = false;
        a(context);
    }

    public SwipeableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        this.c = false;
        a(context);
    }

    public void a(duh duh) {
        this.e = duh;
    }

    private void a(Context context) {
        Resources resources = getResources();
        this.a = new dua(resources, VelocityTracker.obtain(), 0, this, resources.getDisplayMetrics().density, (float) ViewConfiguration.get(context).getScaledPagingTouchSlop());
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a.a(getResources().getDisplayMetrics().density);
        this.a.b((float) ViewConfiguration.get(getContext()).getScaledPagingTouchSlop());
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z;
        if (this.c) {
            this.a.b(motionEvent);
            z = true;
        } else if (this.a.a(motionEvent)) {
            this.c = true;
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(3);
            super.onTouchEvent(obtain);
            this.a.b(motionEvent);
            z = true;
        } else {
            z = super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return z;
        }
        this.c = false;
        return z;
    }

    public View a(MotionEvent motionEvent) {
        int childCount = getChildCount();
        int y = (int) motionEvent.getY();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8 && y >= childAt.getTop() && y <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean a(dug dug) {
        return dug.b();
    }

    public void b(dug dug) {
        if (dug != null) {
            dug.c();
            if (this.e != null) {
                this.e.b(dug);
            }
        }
    }

    public void a(dug dug, int i) {
        requestDisallowInterceptTouchEvent(true);
        this.d = i;
        dug.a(i);
        if (this.e != null) {
            this.e.a(dug);
        }
    }

    public void b(dug dug, int i) {
        if (this.d != i) {
            dug.a(i);
            this.d = i;
        }
    }

    public void c(dug dug) {
        dug.d();
        if (this.e != null) {
            this.e.b(dug);
        }
    }
}
