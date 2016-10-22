package com.google.android.apps.dialer.extensions;

import acv;
import com.android.dialer.app.UsedByReflection;

@UsedByReflection
/* compiled from: PG */
public class DialerExtendedPhoneDirectoriesManager implements acv {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(android.content.Context r11) {
        /*
        r10 = this;
        r9 = 1;
        r8 = 0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = bjd.t;
        r3 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0016;
    L_0x000e:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0016:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0092;
    L_0x0024:
        r0 = r2.i;
        if (r0 == 0) goto L_0x007a;
    L_0x0028:
        r0 = crm.b;
        r3 = r2.i;
        r0 = r0.getSharedPreferences(r3, r8);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0092;
    L_0x0038:
        r0 = r2.a(r0);
    L_0x003c:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r11);
        r3 = r11.getResources();
        r4 = buf.lI;
        r3 = r3.getString(r4);
        r2 = r2.getBoolean(r3, r9);
        if (r0 == 0) goto L_0x0079;
    L_0x0056:
        if (r2 == 0) goto L_0x0079;
    L_0x0058:
        r0 = new aef;
        r0.<init>(r8, r9);
        r2 = com.google.android.apps.dialer.provider.DialerProvider.a;
        r2 = r2.toString();
        r0.g = r2;
        r2 = buf.lD;
        r2 = r11.getString(r2);
        r0.o = r2;
        r0.k = r8;
        r0.l = r9;
        r0.n = r8;
        r2 = 3;
        r0.m = r2;
        r1.add(r0);
    L_0x0079:
        return r1;
    L_0x007a:
        if (r3 != 0) goto L_0x00a9;
    L_0x007c:
        r0 = r2.j;
        r3 = crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x008a:
        if (r0 == 0) goto L_0x0092;
    L_0x008c:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x003c;
    L_0x0092:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = ckq.a(r0, r3);
        if (r0 == 0) goto L_0x00a6;
    L_0x00a0:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x003c;
    L_0x00a6:
        r0 = r2.k;
        goto L_0x003c;
    L_0x00a9:
        r0 = r2.j;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r7 = new crk;
        r7.<init>(r4, r5, r6);
        r4 = r0.a(r7);
        if (r4 == 0) goto L_0x00c1;
    L_0x00bc:
        r0 = r4.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x008a;
    L_0x00c1:
        r0 = r0.a(r3, r7);
        goto L_0x008a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.dialer.extensions.DialerExtendedPhoneDirectoriesManager.a(android.content.Context):java.util.List");
    }
}
