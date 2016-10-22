package com.google.android.gms.people.accountswitcherview;

import a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ba;
import bm;
import gui;
import gwb;
import hss;
import hst;
import hsw;
import hti;
import htk;
import htl;
import htm;
import htn;
import hto;
import htp;
import htq;
import htr;
import hts;
import htt;
import htu;
import htv;
import hwn;
import java.util.ArrayList;
import oa;
import wi;

public class SelectedAccountNavigationView extends FrameLayout {
    private VelocityTracker A;
    private int B;
    private boolean C;
    private int D;
    private float E;
    private int F;
    private int G;
    private int H;
    private int I;
    private boolean J;
    private int K;
    private hwn L;
    private int M;
    private int N;
    public ArrayList<hwn> a;
    public hwn b;
    public htq c;
    public htu d;
    public float e;
    public float f;
    public boolean g;
    public a h;
    public boolean i;
    public Interpolator j;
    public AnimatorSet k;
    public hwn l;
    public hwn m;
    public hwn n;
    private hts o;
    private int p;
    private htv q;
    private gui r;
    private hsw s;
    private hst t;
    private a u;
    private int v;
    private htt w;
    private float x;
    private float y;
    private int z;

    public SelectedAccountNavigationView(Context context, AttributeSet attributeSet) {
        int i;
        Interpolator loadInterpolator;
        boolean z = true;
        super(context, attributeSet);
        this.p = 0;
        this.g = hss.a(21);
        this.a = new ArrayList(2);
        this.v = -1;
        this.z = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A = VelocityTracker.obtain();
        this.B = ViewConfiguration.getMinimumFlingVelocity();
        Resources resources = context.getResources();
        this.e = (float) resources.getDimensionPixelSize(gwb.xi);
        if (VERSION.SDK_INT >= 17) {
            if (getResources().getConfiguration().getLayoutDirection() != 1) {
                z = false;
            }
            this.i = z;
        }
        if (hss.a(21)) {
            i = 17563661;
        } else {
            i = -1;
        }
        if (i != -1) {
            loadInterpolator = AnimationUtils.loadInterpolator(context, 17563661);
        } else {
            loadInterpolator = new DecelerateInterpolator();
        }
        this.j = loadInterpolator;
        this.N = resources.getDimensionPixelSize(gwb.xj);
        this.M = resources.getDimensionPixelSize(gwb.xh);
    }

    public void a(hts hts) {
        this.o = hts;
    }

    public void a(htq htq) {
        this.c = htq;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case wi.w /*0*/:
                this.C = false;
                this.D = motionEvent.getPointerId(0);
                this.C = false;
                break;
            case wi.s /*6*/:
                a(motionEvent);
                this.D = -1;
                this.C = false;
                break;
        }
        return this.C;
    }

    public void a(int i) {
        if (this.d == null) {
            d();
        }
        int i2 = this.N + i;
        setMinimumHeight(i2);
        LayoutParams layoutParams = this.d.I.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-1, i2);
        } else {
            layoutParams.height = i2;
        }
        this.d.I.setLayoutParams(layoutParams);
        a(this.d.p, i);
        a(this.d.B, i);
        a(this.d.s, i);
        a(this.d.t, i);
        a(this.d.D, i);
        a(this.d.E, i);
    }

    private void a(View view, int i) {
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = this.M + i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.D) {
            this.D = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.h != null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        ViewParent parent = getParent();
        float f;
        float translationX;
        MarginLayoutParams marginLayoutParams;
        MarginLayoutParams marginLayoutParams2;
        int marginStart;
        float f2;
        switch (action) {
            case wi.w /*0*/:
                this.x = motionEvent.getX();
                this.y = motionEvent.getY();
                break;
            case wi.j /*1*/:
                int findPointerIndex = motionEvent.findPointerIndex(this.D);
                if (findPointerIndex < 0) {
                    Log.e("SelectedAccountNavigationView", "Got ACTION_UP event but have an invalid active pointer id.");
                    return false;
                }
                if (this.C) {
                    boolean z;
                    f = this.a.size() > 1 ? (float) this.F : this.E;
                    translationX = this.d.p.getTranslationX();
                    if (this.i) {
                        translationX = Math.abs(translationX);
                    }
                    if (translationX >= f * 0.5f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && motionEvent.getX(findPointerIndex) - this.x > ((float) this.z)) {
                        this.A.computeCurrentVelocity(1000);
                        if (Math.abs(this.A.getXVelocity()) > ((float) this.B)) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        marginLayoutParams = (MarginLayoutParams) this.d.w.getLayoutParams();
                        marginLayoutParams2 = (MarginLayoutParams) this.d.x.getLayoutParams();
                        action = this.i ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
                        marginStart = this.i ? marginLayoutParams2.getMarginStart() : marginLayoutParams2.leftMargin;
                        if (this.f == 0.0f) {
                            this.f = (float) this.d.w.getWidth();
                        }
                        f2 = this.f / this.e;
                        float f3 = (this.f - this.e) * 0.5f;
                        if (this.a.size() > 1) {
                            action = this.d.t.getLeft() + marginStart;
                        } else {
                            action += this.d.s.getLeft();
                        }
                        Builder with = animatorSet.play(ObjectAnimator.ofFloat(this.d.p, "translationX", new float[]{((this.f - this.e) * 0.5f) + ((float) (action - this.d.p.getLeft()))})).with(ObjectAnimator.ofFloat(this.d.p, "translationY", new float[]{f3})).with(ObjectAnimator.ofFloat(this.d.p, "scaleX", new float[]{f2})).with(ObjectAnimator.ofFloat(this.d.p, "scaleY", new float[]{f2}));
                        if (this.g && this.a.size() > 0) {
                            if (this.a.size() > 1) {
                                f = (float) (this.d.s.getLeft() - this.d.t.getLeft());
                                with.with(ObjectAnimator.ofFloat(this.d.t, "translationX", new float[]{f}));
                            }
                            if (this.i) {
                                f = ((float) getLeft()) - (((float) this.d.s.getWidth()) + this.E);
                            } else {
                                f = (float) (getWidth() - this.d.s.getLeft());
                            }
                            with.with(ObjectAnimator.ofFloat(this.d.s, "translationX", new float[]{f})).with(ObjectAnimator.ofFloat(this.d.s, "alpha", new float[]{0.0f}));
                            if (this.d.B != null) {
                                with.with(ObjectAnimator.ofFloat(this.d.B, "translationX", new float[]{0.0f}));
                            }
                            if (this.d.y != null) {
                                a((hwn) this.a.get(0), with, 0, 0);
                            }
                        }
                        animatorSet.addListener(new htl(this));
                        hwn hwn = this.b;
                        this.b = (hwn) this.a.remove(0);
                        this.a.add(hwn);
                        b(100);
                        animatorSet.setDuration((long) ((1.0f - (this.d.p.getTranslationX() / translationX)) * 450.0f));
                        animatorSet.setInterpolator(this.j);
                        this.k = animatorSet;
                        this.k.start();
                    } else {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        Builder play = animatorSet2.play(ObjectAnimator.ofFloat(this.d.p, "alpha", new float[]{1.0f}));
                        play.with(ObjectAnimator.ofFloat(this.d.p, "translationX", new float[]{0.0f})).with(ObjectAnimator.ofFloat(this.d.p, "translationY", new float[]{0.0f})).with(ObjectAnimator.ofFloat(this.d.p, "scaleX", new float[]{1.0f})).with(ObjectAnimator.ofFloat(this.d.p, "scaleY", new float[]{1.0f}));
                        play.with(ObjectAnimator.ofFloat(this.d.B, "translationX", new float[]{(float) this.K}));
                        if (this.d.C != null) {
                            play.with(ObjectAnimator.ofFloat(this.d.C, "alpha", new float[]{0.0f}));
                        }
                        if (this.d.u != null) {
                            play.with(ObjectAnimator.ofFloat(this.d.u, "alpha", new float[]{1.0f}));
                        }
                        play.with(ObjectAnimator.ofFloat(this.d.t, "translationX", new float[]{0.0f}));
                        Animator ofFloat = ObjectAnimator.ofFloat(this.d.s, "translationX", new float[]{0.0f});
                        Animator ofFloat2 = ObjectAnimator.ofFloat(this.d.y, "translationX", new float[]{(float) (-getWidth())});
                        Animator ofFloat3 = ObjectAnimator.ofFloat(this.d.s, "alpha", new float[]{1.0f});
                        Animator ofFloat4 = ObjectAnimator.ofFloat(this.d.m, "translationX", new float[]{0.0f});
                        play.with(ofFloat).with(ofFloat3);
                        play.with(ofFloat2).with(ObjectAnimator.ofFloat(this.d.y, "alpha", new float[]{0.0f})).with(ofFloat4).with(ObjectAnimator.ofFloat(this.d.m, "alpha", new float[]{1.0f}));
                        animatorSet2.setDuration(100);
                        animatorSet2.addListener(new hti(this));
                        animatorSet2.setInterpolator(this.j);
                        this.k = animatorSet2;
                        this.k.start();
                    }
                } else {
                    c();
                }
                this.C = false;
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                this.A.clear();
                return false;
            case wi.l /*2*/:
                action = motionEvent.findPointerIndex(this.D);
                if (action >= 0) {
                    translationX = motionEvent.getX(action);
                    float f4 = translationX - this.x;
                    f = motionEvent.getY(action) - this.y;
                    f2 = (f4 * f4) + (f * f);
                    if (this.g && this.a.size() > 0 && !this.C && f2 > ((float) (this.z * this.z)) && Math.abs(f4) > Math.abs(f)) {
                        this.C = true;
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.C) {
                        float f5 = translationX - this.x;
                        if (this.E == -1.0f) {
                            marginLayoutParams = (MarginLayoutParams) this.d.w.getLayoutParams();
                            marginLayoutParams2 = (MarginLayoutParams) this.d.x.getLayoutParams();
                            action = this.i ? marginLayoutParams.getMarginStart() : marginLayoutParams.leftMargin;
                            marginStart = this.i ? marginLayoutParams2.getMarginStart() : marginLayoutParams2.leftMargin;
                            this.E = (float) (action + this.d.s.getLeft());
                            this.F = this.d.t.getLeft() + marginStart;
                            this.H = this.d.p.getLeft() + this.d.p.getPaddingLeft();
                            this.I = this.d.p.getWidth();
                        }
                        f = this.i ? Math.min(f5, 0.0f) : Math.max(f5, 0.0f);
                        if (this.f == 0.0f) {
                            this.f = (float) this.d.w.getWidth();
                        }
                        f5 = this.f / this.e;
                        f4 = (this.f - this.e) * 0.5f;
                        if (this.a.size() > 1) {
                            translationX = (float) this.F;
                        } else {
                            translationX = this.E;
                        }
                        translationX = (translationX - ((float) this.H)) + ((this.f - this.e) * 0.5f);
                        f2 = Math.min(1.0f, f / translationX);
                        f = Math.abs(f4);
                        f4 = Math.max(0.0f, 1.0f - f2);
                        this.d.p.setTranslationX(translationX * f2);
                        this.d.p.setTranslationY(Math.abs(f * f2) * -1.0f);
                        f = Math.min(1.0f, Math.max(f5, 1.0f - (f2 * f5)));
                        this.d.p.setScaleX(f);
                        this.d.p.setScaleY(f);
                        if (this.d.B != null) {
                            if (this.d.B.getVisibility() != 0) {
                                if (this.i) {
                                    action = getWidth() - this.H;
                                } else {
                                    action = (-this.I) - this.H;
                                }
                                this.K = action;
                                this.d.B.setTranslationX((float) this.K);
                                this.d.F.setImageDrawable(this.d.w.getDrawable());
                                this.d.B.setVisibility(0);
                            } else {
                                this.d.B.setTranslationX((((float) (-this.K)) * f2) + ((float) this.K));
                            }
                        }
                        if (this.a.size() > 1) {
                            this.d.t.setTranslationX((this.E - ((float) this.F)) * f2);
                        }
                        if (this.a.size() > 0) {
                            if (this.d.C != null) {
                                if (this.d.C.getVisibility() != 0) {
                                    this.d.C.setAlpha(0.0f);
                                    this.d.C.setVisibility(0);
                                } else {
                                    this.d.C.setAlpha(f2);
                                }
                            }
                            if (this.d.u != null) {
                                this.d.u.setAlpha(1.0f - f2);
                            }
                            if (this.i) {
                                f = ((float) getLeft()) - (((float) this.d.s.getWidth()) + this.E);
                            } else {
                                f = ((float) getWidth()) - this.E;
                            }
                            this.d.s.setTranslationX(f * f2);
                            this.d.s.setAlpha(f4);
                            if (this.d.y != null) {
                                if (this.d.y.getVisibility() != 0) {
                                    hwn hwn2 = (hwn) this.a.get(0);
                                    this.G = this.K;
                                    this.d.y.setTranslationX((float) this.G);
                                    a(this.d.z, this.d.A, hwn2);
                                    this.d.y.setAlpha(0.0f);
                                    this.d.y.setVisibility(0);
                                } else {
                                    if (f2 > 0.33333334f) {
                                        this.d.y.setAlpha(Math.min(1.0f, (f2 - 0.33333334f) * 3.0f));
                                    }
                                    this.d.y.setTranslationX(((float) this.G) + (((float) (-this.G)) * f2));
                                }
                            }
                            if (this.d.m != null) {
                                this.d.m.setTranslationX(this.d.p.getTranslationX());
                                this.d.m.setAlpha(Math.max(0.0f, 1.0f - (3.0f * f2)));
                            }
                        }
                        this.A.addMovement(motionEvent);
                        break;
                    }
                }
                Log.e("SelectedAccountNavigationView", "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
                break;
            case wi.z /*3*/:
                if (parent == null) {
                    return false;
                }
                parent.requestDisallowInterceptTouchEvent(false);
                return false;
            case wi.p /*5*/:
                this.D = motionEvent.getPointerId(motionEvent.getActionIndex());
                break;
            case wi.s /*6*/:
                a(motionEvent);
                break;
        }
        return true;
    }

    public void b(int i) {
        if (this.u != null) {
            getHandler().postDelayed(new htk(this), (long) i);
        }
    }

    public void a(hwn hwn, Builder builder, int i, int i2) {
        a(this.d.z, this.d.A, hwn);
        this.d.y.setVisibility(0);
        Animator ofFloat = ObjectAnimator.ofFloat(this.d.y, "alpha", new float[]{1.0f});
        ofFloat.setStartDelay((long) i);
        ofFloat.setDuration(150);
        Animator ofFloat2 = ObjectAnimator.ofFloat(this.d.m, "alpha", new float[]{0.0f});
        ofFloat2.setStartDelay(0);
        ofFloat2.setDuration(150);
        builder.with(ofFloat).with(ofFloat2);
    }

    public void a(boolean z) {
        this.J = hss.a(11);
        this.g = this.J;
    }

    private void d() {
        Context context = getContext();
        if (this.v == -1) {
            int i;
            if (this.J) {
                i = ba.nd;
            } else if (hss.a(21)) {
                i = ba.nd;
            } else {
                i = ba.ne;
            }
            this.v = i;
        }
        if (this.q == null) {
            this.q = new htr(this);
        }
        LayoutInflater.from(context).inflate(this.v, this);
        this.d = this.q.a(this);
        if (this.g) {
            this.d.s.setOnClickListener(new htm(this));
            this.d.t.setOnClickListener(new htn(this));
        }
        if (this.d.n != null) {
            this.d.n.setOnClickListener(new hto(this));
        }
        setOnClickListener(new htp(this));
    }

    public void c(int i) {
        boolean z = true;
        if (this.p != i) {
            this.p = i;
            if (this.d == null) {
                d();
            }
            if (this.p != 1) {
                z = false;
            }
            this.d.n.a(z);
        }
    }

    public int a() {
        return this.p;
    }

    public void onMeasure(int i, int i2) {
        if (this.d == null) {
            d();
        }
        if (this.d.u != null) {
            this.d.u.measure(i, i2);
        }
        if (this.d.k != null) {
            this.d.k.measure(i, i2);
        }
        if (this.L != null) {
            a(this.L);
            this.L = null;
        }
        super.onMeasure(i, i2);
    }

    public void a(hwn hwn) {
        if (this.d == null) {
            d();
        }
        if (!gwb.a(hwn)) {
            this.b = null;
            this.l = null;
            this.L = null;
        } else if (this.k != null && this.k.isRunning()) {
            this.l = hwn;
        } else if (this.d.u != null && this.d.u.getMeasuredWidth() == 0) {
            this.L = hwn;
            forceLayout();
        } else if (gwb.a(this.b) && this.b.a().equals(hwn.a())) {
            this.b = hwn;
            b();
        } else {
            hwn hwn2 = this.b;
            this.b = hwn;
            String a = this.b.a();
            int i = 0;
            while (i < this.a.size()) {
                hwn hwn3 = (hwn) this.a.get(i);
                if (gwb.a(hwn3) && hwn3.a() != null && hwn3.a().equals(a)) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i >= 0) {
                this.a.remove(i);
            }
            if (hwn2 != null) {
                this.a.add(0, hwn2);
                while (this.a.size() > 2) {
                    this.a.remove(this.a.size() - 1);
                }
            }
            b();
        }
    }

    public void b() {
        if (this.d == null) {
            d();
        }
        if (this.g) {
            a(this.d.p);
            a(this.d.s);
            a(this.d.t);
            a(this.d.m);
            a(this.d.u);
            a(this.d.C);
            a(this.d.B);
        }
        htu htu = this.d;
        hwn hwn = this.b;
        if (htu.l != null && gwb.a(this.b)) {
            htu.l.setContentDescription(getContext().getResources().getString(bm.an, new Object[]{this.b.a()}));
        }
        if (htu.v != null && gwb.a(hwn)) {
            htu.v.setImageBitmap(hst.a(getContext()));
            if (TextUtils.isEmpty(hwn.h())) {
                this.t.a(htu.v);
            } else {
                this.t.a(htu.v);
                this.t.a(htu.v, hwn, 2);
            }
        }
        a(htu.q, htu.r, hwn);
        a(htu, htu.u, hwn);
        e();
        if (this.w != null) {
            this.w.a(this.d, this.b, this.a);
        }
        if (this.g) {
            this.f = (float) this.d.w.getWidth();
            if (this.d.B != null) {
                this.d.B.setVisibility(8);
            }
            if (this.d.C != null) {
                this.d.C.setVisibility(8);
            }
            if (this.d.y != null) {
                this.d.y.setVisibility(8);
            }
            if (this.d.D != null) {
                oa.c(this.d.D, 0.0f);
                oa.d(this.d.D, 0.8f);
                oa.e(this.d.D, 0.8f);
                this.d.D.setVisibility(8);
            }
            if (this.d.E != null) {
                oa.c(this.d.E, 0.0f);
                oa.d(this.d.E, 0.8f);
                oa.e(this.d.E, 0.8f);
                this.d.E.setVisibility(8);
            }
        }
    }

    private static void a(View view) {
        if (view != null) {
            oa.a(view, 0.0f);
            oa.b(view, 0.0f);
            oa.d(view, 1.0f);
            oa.e(view, 1.0f);
            oa.c(view, 1.0f);
        }
    }

    private static void a(TextView textView, TextView textView2, hwn hwn) {
        int i;
        if (textView == null || !gwb.a(hwn)) {
            i = 0;
        } else if (TextUtils.isEmpty(hwn.c())) {
            textView.setText(hwn.a());
            i = 0;
        } else {
            i = 1;
            textView.setText(hwn.c());
        }
        if (textView2 == null) {
            return;
        }
        if (i == 0 || !gwb.a(hwn)) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText(hwn.a());
    }

    public void a(hwn hwn, hwn hwn2) {
        if (this.k == null || !this.k.isRunning()) {
            if (this.a == null) {
                this.a = new ArrayList();
            } else {
                this.a.clear();
            }
            if (hwn != null) {
                this.a.add(hwn);
            }
            if (hwn2 != null) {
                this.a.add(hwn2);
            }
            e();
            return;
        }
        this.m = hwn;
        this.n = hwn2;
    }

    private void e() {
        if (this.g) {
            if (this.d == null) {
                d();
            }
            if (this.d.u == null || this.d.u.getMeasuredWidth() != 0) {
                if (this.a.size() > 0) {
                    hwn hwn = (hwn) this.a.get(0);
                    htu htu = this.d;
                    this.d.s.setVisibility(0);
                    a(this.d.w, hwn);
                    a(htu, htu.C, hwn);
                } else {
                    this.d.s.setVisibility(8);
                }
                if (this.a.size() > 1) {
                    this.d.t.setVisibility(0);
                    a(this.d.x, (hwn) this.a.get(1));
                } else {
                    this.d.t.setVisibility(8);
                }
                this.E = -1.0f;
                return;
            }
            forceLayout();
        }
    }

    public void a(htu htu, ImageView imageView, hwn hwn) {
        if (imageView != null && gwb.a(hwn)) {
            if (TextUtils.isEmpty(hwn.i())) {
                this.s.a(imageView);
                imageView.setImageBitmap(hsw.a(getContext()));
                return;
            }
            this.s.a(imageView);
            this.s.a(imageView, hwn, htu.u.getMeasuredWidth());
        }
    }

    private void a(ImageView imageView, hwn hwn) {
        if (imageView != null && this.t != null && gwb.a(hwn)) {
            imageView.setImageBitmap(hst.a(imageView.getContext()));
            if (TextUtils.isEmpty(hwn.h())) {
                this.t.a(imageView);
            } else {
                this.t.a(imageView);
                this.t.a(imageView, hwn, 2);
            }
            imageView.setVisibility(0);
            imageView.setContentDescription(getContext().getString(bm.al, new Object[]{hwn.a()}));
        }
    }

    public void c() {
        int i;
        boolean z = true;
        if (this.p == 1) {
            i = 0;
        } else {
            i = 1;
        }
        c(i);
        if (this.o != null) {
            this.o.a(this);
        }
        ExpanderView expanderView = this.d.n;
        if (this.p != 1) {
            z = false;
        }
        expanderView.a(z);
    }

    public void a(gui gui) {
        this.r = gui;
        if (this.r != null) {
            a(new hsw(getContext(), this.r));
        }
    }

    public void a(hsw hsw) {
        this.s = hsw;
    }

    public void a(hst hst) {
        this.t = hst;
    }

    public void a(int i, htv htv, htt htt) {
        this.v = i;
        this.q = htv;
        this.w = htt;
    }
}
