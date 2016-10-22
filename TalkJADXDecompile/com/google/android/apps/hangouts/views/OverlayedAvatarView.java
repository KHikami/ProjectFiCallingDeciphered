package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import ba;
import bc;
import bko;
import edo;
import etu;
import etx;
import gir;
import gld;
import glk;
import gqi;
import gqj;
import gwb;
import icb;
import jca;
import jyn;
import kae;
import kbc;
import kbu;
import wi;

public class OverlayedAvatarView extends RelativeLayout {
    public static final int a;
    private static final boolean c;
    private static final Handler d;
    private static volatile boolean e;
    public RichStatusView b;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private AvatarView k;
    private edo l;
    private int m;
    private String n;
    private gqj o;
    private gir p;
    private Runnable q;

    static {
        kae kae = glk.u;
        c = false;
        a = etx.CALL_TYPE.l | etx.DEVICE_STATUS.l;
        d = new Handler(Looper.getMainLooper());
        e = true;
    }

    public static String a(int i) {
        switch (b(i)) {
            case wi.w /*0*/:
                return "NULL";
            case wi.j /*1*/:
                return "STATE_WATERMARK";
            case wi.l /*2*/:
                return "STATE_FOCUSED";
            case wi.h /*4*/:
                return "STATE_TYPING";
            default:
                return "UNKNOWN";
        }
    }

    public static int b(int i) {
        int i2 = (i >> 1) | i;
        i2 |= i2 >> 2;
        return i2 - (i2 >> 1);
    }

    public OverlayedAvatarView(Context context) {
        super(context);
        this.h = 0;
        this.i = 0;
        this.m = -1;
    }

    public OverlayedAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 0;
        this.i = 0;
        this.m = -1;
    }

    public OverlayedAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 0;
        this.i = 0;
        this.m = -1;
    }

    public static OverlayedAvatarView a(LayoutInflater layoutInflater, String str, edo edo, boolean z, boolean z2, int i, gir gir) {
        OverlayedAvatarView overlayedAvatarView = (OverlayedAvatarView) layoutInflater.inflate(gwb.hk, null, false);
        overlayedAvatarView.n = str;
        overlayedAvatarView.l = edo;
        overlayedAvatarView.b.a(overlayedAvatarView.l);
        overlayedAvatarView.k.b(z2);
        overlayedAvatarView.p = gir;
        overlayedAvatarView.g(i);
        e = icb.a(overlayedAvatarView.getContext().getContentResolver(), "babel_richstatus", true);
        overlayedAvatarView.f = true;
        overlayedAvatarView.h();
        return overlayedAvatarView;
    }

    public int a() {
        return b(this.h);
    }

    public int c(int i) {
        return this.h & (i ^ -1);
    }

    public int d(int i) {
        return this.h | i;
    }

    public void e(int i) {
        int b = b(this.h);
        int b2 = b(i);
        this.h = i;
        if (c) {
            String valueOf = String.valueOf(a(b2));
            String valueOf2 = String.valueOf(this.l);
            new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length()).append("[AvatarView] new state  ").append(valueOf).append(" for ").append(valueOf2);
        }
        if (b2 != b) {
            switch (b2) {
                case wi.j /*1*/:
                    b(false);
                    c(false);
                case wi.l /*2*/:
                    b(true);
                    c(false);
                case wi.h /*4*/:
                    c(true);
                    b(true);
                default:
            }
        }
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public void f(int i) {
        this.i = i;
    }

    public boolean d() {
        return (this.h & 2) == 2;
    }

    public boolean e() {
        return (this.h & 4) == 4;
    }

    public void a(boolean z) {
        if (!e) {
            z = false;
        }
        if (this.g != z) {
            this.g = z;
            String str = this.g ? this.l.a : null;
            if (this.o == null) {
                if (str != null) {
                    jyn b = jyn.b(getContext());
                    this.o = new gqj(this, getContext(), (kbu) b.a(kbc.class), ((jca) b.a(jca.class)).a());
                } else {
                    return;
                }
            }
            this.o.a(str);
        }
    }

    private void h() {
        if (!this.f || TextUtils.isEmpty(this.n) || this.b == null) {
            setContentDescription(null);
        } else {
            StringBuilder stringBuilder = new StringBuilder(this.n);
            this.b.a(stringBuilder);
            setContentDescription(stringBuilder.toString());
        }
        if (this.p != null) {
            this.p.b();
        }
    }

    public void f() {
        a(false);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.k = (AvatarView) findViewById(ba.D);
        this.k.a(true);
        this.b = (RichStatusView) findViewById(ba.eQ);
    }

    public void g(int i) {
        if (this.m != i) {
            this.m = i;
            this.b.a(i);
        }
    }

    public void a(String str, String str2, bko bko) {
        this.k.a(str, str2, bko);
    }

    private void b(boolean z) {
        boolean z2;
        boolean z3 = true;
        AvatarView avatarView = this.k;
        if (z) {
            z2 = false;
        } else {
            z2 = true;
        }
        avatarView.a(z2);
        RichStatusView richStatusView = this.b;
        if (z) {
            z3 = false;
        }
        richStatusView.b(z3);
    }

    private void c(boolean z) {
        if (this.m != -1) {
            this.b.a(z);
            if (this.j != z) {
                int i;
                if (z) {
                    i = bc.l;
                } else {
                    i = bc.m;
                }
                gld.a((View) this, null, getResources().getString(i, new Object[]{this.n}));
                this.j = z;
            }
        }
    }

    public edo g() {
        return this.l;
    }

    public void a(etu etu) {
        this.b.a(etu);
        if (this.g && this.b.b()) {
            if (this.q == null) {
                this.q = new gqi(this);
            }
            d.removeCallbacks(this.q);
            d.postDelayed(this.q, 10000);
        }
        h();
    }
}
