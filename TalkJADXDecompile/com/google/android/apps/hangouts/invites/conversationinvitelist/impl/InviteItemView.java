package com.google.android.apps.hangouts.invites.conversationinvitelist.impl;

import abi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.text.Html;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import awe;
import azl;
import azx;
import ba;
import bbm;
import bc;
import blc;
import bnn;
import bnq;
import dex;
import dey;
import dqm;
import dqn;
import dqo;
import dqq;
import ed;
import fsi;
import gjo;
import gkc;
import gkt;
import glk;
import gwb;
import ia;
import iic;
import iil;
import jyn;
import kae;

public class InviteItemView extends abi implements bnq {
    private static final boolean l;
    public String e;
    public bnn f;
    public String g;
    public Bitmap h;
    public dqq i;
    public String j;
    public int k;
    private gkt m;
    private dex n;
    private dey o;
    private final azx<Bitmap> p;

    static {
        kae kae = glk.f;
        l = false;
    }

    public InviteItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new dqm(this);
        this.n = (dex) jyn.a(context, dex.class);
    }

    public void a(int i, String str, String str2, dqq dqq, InviteListFragment inviteListFragment) {
        this.k = i;
        this.e = str;
        this.i = dqq;
        this.j = str2;
        setSelected(false);
        ((ImageView) findViewById(gwb.qF)).setVisibility(0);
        a(this.i.f());
        CharSequence i2 = this.i.i();
        TextView textView = (TextView) findViewById(gwb.qE);
        if (TextUtils.isEmpty(i2)) {
            textView.setText(getResources().getString(ba.lK));
        } else {
            textView.setText(i2);
        }
        b(this.i.q());
        c(this.i.g());
        a(inviteListFragment);
        a(inviteListFragment.getFragmentManager());
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            c();
            this.g = "";
            this.m = null;
            this.h = null;
            a(blc.b());
        } else if (!TextUtils.equals(str, this.g)) {
            c();
            this.g = str;
            if (this.n.c()) {
                this.o = (dey) jyn.a(getContext(), dey.class);
                this.n.a(str, this.p, (azl) this.o.d(blc.a()).a(getContext(), new awe(getContext())), (iic) this.o.b().a());
                return;
            }
            this.f = new bnn(new gkc(str, ((bbm) jyn.a(getContext(), bbm.class)).a(this.k)).a(blc.a()).d(true).b(true), this, true, this.e);
            if (((fsi) jyn.a(getContext(), fsi.class)).a(this.f)) {
                this.f = null;
            }
        } else if (this.m != null) {
            a(this.m.e());
        } else if (this.h != null) {
            a(this.h);
        } else {
            a(blc.b());
        }
    }

    public void a(Bitmap bitmap) {
        ((ImageView) findViewById(gwb.qF)).setImageDrawable(new BitmapDrawable(getResources(), bitmap));
    }

    private void c() {
        if (this.f != null) {
            this.f.b();
            this.f = null;
        }
        if (this.m != null) {
            this.m.b();
            this.m = null;
        }
        ((ImageView) findViewById(gwb.qF)).setImageDrawable(null);
        this.g = null;
        this.h = null;
    }

    protected void onDetachedFromWindow() {
        c();
        super.onDetachedFromWindow();
    }

    public void a(InviteListFragment inviteListFragment) {
        ((Button) findViewById(gwb.qw)).setOnClickListener(new dqn(this, inviteListFragment));
    }

    public void a(ed edVar) {
        ((Button) findViewById(gwb.qB)).setOnClickListener(new dqo(this, edVar));
    }

    public void b(String str) {
        TextView textView = (TextView) findViewById(gwb.qC);
        textView.setLines(1);
        textView.setEllipsize(TruncateAt.END);
        textView.setText(Html.fromHtml(str));
        View findViewById = findViewById(gwb.qD);
        findViewById.setBackgroundResource(ba.lu);
        findViewById.getBackground().setColorFilter(ia.c(getContext(), bc.uJ), Mode.SRC_IN);
    }

    public void c(String str) {
        TextView textView = (TextView) findViewById(gwb.qG);
        textView.setText(str);
        CharSequence h = this.i.h();
        if (!TextUtils.isEmpty(h)) {
            textView.setMaxLines(1);
            textView = (TextView) findViewById(gwb.qH);
            textView.setVisibility(0);
            textView.setText(h);
        }
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.a("Expected null", (Object) gjo);
        if (l) {
            Object obj;
            if (gkt == null) {
                obj = null;
            } else {
                obj = gkt.toString();
            }
            String valueOf = String.valueOf(obj);
            if (gjo == null) {
                obj = null;
            } else {
                obj = gjo.toString();
            }
            String valueOf2 = String.valueOf(obj);
            new StringBuilder((String.valueOf(valueOf).length() + 71) + String.valueOf(valueOf2).length()).append("InviteItem setImageBitmap ").append(valueOf).append("gifImage=").append(valueOf2).append(" success=").append(z).append(" loadedFromCache=").append(z2);
        }
        if (this.f == bnn) {
            this.f = null;
            if (z) {
                this.m = gkt;
                if (this.m != null) {
                    a(this.m.e());
                } else {
                    a("");
                }
            }
        } else if (gkt != null) {
            gkt.b();
        }
    }
}
