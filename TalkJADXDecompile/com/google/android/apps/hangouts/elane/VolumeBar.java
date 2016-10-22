package com.google.android.apps.hangouts.elane;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import gld;
import gwb;
import iil;

public final class VolumeBar extends LinearLayout {
    static final float[][] a;
    static final float[][] b;
    static final int[] c;
    private View[] d;
    private int e;

    static {
        a = new float[][]{new float[]{0.0f, 0.0f, 0.0f}, new float[]{0.4f, 0.0f, 0.0f}, new float[]{0.6f, 0.4f, 0.0f}, new float[]{0.8f, 0.6f, 0.4f}, new float[]{1.0f, 0.8f, 0.6f}, new float[]{1.0f, 1.0f, 1.0f}};
        b = new float[][]{new float[]{0.0f, 0.0f, 0.0f}, new float[]{0.25f, 0.0f, 0.0f}, new float[]{0.5f, 0.25f, 0.0f}, new float[]{0.75f, 0.5f, 0.25f}, new float[]{1.0f, 0.75f, 0.5f}, new float[]{1.0f, 1.0f, 1.0f}};
        c = new int[]{gwb.oY, gwb.oZ, gwb.pa};
    }

    public VolumeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        this.d = new View[c.length];
        for (int i = 0; i < c.length; i++) {
            this.d[i] = findViewById(c[i]);
        }
        this.e = 0;
        super.onFinishInflate();
    }

    public void a(int i) {
        int i2 = 0;
        int e = gld.e(i);
        if (e != this.e) {
            iil.a(e, 0, b.length - 1);
            while (i2 < this.d.length) {
                View view = this.d[i2];
                float f = a[e][i2];
                float f2 = b[e][i2];
                view.animate().alpha(f).scaleX(f2).scaleY(f2).setDuration(150).start();
                i2++;
            }
            this.e = e;
        }
    }
}
