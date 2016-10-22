import android.content.Context;

/* compiled from: PG */
public class bjy {
    private static final String a;

    static {
        a = bjy.class.getSimpleName();
    }

    public static boolean a(Context context) {
        return b(context) && a();
    }

    public static boolean b(Context context) {
        return context.getSharedPreferences(String.valueOf(context.getPackageName()).concat("_preferences"), 4).getBoolean("google_caller_id", true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a() {
        /*
        r1 = 0;
        r2 = bjd.q;
        r3 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x0010;
    L_0x0008:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x0010:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0081;
    L_0x001e:
        r0 = r2.i;
        if (r0 == 0) goto L_0x0069;
    L_0x0022:
        r0 = crm.b;
        r3 = r2.i;
        r0 = r0.getSharedPreferences(r3, r1);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x0081;
    L_0x0032:
        r0 = r2.a(r0);
    L_0x0036:
        r0 = (java.lang.Integer) r0;
        r2 = r0.intValue();
        r0 = 3;
        if (r0 < r2) goto L_0x00b5;
    L_0x003f:
        r0 = 1;
    L_0x0040:
        if (r0 != 0) goto L_0x0068;
    L_0x0042:
        r1 = a;
        r3 = "Reverse number lookup is disabled. Current version: 3 Enabled version: ";
        r3 = java.lang.String.valueOf(r3);
        r4 = new java.lang.StringBuilder;
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r5 = r5 + 11;
        r4.<init>(r5);
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r2 = r2.toString();
        bdf.a(r1, r2);
    L_0x0068:
        return r0;
    L_0x0069:
        if (r3 != 0) goto L_0x0098;
    L_0x006b:
        r0 = r2.j;
        r3 = crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x0079:
        if (r0 == 0) goto L_0x0081;
    L_0x007b:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0081:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = ckq.a(r0, r3);
        if (r0 == 0) goto L_0x0095;
    L_0x008f:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0095:
        r0 = r2.k;
        goto L_0x0036;
    L_0x0098:
        r0 = r2.j;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r7 = new crk;
        r7.<init>(r4, r5, r6);
        r4 = r0.a(r7);
        if (r4 == 0) goto L_0x00b0;
    L_0x00ab:
        r0 = r4.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0079;
    L_0x00b0:
        r0 = r0.a(r3, r7);
        goto L_0x0079;
    L_0x00b5:
        r0 = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjy.a():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b() {
        /*
        r1 = bjd.r;
        r2 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x000f;
    L_0x0007:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x000f:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0051;
    L_0x001d:
        r0 = r1.i;
        if (r0 == 0) goto L_0x0039;
    L_0x0021:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0051;
    L_0x0032:
        r0 = r1.a(r0);
    L_0x0036:
        r0 = (java.lang.String) r0;
        return r0;
    L_0x0039:
        if (r2 != 0) goto L_0x0068;
    L_0x003b:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x0049:
        if (r0 == 0) goto L_0x0051;
    L_0x004b:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0051:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0065;
    L_0x005f:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0065:
        r0 = r1.k;
        goto L_0x0036;
    L_0x0068:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0080;
    L_0x007b:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0049;
    L_0x0080:
        r0 = r0.a(r2, r6);
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjy.b():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c() {
        /*
        r1 = bjd.s;
        r2 = 0;
        r0 = crm.b;
        if (r0 != 0) goto L_0x000f;
    L_0x0007:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must call PhenotypeFlag.init() first";
        r0.<init>(r1);
        throw r0;
    L_0x000f:
        r0 = crm.d;
        r0 = r0.b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x0051;
    L_0x001d:
        r0 = r1.i;
        if (r0 == 0) goto L_0x0039;
    L_0x0021:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0051;
    L_0x0032:
        r0 = r1.a(r0);
    L_0x0036:
        r0 = (java.lang.String) r0;
        return r0;
    L_0x0039:
        if (r2 != 0) goto L_0x0068;
    L_0x003b:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x0049:
        if (r0 == 0) goto L_0x0051;
    L_0x004b:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0051:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0065;
    L_0x005f:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0065:
        r0 = r1.k;
        goto L_0x0036;
    L_0x0068:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0080;
    L_0x007b:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0049;
    L_0x0080:
        r0 = r0.a(r2, r6);
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjy.c():java.lang.String");
    }
}
