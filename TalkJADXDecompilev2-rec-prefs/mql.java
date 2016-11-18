package p000;

public final class mql extends mqo {
    public int mo3914a(moc<?> moc_, int i, String str, int i2, int i3, int i4) {
        mpz a;
        int i5;
        boolean z = true;
        boolean z2 = false;
        int i6 = i4 + 1;
        mog a2 = mog.m32615a(str, i3, i4);
        char charAt = str.charAt(i4);
        mof a3 = mof.m32608a(charAt);
        if (a3 != null) {
            if (a2.m32620a(a3)) {
                a = mqb.m32687a(i, a3, a2);
                i5 = i6;
            } else {
                throw mqn.m32711a("invalid format specifier", str, i2, i6);
            }
        } else if (charAt == 'h' || charAt == 'H') {
            if (a2.m32619a(32, false)) {
                if (charAt == 'H') {
                    z2 = true;
                }
                a = new mqh(mqb.m32687a(i, z2 ? mof.HEX_UPPER : mof.HEX, a2), z2);
                i5 = i6;
            } else {
                throw mqn.m32711a("invalid format specification", str, i2, i6);
            }
        } else if (charAt != 't' && charAt != 'T') {
            throw mqn.m32711a("invalid format specification", str, i2, i4 + 1);
        } else if (a2.m32619a(32, false)) {
            i6++;
            if (i6 > str.length()) {
                throw mqn.m32710a("truncated format specifier", str, i2);
            }
            mpw mpw = (mpw) mpw.f28068F.get(Character.valueOf(str.charAt(i4 + 1)));
            if (mpw == null) {
                throw mqn.m32710a("illegal date/time conversion", str, i4 + 1);
            }
            if (charAt != 'T') {
                z = false;
            }
            a = new mpx(a2, i, mpw, z);
            i5 = i6;
        } else {
            throw mqn.m32711a("invalid format specification", str, i2, i6);
        }
        moc_.m32602a(i2, i5, a);
        return i5;
    }
}
