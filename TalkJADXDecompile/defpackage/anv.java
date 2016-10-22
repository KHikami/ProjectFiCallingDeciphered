package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: anv */
public interface anv {
    public static final Charset a;

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();

    static {
        a = Charset.forName("UTF-8");
    }
}
