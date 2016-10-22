package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bih */
public final class bih {
    public final Map a;
    public blq b;
    public boolean c;
    private final Intent d;
    private final Context e;
    private final ServiceConnection f;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bih(android.content.Context r11, android.telecom.PhoneAccountHandle r12) {
        /*
        r10 = this;
        r9 = 0;
        r8 = 1;
        r7 = 0;
        r10.<init>();
        r0 = new android.content.Intent;
        r1 = "com.google.android.apps.hangouts.telephony.ITeleHangoutsService";
        r0.<init>(r1);
        r10.d = r0;
        r0 = new hv;
        r0.<init>();
        r10.a = r0;
        r10.b = r9;
        r10.c = r7;
        r0 = new bii;
        r0.<init>(r10);
        r10.f = r0;
        r10.e = r11;
        if (r12 != 0) goto L_0x002b;
    L_0x0025:
        r0 = "No phone account specified; skipping connection";
        defpackage.bdf.b(r10, r0);
    L_0x002a:
        return;
    L_0x002b:
        r1 = defpackage.bjd.a;
        r0 = defpackage.crm.b;
        if (r0 != 0) goto L_0x0039;
    L_0x0031:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0039:
        r0 = defpackage.crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0085;
    L_0x0047:
        r0 = r1.i;
        if (r0 == 0) goto L_0x006d;
    L_0x004b:
        r0 = defpackage.crm.b;
        r2 = r1.i;
        r0 = r0.getSharedPreferences(r2, r7);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0085;
    L_0x005b:
        r0 = r1.a(r0);
    L_0x005f:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x00b9;
    L_0x0067:
        r0 = "Binder not enabled; skipping connection";
        defpackage.bdf.b(r10, r0);
        goto L_0x002a;
    L_0x006d:
        if (r9 != 0) goto L_0x009c;
    L_0x006f:
        r0 = r1.j;
        r2 = defpackage.crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x007d:
        if (r0 == 0) goto L_0x0085;
    L_0x007f:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x005f;
    L_0x0085:
        r0 = defpackage.crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = defpackage.ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0099;
    L_0x0093:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x005f;
    L_0x0099:
        r0 = r1.k;
        goto L_0x005f;
    L_0x009c:
        r0 = r1.j;
        r2 = r1.f;
        r3 = r1.g;
        r4 = r1.h;
        r5 = new crk;
        r5.<init>(r2, r3, r4);
        r2 = r0.a(r5);
        if (r2 == 0) goto L_0x00b4;
    L_0x00af:
        r0 = r2.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x007d;
    L_0x00b4:
        r0 = r0.a(r9, r5);
        goto L_0x007d;
    L_0x00b9:
        r0 = r12.getComponentName();
        r1 = r0.getPackageName();
        r2 = defpackage.bjd.j;
        r0 = defpackage.crm.b;
        if (r0 != 0) goto L_0x00cf;
    L_0x00c7:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x00cf:
        r0 = defpackage.crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x012d;
    L_0x00dd:
        r0 = r2.i;
        if (r0 == 0) goto L_0x0115;
    L_0x00e1:
        r0 = defpackage.crm.b;
        r3 = r2.i;
        r0 = r0.getSharedPreferences(r3, r7);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x012d;
    L_0x00f1:
        r0 = r2.a(r0);
    L_0x00f5:
        r0 = (java.lang.String) r0;
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0161;
    L_0x00fd:
        r2 = android.text.TextUtils.equals(r1, r0);
        if (r2 != 0) goto L_0x0161;
    L_0x0103:
        r2 = "%s != %s; skipping binding";
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r3[r7] = r1;
        r3[r8] = r0;
        r0 = java.lang.String.format(r2, r3);
        defpackage.bdf.b(r10, r0);
        goto L_0x002a;
    L_0x0115:
        if (r9 != 0) goto L_0x0144;
    L_0x0117:
        r0 = r2.j;
        r3 = defpackage.crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x0125:
        if (r0 == 0) goto L_0x012d;
    L_0x0127:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x00f5;
    L_0x012d:
        r0 = defpackage.crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = defpackage.ckq.a(r0, r3);
        if (r0 == 0) goto L_0x0141;
    L_0x013b:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x00f5;
    L_0x0141:
        r0 = r2.k;
        goto L_0x00f5;
    L_0x0144:
        r0 = r2.j;
        r3 = r2.f;
        r4 = r2.g;
        r5 = r2.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x015c;
    L_0x0157:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0125;
    L_0x015c:
        r0 = r0.a(r9, r6);
        goto L_0x0125;
    L_0x0161:
        r0 = "Binding to %s";
        r2 = new java.lang.Object[r8];
        r2[r7] = r12;
        r0 = java.lang.String.format(r0, r2);
        defpackage.bdf.b(r10, r0);
        r0 = r10.d;
        r0.setPackage(r1);
        r0 = r10.d;
        r1 = r10.f;
        r0 = r11.bindService(r0, r1, r8);
        r10.c = r0;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: bih.<init>(android.content.Context, android.telecom.PhoneAccountHandle):void");
    }

    public final void a() {
        if (this.c) {
            bdf.b((Object) this, "Unbinding from service");
            this.c = false;
            this.e.unbindService(this.f);
        }
        for (bij cancel : this.a.values()) {
            cancel.cancel(true);
        }
        this.a.clear();
    }
}
