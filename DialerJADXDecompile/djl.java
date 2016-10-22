import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
final class djl extends djj {
    private final Method c;
    private final Method d;
    private final Method e;
    private final Class f;
    private final Class g;

    public djl(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    public final void a(SSLSocket sSLSocket, String str, List list) {
        List arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            djn djn = (djn) list.get(i);
            if (djn != djn.HTTP_1_0) {
                arrayList.add(djn.toString());
            }
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(djj.class.getClassLoader(), new Class[]{this.f, this.g}, new djm(arrayList));
            this.c.invoke(null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
        }
    }

    public final String b(SSLSocket sSLSocket) {
        try {
            djm djm = (djm) Proxy.getInvocationHandler(this.d.invoke(null, new Object[]{sSLSocket}));
            if (djm.a || djm.b != null) {
                return djm.a ? null : djm.b;
            } else {
                a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError();
        } catch (IllegalAccessException e2) {
            throw new AssertionError();
        }
    }
}
