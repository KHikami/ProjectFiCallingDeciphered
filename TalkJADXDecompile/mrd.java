import java.io.Closeable;
import java.lang.reflect.Method;

final class mrd implements mre {
    static final mrd a;
    static final Method b;

    mrd() {
    }

    static {
        a = new mrd();
        b = a();
    }

    private static Method a() {
        try {
            return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Throwable th) {
            return null;
        }
    }

    public void a(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                b.invoke(th, new Object[]{th2});
            } catch (Throwable th3) {
                mrc.a.a(closeable, th, th2);
            }
        }
    }
}
