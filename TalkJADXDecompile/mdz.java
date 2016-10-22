public abstract class mdz implements mfe<Character> {
    @Deprecated
    public static final mdz a;
    @Deprecated
    public static final mdz b;
    @Deprecated
    public static final mdz c;
    @Deprecated
    public static final mdz d;
    @Deprecated
    public static final mdz e;
    @Deprecated
    public static final mdz f;
    @Deprecated
    public static final mdz g;
    @Deprecated
    public static final mdz h;
    @Deprecated
    public static final mdz i;
    @Deprecated
    public static final mdz j;
    @Deprecated
    public static final mdz k;
    @Deprecated
    public static final mdz l;
    @Deprecated
    public static final mdz m;
    @Deprecated
    public static final mdz n;

    public abstract boolean b(char c);

    public static mdz a() {
        return meo.o;
    }

    public static mdz b() {
        return mer.p;
    }

    public static mdz a(char c) {
        return new meg(c);
    }

    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        bm.b(i, length);
        for (int i2 = i; i2 < length; i2++) {
            if (b(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public String a(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!b(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Deprecated
    public boolean a(Character ch) {
        return b(ch.charValue());
    }

    public String toString() {
        return super.toString();
    }

    static {
        a = mer.p;
        b = mec.o;
        c = meb.o;
        d = med.o;
        e = meh.o;
        f = mej.o;
        g = mek.o;
        h = mem.o;
        i = mel.o;
        j = mei.o;
        k = mef.o;
        l = meq.o;
        m = mea.o;
        n = meo.o;
    }
}
