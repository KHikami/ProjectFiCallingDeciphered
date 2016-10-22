package com.android.dialer.app.widget;

import ake;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import android.widget.FrameLayout;
import aq;
import ati;
import atj;
import atk;
import atl;
import atm;
import atn;
import ato;
import atp;
import cob;

/* compiled from: PG */
public class SearchEditTextLayout extends FrameLayout {
    public boolean a;
    public boolean b;
    public OnKeyListener c;
    public EditText d;
    public View e;
    public View f;
    public atp g;
    private int h;
    private int i;
    private int j;
    private int k;
    private float l;
    private View m;
    private View n;
    private View o;
    private View p;
    private View q;
    private View r;
    private ValueAnimator s;

    public SearchEditTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.b = false;
    }

    protected void onFinishInflate() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        this.h = marginLayoutParams.topMargin;
        this.i = marginLayoutParams.bottomMargin;
        this.j = marginLayoutParams.leftMargin;
        this.k = marginLayoutParams.rightMargin;
        this.l = getElevation();
        this.m = findViewById(aq.bh);
        this.n = findViewById(aq.bi);
        this.d = (EditText) this.n.findViewById(aq.bm);
        this.o = findViewById(aq.bl);
        this.e = findViewById(aq.bj);
        this.p = findViewById(aq.bI);
        this.q = findViewById(aq.aj);
        this.r = findViewById(aq.bg);
        findViewById(aq.bi);
        this.f = findViewById(aq.bk);
        this.e.setOnLongClickListener(new ati(this));
        this.d.setOnFocusChangeListener(new atj(this));
        this.d.setOnClickListener(new atk(this));
        this.d.addTextChangedListener(new atl(this));
        findViewById(aq.bk).setOnClickListener(new atm(this));
        findViewById(aq.bg).setOnClickListener(new atn(this));
        super.onFinishInflate();
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (this.c == null || !this.c.onKey(this, keyEvent.getKeyCode(), keyEvent)) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        return true;
    }

    public final void a() {
        ake.b(this, 200);
        this.b = false;
    }

    public final void a(boolean z) {
        if (z) {
            setAlpha(1.0f);
            setVisibility(0);
            this.b = false;
            return;
        }
        setAlpha(0.0f);
        setVisibility(8);
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        c(true);
        if (z) {
            ake.a(this.n, this.m, 200);
            this.s = ValueAnimator.ofFloat(new float[]{0.8f, 0.0f});
            a(0.8f);
            b();
        } else {
            this.n.setVisibility(0);
            this.n.setAlpha(1.0f);
            a(0.0f);
            this.m.setVisibility(8);
        }
        int paddingTop = getPaddingTop();
        int paddingStart = getPaddingStart();
        int paddingBottom = getPaddingBottom();
        int paddingEnd = getPaddingEnd();
        setBackgroundResource(cob.aS);
        setElevation(0.0f);
        setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
        if (z2) {
            this.d.requestFocus();
        }
        this.a = true;
    }

    public final void b(boolean z) {
        c(false);
        if (z) {
            ake.a(this.m, this.n, 200);
            this.s = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            b();
        } else {
            this.m.setVisibility(0);
            this.m.setAlpha(1.0f);
            a(1.0f);
            this.n.setVisibility(8);
        }
        this.a = false;
        setElevation(this.l);
        setBackgroundResource(cob.aR);
    }

    private final void c(boolean z) {
        int i = 0;
        int i2 = z ? 8 : 0;
        if (!z) {
            i = 8;
        }
        this.o.setVisibility(i2);
        this.e.setVisibility(i2);
        this.p.setVisibility(i2);
        this.q.setVisibility(i2);
        this.r.setVisibility(i);
        if (TextUtils.isEmpty(this.d.getText())) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(i);
        }
    }

    private final void b() {
        if (this.s != null) {
            this.s.cancel();
        }
        this.s.addUpdateListener(new ato(this));
        this.s.setDuration(200);
        this.s.start();
    }

    public final void a(float f) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = (int) (((float) this.h) * f);
        marginLayoutParams.bottomMargin = (int) (((float) this.i) * f);
        marginLayoutParams.leftMargin = (int) (((float) this.j) * f);
        marginLayoutParams.rightMargin = (int) (((float) this.k) * f);
        requestLayout();
    }
}
