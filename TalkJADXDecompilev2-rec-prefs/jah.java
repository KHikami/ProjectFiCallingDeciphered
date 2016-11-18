package p000;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public abstract class jah implements izw {
    private static final Charset f19503a = Charset.forName("UTF-8");

    protected abstract void mo3427b(ook ook);

    public void mo3417a(ook ook) {
        if (!(ook.c == null || ook.c.trim().isEmpty())) {
            ook.b = Long.valueOf(jah.m23614a(ook.c));
            ook.c = null;
        }
        mo3427b(ook);
    }

    private static long m23614a(String str) {
        ba.m4536a((Object) str);
        ba.m4535a((CharSequence) str, (Object) "name can not be empty.");
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(f19503a));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
