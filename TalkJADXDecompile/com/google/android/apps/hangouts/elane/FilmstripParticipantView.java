package com.google.android.apps.hangouts.elane;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import csi;
import csj;
import csk;
import csx;
import csy;
import csz;
import cta;
import ctb;
import ctc;
import ctj;
import ctm;
import ctn;
import cuj;
import cus;
import cuz;
import cvh;
import cvn;
import cvo;
import cvq;
import cws;
import glk;
import gwb;
import iil;
import java.util.ArrayList;
import java.util.List;
import jyn;

public class FilmstripParticipantView extends RelativeLayout implements cvq {
    String a;
    public String b;
    public final ctn c;
    public final ctj d;
    public VolumeBar e;
    public TextView f;
    private boolean g;
    private final cus h;
    private final cvo i;
    private final cvh j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    private AnimatorSet o;
    private int p;
    private float q;
    private View r;
    private csi s;
    private final ctm t;
    private final cuz u;
    private final cvn v;
    private final csj w;

    public FilmstripParticipantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = true;
        this.n = true;
        this.t = new csx(this);
        this.u = new csy(this);
        this.v = new csz(this);
        this.w = new csj(this);
        cws A = gwb.A((View) this);
        this.d = A.b();
        this.i = new cvo(A.a(), this);
        this.i.a(1);
        this.i.a(1.0f);
        this.c = ((cuj) jyn.a(context, cuj.class)).a();
        this.h = this.c.g();
        this.j = this.c.h();
        this.q = getTranslationY();
        this.p = 0;
        this.s = (csi) jyn.a(context, csi.class);
    }

    public void a(String str, String str2, boolean z) {
        iil.a("View previously initialized", this.b);
        this.b = str;
        this.g = z;
        if (str2 != null) {
            gwb.a(getContext(), this.c.b(), str2, new cta(this));
        }
        this.e = (VolumeBar) findViewById(gwb.oW);
        this.r = findViewById(gwb.oq);
        this.f = (TextView) findViewById(gwb.oA);
        b(this.j.a(str));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.s.a(this.w);
        setOnClickListener(new ctb(this));
        this.d.a(this.t);
        this.i.a(this.b, 10);
        if (this.g) {
            this.h.a(this.u);
            j();
        }
        this.j.a(this.b, this.v);
        f();
    }

    protected void onDetachedFromWindow() {
        setOnClickListener(null);
        this.i.a(null, 10);
        this.d.b(this.t);
        if (this.g) {
            this.h.b(this.u);
        }
        this.j.b(this.b, this.v);
        this.s.b(this.w);
        super.onDetachedFromWindow();
    }

    protected void onMeasure(int i, int i2) {
        int i3 = i();
        if (getMeasuredHeight() != i3) {
            j();
            g();
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(getMinimumWidth(), 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    String a() {
        return this.a;
    }

    boolean b() {
        return this.m;
    }

    public void a(Runnable runnable) {
        this.m = false;
        g();
        getHandler().postDelayed(runnable, (long) (getResources().getInteger(gwb.ph) + getResources().getInteger(gwb.pi)));
    }

    void c() {
        if (this.n) {
            this.n = false;
            g();
        }
    }

    void d() {
        if (!this.n) {
            this.n = true;
            g();
        }
    }

    public boolean e() {
        return TextUtils.equals(this.b, this.d.c());
    }

    private int i() {
        View view;
        while (view.getMinimumHeight() == 0) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return view.getMinimumHeight();
    }

    private void j() {
        int measuredHeight = getMeasuredHeight();
        setMinimumWidth((int) ((this.l != 0 ? ((float) measuredHeight) / ((float) this.l) : 0.0f) * ((float) getMinimumWidth())));
        setMeasuredDimension(getMinimumWidth(), measuredHeight);
        this.l = measuredHeight;
        g();
    }

    public void f() {
        int i;
        int i2 = 0;
        View findViewById = findViewById(gwb.oI);
        if (TextUtils.equals(this.b, this.d.d()) || this.k) {
            i = 4;
        } else {
            i = 0;
        }
        findViewById.setVisibility(i);
        View findViewById2 = findViewById(gwb.oK);
        if (!e()) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
        h();
    }

    public void g() {
        float f;
        int i;
        float f2;
        int i2 = (!this.m || this.n || i() == 0) ? 1 : 0;
        List arrayList = new ArrayList();
        if (!this.g || this.h.c()) {
            f = 1.0f;
        } else {
            f = this.h.a();
        }
        int i3 = (int) (f * ((float) i()));
        if (i2 != 0) {
            i = 0;
        } else {
            i = i3;
        }
        int minimumWidth = getMinimumWidth();
        if (i != minimumWidth) {
            if (minimumWidth > i3) {
                f2 = ((float) i3) / ((float) minimumWidth);
            } else {
                f2 = ((float) minimumWidth) / ((float) i3);
            }
            if (i2 == 0) {
                f2 = 1.0f - f2;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "minimumWidth", new int[]{minimumWidth, i});
            ofInt.setDuration((long) ((int) (f2 * ((float) getResources().getInteger(gwb.ph)))));
            ofInt.setInterpolator(gwb.ay());
            arrayList.add(ofInt);
        }
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(gwb.nZ);
        f2 = i2 != 0 ? dimensionPixelSize : 0.0f;
        float translationY = getTranslationY();
        if (f2 != translationY) {
            float f3;
            dimensionPixelSize = translationY / dimensionPixelSize;
            if (i2 != 0) {
                f3 = 1.0f - dimensionPixelSize;
            } else {
                f3 = dimensionPixelSize;
            }
            ofInt = ObjectAnimator.ofFloat(this, "translationY", new float[]{translationY, f2});
            ofInt.setDuration((long) ((int) (f3 * ((float) getResources().getInteger(gwb.pi)))));
            if (f2 < translationY) {
                ofInt.setInterpolator(gwb.ax());
            } else {
                ofInt.setInterpolator(gwb.aw());
            }
            arrayList.add(i2 != 0 ? 0 : arrayList.size(), ofInt);
        }
        if (this.o == null || !this.o.isRunning() || this.p != i || this.q != f2) {
            this.p = i;
            this.q = f2;
            if (this.o != null) {
                this.o.cancel();
                this.o = null;
            }
            this.o = new AnimatorSet();
            this.o.playSequentially(arrayList);
            this.o.start();
            glk.c("Babel_explane", "Starting filmstrip animation: PID: %s  Width: %d  Offset: %d", this.b, Integer.valueOf(i), Integer.valueOf((int) f2));
        }
    }

    public void a(boolean z) {
        this.k = z;
        if (this.g) {
            g();
        } else if (z) {
            this.c.p();
        }
        f();
    }

    public void a(TextureView textureView, TextureView textureView2) {
        ViewGroup viewGroup = (ViewGroup) findViewById(gwb.oL);
        if (textureView != null) {
            viewGroup.removeView(textureView);
        }
        if (textureView2 != null) {
            viewGroup.addView(textureView2, 0);
        }
    }

    public void b(boolean z) {
        if (z) {
            this.r.setVisibility(0);
            this.e.setVisibility(8);
            return;
        }
        this.r.setVisibility(8);
        this.e.setVisibility(0);
    }

    public void h() {
        int visibility = this.f.getVisibility();
        int i;
        if (e() || this.s.a() == csk.a || this.s.a() == csk.b) {
            i = 0;
        } else {
            i = 8;
        }
        Animation loadAnimation;
        if (visibility == 8 && r0 == 0) {
            loadAnimation = AnimationUtils.loadAnimation(getContext(), gwb.nN);
            this.f.setVisibility(0);
            this.f.startAnimation(loadAnimation);
        } else if (visibility == 0 && r0 == 8) {
            loadAnimation = AnimationUtils.loadAnimation(getContext(), gwb.nO);
            loadAnimation.setAnimationListener(new ctc(this));
            this.f.startAnimation(loadAnimation);
        }
    }
}
