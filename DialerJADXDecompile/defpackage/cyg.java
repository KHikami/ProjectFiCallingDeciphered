package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* renamed from: cyg */
public final class cyg {
    public static final Charset a;
    public static final Charset b;

    static {
        a = Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        b = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}
