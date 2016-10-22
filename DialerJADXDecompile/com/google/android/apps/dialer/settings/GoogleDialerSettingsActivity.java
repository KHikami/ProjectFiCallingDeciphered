package com.google.android.apps.dialer.settings;

import com.android.dialer.app.settings.DialerSettingsActivity;

/* compiled from: PG */
public class GoogleDialerSettingsActivity extends DialerSettingsActivity {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBuildHeaders(java.util.List r8) {
        /*
        r7 = this;
        super.onBuildHeaders(r8);
        r0 = bjy.a();
        if (r0 == 0) goto L_0x001d;
    L_0x0009:
        r0 = new android.preference.PreferenceActivity$Header;
        r0.<init>();
        r1 = buf.lA;
        r0.titleRes = r1;
        r1 = bjz.class;
        r1 = r1.getName();
        r0.fragment = r1;
        r8.add(r0);
    L_0x001d:
        r1 = bjd.t;
        r2 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x002c;
    L_0x0024:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x002c:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x009c;
    L_0x003a:
        r0 = r1.i;
        if (r0 == 0) goto L_0x0084;
    L_0x003e:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x009c;
    L_0x004f:
        r0 = r1.a(r0);
    L_0x0053:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x006f;
    L_0x005b:
        r0 = new android.preference.PreferenceActivity$Header;
        r0.<init>();
        r1 = buf.lF;
        r0.titleRes = r1;
        r1 = bka.class;
        r1 = r1.getName();
        r0.fragment = r1;
        r8.add(r0);
    L_0x006f:
        r0 = new android.preference.PreferenceActivity$Header;
        r0.<init>();
        r1 = buf.lw;
        r0.titleRes = r1;
        r1 = bhi.class;
        r1 = r1.getName();
        r0.fragment = r1;
        r8.add(r0);
        return;
    L_0x0084:
        if (r2 != 0) goto L_0x00b3;
    L_0x0086:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x0094:
        if (r0 == 0) goto L_0x009c;
    L_0x0096:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0053;
    L_0x009c:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x00b0;
    L_0x00aa:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0053;
    L_0x00b0:
        r0 = r1.k;
        goto L_0x0053;
    L_0x00b3:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x00cb;
    L_0x00c6:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0094;
    L_0x00cb:
        r0 = r0.a(r2, r6);
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.dialer.settings.GoogleDialerSettingsActivity.onBuildHeaders(java.util.List):void");
    }
}
