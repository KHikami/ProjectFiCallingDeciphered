package defpackage;

public abstract class mdz implements mfe<Character> {
    @Deprecated
    public static final mdz a = mer.p;
    @Deprecated
    public static final mdz b = mec.o;
    @Deprecated
    public static final mdz c = meb.o;
    @Deprecated
    public static final mdz d = med.o;
    @Deprecated
    public static final mdz e = meh.o;
    @Deprecated
    public static final mdz f = mej.o;
    @Deprecated
    public static final mdz g = mek.o;
    @Deprecated
    public static final mdz h = mem.o;
    @Deprecated
    public static final mdz i = mel.o;
    @Deprecated
    public static final mdz j = mei.o;
    @Deprecated
    public static final mdz k = mef.o;
    @Deprecated
    public static final mdz l = meq.o;
    @Deprecated
    public static final mdz m = mea.o;
    @Deprecated
    public static final mdz n = meo.o;

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
}
