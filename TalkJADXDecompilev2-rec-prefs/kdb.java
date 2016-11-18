package p000;

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
    private static final String f21391c = kdb.class.getSimpleName();
    private static final Object f21392d = new Object();
    private static final String f21393e = SslGuardSocketFactory.class.getName();
    private static String f21394f;
    private static kdf f21395g;
    ihg f21396a;
    public idv f21397b;

    public kdb(ihg ihg, idv idv) {
        this.f21396a = ihg;
        this.f21397b = idv;
    }

    public void m25580a(Context context) {
        kdd kdd = new kdd(context, kde.f21405d);
        synchronized (f21392d) {
            if (kdd.f21399a != null) {
                String str = f21394f;
                throw new RuntimeException(new StringBuilder(String.valueOf(str).length() + 82).append("Tried to install SslGuard after it was already installed.\n--Trace--\n").append(str).append("--End Trace--\n").toString());
            }
            kdd.f21399a = kdd;
            if (f21395g == null) {
                f21395g = new kdf();
            }
            if (Security.insertProviderAt(f21395g, 1) == 1) {
                SslGuardSocketFactory.m10503a(this.f21396a, this.f21397b);
                kdb.m25578b();
                kdb.m25579c();
                switch (kdc.f21398a[kdd.f21399a.f21401c - 1]) {
                    case 1:
                    case 2:
                        this.f21396a.m21787a(kdd.f21399a.f21400b, new ihh(this));
                        break;
                }
                kdb.m25577a();
            } else {
                throw new RuntimeException("Failed to install SslGuard with top priority.");
            }
        }
    }

    private static void m25577a() {
        synchronized (f21392d) {
            StringBuilder stringBuilder = new StringBuilder();
            for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
                stringBuilder.append(stackTraceElement.toString());
                stringBuilder.append("\n");
            }
            f21394f = stringBuilder.toString();
        }
    }

    private static void m25578b() {
        Throwable e;
        try {
            SSLContext instance = SSLContext.getInstance("Default");
            Field declaredField = SSLSocketFactory.class.getDeclaredField("defaultSocketFactory");
            declaredField.setAccessible(true);
            declaredField.set(null, instance.getSocketFactory());
            declaredField = SSLServerSocketFactory.class.getDeclaredField("defaultServerSocketFactory");
            declaredField.setAccessible(true);
            declaredField.set(null, instance.getServerSocketFactory());
            Security.setProperty("ssl.SocketFactory.provider", f21393e);
            Security.setProperty("ssl.ServerSocketFactory.provider", f21393e);
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

    private static void m25579c() {
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
