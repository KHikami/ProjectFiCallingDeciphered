package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba;
import bc;
import bko;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import fip;
import fme;
import fmf;
import glq;
import gre;
import gwb;
import iil;
import jyn;

public class VoiceRatesAndBalanceView extends LinearLayout implements OnClickListener {
    public View a;
    public TextView b;
    public TextView c;
    public boolean d;
    public final Object e;
    public Pair<Integer, String> f;
    public int g;
    private TextView h;
    private View i;
    private View j;
    private final fip k;

    public VoiceRatesAndBalanceView(Context context) {
        this(context, null);
    }

    public VoiceRatesAndBalanceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Object();
        this.g = -1;
        this.k = new gre(this);
        View inflate = LayoutInflater.from(context).inflate(gwb.hH, this, true);
        this.a = inflate.findViewById(ba.fH);
        this.a.setOnClickListener(this);
        this.b = (TextView) inflate.findViewById(ba.eo);
        this.c = (TextView) inflate.findViewById(ba.eq);
        this.h = (TextView) inflate.findViewById(ba.K);
        this.i = inflate.findViewById(ba.J);
        this.j = inflate.findViewById(ba.I);
        this.d = true;
    }

    public void onClick(View view) {
        a(getContext());
    }

    public void onDetachedFromWindow() {
        synchronized (this.e) {
            a();
            b();
        }
        super.onDetachedFromWindow();
    }

    public void a(String str, bko bko) {
        if (this.d && !TextUtils.isEmpty(str) && bko != null && a(bko)) {
            synchronized (this.e) {
                if (this.g == -1) {
                    fme a = ((fmf) jyn.a(getContext(), fmf.class)).a();
                    this.g = a.a();
                    RealTimeChatService.a(this.k);
                    RealTimeChatService.b(a, bko.g());
                }
            }
        }
        String c = glq.c(gwb.H(), str);
        if (c == null) {
            synchronized (this.e) {
                a();
            }
            setVisibility(8);
        } else if (bko != null) {
            synchronized (this.e) {
                RealTimeChatService.a(this.k);
                a = ((fmf) jyn.a(getContext(), fmf.class)).a();
                this.f = new Pair(Integer.valueOf(a.a()), c);
                RealTimeChatService.d(a, bko.g(), c);
            }
        }
    }

    public static void a(Context context) {
        context.startActivity(gwb.z(gwb.b(context, "babel_google_voice_add_balance_url", "https://www.google.com/voice/m/billing")));
    }

    public void a() {
        iil.a("Expected condition to be true", Thread.holdsLock(this.e));
        if (this.f != null) {
            this.f = null;
            d();
        }
    }

    public void b() {
        iil.a("Expected condition to be true", Thread.holdsLock(this.e));
        if (this.g != -1) {
            this.g = -1;
            d();
        }
    }

    private void d() {
        if (this.f == null && this.g == -1) {
            RealTimeChatService.b(this.k);
        }
    }

    public void c() {
        this.d = true;
    }

    public boolean a(bko bko, StringBuilder stringBuilder) {
        int i = 8;
        if (a(bko)) {
            Object K = bko.K();
            this.h.setText(K);
            if (stringBuilder != null) {
                String valueOf = String.valueOf(getResources().getString(bc.be));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(K).length()).append(", ").append(valueOf).append(K).toString());
            }
            i = 0;
        }
        this.h.setVisibility(i);
        this.i.setVisibility(i);
        this.j.setVisibility(i);
        if (i == 0) {
            return true;
        }
        return false;
    }

    private static boolean a(bko bko) {
        return !bko.M();
    }
}
