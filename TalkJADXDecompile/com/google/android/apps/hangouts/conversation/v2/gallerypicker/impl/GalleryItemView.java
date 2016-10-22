package com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import cjs;
import cju;
import glj;
import gwb;
import iil;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class GalleryItemView extends FrameLayout {
    private int a;
    private int b;

    public GalleryItemView(Context context) {
        super(context);
        this.a = 512;
        this.b = 512;
    }

    public GalleryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 512;
        this.b = 512;
    }

    public GalleryItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 512;
        this.b = 512;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a = getMeasuredWidth();
        this.b = getMeasuredHeight();
        setMeasuredDimension(this.a, this.b);
    }

    public void a(View view, cjs cjs, boolean z) {
        float f;
        float f2;
        View findViewById = view.findViewById(gwb.mB);
        view.findViewById(gwb.mC).setVisibility(8);
        View findViewById2 = view.findViewById(gwb.mI);
        View findViewById3 = view.findViewById(gwb.mH);
        if (cjs.h) {
            findViewById.setVisibility(0);
            findViewById3.setAlpha(0.5f);
            if (z) {
                f = 1.0f;
                f2 = 0.88f;
            } else {
                f2 = 0.88f;
                f = 0.88f;
            }
        } else {
            findViewById.setVisibility(4);
            findViewById3.setAlpha(0.0f);
            if (z) {
                f = 0.87f;
                f2 = 1.0f;
            } else {
                f2 = 1.0f;
                f = 1.0f;
            }
        }
        String format = SimpleDateFormat.getDateTimeInstance().format(new Date(cjs.g * 1000));
        Resources resources;
        int i;
        if (cjs.b == cju.VIDEO) {
            resources = getResources();
            if (cjs.h) {
                i = gwb.mN;
            } else {
                i = gwb.mO;
            }
            setContentDescription(resources.getString(i, new Object[]{format, glj.a(cjs.i, true, true)}));
        } else if (cjs.b == cju.IMAGE) {
            resources = getResources();
            if (cjs.h) {
                i = gwb.mL;
            } else {
                i = gwb.mM;
            }
            setContentDescription(resources.getString(i, new Object[]{format}));
        } else {
            String valueOf = String.valueOf(cjs.b);
            iil.a(new StringBuilder(String.valueOf(valueOf).length() + 30).append("unexpected gallery item type: ").append(valueOf).toString());
        }
        float f3 = ((f - 1.0f) * ((float) this.a)) / 2.0f;
        float f4 = ((f2 - 1.0f) * ((float) this.a)) / 2.0f;
        float f5 = ((1.0f - f) * ((float) this.b)) / 2.0f;
        float f6 = ((1.0f - f2) * ((float) this.b)) / 2.0f;
        setScaleX(f);
        setScaleY(f);
        findViewById2.setTranslationX(f3);
        findViewById2.setTranslationY(f5);
        if (f != f2) {
            animate().scaleX(f2).scaleY(f2).setDuration(135).setStartDelay(51).setInterpolator(gwb.o()).start();
            findViewById2.animate().translationX(f4).translationY(f6).setDuration(135).setStartDelay(51).setInterpolator(gwb.o()).start();
        }
    }
}
