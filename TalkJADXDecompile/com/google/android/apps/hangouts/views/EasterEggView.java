package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bc;
import bko;
import gkc;
import gnu;
import gnv;
import gnw;
import gwb;
import iil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import mjx;
import mjz;

public class EasterEggView extends FrameLayout {
    public static final Random a;
    public static final int[] d;
    private static final String[] i;
    private static final String[] j;
    private static final mjx<Integer, Integer> k;
    public final TypedArray b;
    public final TypedArray c;
    public Handler e;
    public Runnable f;
    public int g;
    public final List<gnw> h;
    private Runnable l;
    private Resources m;

    static {
        i = new String[]{"ponies", "ponystream", "pitchforks"};
        j = new String[]{"ponies", "pitchforks"};
        k = new mjz().a(Integer.valueOf(bc.bB), Integer.valueOf(bc.bC)).a(Integer.valueOf(bc.bE), Integer.valueOf(bc.bF)).a(Integer.valueOf(bc.bG), Integer.valueOf(bc.bH)).a(Integer.valueOf(bc.bI), Integer.valueOf(bc.bJ)).a(Integer.valueOf(bc.bK), Integer.valueOf(bc.bL)).a(Integer.valueOf(bc.bM), Integer.valueOf(bc.bN)).a(Integer.valueOf(bc.bO), Integer.valueOf(bc.bP)).a(Integer.valueOf(bc.bU), Integer.valueOf(bc.bV)).a(Integer.valueOf(bc.bX), Integer.valueOf(bc.bY)).a(Integer.valueOf(bc.bW), Integer.valueOf(bc.bY)).a(Integer.valueOf(bc.bZ), Integer.valueOf(bc.ca)).a(Integer.valueOf(bc.cb), Integer.valueOf(bc.cc)).a(Integer.valueOf(bc.bD), Integer.valueOf(bc.cc)).a(Integer.valueOf(bc.cf), Integer.valueOf(bc.cg)).a(Integer.valueOf(bc.cd), Integer.valueOf(bc.ce)).a(Integer.valueOf(bc.cj), Integer.valueOf(bc.ck)).a(Integer.valueOf(bc.ch), Integer.valueOf(bc.ci)).a(Integer.valueOf(bc.cl), Integer.valueOf(bc.cm)).a(Integer.valueOf(bc.cn), Integer.valueOf(bc.co)).a(Integer.valueOf(bc.bS), Integer.valueOf(bc.bT)).a(Integer.valueOf(bc.bQ), Integer.valueOf(bc.bR)).a();
        a = new Random();
        d = new int[]{gwb.cY, gwb.da, gwb.cZ};
    }

    public String a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence) || charSequence.charAt(0) != '/') {
            return null;
        }
        int a;
        for (String str : i) {
            String str2 = "/";
            String valueOf = String.valueOf(str);
            if (b(charSequence, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2))) {
                return str;
            }
        }
        Iterator a2 = k.g().a();
        while (a2.hasNext()) {
            a = gwb.a((Integer) a2.next());
            String str3 = "/";
            valueOf = String.valueOf(this.m.getString(a));
            if (b(charSequence, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3))) {
                return this.m.getString(a);
            }
        }
        return null;
    }

    private static boolean b(CharSequence charSequence, String str) {
        return TextUtils.indexOf(charSequence, str) == 0 && (charSequence.length() == str.length() || charSequence.charAt(str.length() + 1) == ' ');
    }

    public boolean a(String str) {
        for (CharSequence equals : j) {
            if (TextUtils.equals(str, equals)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(String str) {
        Iterator a = k.g().a();
        while (a.hasNext()) {
            if (TextUtils.equals(str, this.m.getString(gwb.a((Integer) a.next())))) {
                return true;
            }
        }
        return false;
    }

    public CharSequence a(CharSequence charSequence, String str) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        Iterator a = k.g().a();
        while (a.hasNext()) {
            int a2 = gwb.a((Integer) a.next());
            if (TextUtils.equals(str, this.m.getString(a2))) {
                int a3 = gwb.a((Integer) k.get(Integer.valueOf(a2)));
                String str2 = "/";
                String valueOf = String.valueOf(this.m.getString(a2));
                return gwb.a(charSequence, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), this.m.getString(a3));
            }
        }
        return charSequence;
    }

    public EasterEggView(Context context) {
        this(context, null);
    }

    public EasterEggView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Handler();
        this.h = new ArrayList();
        this.m = context.getResources();
        this.b = this.m.obtainTypedArray(gwb.dk);
        this.c = this.m.obtainTypedArray(gwb.dj);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void a(bko bko, TypedArray typedArray, int i) {
        if (typedArray != null) {
            int nextInt = a.nextInt(typedArray.length());
            String valueOf = String.valueOf("//ssl.gstatic.com/chat/babble/ee/");
            String valueOf2 = String.valueOf(typedArray.getString(nextInt));
            gkc gkc = new gkc(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), bko.a());
            gkc.a(false);
            gkc.c(false);
            gkc.d(false);
            this.h.add(new gnw(this, gkc, i));
        }
    }

    public void a(bko bko, String str) {
        if (!gwb.a(getContext(), "babel_easter_eggs", true)) {
            return;
        }
        if (TextUtils.equals("ponies", str)) {
            a(bko, this.b, a.nextBoolean() ? gwb.cX : gwb.cW);
        } else if (TextUtils.equals("ponystream", str)) {
            if (this.l != null) {
                this.e.removeCallbacks(this.l);
                this.l = null;
                return;
            }
            this.l = new gnu(this, bko);
            this.e.post(this.l);
        } else if (TextUtils.equals("pitchforks", str) && this.f == null) {
            this.g = a.nextInt(20) + 20;
            this.f = new gnv(this, bko);
            this.e.post(this.f);
        }
    }

    public void a() {
        boolean z;
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((gnw) it.next()).a();
            it.remove();
        }
        if (this.h.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        if (this.l != null) {
            this.e.removeCallbacks(this.l);
            this.l = null;
        }
        if (this.f != null) {
            this.e.removeCallbacks(this.f);
            this.f = null;
        }
    }
}
