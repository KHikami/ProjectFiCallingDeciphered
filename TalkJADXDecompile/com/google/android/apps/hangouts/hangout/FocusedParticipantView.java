package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ba;
import bc;
import blc;
import dgg;
import dhf;
import dhg;
import dhh;
import dhi;
import dht;
import dhu;
import did;
import dii;
import djd;
import dkf;
import dks;
import dkv;
import dkx;
import dpb;
import glk;
import glq;
import gwb;
import itg;
import itl;
import java.util.Iterator;
import jyn;
import kae;

public final class FocusedParticipantView extends FrameLayout implements dht {
    private static final boolean f;
    public djd a;
    public boolean b;
    public itl c;
    public dpb d;
    private final itg e;
    private int g;
    private final dgg h;
    private dhu i;
    private ParticipantTrayView j;
    private dkf k;
    private final View l;
    private final ImageView m;
    private final Chronometer n;
    private final View o;
    private final TextView p;
    private final View q;
    private boolean r;

    static {
        kae kae = glk.g;
        f = false;
    }

    public FocusedParticipantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new dhg(this);
        this.g = 1;
        this.h = dgg.a();
        this.b = true;
        this.r = false;
        View inflate = LayoutInflater.from(context).inflate(gwb.gz, this, true);
        this.m = (ImageView) inflate.findViewById(ba.br);
        this.l = inflate.findViewById(ba.bp);
        this.n = (Chronometer) inflate.findViewById(ba.Y);
        this.o = inflate.findViewById(ba.el);
        this.p = (TextView) inflate.findViewById(ba.at);
        this.q = inflate.findViewById(ba.ga);
        this.l.setVisibility(0);
        this.d = (dpb) jyn.b(context, dpb.class);
        if (this.d != null) {
            this.d.a(context, (ViewGroup) inflate.findViewById(ba.bq));
            this.d.b(0);
            this.m.bringToFront();
        }
    }

    void a(djd djd, ParticipantTrayView participantTrayView) {
        this.j = participantTrayView;
        this.a = djd;
        h();
        f();
    }

    private void f() {
        setContentDescription(this.a.a(getContext()));
    }

    public void a(dhu dhu) {
        this.i = dhu;
        g();
        this.h.a(this.e);
        setOnClickListener(new dhh(this));
        if (f) {
            setOnLongClickListener(new dhi(this));
        }
        f();
    }

    public void y_() {
        this.h.b(this.e);
        this.c = null;
        this.k = null;
        setOnClickListener(null);
        setOnLongClickListener(null);
    }

    public void a(int i) {
        g();
    }

    private void g() {
        if (this.i != null && this.i.n() != null) {
            this.i.n().a((ViewGroup) findViewById(ba.bI));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    private void b(itl itl) {
        dkf dkf = this.k;
        this.c = itl;
        if (this.c == null) {
            this.k = this.j.e();
        } else {
            this.k = this.j.a(this.c.a());
        }
        if (this.h.u() && (this.k instanceof dkx)) {
            this.c = null;
            this.k = null;
        }
        if (this.k != dkf) {
            c();
            b();
            return;
        }
        h();
    }

    public void a(String str) {
        if (this.c != null && this.c.a().equals(str)) {
            b();
        }
    }

    public void b() {
        Bitmap b;
        if (this.c == null || !this.c.j()) {
            b = blc.b();
        } else {
            b = blc.b();
        }
        ImageView imageView = this.m;
        if (this.k != null) {
            b = this.k.l();
        }
        imageView.setImageBitmap(b);
        h();
        if (this.d != null) {
            this.d.a(0);
        }
    }

    private void h() {
        Iterator it = jyn.c(getContext(), dhf.class).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private static String b(int i) {
        return i == 2 ? "VIDEO_FRAME" : "AVATAR_BITMAP";
    }

    private void c(int i) {
        int i2 = 0;
        if (this.g != i) {
            glk.a("Babel_calls", "FocusedParticipantView: switch from mode %s to mode %s", b(this.g), b(i));
            this.g = i;
            if (this.g == 2) {
                i2 = 4;
            }
            this.l.setVisibility(i2);
            if (this.d != null) {
                this.d.b(i2);
            }
        }
    }

    public void c() {
        if (this.h.u() || (this.c != null && this.c.j())) {
            c(1);
            if (this.c != null && this.k != null) {
                int i;
                if (this.c.h() > 0) {
                    this.n.setVisibility(0);
                    if (!(this.r || this.c == null || this.k == null)) {
                        this.n.setBase(this.c.h());
                        this.n.start();
                        this.r = true;
                    }
                } else {
                    this.n.setVisibility(8);
                }
                did s = this.h.s();
                if (this.k instanceof dkv) {
                    dks n = ((dkv) this.k).n();
                    if (!(n == null || s == null)) {
                        for (dii dii : s.T()) {
                            String c = glq.c(gwb.H(), n.b());
                            if (c != null && c.equals(dii.a())) {
                                break;
                            }
                        }
                    }
                }
                dii dii2 = null;
                if (dii2 == null || dii2.b() == null) {
                    this.p.setVisibility(8);
                    i = 8;
                } else {
                    this.p.setText(getResources().getString(bc.bo, new Object[]{dii2.b()}));
                    this.p.setText(getResources().getString(bc.bp, new Object[]{dii2.b()}));
                    this.p.setVisibility(0);
                    i = 0;
                }
                if (s == null || !s.k().M()) {
                    this.q.setVisibility(8);
                } else {
                    this.q.setVisibility(0);
                    i = 0;
                }
                this.o.setVisibility(i);
                return;
            }
            return;
        }
        this.n.setVisibility(8);
        this.o.setVisibility(8);
    }

    public void a(itl itl) {
        glk.a("Babel_calls", "Focused participant changed to %s", itl);
        b(itl);
    }

    public void d() {
        c(2);
    }

    public void e() {
        c(1);
    }
}
