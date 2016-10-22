package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import ba;
import dgg;
import dht;
import dhu;
import did;
import djd;
import dka;
import dkb;
import dkc;
import dkd;
import dke;
import dkf;
import dkv;
import dkx;
import gwb;
import iil;
import itc;
import ite;
import itg;
import itl;
import java.util.ArrayList;
import me;

public final class ParticipantTrayView extends LinearLayout implements dht {
    public djd a;
    public dhu b;
    public boolean c;
    public final FrameLayout d;
    private final itg e;
    private final OnGlobalLayoutListener f;
    private final dgg g;
    private FocusedParticipantView h;
    private dkx i;
    private Handler j;
    private me k;
    private final ArrayList<dkf> l;
    private boolean m;
    private final HorizontalScrollNotifier n;
    private final LinearLayout o;
    private final LinearLayout p;

    public class HorizontalScrollNotifier extends HorizontalScrollView {
        dke a;

        public HorizontalScrollNotifier(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void onScrollChanged(int i, int i2, int i3, int i4) {
            if (this.a != null) {
                this.a.a();
            }
        }

        void a(dke dke) {
            this.a = dke;
        }
    }

    public ParticipantTrayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new dka(this);
        this.f = new dkb(this);
        this.g = dgg.a();
        this.j = new Handler();
        this.l = new ArrayList();
        View inflate = LayoutInflater.from(context).inflate(gwb.gD, this, true);
        this.n = (HorizontalScrollNotifier) inflate.findViewById(ba.eX);
        this.o = (LinearLayout) inflate.findViewById(ba.dV);
        this.p = (LinearLayout) inflate.findViewById(ba.eJ);
        this.d = (FrameLayout) inflate.findViewById(ba.eY);
        this.k = new me(context, new dkd(this));
    }

    void a(djd djd) {
        this.a = djd;
        this.m = false;
        if (VERSION.SDK_INT < 19) {
            LayoutParams layoutParams = (LayoutParams) this.o.getLayoutParams();
            layoutParams.gravity = 3;
            this.o.setLayoutParams(layoutParams);
        }
    }

    protected void onVisibilityChanged(View view, int i) {
        g();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return this.k.a(motionEvent);
    }

    public void b() {
        this.j.postDelayed(new dkc(this), 500);
    }

    void a(FocusedParticipantView focusedParticipantView) {
        this.h = focusedParticipantView;
    }

    public void a(dhu dhu) {
        this.b = dhu;
        this.g.a(this.e);
        this.n.getViewTreeObserver().addOnGlobalLayoutListener(this.f);
        this.n.a(new dke(this));
        iil.b("Expected condition to be false", this.m);
        this.m = true;
        ite g = this.g.g();
        itc itc = null;
        if (g != null) {
            itc = g.q();
        }
        boolean z = itc == null || !itc.b();
        a(new itl().a("localParticipant").c(true).a(z));
        for (itl itl : this.g.q()) {
            if (!itl.f()) {
                a(itl);
            }
        }
        iil.a("Expected condition to be true", this.m);
        this.m = false;
        i();
    }

    public void y_() {
        this.n.a(null);
        this.n.getViewTreeObserver().removeOnGlobalLayoutListener(this.f);
        this.g.b(this.e);
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dkf) obj).y_();
        }
        this.l.clear();
        this.i = null;
        this.p.removeAllViews();
        this.d.removeAllViews();
    }

    public void a(int i) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((dkf) obj).a(i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dkf) obj).onConfigurationChanged(configuration);
        }
        d();
    }

    public void c() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dkf) obj).j();
        }
    }

    public void d() {
        if (this.b != null && this.b.n() != null) {
            this.b.n().b();
        }
    }

    public void a(dkf dkf) {
        dkf.c();
        for (int i = 0; i < this.l.size(); i++) {
            if (this.l.get(i) == dkf) {
                this.l.remove(i);
                break;
            }
        }
        this.p.removeView(dkf);
        this.d.removeView(dkf);
        i();
    }

    dkf a(String str) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dkf dkf = (dkf) obj;
            itl d = dkf.d();
            if (str == null && d.f()) {
                return dkf;
            }
            if (str.equals(d.a())) {
                return dkf;
            }
        }
        return null;
    }

    dkf e() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dkf dkf = (dkf) obj;
            if (dkf != this.i) {
                return dkf;
            }
        }
        return this.i;
    }

    dkx f() {
        return this.i;
    }

    public void a(View view) {
        int left;
        int left2 = ((ViewGroup) view.getParent()).getLeft();
        if (view == this.d) {
            left = (this.p.getLeft() + this.p.getWidth()) + left2;
            left2 = this.d.getWidth() + left;
        } else {
            left = view.getLeft() + left2;
            left2 += view.getRight();
        }
        int scrollX = this.n.getScrollX();
        int width = this.n.getWidth() + scrollX;
        if (scrollX > left) {
            this.n.smoothScrollTo(left, 0);
        } else if (left2 > width) {
            this.n.smoothScrollTo(left2 - (width - scrollX), 0);
        }
    }

    public void g() {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((dkf) obj).f();
        }
    }

    public void h() {
        i();
    }

    public void i() {
        did s = this.g.s();
        if (this.l.size() <= 1 || (s != null && s.K())) {
            this.p.setVisibility(8);
            this.d.setVisibility(8);
        } else if (this.l.size() != 2 || this.i.isFocused()) {
            this.p.setVisibility(0);
            this.d.setVisibility(0);
        } else {
            this.p.setVisibility(8);
            this.d.setVisibility(0);
        }
        if (this.p.getVisibility() == 8) {
            g();
        }
    }

    public boolean j() {
        return this.c;
    }

    public void a(boolean z) {
        int dimensionPixelSize;
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(gwb.eS);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || layoutParams.height < 0) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(gwb.eU);
        } else {
            dimensionPixelSize = layoutParams.height;
        }
        if (z) {
            startAnimation(this.a.a(-(dimensionPixelSize + dimensionPixelSize2), dimensionPixelSize2, this, true));
            this.c = false;
            return;
        }
        startAnimation(this.a.a(dimensionPixelSize2, -(dimensionPixelSize + dimensionPixelSize2), this, false));
    }

    public void a(itl itl) {
        iil.b("Expected non-null", (Object) itl);
        dkf dkf = null;
        if (itl.f()) {
            iil.a("Expected null", this.i);
            this.i = new dkx(this.a, itl, this, this.h);
            dkf = this.i;
            this.d.addView(dkf);
        } else if (a(itl.a()) == null) {
            dkf = new dkv(this.a, itl, this, this.h);
            this.p.addView(dkf);
        }
        if (dkf != null) {
            this.l.add(dkf);
            dkf.a(this.b);
        }
        if (!this.m) {
            i();
        }
    }
}
