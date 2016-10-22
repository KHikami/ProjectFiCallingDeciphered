package defpackage;

/* compiled from: PG */
/* renamed from: cxn */
public abstract class cxn implements cyn {
    public abstract boolean b(char c);

    public static cxn a() {
        return cyc.a;
    }

    public static cxn b() {
        return cyf.a;
    }

    public static cxn a(char c) {
        return new cxu(c);
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
    public final boolean a(Character ch) {
        return b(ch.charValue());
    }

    public String toString() {
        return super.toString();
    }

    static {
        cyf cyf = cyf.a;
        cxn cxn = cxq.a;
        cxp cxp = cxp.a;
        cxr cxr = cxr.a;
        cxv cxv = cxv.a;
        cxx cxx = cxx.a;
        cxy cxy = cxy.a;
        cya cya = cya.a;
        cxz cxz = cxz.a;
        cxw cxw = cxw.a;
        cxt cxt = cxt.a;
        cye cye = cye.a;
        cxo cxo = cxo.a;
        cyc cyc = cyc.a;
    }
}
