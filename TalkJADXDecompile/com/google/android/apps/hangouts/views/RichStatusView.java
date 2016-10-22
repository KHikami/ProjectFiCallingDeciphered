package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ba;
import bc;
import com.google.android.apps.hangouts.R$drawable;
import com.google.api.client.http.HttpStatusCodes;
import edo;
import etu;
import gld;
import glk;
import gnz;
import gqt;
import gwb;
import iil;
import jyn;
import kae;
import kbc;
import kbu;
import wi;

public class RichStatusView extends LinearLayout {
    private static final boolean b;
    private static int c;
    private static int d;
    public final gqt[] a;
    private AnimationDrawable e;
    private edo f;
    private etu g;

    static {
        kae kae = glk.u;
        b = false;
        c = -1;
        d = -1;
    }

    public RichStatusView(Context context) {
        super(context);
        this.a = new gqt[3];
        if (c < 0) {
            c = getResources().getDimensionPixelSize(gwb.fm);
        }
        if (d < 0) {
            d = getResources().getDimensionPixelSize(gwb.fl);
        }
    }

    public RichStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new gqt[3];
        if (c < 0) {
            c = getResources().getDimensionPixelSize(gwb.fm);
        }
        if (d < 0) {
            d = getResources().getDimensionPixelSize(gwb.fl);
        }
    }

    public void a(edo edo) {
        this.f = edo;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.a[0] = new gqt(this, ba.eR, ba.aS, d);
        this.a[1] = new gqt(this, ba.eP, ba.eO, c);
        this.a[2] = new gqt(this, ba.eN, ba.eM, c);
        Object obj = this.a[0].c;
        iil.b("Expected non-null", obj);
        Context context = getContext();
        kbu kbu = (kbu) jyn.b(context, kbu.class);
        if (kbu == null) {
            kbu = (kbu) jyn.b(context, kbc.class);
        }
        this.e = gnz.a(context, kbu);
        obj.setBackgroundDrawable(this.e);
    }

    public void a(int i) {
        int color;
        if (i == 1) {
            color = getResources().getColor(gwb.dR);
        } else {
            color = getResources().getColor(gwb.dQ);
        }
        this.a[0].b(color);
        this.a[1].b(color);
        this.a[2].b(color);
    }

    public void a(etu etu) {
        this.g = etu;
    }

    public void a() {
        this.a[1].a(false);
        this.a[2].a(false);
    }

    public boolean b() {
        int i = 0;
        if (this.g == null) {
            return false;
        }
        int i2;
        if (b) {
            String valueOf = String.valueOf(this.f);
            String valueOf2 = String.valueOf(this.g);
            new StringBuilder((String.valueOf(valueOf).length() + 44) + String.valueOf(valueOf2).length()).append("Showing presence: mParticipantId=").append(valueOf).append(", presence=").append(valueOf2);
        }
        switch (this.g.b(0)) {
            case 100:
                i2 = R$drawable.bA;
                break;
            case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                i2 = R$drawable.bD;
                break;
            default:
                i2 = 0;
                break;
        }
        i2 = this.a[1].a(i2, getResources().getColor(gwb.ep)) | 0;
        switch (this.g.a(0)) {
            case wi.j /*1*/:
                i = R$drawable.bz;
                break;
            case wi.l /*2*/:
                i = R$drawable.bB;
                break;
            case wi.z /*3*/:
                i = R$drawable.bk;
                break;
        }
        return this.a[2].a(i, getResources().getColor(gwb.ep)) | i2;
    }

    public void a(boolean z) {
        gqt gqt = this.a[0];
        if (gqt.a != z) {
            gqt.a(z);
            if (z) {
                this.e.start();
            } else {
                this.e.stop();
            }
        }
    }

    public void b(boolean z) {
        float f = z ? 0.4f : 1.0f;
        for (int i = 0; i < 3; i++) {
            this.a[i].c.setAlpha(f);
        }
    }

    public void a(StringBuilder stringBuilder) {
        if (this.g != null) {
            Context context = getContext();
            if (this.a[2].a) {
                CharSequence a = a(context);
                if (a != null) {
                    gld.a(stringBuilder, a);
                }
            }
            if (this.a[1].a) {
                CharSequence string;
                switch (this.g.b(0)) {
                    case 100:
                        string = context.getString(bc.c);
                        break;
                    case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                        string = context.getString(bc.d);
                        break;
                    default:
                        string = null;
                        break;
                }
                if (string != null) {
                    gld.a(stringBuilder, string);
                }
            }
        }
    }

    public String a(Context context) {
        switch (this.g.a(0)) {
            case wi.j /*1*/:
                return context.getString(bc.f);
            case wi.l /*2*/:
                return context.getString(bc.g);
            case wi.z /*3*/:
                return context.getString(bc.e);
            default:
                return null;
        }
    }
}
