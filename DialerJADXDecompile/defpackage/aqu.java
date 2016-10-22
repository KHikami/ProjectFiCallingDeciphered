package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: aqu */
public class aqu extends aqd {
    public boolean D;

    public aqu(Context context) {
        super(context);
        b(1, false);
        b(2, false);
    }

    public final String e() {
        if (this.D) {
            return this.n;
        }
        return super.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        r2 = r6.e();
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x003a;
    L_0x000c:
        r3 = r6.n;
        r4 = r3.length();
        r2 = r1;
    L_0x0013:
        if (r2 >= r4) goto L_0x0038;
    L_0x0015:
        r5 = r3.charAt(r2);
        r5 = java.lang.Character.isDigit(r5);
        if (r5 == 0) goto L_0x0035;
    L_0x001f:
        r2 = r0;
    L_0x0020:
        if (r2 == 0) goto L_0x003a;
    L_0x0022:
        r1 = defpackage.awy.a(r7);
        r6.D = r1;
        r0 = r6.a(r0);
        if (r0 == 0) goto L_0x0031;
    L_0x002e:
        r6.notifyDataSetChanged();
    L_0x0031:
        super.a(r7);
        return;
    L_0x0035:
        r2 = r2 + 1;
        goto L_0x0013;
    L_0x0038:
        r2 = r1;
        goto L_0x0020;
    L_0x003a:
        r0 = r1;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: aqu.a(java.lang.String):void");
    }

    protected boolean a(boolean z) {
        boolean z2 = true;
        boolean z3 = z || this.D;
        int b = (b(0, z3) | 0) | b(3, z);
        if (!(z && buf.e(this.a))) {
            z2 = false;
        }
        return b | b(4, z2);
    }
}
