package defpackage;

/* renamed from: mqj */
public abstract class mqj extends mqm {
    abstract void a(moc<?> moc_, int i, String str, int i2, int i3, int i4);

    protected mqj() {
        super(moa.BRACE_STYLE);
    }

    protected final <T> void a(moc<T> moc_T) {
        String a = moc_T.a();
        int a2 = mqj.a(a, 0);
        while (a2 >= 0) {
            int i = a2 + 1;
            int i2 = a2 + 1;
            int i3 = 0;
            while (i < a.length()) {
                int i4 = i + 1;
                char charAt = a.charAt(i);
                char c = (char) (charAt - 48);
                if (c < '\n') {
                    i3 = (i3 * 10) + c;
                    if (i3 >= 1000000) {
                        throw mqn.a("index too large", a, i2, i4);
                    }
                    i = i4;
                } else {
                    int i5 = (i4 - 1) - i2;
                    if (i5 == 0) {
                        throw mqn.a("missing index", a, a2, i4);
                    } else if (a.charAt(i2) != '0' || i5 <= 1) {
                        if (charAt == '}') {
                            i2 = -1;
                            i5 = i4;
                        } else if (charAt == ',') {
                            i = i4;
                            while (i != a.length()) {
                                i2 = i + 1;
                                if (a.charAt(i) == '}') {
                                    i5 = i2;
                                    i2 = i4;
                                } else {
                                    i = i2;
                                }
                            }
                            throw mqn.b("unterminated parameter", a, a2);
                        } else {
                            throw mqn.a("malformed index", a, a2 + 1, i4);
                        }
                        a(moc_T, i3, a, a2, i2, i5);
                        a2 = mqj.a(a, i5);
                    } else {
                        throw mqn.a("index has leading zero", a, i2, i4 - 1);
                    }
                }
            }
            throw mqn.b("unterminated parameter", a, a2);
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '{') {
                return i2 - 1;
            }
            if (charAt != '\'') {
                i = i2;
            } else if (i2 == str.length()) {
                throw mqn.b("trailing single quote", str, i2 - 1);
            } else {
                i = i2 + 1;
                if (str.charAt(i2) != '\'') {
                    int i3 = i - 2;
                    i2 = i;
                    while (i2 != str.length()) {
                        i = i2 + 1;
                        if (str.charAt(i2) != '\'') {
                            i2 = i;
                        }
                    }
                    throw mqn.b("unmatched single quote", str, i3);
                }
                continue;
            }
        }
        return -1;
    }
}
