package defpackage;

import java.util.Set;

/* renamed from: akr */
class akr extends akp {
    private String g;
    private boolean h;

    public akr() {
        this.h = false;
    }

    public akr(int i) {
        super((byte) 0);
        this.h = false;
    }

    protected int f() {
        return 1;
    }

    protected String g() {
        return "3.0";
    }

    protected String a() {
        if (this.g == null) {
            return this.d.readLine();
        }
        String str = this.g;
        this.g = null;
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String c() {
        /*
        r6 = this;
        r5 = 0;
        r1 = 0;
        r0 = r1;
    L_0x0003:
        r2 = r6.d;
        r2 = r2.readLine();
        if (r2 == 0) goto L_0x0045;
    L_0x000b:
        r3 = r2.length();
        if (r3 == 0) goto L_0x0003;
    L_0x0011:
        r3 = r2.charAt(r5);
        r4 = 32;
        if (r3 == r4) goto L_0x0021;
    L_0x0019:
        r3 = r2.charAt(r5);
        r4 = 9;
        if (r3 != r4) goto L_0x003c;
    L_0x0021:
        if (r0 != 0) goto L_0x0028;
    L_0x0023:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
    L_0x0028:
        r3 = r6.g;
        if (r3 == 0) goto L_0x0033;
    L_0x002c:
        r3 = r6.g;
        r0.append(r3);
        r6.g = r1;
    L_0x0033:
        r3 = 1;
        r2 = r2.substring(r3);
        r0.append(r2);
        goto L_0x0003;
    L_0x003c:
        if (r0 != 0) goto L_0x0045;
    L_0x003e:
        r3 = r6.g;
        if (r3 != 0) goto L_0x0045;
    L_0x0042:
        r6.g = r2;
        goto L_0x0003;
    L_0x0045:
        if (r0 == 0) goto L_0x0057;
    L_0x0047:
        r1 = r0.toString();
    L_0x004b:
        r6.g = r2;
        if (r1 != 0) goto L_0x005e;
    L_0x004f:
        r0 = new akz;
        r1 = "Reached end of buffer.";
        r0.<init>(r1);
        throw r0;
    L_0x0057:
        r0 = r6.g;
        if (r0 == 0) goto L_0x004b;
    L_0x005b:
        r1 = r6.g;
        goto L_0x004b;
    L_0x005e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: akr.c():java.lang.String");
    }

    protected boolean a(boolean z) {
        return super.a(z);
    }

    protected void a(aku aku, String str) {
        try {
            super.a(aku, str);
        } catch (akz e) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                a(aku, split[0], split[1]);
                return;
            }
            String str2 = "Unknown params value: ";
            String valueOf = String.valueOf(str);
            throw new akz(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    protected void a(aku aku, String str, String str2) {
        b(aku, str, str2);
    }

    protected void b(aku aku, String str) {
        c(aku, str);
    }

    protected void c(aku aku, String str) {
        b(aku, "TYPE", str);
    }

    private void b(aku aku, String str, String str2) {
        int length = str2.length();
        int i = 0;
        Object obj = null;
        StringBuilder stringBuilder = null;
        while (i < length) {
            Object obj2;
            StringBuilder stringBuilder2;
            Object obj3;
            char charAt = str2.charAt(i);
            if (charAt == '\"') {
                if (obj != null) {
                    aku.a(str, e(stringBuilder.toString()));
                    obj2 = null;
                    stringBuilder2 = null;
                } else {
                    if (stringBuilder != null && stringBuilder.length() <= 0) {
                        aku.a(str, e(stringBuilder.toString()));
                    }
                    stringBuilder2 = stringBuilder;
                    int i2 = 1;
                }
            } else if (charAt != ',' || obj != null) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(charAt);
                obj3 = obj;
                stringBuilder2 = stringBuilder;
                obj2 = obj3;
            } else if (stringBuilder == null) {
                new StringBuilder(String.valueOf(str2).length() + 44).append("Comma is used before actual string comes. (").append(str2).append(")");
                obj3 = obj;
                stringBuilder2 = stringBuilder;
                obj2 = obj3;
            } else {
                aku.a(str, e(stringBuilder.toString()));
                obj2 = obj;
                stringBuilder2 = null;
            }
            i++;
            obj3 = obj2;
            stringBuilder = stringBuilder2;
            obj = obj3;
        }
        if (stringBuilder != null && stringBuilder.length() != 0) {
            aku.a(str, e(stringBuilder.toString()));
        }
    }

    protected String e(String str) {
        return akw.a(str, "ISO-8859-1", "UTF-8");
    }

    protected void b(aku aku) {
        if (!this.h) {
            this.h = true;
        }
    }

    protected String c(String str) {
        return str;
    }

    protected Set<String> h() {
        return akt.a;
    }

    protected String d(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '\\' || i >= length - 1) {
                stringBuilder.append(charAt);
            } else {
                i++;
                charAt = str.charAt(i);
                if (charAt == 'n' || charAt == 'N') {
                    stringBuilder.append("\n");
                } else {
                    stringBuilder.append(charAt);
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
