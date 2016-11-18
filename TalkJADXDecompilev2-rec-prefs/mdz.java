package p000;

public abstract class mdz implements mfe<Character> {
    @Deprecated
    public static final mdz f27551a = mer.f27585p;
    @Deprecated
    public static final mdz f27552b = mec.f27569o;
    @Deprecated
    public static final mdz f27553c = meb.f27568o;
    @Deprecated
    public static final mdz f27554d = med.f27573o;
    @Deprecated
    public static final mdz f27555e = meh.f27576o;
    @Deprecated
    public static final mdz f27556f = mej.f27578o;
    @Deprecated
    public static final mdz f27557g = mek.f27579o;
    @Deprecated
    public static final mdz f27558h = mem.f27581o;
    @Deprecated
    public static final mdz f27559i = mel.f27580o;
    @Deprecated
    public static final mdz f27560j = mei.f27577o;
    @Deprecated
    public static final mdz f27561k = mef.f27574o;
    @Deprecated
    public static final mdz f27562l = meq.f27583o;
    @Deprecated
    public static final mdz f27563m = mea.f27567o;
    @Deprecated
    public static final mdz f27564n = meo.f27582o;

    public abstract boolean mo3738b(char c);

    public static mdz m31924a() {
        return meo.f27582o;
    }

    public static mdz m31926b() {
        return mer.f27585p;
    }

    public static mdz m31925a(char c) {
        return new meg(c);
    }

    public int mo3737a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        bm.m6146b(i, length);
        for (int i2 = i; i2 < length; i2++) {
            if (mo3738b(charSequence.charAt(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public String mo3739a(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo3738b(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Deprecated
    public boolean m31929a(Character ch) {
        return mo3738b(ch.charValue());
    }

    public String toString() {
        return super.toString();
    }
}
