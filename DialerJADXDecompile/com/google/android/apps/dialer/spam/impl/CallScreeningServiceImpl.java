package com.google.android.apps.dialer.spam.impl;

import android.telecom.Call.Details;
import android.telecom.CallScreeningService;
import android.telecom.CallScreeningService.CallResponse;
import android.telecom.CallScreeningService.CallResponse.Builder;
import bkk;

/* compiled from: PG */
public class CallScreeningServiceImpl extends CallScreeningService {
    private bkk a;

    public static CallResponse a(boolean z) {
        Builder builder = new Builder();
        builder.setDisallowCall(z);
        builder.setRejectCall(z);
        return builder.build();
    }

    public void onCreate() {
        super.onCreate();
        this.a = new bkk(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScreenCall(android.telecom.Call.Details r10) {
        /*
        r9 = this;
        r1 = 0;
        r2 = r10.getHandle();
        r3 = bjd.e;
        r4 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0014;
    L_0x000c:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0014:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0079;
    L_0x0022:
        r0 = r3.i;
        if (r0 == 0) goto L_0x0061;
    L_0x0026:
        r0 = crm.b;
        r4 = r3.i;
        r0 = r0.getSharedPreferences(r4, r1);
        r4 = r3.g;
        r4 = r0.contains(r4);
        if (r4 == 0) goto L_0x0079;
    L_0x0036:
        r0 = r3.a(r0);
    L_0x003a:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x00ad;
    L_0x0042:
        if (r2 == 0) goto L_0x00ad;
    L_0x0044:
        r0 = "tel";
        r3 = r2.getScheme();
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x00ad;
    L_0x0050:
        r0 = r2.getSchemeSpecificPart();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x00ad;
    L_0x005a:
        r0 = 1;
    L_0x005b:
        if (r0 != 0) goto L_0x00af;
    L_0x005d:
        r9.a(r10);
    L_0x0060:
        return;
    L_0x0061:
        if (r4 != 0) goto L_0x0090;
    L_0x0063:
        r0 = r3.j;
        r4 = crm.b;
        r5 = r3.f;
        r6 = r3.g;
        r7 = r3.h;
        r0 = r0.a(r4, r5, r6, r7);
    L_0x0071:
        if (r0 == 0) goto L_0x0079;
    L_0x0073:
        r0 = r3.a(r0);
        if (r0 != 0) goto L_0x003a;
    L_0x0079:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r4 = r3.e;
        r0 = ckq.a(r0, r4);
        if (r0 == 0) goto L_0x008d;
    L_0x0087:
        r0 = r3.a(r0);
        if (r0 != 0) goto L_0x003a;
    L_0x008d:
        r0 = r3.k;
        goto L_0x003a;
    L_0x0090:
        r0 = r3.j;
        r5 = r3.f;
        r6 = r3.g;
        r7 = r3.h;
        r8 = new crk;
        r8.<init>(r5, r6, r7);
        r5 = r0.a(r8);
        if (r5 == 0) goto L_0x00a8;
    L_0x00a3:
        r0 = r5.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0071;
    L_0x00a8:
        r0 = r0.a(r4, r8);
        goto L_0x0071;
    L_0x00ad:
        r0 = r1;
        goto L_0x005b;
    L_0x00af:
        r0 = r10.getHandle();
        r4 = r0.getSchemeSpecificPart();
        r2 = android.os.SystemClock.elapsedRealtime();
        r6 = r9.a;
        r0 = new bkj;
        r1 = r9;
        r5 = r10;
        r0.<init>(r1, r2, r4, r5);
        r1 = buf.g(r9);
        r6.a(r0, r4, r1);
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.dialer.spam.impl.CallScreeningServiceImpl.onScreenCall(android.telecom.Call$Details):void");
    }

    public final void a(Details details) {
        respondToCall(details, a(false));
    }
}
