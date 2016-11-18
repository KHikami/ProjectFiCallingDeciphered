package p000;

public abstract class mqo extends mqm {
    abstract int mo3914a(moc<?> moc_, int i, String str, int i2, int i3, int i4);

    protected mqo() {
        super(moa.PRINTF_STYLE);
    }

    protected final <T> void mo3912a(moc<T> moc_T) {
        String a = moc_T.m32600a();
        int a2 = mqo.m32706a(a, 0);
        int i = 0;
        int i2 = -1;
        while (a2 >= 0) {
            int i3 = a2 + 1;
            int i4 = 0;
            int i5 = i3;
            while (i5 < a.length()) {
                int i6 = i5 + 1;
                char charAt = a.charAt(i5);
                char c = (char) (charAt - 48);
                if (c < '\n') {
                    i4 = (i4 * 10) + c;
                    if (i4 >= 1000000) {
                        throw mqn.m32711a("index too large", a, a2, i6);
                    }
                    i5 = i6;
                } else {
                    if (charAt == '$') {
                        if ((i6 - 1) - i3 == 0) {
                            throw mqn.m32711a("missing index", a, a2, i6);
                        } else if (a.charAt(i3) == '0') {
                            throw mqn.m32711a("index has leading zero", a, a2, i6);
                        } else {
                            i3 = i4 - 1;
                            if (i6 == a.length()) {
                                throw mqn.m32712b("unterminated parameter", a, a2);
                            }
                            i4 = i6 + 1;
                            a.charAt(i6);
                        }
                    } else if (charAt != '<') {
                        int i7 = i;
                        i++;
                        i4 = i6;
                        i6 = i3;
                        i3 = i7;
                    } else if (i2 == -1) {
                        throw mqn.m32711a("invalid relative parameter", a, a2, i6);
                    } else if (i6 == a.length()) {
                        throw mqn.m32712b("unterminated parameter", a, a2);
                    } else {
                        i4 = i6 + 1;
                        a.charAt(i6);
                        i3 = i2;
                    }
                    i2 = i4 - 1;
                    while (i2 < a.length()) {
                        if (((char) ((a.charAt(i2) & -33) - 65)) < '\u001a') {
                            a2 = mqo.m32706a(a, mo3914a(moc_T, i3, a, a2, i6, i2));
                            i2 = i3;
                        } else {
                            i2++;
                        }
                    }
                    throw mqn.m32712b("unterminated parameter", a, a2);
                }
            }
            throw mqn.m32712b("unterminated parameter", a, a2);
        }
    }

    private static int m32706a(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            } else {
                throw mqn.m32712b("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }
}
