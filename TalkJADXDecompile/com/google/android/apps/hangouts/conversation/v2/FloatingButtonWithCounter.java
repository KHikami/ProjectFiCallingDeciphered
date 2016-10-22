package com.google.android.apps.hangouts.conversation.v2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import ba;
import bc;
import cho;
import chp;
import chq;
import chr;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import gld;
import gwb;

public class FloatingButtonWithCounter extends FrameLayout {
    public FloatingActionButton a;
    private int b;
    private View c;
    private final ViewGroup d;
    private int e;

    public FloatingButtonWithCounter(Context context) {
        this(context, null);
    }

    public FloatingButtonWithCounter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        LayoutInflater.from(getContext()).inflate(gwb.lP, this);
        this.a = (FloatingActionButton) getRootView().findViewById(gwb.lq);
        this.a.setScaleType(ScaleType.CENTER);
        this.d = (ViewGroup) getRootView().findViewById(gwb.ls);
        this.d.setOnClickListener(new cho(this, context));
        c();
        this.c = getRootView().findViewById(gwb.lm);
        this.c.bringToFront();
        this.c.setVisibility(8);
        int applyDimension = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.c.setTranslationX(gld.a((View) this) ? (float) applyDimension : (float) (-applyDimension));
        setTranslationY((float) getContext().getResources().getDimensionPixelSize(gwb.lf));
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(b(), a());
    }

    public int a() {
        return getContext().getResources().getDimensionPixelSize(gwb.lh);
    }

    public int b() {
        return getContext().getResources().getDimensionPixelSize(gwb.lh);
    }

    public void a(boolean z, int i) {
        Object obj;
        int i2;
        if (z || i > 0) {
            obj = 1;
        } else {
            obj = null;
        }
        TextView textView = (TextView) this.c.findViewById(gwb.lk);
        TextView textView2 = (TextView) this.c.findViewById(gwb.ll);
        ImageView imageView = (ImageView) this.c.findViewById(gwb.ln);
        CharSequence a = a(this.b);
        CharSequence a2 = a(i);
        textView.setText(a);
        textView2.setText(a2);
        if (obj != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        if (i2 != this.e) {
            AnimatorSet animatorSet;
            Animator a3;
            Animator a4;
            if (i2 == 0) {
                animatorSet = new AnimatorSet();
                a3 = gwb.a(1.0f, 0.0f, 1.0f, 0.0f);
                a3.setStartDelay(0);
                a3.setDuration(100);
                a3.setInterpolator(gwb.p());
                a3.addListener(new chq(this));
                a4 = gwb.a(0.0f, 1.0f, 0.0f, 1.0f);
                a4.setStartDelay(0);
                a4.setDuration(150);
                a4.setInterpolator(gwb.p());
                animatorSet.playSequentially(new Animator[]{a3, a4});
                animatorSet.setTarget(this);
                animatorSet.start();
            } else if (i2 == 8) {
                animatorSet = new AnimatorSet();
                a3 = gwb.a(1.0f, 0.0f, 1.0f, 0.0f);
                a3.setStartDelay(0);
                a3.setDuration(150);
                a3.setInterpolator(gwb.p());
                a3.addListener(new chr(this));
                a4 = gwb.a(0.0f, 1.0f, 0.0f, 1.0f);
                a4.setStartDelay(0);
                a4.setDuration(100);
                a4.setInterpolator(gwb.p());
                animatorSet.playSequentially(new Animator[]{a3, a4});
                animatorSet.setTarget(this);
                animatorSet.start();
            }
            this.e = i2;
        }
        if (this.b != i) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (this.b > 0) {
                textView.setAlpha(1.0f);
                textView.setTranslationY(0.0f);
                textView.animate().alpha(0.0f).setDuration(102).setInterpolator(gwb.o()).start();
            } else {
                textView.setAlpha(0.0f);
            }
            textView2.setAlpha(0.0f);
            textView2.setTranslationY(20.0f);
            textView2.animate().setStartDelay(16).translationY(0.0f).alpha(1.0f).setDuration(102).setInterpolator(gwb.p()).setListener(new chp(this, imageView)).start();
        }
        View view = this.c;
        int i3 = (obj == null || TextUtils.isEmpty(a2)) ? 8 : 0;
        view.setVisibility(i3);
        Resources resources = getContext().getResources();
        if (i <= 0) {
            this.d.setContentDescription(resources.getText(bc.aj));
        } else if (z) {
            this.d.setContentDescription(resources.getQuantityString(gwb.hS, i, new Object[]{Integer.valueOf(i)}));
        } else {
            this.d.setContentDescription(resources.getQuantityString(gwb.hR, i, new Object[]{Integer.valueOf(i)}));
        }
        this.b = i;
    }

    private static String a(int i) {
        if (i == 0) {
            return "";
        }
        return Integer.toString(i);
    }

    public void c() {
        this.a.b(getContext().getResources().getColor(ba.iY));
        this.a.setColorFilter(getResources().getColor(ba.iX), Mode.SRC_IN);
        findViewById(gwb.lr).setVisibility(8);
    }
}
