import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: PG */
public abstract class cxk implements cxc {
    private static final Charset a;

    protected abstract void b(dln dln);

    static {
        a = Charset.forName("UTF-8");
    }

    public final void a(dln dln) {
        if (!(dln.c == null || dln.c.trim().isEmpty())) {
            dln.b = Long.valueOf(a(dln.c));
            dln.c = null;
        }
        b(dln);
    }

    private static long a(String str) {
        buf.B((Object) str);
        buf.a((CharSequence) str, (Object) "name can not be empty.");
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(a));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
