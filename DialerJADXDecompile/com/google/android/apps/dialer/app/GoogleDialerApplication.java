package com.google.android.apps.dialer.app;

import abs;
import abt;
import akp;
import alg;
import alh;
import apr;
import aps;
import avo;
import avt;
import avu;
import awm;
import awn;
import awu;
import awv;
import axf;
import axh;
import bef;
import beg;
import bem;
import ben;
import bhm;
import bho;
import bhp;
import bhq;
import bhr;
import bhs;
import bht;
import bhu;
import bhv;
import bja;
import bkf;
import csq;

/* compiled from: PG */
public class GoogleDialerApplication extends akp implements abt, alh, aps, avu, awn, awv, axh, beg, ben {
    private avo a;
    private csq b;
    private bja c;
    private bhm d;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
        r8 = this;
        r0 = "GoogleDialerApplication onCreate";
        android.os.Trace.beginSection(r0);
        bjd.a(r8);
        r1 = buf.p();
        r2 = bjd.k;
        r3 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x001b;
    L_0x0013:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x001b:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x00ae;
    L_0x0029:
        r0 = r2.i;
        if (r0 == 0) goto L_0x0096;
    L_0x002d:
        r0 = crm.b;
        r3 = r2.i;
        r4 = 0;
        r0 = r0.getSharedPreferences(r3, r4);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x00ae;
    L_0x003e:
        r0 = r2.a(r0);
    L_0x0042:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0056;
    L_0x004a:
        r0 = new bif;
        r2 = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        r0.<init>(r8, r2);
        java.lang.Thread.setDefaultUncaughtExceptionHandler(r0);
    L_0x0056:
        super.onCreate();
        r0 = new bja;
        r0.<init>(r8);
        r8.c = r0;
        r0 = new bhm;
        r0.<init>(r8);
        r8.d = r0;
        bjd.b(r8);
        r0 = buf.a(r8);
        if (r0 == 0) goto L_0x0073;
    L_0x0070:
        buf.R(r8);
    L_0x0073:
        buf.a(r8);
        r0 = "Application.onCreate";
        buf.a(r1, r0);
        r0 = new avo;
        r0.<init>(r8);
        r8.a = r0;
        r0 = new csq;
        r0.<init>();
        r8.b = r0;
        r0 = buf.H(r8);
        r1 = 1001; // 0x3e9 float:1.403E-42 double:4.946E-321;
        r0.a(r1);
        android.os.Trace.endSection();
        return;
    L_0x0096:
        if (r3 != 0) goto L_0x00c6;
    L_0x0098:
        r0 = r2.j;
        r3 = crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x00a6:
        if (r0 == 0) goto L_0x00ae;
    L_0x00a8:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x0042;
    L_0x00ae:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = ckq.a(r0, r3);
        if (r0 == 0) goto L_0x00c2;
    L_0x00bc:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x0042;
    L_0x00c2:
        r0 = r2.k;
        goto L_0x0042;
    L_0x00c6:
        r0 = r2.j;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r7 = new crk;
        r7.<init>(r4, r5, r6);
        r4 = r0.a(r7);
        if (r4 == 0) goto L_0x00de;
    L_0x00d9:
        r0 = r4.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x00a6;
    L_0x00de:
        r0 = r0.a(r3, r7);
        goto L_0x00a6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.dialer.app.GoogleDialerApplication.onCreate():void");
    }

    public final bef h() {
        return new bhs();
    }

    public final bem i() {
        return new bht(this, this.c);
    }

    public final abs a() {
        return new bho(this);
    }

    public final alg b() {
        return new bhq();
    }

    public final apr c() {
        return new bhr();
    }

    public final awm e() {
        return new bhu(this, this.c, this.d);
    }

    public final axf g() {
        return new bkf(this);
    }

    public final awu f() {
        return new bhv();
    }

    public final avt d() {
        return new bhp();
    }
}
