import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public abstract class jah implements izw {
    private static final Charset a;

    protected abstract void b(ook ook);

    static {
        a = Charset.forName("UTF-8");
    }

    public void a(ook ook) {
        if (!(ook.c == null || ook.c.trim().isEmpty())) {
            ook.b = Long.valueOf(a(ook.c));
            ook.c = null;
        }
        b(ook);
    }

    private static long a(String str) {
        ba.a((Object) str);
        ba.a((CharSequence) str, (Object) "name can not be empty.");
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(a));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
