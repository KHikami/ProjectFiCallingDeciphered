package defpackage;

/* renamed from: mql */
public final class mql extends mqo {
    public int a(moc<?> moc_, int i, String str, int i2, int i3, int i4) {
        mpz a;
        int i5;
        boolean z = true;
        boolean z2 = false;
        int i6 = i4 + 1;
        mog a2 = mog.a(str, i3, i4);
        char charAt = str.charAt(i4);
        mof a3 = mof.a(charAt);
        if (a3 != null) {
            if (a2.a(a3)) {
                a = mqb.a(i, a3, a2);
                i5 = i6;
            } else {
                throw mqn.a("invalid format specifier", str, i2, i6);
            }
        } else if (charAt == 'h' || charAt == 'H') {
            if (a2.a(32, false)) {
                if (charAt == 'H') {
                    z2 = true;
                }
                a = new mqh(mqb.a(i, z2 ? mof.HEX_UPPER : mof.HEX, a2), z2);
                i5 = i6;
            } else {
                throw mqn.a("invalid format specification", str, i2, i6);
            }
        } else if (charAt != 't' && charAt != 'T') {
            throw mqn.a("invalid format specification", str, i2, i4 + 1);
        } else if (a2.a(32, false)) {
            i6++;
            if (i6 > str.length()) {
                throw mqn.a("truncated format specifier", str, i2);
            }
            mpw mpw = (mpw) mpw.F.get(Character.valueOf(str.charAt(i4 + 1)));
            if (mpw == null) {
                throw mqn.a("illegal date/time conversion", str, i4 + 1);
            }
            if (charAt != 'T') {
                z = false;
            }
            a = new mpx(a2, i, mpw, z);
            i5 = i6;
        } else {
            throw mqn.a("invalid format specification", str, i2, i6);
        }
        moc_.a(i2, i5, a);
        return i5;
    }
}
