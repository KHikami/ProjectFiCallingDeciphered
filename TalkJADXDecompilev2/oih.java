package defpackage;

public final class oih {
    private static final double[] e = new double[128];
    public int a = 0;
    private char b;
    private CharSequence c;
    private int d;

    public oih(CharSequence charSequence, int i) {
        this.c = charSequence;
        this.d = charSequence.length();
        this.b = charSequence.charAt(0);
    }

    private char d() {
        if (this.a < this.d) {
            this.a++;
        }
        if (this.a == this.d) {
            return '\u0000';
        }
        return this.c.charAt(this.a);
    }

    public void a() {
        while (this.a < this.d && Character.isWhitespace(this.c.charAt(this.a))) {
            b();
        }
    }

    private void e() {
        while (this.a < this.d) {
            switch (this.c.charAt(this.a)) {
                case '\t':
                case '\n':
                case ' ':
                case ',':
                    b();
                default:
                    return;
            }
        }
    }

    public void b() {
        this.b = d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float f() {
        /*
        r11 = this;
        r10 = 9;
        r2 = 1;
        r7 = 0;
        r1 = 0;
        r0 = r11.b;
        switch(r0) {
            case 43: goto L_0x0137;
            case 44: goto L_0x000a;
            case 45: goto L_0x0013;
            default: goto L_0x000a;
        };
    L_0x000a:
        r0 = r2;
    L_0x000b:
        r3 = r11.b;
        switch(r3) {
            case 46: goto L_0x001b;
            case 47: goto L_0x0010;
            case 48: goto L_0x0039;
            case 49: goto L_0x004b;
            case 50: goto L_0x004b;
            case 51: goto L_0x004b;
            case 52: goto L_0x004b;
            case 53: goto L_0x004b;
            case 54: goto L_0x004b;
            case 55: goto L_0x004b;
            case 56: goto L_0x004b;
            case 57: goto L_0x004b;
            default: goto L_0x0010;
        };
    L_0x0010:
        r0 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r1;
    L_0x0014:
        r3 = r11.d();
        r11.b = r3;
        goto L_0x000b;
    L_0x001b:
        r3 = r1;
        r4 = r1;
        r5 = r1;
        r6 = r1;
    L_0x001f:
        r8 = r11.b;
        r9 = 46;
        if (r8 != r9) goto L_0x0099;
    L_0x0025:
        r8 = r11.d();
        r11.b = r8;
        r8 = r11.b;
        switch(r8) {
            case 48: goto L_0x006b;
            case 49: goto L_0x0133;
            case 50: goto L_0x0133;
            case 51: goto L_0x0133;
            case 52: goto L_0x0133;
            case 53: goto L_0x0133;
            case 54: goto L_0x0133;
            case 55: goto L_0x0133;
            case 56: goto L_0x0133;
            case 57: goto L_0x0133;
            default: goto L_0x0030;
        };
    L_0x0030:
        if (r4 != 0) goto L_0x0099;
    L_0x0032:
        r0 = r11.b;
        defpackage.oih.a(r0);
        r0 = r7;
        goto L_0x0012;
    L_0x0039:
        r3 = r11.d();
        r11.b = r3;
        r3 = r11.b;
        switch(r3) {
            case 46: goto L_0x0046;
            case 48: goto L_0x0039;
            case 49: goto L_0x004b;
            case 50: goto L_0x004b;
            case 51: goto L_0x004b;
            case 52: goto L_0x004b;
            case 53: goto L_0x004b;
            case 54: goto L_0x004b;
            case 55: goto L_0x004b;
            case 56: goto L_0x004b;
            case 57: goto L_0x004b;
            case 69: goto L_0x0046;
            case 101: goto L_0x0046;
            default: goto L_0x0044;
        };
    L_0x0044:
        r0 = r7;
        goto L_0x0012;
    L_0x0046:
        r3 = r1;
        r4 = r2;
        r5 = r1;
        r6 = r1;
        goto L_0x001f;
    L_0x004b:
        r3 = r1;
        r4 = r1;
        r5 = r1;
    L_0x004e:
        if (r4 >= r10) goto L_0x0068;
    L_0x0050:
        r4 = r4 + 1;
        r5 = r5 * 10;
        r6 = r11.b;
        r6 = r6 + -48;
        r5 = r5 + r6;
    L_0x0059:
        r6 = r11.d();
        r11.b = r6;
        r6 = r11.b;
        switch(r6) {
            case 48: goto L_0x004e;
            case 49: goto L_0x004e;
            case 50: goto L_0x004e;
            case 51: goto L_0x004e;
            case 52: goto L_0x004e;
            case 53: goto L_0x004e;
            case 54: goto L_0x004e;
            case 55: goto L_0x004e;
            case 56: goto L_0x004e;
            case 57: goto L_0x004e;
            default: goto L_0x0064;
        };
    L_0x0064:
        r6 = r5;
        r5 = r4;
        r4 = r2;
        goto L_0x001f;
    L_0x0068:
        r3 = r3 + 1;
        goto L_0x0059;
    L_0x006b:
        if (r5 != 0) goto L_0x0133;
    L_0x006d:
        r8 = r11.d();
        r11.b = r8;
        r3 = r3 + -1;
        r8 = r11.b;
        switch(r8) {
            case 48: goto L_0x006d;
            case 49: goto L_0x007e;
            case 50: goto L_0x007e;
            case 51: goto L_0x007e;
            case 52: goto L_0x007e;
            case 53: goto L_0x007e;
            case 54: goto L_0x007e;
            case 55: goto L_0x007e;
            case 56: goto L_0x007e;
            case 57: goto L_0x007e;
            default: goto L_0x007a;
        };
    L_0x007a:
        if (r4 != 0) goto L_0x0099;
    L_0x007c:
        r0 = r7;
        goto L_0x0012;
    L_0x007e:
        r4 = r5;
        r5 = r6;
    L_0x0080:
        if (r4 >= r10) goto L_0x008d;
    L_0x0082:
        r4 = r4 + 1;
        r5 = r5 * 10;
        r6 = r11.b;
        r6 = r6 + -48;
        r5 = r5 + r6;
        r3 = r3 + -1;
    L_0x008d:
        r6 = r11.d();
        r11.b = r6;
        r6 = r11.b;
        switch(r6) {
            case 48: goto L_0x0080;
            case 49: goto L_0x0080;
            case 50: goto L_0x0080;
            case 51: goto L_0x0080;
            case 52: goto L_0x0080;
            case 53: goto L_0x0080;
            case 54: goto L_0x0080;
            case 55: goto L_0x0080;
            case 56: goto L_0x0080;
            case 57: goto L_0x0080;
            default: goto L_0x0098;
        };
    L_0x0098:
        r6 = r5;
    L_0x0099:
        r4 = r11.b;
        switch(r4) {
            case 69: goto L_0x00ae;
            case 101: goto L_0x00ae;
            default: goto L_0x009e;
        };
    L_0x009e:
        if (r2 != 0) goto L_0x00a1;
    L_0x00a0:
        r1 = -r1;
    L_0x00a1:
        r1 = r1 + r3;
        if (r0 != 0) goto L_0x012e;
    L_0x00a4:
        r0 = -r6;
    L_0x00a5:
        r2 = -125; // 0xffffffffffffff83 float:NaN double:NaN;
        if (r1 < r2) goto L_0x00ab;
    L_0x00a9:
        if (r0 != 0) goto L_0x0101;
    L_0x00ab:
        r0 = r7;
        goto L_0x0012;
    L_0x00ae:
        r4 = r11.d();
        r11.b = r4;
        r4 = r11.b;
        switch(r4) {
            case 43: goto L_0x00c2;
            case 44: goto L_0x00b9;
            case 45: goto L_0x00c1;
            case 46: goto L_0x00b9;
            case 47: goto L_0x00b9;
            case 48: goto L_0x00d5;
            case 49: goto L_0x00d5;
            case 50: goto L_0x00d5;
            case 51: goto L_0x00d5;
            case 52: goto L_0x00d5;
            case 53: goto L_0x00d5;
            case 54: goto L_0x00d5;
            case 55: goto L_0x00d5;
            case 56: goto L_0x00d5;
            case 57: goto L_0x00d5;
            default: goto L_0x00b9;
        };
    L_0x00b9:
        r0 = r11.b;
        defpackage.oih.a(r0);
        r0 = r7;
        goto L_0x0012;
    L_0x00c1:
        r2 = r1;
    L_0x00c2:
        r4 = r11.d();
        r11.b = r4;
        r4 = r11.b;
        switch(r4) {
            case 48: goto L_0x00d5;
            case 49: goto L_0x00d5;
            case 50: goto L_0x00d5;
            case 51: goto L_0x00d5;
            case 52: goto L_0x00d5;
            case 53: goto L_0x00d5;
            case 54: goto L_0x00d5;
            case 55: goto L_0x00d5;
            case 56: goto L_0x00d5;
            case 57: goto L_0x00d5;
            default: goto L_0x00cd;
        };
    L_0x00cd:
        r0 = r11.b;
        defpackage.oih.a(r0);
        r0 = r7;
        goto L_0x0012;
    L_0x00d5:
        r4 = r11.b;
        switch(r4) {
            case 48: goto L_0x00db;
            case 49: goto L_0x0131;
            case 50: goto L_0x0131;
            case 51: goto L_0x0131;
            case 52: goto L_0x0131;
            case 53: goto L_0x0131;
            case 54: goto L_0x0131;
            case 55: goto L_0x0131;
            case 56: goto L_0x0131;
            case 57: goto L_0x0131;
            default: goto L_0x00da;
        };
    L_0x00da:
        goto L_0x009e;
    L_0x00db:
        r4 = r11.d();
        r11.b = r4;
        r4 = r11.b;
        switch(r4) {
            case 48: goto L_0x00db;
            case 49: goto L_0x00e7;
            case 50: goto L_0x00e7;
            case 51: goto L_0x00e7;
            case 52: goto L_0x00e7;
            case 53: goto L_0x00e7;
            case 54: goto L_0x00e7;
            case 55: goto L_0x00e7;
            case 56: goto L_0x00e7;
            case 57: goto L_0x00e7;
            default: goto L_0x00e6;
        };
    L_0x00e6:
        goto L_0x009e;
    L_0x00e7:
        r4 = r1;
    L_0x00e8:
        r5 = 3;
        if (r1 >= r5) goto L_0x00f4;
    L_0x00eb:
        r1 = r1 + 1;
        r4 = r4 * 10;
        r5 = r11.b;
        r5 = r5 + -48;
        r4 = r4 + r5;
    L_0x00f4:
        r5 = r11.d();
        r11.b = r5;
        r5 = r11.b;
        switch(r5) {
            case 48: goto L_0x00e8;
            case 49: goto L_0x00e8;
            case 50: goto L_0x00e8;
            case 51: goto L_0x00e8;
            case 52: goto L_0x00e8;
            case 53: goto L_0x00e8;
            case 54: goto L_0x00e8;
            case 55: goto L_0x00e8;
            case 56: goto L_0x00e8;
            case 57: goto L_0x00e8;
            default: goto L_0x00ff;
        };
    L_0x00ff:
        r1 = r4;
        goto L_0x009e;
    L_0x0101:
        r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 < r2) goto L_0x010f;
    L_0x0105:
        if (r0 <= 0) goto L_0x010b;
    L_0x0107:
        r0 = 2139095040; // 0x7f800000 float:Infinity double:1.0568533725E-314;
        goto L_0x0012;
    L_0x010b:
        r0 = -8388608; // 0xffffffffff800000 float:-Infinity double:NaN;
        goto L_0x0012;
    L_0x010f:
        if (r1 != 0) goto L_0x0114;
    L_0x0111:
        r0 = (float) r0;
        goto L_0x0012;
    L_0x0114:
        r2 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        if (r0 < r2) goto L_0x011a;
    L_0x0118:
        r0 = r0 + 1;
    L_0x011a:
        if (r1 <= 0) goto L_0x0125;
    L_0x011c:
        r2 = (double) r0;
        r0 = e;
        r0 = r0[r1];
        r0 = r0 * r2;
    L_0x0122:
        r0 = (float) r0;
        goto L_0x0012;
    L_0x0125:
        r2 = (double) r0;
        r0 = e;
        r1 = -r1;
        r0 = r0[r1];
        r0 = r2 / r0;
        goto L_0x0122;
    L_0x012e:
        r0 = r6;
        goto L_0x00a5;
    L_0x0131:
        r4 = r1;
        goto L_0x00e8;
    L_0x0133:
        r4 = r5;
        r5 = r6;
        goto L_0x0080;
    L_0x0137:
        r0 = r2;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: oih.f():float");
    }

    private static void a(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    static {
        for (int i = 0; i < e.length; i++) {
            e[i] = Math.pow(10.0d, (double) i);
        }
    }

    public float c() {
        a();
        float f = f();
        e();
        return f;
    }
}
