package p000;

public final class mog {
    public static final mog f28005a = new mog(0, -1, -1);
    private static final long f28006b;
    private final int f28007c;
    private final int f28008d;
    private final int f28009e;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - 32)) * 3));
        }
        f28006b = j;
    }

    private static int m32613a(char c) {
        return ((int) ((f28006b >>> ((c - 32) * 3)) & 7)) - 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static mog m32615a(String str, int i, int i2) {
        if (i == i2) {
            return f28005a;
        }
        int i3 = 0;
        while (true) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '0') {
                int i5 = i4 - 1;
            } else {
                int a = mog.m32613a(charAt);
                if (a < 0) {
                    break;
                }
                int i6 = 1 << a;
                if ((i3 & i6) != 0) {
                    throw mqn.m32710a("repeated flag", str, i4 - 1);
                }
                i3 |= i6;
                if (i4 == i2) {
                    return new mog(i3, -1, -1);
                }
                i = i4;
            }
        }
        if (charAt == '.') {
            return new mog(i3, -1, mog.m32616b(str, i4, i2));
        }
        throw mqn.m32710a("invalid flag", str, i4 - 1);
    }

    private static int m32616b(String str, int i, int i2) {
        if (i == i2) {
            throw mqn.m32710a("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - 48);
            if (charAt >= '\n') {
                throw mqn.m32710a("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw mqn.m32711a("precision too large", str, i, i2);
            }
        }
        if (i3 != 0 || i2 == i + 1) {
            return i3;
        }
        throw mqn.m32711a("invalid precision", str, i, i2);
    }

    static int m32614a(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int a = mog.m32613a(str.charAt(i));
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
        this.f28007c = i;
        this.f28008d = i2;
        this.f28009e = i3;
    }

    public boolean m32619a(int i, boolean z) {
        if (m32618a()) {
            return true;
        }
        if ((this.f28007c & (i ^ -1)) != 0) {
            return false;
        }
        if (!z && this.f28009e != -1) {
            return false;
        }
        if ((this.f28007c & 9) == 9) {
            return false;
        }
        if ((this.f28007c & 96) == 96) {
            return false;
        }
        if ((this.f28007c & 96) == 0 || this.f28008d != -1) {
            return true;
        }
        return false;
    }

    public boolean m32620a(mof mof) {
        return m32619a(mof.m32611c(), mof.m32610b().m32621a());
    }

    public StringBuilder m32617a(StringBuilder stringBuilder) {
        if (!m32618a()) {
            for (int i = 0; (1 << i) <= this.f28007c; i++) {
                if ((this.f28007c & (1 << i)) != 0) {
                    stringBuilder.append(" #(+,-0".charAt(i));
                }
            }
            if (this.f28008d != -1) {
                stringBuilder.append(this.f28008d);
            }
            if (this.f28009e != -1) {
                stringBuilder.append('.').append(this.f28009e);
            }
        }
        return stringBuilder;
    }

    public boolean m32618a() {
        return this == f28005a;
    }
}
