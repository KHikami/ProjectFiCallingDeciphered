import android.content.Context;
import com.google.android.libraries.stitch.sslguard.SslGuardSocketFactory;
import java.lang.reflect.Field;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class kdb {
    private static final String c;
    private static final Object d;
    private static final String e;
    private static String f;
    private static kdf g;
    ihg a;
    public idv b;

    static {
        c = kdb.class.getSimpleName();
        d = new Object();
        e = SslGuardSocketFactory.class.getName();
    }

    public kdb(ihg ihg, idv idv) {
        this.a = ihg;
        this.b = idv;
    }

    public void a(Context context) {
        kdd kdd = new kdd(context, kde.d);
        synchronized (d) {
            if (kdd.a != null) {
                String str = f;
                throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 82).append("Tried to install SslGuard after it was already installed.\n--Trace--\n").append(str).append("--End Trace--\n").toString());
            }
            kdd.a = kdd;
            if (g == null) {
                g = new kdf();
            }
            if (Security.insertProviderAt(g, 1) == 1) {
                SslGuardSocketFactory.a(this.a, this.b);
                b();
                c();
                switch (kdc.a[kdd.a.c - 1]) {
                    case wi.j /*1*/:
                    case wi.l /*2*/:
                        this.a.a(kdd.a.b, new ihh(this));
                        break;
                }
                a();
            } else {
                throw new RuntimeException("Failed to install SslGuard with top priority.");
            }
        }
    }

    private static void a() {
        synchronized (d) {
            StringBuilder stringBuilder = new StringBuilder();
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                stringBuilder.append(stackTraceElement.toString());
                stringBuilder.append("\n");
            }
            f = stringBuilder.toString();
        }
    }

    private static void b() {
        Throwable e;
        try {
            SSLContext instance = SSLContext.getInstance("Default");
            Field declaredField = SSLSocketFactory.class.getDeclaredField("defaultSocketFactory");
            declaredField.setAccessible(true);
            declaredField.set(null, instance.getSocketFactory());
            declaredField = SSLServerSocketFactory.class.getDeclaredField("defaultServerSocketFactory");
            declaredField.setAccessible(true);
            declaredField.set(null, instance.getServerSocketFactory());
            Security.setProperty("ssl.SocketFactory.provider", e);
            Security.setProperty("ssl.ServerSocketFactory.provider", e);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
    }

    private static void c() {
        Throwable e;
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, new TrustManager[]{new kdg()}, null);
            SSLContext.setDefault(instance);
            HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
        } catch (KeyManagementException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }
}
