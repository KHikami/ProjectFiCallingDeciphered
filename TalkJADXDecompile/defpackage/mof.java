package defpackage;

/* renamed from: mof */
public enum mof {
    STRING('s', moh.GENERAL, "-#"),
    STRING_UPPER('S', moh.GENERAL, "-#"),
    BOOLEAN('b', moh.BOOLEAN, "-"),
    BOOLEAN_UPPER('B', moh.BOOLEAN, "-"),
    CHAR('c', moh.CHARACTER, "-"),
    CHAR_UPPER('C', moh.CHARACTER, "-"),
    DECIMAL('d', moh.INTEGRAL, "-0+ ,"),
    OCTAL('o', moh.INTEGRAL, "-0#"),
    HEX('x', moh.INTEGRAL, "-0#"),
    HEX_UPPER('X', moh.INTEGRAL, "-0#"),
    FLOAT('f', moh.FLOAT, "-#0+ ,"),
    EXPONENT('e', moh.FLOAT, "-#0+ "),
    EXPONENT_UPPER('E', moh.FLOAT, "-#0+ "),
    GENERAL('g', moh.FLOAT, "-0+ ,"),
    GENERAL_UPPER('G', moh.FLOAT, "-0+ ,"),
    EXPONENT_HEX('a', moh.FLOAT, "-#0+ "),
    EXPONENT_HEX_UPPER('A', moh.FLOAT, "-#0+ ");
    
    private static final mof[] r;
    private static final mof[] s;
    private final char t;
    private final moh u;
    private final int v;
    private final String w;

    static {
        r = new mof[24];
        s = new mof[24];
        mof[] values = mof.values();
        int length = values.length;
        int i;
        while (i < length) {
            mof mof = values[i];
            char a = mof.a();
            if (Character.isLowerCase(a)) {
                r[a - 97] = mof;
            } else {
                s[a - 65] = mof;
            }
            i++;
        }
    }

    public static mof a(char c) {
        if (c >= 'a' && c <= 'x') {
            return r[c - 97];
        }
        if (c < 'A' || c > 'X') {
            return null;
        }
        return s[c - 65];
    }

    private mof(char c, moh moh, String str) {
        this.t = c;
        this.u = moh;
        this.v = mog.a(str);
        this.w = "%" + c;
    }

    public char a() {
        return this.t;
    }

    public moh b() {
        return this.u;
    }

    int c() {
        return this.v;
    }

    public String d() {
        return this.w;
    }
}
