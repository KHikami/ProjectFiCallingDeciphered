package p000;

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
    
    private static final mof[] f27998r = null;
    private static final mof[] f27999s = null;
    private final char f28001t;
    private final moh f28002u;
    private final int f28003v;
    private final String f28004w;

    static {
        f27998r = new mof[24];
        f27999s = new mof[24];
        mof[] values = mof.values();
        int length = values.length;
        int i;
        while (i < length) {
            mof mof = values[i];
            char a = mof.m32609a();
            if (Character.isLowerCase(a)) {
                f27998r[a - 97] = mof;
            } else {
                f27999s[a - 65] = mof;
            }
            i++;
        }
    }

    public static mof m32608a(char c) {
        if (c >= 'a' && c <= 'x') {
            return f27998r[c - 97];
        }
        if (c < 'A' || c > 'X') {
            return null;
        }
        return f27999s[c - 65];
    }

    private mof(char c, moh moh, String str) {
        this.f28001t = c;
        this.f28002u = moh;
        this.f28003v = mog.m32614a(str);
        this.f28004w = "%" + c;
    }

    public char m32609a() {
        return this.f28001t;
    }

    public moh m32610b() {
        return this.f28002u;
    }

    int m32611c() {
        return this.f28003v;
    }

    public String m32612d() {
        return this.f28004w;
    }
}
