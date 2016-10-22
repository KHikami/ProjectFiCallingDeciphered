package defpackage;

import android.content.Context;
import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: bkl */
public final class bkl extends AsyncTask {
    private /* synthetic */ Context a;
    private /* synthetic */ bku b;

    public bkl(Context context, bku bku) {
        this.a = context;
        this.b = bku;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final /* synthetic */ void onPostExecute(java.lang.Object r14) {
        /*
        r13 = this;
        r3 = 0;
        r12 = 0;
        r14 = (android.util.Pair) r14;
        r0 = r14.first;
        if (r0 == 0) goto L_0x010b;
    L_0x0008:
        r4 = new bkk;
        r0 = r13.a;
        r4.<init>(r0);
        r0 = r14.first;
        r0 = (defpackage.ddd) r0;
        r1 = r14.second;
        r1 = (java.lang.String) r1;
        r5 = r13.b;
        r6 = new dcz;
        r6.<init>();
        r7 = defpackage.bjd.G;
        r2 = defpackage.crm.b;
        if (r2 != 0) goto L_0x002c;
    L_0x0024:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x002c:
        r2 = defpackage.crm.d;
        r2 = r2.b();
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x00c5;
    L_0x003a:
        r2 = r7.i;
        if (r2 == 0) goto L_0x00ad;
    L_0x003e:
        r2 = defpackage.crm.b;
        r8 = r7.i;
        r2 = r2.getSharedPreferences(r8, r12);
        r8 = r7.g;
        r8 = r2.contains(r8);
        if (r8 == 0) goto L_0x00c5;
    L_0x004e:
        r2 = r7.a(r2);
    L_0x0052:
        r2 = (java.lang.Long) r2;
        r8 = r2.longValue();
        r6.b = r8;
        r2 = r4.c;
        r8 = defpackage.bky.b(r2);
        r6.c = r8;
        r2 = r4.c;
        r7 = r2.getPackageName();
        r2 = r2.getSharedPreferences(r7, r12);
        r7 = "global_blacklist_country_codes";
        r7 = r2.getStringSet(r7, r3);
        if (r7 != 0) goto L_0x00fa;
    L_0x0074:
        r2 = r3;
    L_0x0075:
        r6.d = r2;
        r2 = r4.c;
        r3 = "phone";
        r2 = r2.getSystemService(r3);
        r2 = (android.telephony.TelephonyManager) r2;
        r2 = r2.getSimCountryIso();
        r6.a = r2;
        if (r1 == 0) goto L_0x008b;
    L_0x0089:
        r6.e = r1;
    L_0x008b:
        r2 = "SpamAsyncTaskUtil, request:";
        r1 = r6.toString();
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0105;
    L_0x009b:
        r1 = r2.concat(r1);
    L_0x009f:
        r2 = new java.lang.Object[r12];
        defpackage.buf.a(r1, r2);
        r1 = new dko;
        r1.<init>(r4, r5);
        r0.a(r6, r1);
    L_0x00ac:
        return;
    L_0x00ad:
        if (r3 != 0) goto L_0x00dd;
    L_0x00af:
        r2 = r7.j;
        r8 = defpackage.crm.b;
        r9 = r7.f;
        r10 = r7.g;
        r11 = r7.h;
        r2 = r2.a(r8, r9, r10, r11);
    L_0x00bd:
        if (r2 == 0) goto L_0x00c5;
    L_0x00bf:
        r2 = r7.a(r2);
        if (r2 != 0) goto L_0x0052;
    L_0x00c5:
        r2 = defpackage.crm.b;
        r2 = r2.getContentResolver();
        r8 = r7.e;
        r2 = defpackage.ckq.a(r2, r8);
        if (r2 == 0) goto L_0x00d9;
    L_0x00d3:
        r2 = r7.a(r2);
        if (r2 != 0) goto L_0x0052;
    L_0x00d9:
        r2 = r7.k;
        goto L_0x0052;
    L_0x00dd:
        r2 = r7.j;
        r8 = r7.f;
        r9 = r7.g;
        r10 = r7.h;
        r11 = new crk;
        r11.<init>(r8, r9, r10);
        r8 = r2.a(r11);
        if (r8 == 0) goto L_0x00f5;
    L_0x00f0:
        r2 = r8.a;
        r2 = (com.google.android.gms.phenotype.Flag) r2;
        goto L_0x00bd;
    L_0x00f5:
        r2 = r2.a(r3, r11);
        goto L_0x00bd;
    L_0x00fa:
        r2 = r7.size();
        r2 = new java.lang.String[r2];
        r7.toArray(r2);
        goto L_0x0075;
    L_0x0105:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x009f;
    L_0x010b:
        r0 = r13.b;
        if (r0 == 0) goto L_0x00ac;
    L_0x010f:
        r0 = r13.b;
        r0.a(r12);
        goto L_0x00ac;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkl.onPostExecute(java.lang.Object):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair a() {
        /*
        r16 = this;
        r15 = 0;
        r14 = 0;
        r0 = r16;
        r2 = r0.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r3 = new dgr;	 Catch:{ NameNotFoundException -> 0x0053 }
        r3.<init>();	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = defpackage.blc.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.dgr.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = defpackage.dha.a(r4, r5);	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.blc.d;	 Catch:{ NameNotFoundException -> 0x0053 }
        r3.a(r4, r5);	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = defpackage.blc.a(r2);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r4 == 0) goto L_0x0068;
    L_0x001e:
        r5 = defpackage.blc.b;	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = defpackage.dgr.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.dha.a(r5, r6);	 Catch:{ NameNotFoundException -> 0x0053 }
        r3.a(r5, r4);	 Catch:{ NameNotFoundException -> 0x0053 }
    L_0x0029:
        r4 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.blc.c;	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = defpackage.dgr.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.dha.a(r5, r6);	 Catch:{ NameNotFoundException -> 0x0053 }
        r3.a(r5, r4);	 Catch:{ NameNotFoundException -> 0x0053 }
        r3 = defpackage.buf.a(r3);	 Catch:{ NameNotFoundException -> 0x0053 }
        r3 = java.util.Collections.singletonList(r3);	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = defpackage.bjd.c(r2);	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.bjd.B;	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = 0;
        r2 = defpackage.crm.b;	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r2 != 0) goto L_0x0071;
    L_0x004b:
        r2 = new java.lang.IllegalStateException;	 Catch:{ NameNotFoundException -> 0x0053 }
        r3 = "Must call PhenotypeFlag.init() first";
        r2.<init>(r3);	 Catch:{ NameNotFoundException -> 0x0053 }
        throw r2;	 Catch:{ NameNotFoundException -> 0x0053 }
    L_0x0053:
        r2 = move-exception;
        r3 = "SpamAsyncTaskUtil, problem when creating scooby stub";
        defpackage.buf.a(r3, r2);
        r3 = r14;
    L_0x005a:
        r4 = defpackage.bjd.F;
        r2 = defpackage.crm.b;
        if (r2 != 0) goto L_0x0148;
    L_0x0060:
        r2 = new java.lang.IllegalStateException;
        r3 = "Must call PhenotypeFlag.init() first";
        r2.<init>(r3);
        throw r2;
    L_0x0068:
        r4 = "SpamGrpcStubFactory, X-Android-Cert value unavailable.";
        r5 = 0;
        r5 = new java.lang.Object[r5];	 Catch:{ NameNotFoundException -> 0x0053 }
        defpackage.buf.b(r4, r5);	 Catch:{ NameNotFoundException -> 0x0053 }
        goto L_0x0029;
    L_0x0071:
        r2 = defpackage.crm.d;	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = r2.b();	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = (java.lang.Boolean) r2;	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = r2.booleanValue();	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r2 != 0) goto L_0x010e;
    L_0x007f:
        r2 = r5.i;	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r2 == 0) goto L_0x00f6;
    L_0x0083:
        r2 = defpackage.crm.b;	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = r5.i;	 Catch:{ NameNotFoundException -> 0x0053 }
        r7 = 0;
        r2 = r2.getSharedPreferences(r6, r7);	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = r5.g;	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = r2.contains(r6);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r6 == 0) goto L_0x010e;
    L_0x0094:
        r2 = r5.a(r2);	 Catch:{ NameNotFoundException -> 0x0053 }
    L_0x0098:
        r2 = (java.lang.Integer) r2;	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = r2.intValue();	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = new dik;	 Catch:{ NameNotFoundException -> 0x0053 }
        r2.<init>(r4, r5);	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = r2.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r4.addAll(r3);	 Catch:{ NameNotFoundException -> 0x0053 }
        r0 = r2;
        r0 = (defpackage.dik) r0;	 Catch:{ NameNotFoundException -> 0x0053 }
        r13 = r0;
        r8 = r13.a();	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = new io.grpc.internal.bb;	 Catch:{ NameNotFoundException -> 0x0053 }
        r3 = r13.b;	 Catch:{ NameNotFoundException -> 0x0053 }
        r4 = new io.grpc.internal.h;	 Catch:{ NameNotFoundException -> 0x0053 }
        r4.<init>();	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = 0;
        r6 = defpackage.dhi.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = defpackage.buf.e(r5, r6);	 Catch:{ NameNotFoundException -> 0x0053 }
        r5 = (defpackage.dhg) r5;	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = r13.b();	 Catch:{ NameNotFoundException -> 0x0053 }
        r7 = 0;
        r9 = defpackage.dhk.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r7 = defpackage.buf.e(r7, r9);	 Catch:{ NameNotFoundException -> 0x0053 }
        r7 = (defpackage.dgn) r7;	 Catch:{ NameNotFoundException -> 0x0053 }
        r9 = 0;
        r10 = defpackage.dgc.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r9 = defpackage.buf.e(r9, r10);	 Catch:{ NameNotFoundException -> 0x0053 }
        r9 = (defpackage.dgc) r9;	 Catch:{ NameNotFoundException -> 0x0053 }
        r10 = 0;
        r11 = defpackage.dfq.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r10 = defpackage.buf.e(r10, r11);	 Catch:{ NameNotFoundException -> 0x0053 }
        r10 = (defpackage.dfq) r10;	 Catch:{ NameNotFoundException -> 0x0053 }
        r11 = 0;
        r12 = 0;
        r13 = r13.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r2 != 0) goto L_0x0143;
    L_0x00ea:
        r2 = "SpamGrpcStubFactory, problem initializing the channel.";
        r3 = 0;
        r3 = new java.lang.Object[r3];	 Catch:{ NameNotFoundException -> 0x0053 }
        defpackage.buf.a(r2, r3);	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = r14;
    L_0x00f3:
        r3 = r2;
        goto L_0x005a;
    L_0x00f6:
        if (r14 != 0) goto L_0x0126;
    L_0x00f8:
        r2 = r5.j;	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = defpackage.crm.b;	 Catch:{ NameNotFoundException -> 0x0053 }
        r7 = r5.f;	 Catch:{ NameNotFoundException -> 0x0053 }
        r8 = r5.g;	 Catch:{ NameNotFoundException -> 0x0053 }
        r9 = r5.h;	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = r2.a(r6, r7, r8, r9);	 Catch:{ NameNotFoundException -> 0x0053 }
    L_0x0106:
        if (r2 == 0) goto L_0x010e;
    L_0x0108:
        r2 = r5.a(r2);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r2 != 0) goto L_0x0098;
    L_0x010e:
        r2 = defpackage.crm.b;	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = r2.getContentResolver();	 Catch:{ NameNotFoundException -> 0x0053 }
        r6 = r5.e;	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = defpackage.ckq.a(r2, r6);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r2 == 0) goto L_0x0122;
    L_0x011c:
        r2 = r5.a(r2);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r2 != 0) goto L_0x0098;
    L_0x0122:
        r2 = r5.k;	 Catch:{ NameNotFoundException -> 0x0053 }
        goto L_0x0098;
    L_0x0126:
        r2 = r5.j;	 Catch:{ NameNotFoundException -> 0x0053 }
        r7 = r5.f;	 Catch:{ NameNotFoundException -> 0x0053 }
        r8 = r5.g;	 Catch:{ NameNotFoundException -> 0x0053 }
        r9 = r5.h;	 Catch:{ NameNotFoundException -> 0x0053 }
        r10 = new crk;	 Catch:{ NameNotFoundException -> 0x0053 }
        r10.<init>(r7, r8, r9);	 Catch:{ NameNotFoundException -> 0x0053 }
        r7 = r2.a(r10);	 Catch:{ NameNotFoundException -> 0x0053 }
        if (r7 == 0) goto L_0x013e;
    L_0x0139:
        r2 = r7.a;	 Catch:{ NameNotFoundException -> 0x0053 }
        r2 = (com.google.android.gms.phenotype.Flag) r2;	 Catch:{ NameNotFoundException -> 0x0053 }
        goto L_0x0106;
    L_0x013e:
        r2 = r2.a(r6, r10);	 Catch:{ NameNotFoundException -> 0x0053 }
        goto L_0x0106;
    L_0x0143:
        r2 = defpackage.ddc.a(r2);	 Catch:{ NameNotFoundException -> 0x0053 }
        goto L_0x00f3;
    L_0x0148:
        r2 = defpackage.crm.d;
        r2 = r2.b();
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 != 0) goto L_0x01c4;
    L_0x0156:
        r2 = r4.i;
        if (r2 == 0) goto L_0x01ac;
    L_0x015a:
        r2 = defpackage.crm.b;
        r5 = r4.i;
        r2 = r2.getSharedPreferences(r5, r15);
        r5 = r4.g;
        r5 = r2.contains(r5);
        if (r5 == 0) goto L_0x01c4;
    L_0x016a:
        r2 = r4.a(r2);
    L_0x016e:
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        if (r2 == 0) goto L_0x01a7;
    L_0x0176:
        r0 = r16;
        r4 = r0.a;
        r0 = r16;
        r2 = r0.a;
        r5 = android.telephony.TelephonyManager.class;
        r2 = r2.getSystemService(r5);
        r2 = (android.telephony.TelephonyManager) r2;
        r2 = r2.getSimCountryIso();
        r5 = new android.util.ArrayMap;
        r5.<init>();
        r6 = defpackage.bky.b(r4);
        r6 = java.lang.Long.toString(r6);
        r7 = "current_blacklist_version";
        r5.put(r7, r6);
        r6 = "sim_country_code_iso";
        r5.put(r6, r2);
        r2 = "dialer_spam_report";
        r14 = defpackage.buf.a(r4, r2, r5);
    L_0x01a7:
        r2 = android.util.Pair.create(r3, r14);
        return r2;
    L_0x01ac:
        if (r14 != 0) goto L_0x01db;
    L_0x01ae:
        r2 = r4.j;
        r5 = defpackage.crm.b;
        r6 = r4.f;
        r7 = r4.g;
        r8 = r4.h;
        r2 = r2.a(r5, r6, r7, r8);
    L_0x01bc:
        if (r2 == 0) goto L_0x01c4;
    L_0x01be:
        r2 = r4.a(r2);
        if (r2 != 0) goto L_0x016e;
    L_0x01c4:
        r2 = defpackage.crm.b;
        r2 = r2.getContentResolver();
        r5 = r4.e;
        r2 = defpackage.ckq.a(r2, r5);
        if (r2 == 0) goto L_0x01d8;
    L_0x01d2:
        r2 = r4.a(r2);
        if (r2 != 0) goto L_0x016e;
    L_0x01d8:
        r2 = r4.k;
        goto L_0x016e;
    L_0x01db:
        r2 = r4.j;
        r5 = r4.f;
        r6 = r4.g;
        r7 = r4.h;
        r8 = new crk;
        r8.<init>(r5, r6, r7);
        r5 = r2.a(r8);
        if (r5 == 0) goto L_0x01f3;
    L_0x01ee:
        r2 = r5.a;
        r2 = (com.google.android.gms.phenotype.Flag) r2;
        goto L_0x01bc;
    L_0x01f3:
        r2 = r2.a(r14, r8);
        goto L_0x01bc;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkl.a():android.util.Pair");
    }
}
