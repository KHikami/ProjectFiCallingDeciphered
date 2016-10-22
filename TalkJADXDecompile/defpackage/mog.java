package defpackage;

/* renamed from: mog */
public final class mog {
    public static final mog a;
    private static final long b;
    private final int c;
    private final int d;
    private final int e;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - 32)) * 3));
        }
        b = j;
        a = new mog(0, -1, -1);
    }

    private static int a(char c) {
        return ((int) ((b >>> ((c - 32) * 3)) & 7)) - 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.mog a(java.lang.String r8, int r9, int r10) {
        /*
        r7 = 46;
        r6 = -1;
        if (r9 != r10) goto L_0x0008;
    L_0x0005:
        r0 = a;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = 0;
    L_0x0009:
        r1 = r9 + 1;
        r2 = r8.charAt(r9);
        r3 = 32;
        if (r2 < r3) goto L_0x004e;
    L_0x0013:
        r3 = 48;
        if (r2 > r3) goto L_0x004e;
    L_0x0017:
        r3 = defpackage.mog.a(r2);
        if (r3 >= 0) goto L_0x0033;
    L_0x001d:
        if (r2 != r7) goto L_0x002a;
    L_0x001f:
        r2 = new mog;
        r1 = defpackage.mog.b(r8, r1, r10);
        r2.<init>(r0, r6, r1);
        r0 = r2;
        goto L_0x0007;
    L_0x002a:
        r0 = "invalid flag";
        r1 = r1 + -1;
        r0 = defpackage.mqn.a(r0, r8, r1);
        throw r0;
    L_0x0033:
        r2 = 1;
        r2 = r2 << r3;
        r3 = r0 & r2;
        if (r3 == 0) goto L_0x0042;
    L_0x0039:
        r0 = "repeated flag";
        r1 = r1 + -1;
        r0 = defpackage.mqn.a(r0, r8, r1);
        throw r0;
    L_0x0042:
        r0 = r0 | r2;
        if (r1 != r10) goto L_0x004c;
    L_0x0045:
        r1 = new mog;
        r1.<init>(r0, r6, r6);
        r0 = r1;
        goto L_0x0007;
    L_0x004c:
        r9 = r1;
        goto L_0x0009;
    L_0x004e:
        r4 = r1 + -1;
        r3 = 57;
        if (r2 <= r3) goto L_0x005b;
    L_0x0054:
        r0 = "invalid flag";
        r0 = defpackage.mqn.a(r0, r8, r4);
        throw r0;
    L_0x005b:
        r2 = r2 + -48;
    L_0x005d:
        if (r1 != r10) goto L_0x0066;
    L_0x005f:
        r1 = new mog;
        r1.<init>(r0, r2, r6);
        r0 = r1;
        goto L_0x0007;
    L_0x0066:
        r3 = r1 + 1;
        r1 = r8.charAt(r1);
        if (r1 != r7) goto L_0x0079;
    L_0x006e:
        r1 = new mog;
        r3 = defpackage.mog.b(r8, r3, r10);
        r1.<init>(r0, r2, r3);
        r0 = r1;
        goto L_0x0007;
    L_0x0079:
        r1 = r1 + -48;
        r1 = (char) r1;
        r5 = 10;
        if (r1 < r5) goto L_0x0089;
    L_0x0080:
        r0 = "invalid width character";
        r1 = r3 + -1;
        r0 = defpackage.mqn.a(r0, r8, r1);
        throw r0;
    L_0x0089:
        r2 = r2 * 10;
        r1 = r1 + r2;
        r2 = 999999; // 0xf423f float:1.401297E-39 double:4.94065E-318;
        if (r1 <= r2) goto L_0x0098;
    L_0x0091:
        r0 = "width too large";
        r0 = defpackage.mqn.a(r0, r8, r4, r10);
        throw r0;
    L_0x0098:
        r2 = r1;
        r1 = r3;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: mog.a(java.lang.String, int, int):mog");
    }

    private static int b(String str, int i, int i2) {
        if (i == i2) {
            throw mqn.a("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - 48);
            if (charAt >= '\n') {
                throw mqn.a("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw mqn.a("precision too large", str, i, i2);
            }
        }
        if (i3 != 0 || i2 == i + 1) {
            return i3;
        }
        throw mqn.a("invalid precision", str, i, i2);
    }

    static int a(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int a = mog.a(str.charAt(i));
            if (a < 0) {
                String str2 = "invalid flags: ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            i2 |= 1 << a;
            i++;
        }
        return i2;
    }

    private mog(int i, int i2, int i3) {
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public boolean a(int i, boolean z) {
        if (a()) {
            return true;
        }
        if ((this.c & (i ^ -1)) != 0) {
            return false;
        }
        if (!z && this.e != -1) {
            return false;
        }
        if ((this.c & 9) == 9) {
            return false;
        }
        if ((this.c & 96) == 96) {
            return false;
        }
        if ((this.c & 96) == 0 || this.d != -1) {
            return true;
        }
        return false;
    }

    public boolean a(mof mof) {
        return a(mof.c(), mof.b().a());
    }

    public StringBuilder a(StringBuilder stringBuilder) {
        if (!a()) {
            for (int i = 0; (1 << i) <= this.c; i++) {
                if ((this.c & (1 << i)) != 0) {
                    stringBuilder.append(" #(+,-0".charAt(i));
                }
            }
            if (this.d != -1) {
                stringBuilder.append(this.d);
            }
            if (this.e != -1) {
                stringBuilder.append('.').append(this.e);
            }
        }
        return stringBuilder;
    }

    public boolean a() {
        return this == a;
    }
}
