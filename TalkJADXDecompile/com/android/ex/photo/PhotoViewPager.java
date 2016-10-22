package com.android.ex.photo;

import aha;
import ahb;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import nh;
import pd;
import wi;

public class PhotoViewPager extends ViewPager {
    private float d;
    private int e;
    private float f;
    private float g;
    private ahb h;

    public PhotoViewPager(Context context) {
        super(context);
        h();
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }

    private void h() {
        a(true, new pd(this));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int a;
        boolean z;
        boolean z2;
        int i = 1;
        if (this.h != null) {
            a = this.h.a(this.f, this.g);
        } else {
            a = aha.a;
        }
        if (a == aha.d || a == aha.b) {
            z = true;
        } else {
            z = false;
        }
        if (a == aha.d || a == aha.c) {
            z2 = true;
        } else {
            z2 = false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.e = -1;
        }
        switch (action) {
            case wi.w /*0*/:
                this.d = motionEvent.getX();
                this.f = motionEvent.getRawX();
                this.g = motionEvent.getRawY();
                this.e = nh.b(motionEvent, 0);
                break;
            case wi.l /*2*/:
                if (z || z2) {
                    i = this.e;
                    if (i != -1) {
                        float c = nh.c(motionEvent, nh.a(motionEvent, i));
                        if (z && z2) {
                            this.d = c;
                            return false;
                        } else if (z && c > this.d) {
                            this.d = c;
                            return false;
                        } else if (z2 && c < this.d) {
                            this.d = c;
                            return false;
                        }
                    }
                }
                break;
            case wi.s /*6*/:
                a = nh.b(motionEvent);
                if (nh.b(motionEvent, a) == this.e) {
                    if (a != 0) {
                        i = 0;
                    }
                    this.d = nh.c(motionEvent, i);
                    this.e = nh.b(motionEvent, i);
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void a(ahb ahb) {
        this.h = ahb;
    }
}
