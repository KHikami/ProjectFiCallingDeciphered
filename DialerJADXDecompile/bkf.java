import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: PG */
public final class bkf implements axf {
    private final Context a;
    private final bkk b;
    private final bkz c;

    public bkf(Context context) {
        this.a = context;
        this.c = new bkz(context);
        this.b = new bkk(this.a, this.c);
    }

    public final boolean a() {
        if (buf.a(this.a)) {
            return bjy.b(this.a);
        }
        buf.c("SpamBindingsImpl.isSpamEnabled, device locked in FBE mode", new Object[0]);
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
        r8 = this;
        r1 = 0;
        r0 = r8.a();
        if (r0 == 0) goto L_0x0092;
    L_0x0007:
        r2 = bjd.f;
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
        if (r0 != 0) goto L_0x005e;
    L_0x0024:
        r0 = r2.i;
        if (r0 == 0) goto L_0x0046;
    L_0x0028:
        r0 = crm.b;
        r3 = r2.i;
        r0 = r0.getSharedPreferences(r3, r1);
        r3 = r2.g;
        r3 = r0.contains(r3);
        if (r3 == 0) goto L_0x005e;
    L_0x0038:
        r0 = r2.a(r0);
    L_0x003c:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x0092;
    L_0x0044:
        r0 = 1;
    L_0x0045:
        return r0;
    L_0x0046:
        if (r3 != 0) goto L_0x0075;
    L_0x0048:
        r0 = r2.j;
        r3 = crm.b;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r0 = r0.a(r3, r4, r5, r6);
    L_0x0056:
        if (r0 == 0) goto L_0x005e;
    L_0x0058:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x003c;
    L_0x005e:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r3 = r2.e;
        r0 = ckq.a(r0, r3);
        if (r0 == 0) goto L_0x0072;
    L_0x006c:
        r0 = r2.a(r0);
        if (r0 != 0) goto L_0x003c;
    L_0x0072:
        r0 = r2.k;
        goto L_0x003c;
    L_0x0075:
        r0 = r2.j;
        r4 = r2.f;
        r5 = r2.g;
        r6 = r2.h;
        r7 = new crk;
        r7.<init>(r4, r5, r6);
        r4 = r0.a(r7);
        if (r4 == 0) goto L_0x008d;
    L_0x0088:
        r0 = r4.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x0056;
    L_0x008d:
        r0 = r0.a(r3, r7);
        goto L_0x0056;
    L_0x0092:
        r0 = r1;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkf.b():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
        r7 = this;
        r1 = bjd.i;
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
        if (r0 != 0) goto L_0x0055;
    L_0x001d:
        r0 = r1.i;
        if (r0 == 0) goto L_0x003d;
    L_0x0021:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0055;
    L_0x0032:
        r0 = r1.a(r0);
    L_0x0036:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        return r0;
    L_0x003d:
        if (r2 != 0) goto L_0x006c;
    L_0x003f:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x004d:
        if (r0 == 0) goto L_0x0055;
    L_0x004f:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0055:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0069;
    L_0x0063:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0069:
        r0 = r1.k;
        goto L_0x0036;
    L_0x006c:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0084;
    L_0x007f:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x004d;
    L_0x0084:
        r0 = r0.a(r2, r6);
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkf.c():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
        r7 = this;
        r1 = bjd.d;
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
        if (r0 != 0) goto L_0x0055;
    L_0x001d:
        r0 = r1.i;
        if (r0 == 0) goto L_0x003d;
    L_0x0021:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0055;
    L_0x0032:
        r0 = r1.a(r0);
    L_0x0036:
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        return r0;
    L_0x003d:
        if (r2 != 0) goto L_0x006c;
    L_0x003f:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x004d:
        if (r0 == 0) goto L_0x0055;
    L_0x004f:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0055:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0069;
    L_0x0063:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0069:
        r0 = r1.k;
        goto L_0x0036;
    L_0x006c:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0084;
    L_0x007f:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x004d;
    L_0x0084:
        r0 = r0.a(r2, r6);
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkf.d():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
        r7 = this;
        r1 = bjd.g;
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
        if (r0 != 0) goto L_0x0055;
    L_0x001d:
        r0 = r1.i;
        if (r0 == 0) goto L_0x003d;
    L_0x0021:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0055;
    L_0x0032:
        r0 = r1.a(r0);
    L_0x0036:
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        return r0;
    L_0x003d:
        if (r2 != 0) goto L_0x006c;
    L_0x003f:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x004d:
        if (r0 == 0) goto L_0x0055;
    L_0x004f:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0055:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0069;
    L_0x0063:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0069:
        r0 = r1.k;
        goto L_0x0036;
    L_0x006c:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0084;
    L_0x007f:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x004d;
    L_0x0084:
        r0 = r0.a(r2, r6);
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkf.e():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f() {
        /*
        r7 = this;
        r1 = bjd.h;
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
        if (r0 != 0) goto L_0x0055;
    L_0x001d:
        r0 = r1.i;
        if (r0 == 0) goto L_0x003d;
    L_0x0021:
        r0 = crm.b;
        r2 = r1.i;
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r1.g;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0055;
    L_0x0032:
        r0 = r1.a(r0);
    L_0x0036:
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        return r0;
    L_0x003d:
        if (r2 != 0) goto L_0x006c;
    L_0x003f:
        r0 = r1.j;
        r2 = crm.b;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r0 = r0.a(r2, r3, r4, r5);
    L_0x004d:
        if (r0 == 0) goto L_0x0055;
    L_0x004f:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0055:
        r0 = crm.b;
        r0 = r0.getContentResolver();
        r2 = r1.e;
        r0 = ckq.a(r0, r2);
        if (r0 == 0) goto L_0x0069;
    L_0x0063:
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x0069:
        r0 = r1.k;
        goto L_0x0036;
    L_0x006c:
        r0 = r1.j;
        r3 = r1.f;
        r4 = r1.g;
        r5 = r1.h;
        r6 = new crk;
        r6.<init>(r3, r4, r5);
        r3 = r0.a(r6);
        if (r3 == 0) goto L_0x0084;
    L_0x007f:
        r0 = r3.a;
        r0 = (com.google.android.gms.phenotype.Flag) r0;
        goto L_0x004d;
    L_0x0084:
        r0 = r0.a(r2, r6);
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: bkf.f():int");
    }

    public final void a(String str, String str2, axg axg) {
        String g = buf.g(this.a);
        if (TextUtils.isEmpty(str)) {
            axg.a(false);
            return;
        }
        Boolean a = bkw.a(str);
        if (a != null) {
            axg.a(a.booleanValue());
            return;
        }
        this.b.a(new bkg(this, str, axg), str, g);
    }

    public final void b(String str, String str2, axg axg) {
        String g = buf.g(this.a);
        if (TextUtils.isEmpty(str)) {
            axg.a(false);
            return;
        }
        Boolean bool;
        blb blb = (blb) bkw.a.get(str);
        if (blb == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(blb == blb.NOT_SPAM);
        }
        if (bool != null) {
            axg.a(bool.booleanValue());
        } else {
            this.b.a(new bkh(this, str, axg), str, g);
        }
    }

    public final void c(String str, String str2, axg axg) {
        String g = buf.g(this.a);
        if (TextUtils.isEmpty(str)) {
            axg.a(false);
            return;
        }
        Boolean bool;
        blb blb = (blb) bkw.a.get(str);
        if (blb == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(blb == blb.SPAM);
        }
        if (bool != null) {
            axg.a(bool.booleanValue());
        } else {
            this.b.a(new bki(this, str, axg), str, g);
        }
    }

    public final void d(String str, String str2, axg axg) {
        String g = buf.g(this.a);
        if (TextUtils.isEmpty(str)) {
            axg.a(false);
            return;
        }
        Boolean bool = (Boolean) bkw.b.get(str);
        if (bool != null) {
            axg.a(bool.booleanValue());
            return;
        }
        bkr bkr = new bkr(this, str, axg);
        bkk bkk = this.b;
        Objects.requireNonNull(bkr);
        avm avm = bkk.a;
        bkv bkv = bkv.CHECK_NUMBER_IN_GLOBAL_SPAM_LIST;
        avm.a(new bkn(bkk, str, g, bkr), new Void[0]);
    }

    public final boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Boolean a = bkw.a(str);
        if (a != null) {
            return a.booleanValue();
        }
        bla a2 = this.c.a(str, str2);
        bkw.a(str, a2.b);
        bkw.a(str, a2.a);
        return a2.a();
    }

    public final void a(String str, String str2, int i, int i2) {
        bkk bkk = this.b;
        int a = bkk.a(i2);
        avm avm = bkk.a;
        bkv bkv = bkv.REPORT_SPAM;
        avm.a(new bkp(bkk, str, str2, i, a), new Void[0]);
        bkw.a(str, blb.SPAM);
    }

    public final void b(String str, String str2, int i, int i2) {
        bkk bkk = this.b;
        int a = bkk.a(i2);
        avm avm = bkk.a;
        bkv bkv = bkv.REPORT_NOT_SPAM;
        avm.a(new bkq(bkk, str, str2, i, a), new Void[0]);
        bkw.a(str, blb.NOT_SPAM);
    }
}
