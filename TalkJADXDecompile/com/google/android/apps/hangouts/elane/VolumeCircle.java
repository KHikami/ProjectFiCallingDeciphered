package com.google.android.apps.hangouts.elane;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import cwt;
import gld;
import gwb;

public final class VolumeCircle extends FrameLayout {
    private static final int[] e;
    public boolean a;
    public int b;
    public final Handler c;
    public final Runnable d;
    private View f;
    private View g;

    static {
        e = new int[]{gwb.od, gwb.oe, gwb.of, gwb.og, gwb.oh, gwb.oi};
    }

    public VolumeCircle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = 0;
        this.c = new Handler();
        this.d = new cwt(this);
    }

    protected void onFinishInflate() {
        this.f = findViewById(gwb.pb);
        this.g = findViewById(gwb.oQ);
        super.onFinishInflate();
    }

    public void a(int i) {
        int e = gld.e(i);
        if (this.b != e) {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(e[e], typedValue, true);
            this.f.animate().scaleX(typedValue.getFloat()).scaleY(typedValue.getFloat()).setDuration((long) getResources().getInteger(gwb.pk)).start();
            this.b = e;
        }
        if (e > 0 && !this.a) {
            this.a = true;
            a();
            this.c.postDelayed(this.d, (long) getResources().getInteger(gwb.pj));
        }
    }

    public void a() {
        this.g.startAnimation(AnimationUtils.loadAnimation(getContext(), gwb.nP));
    }
}
