package com.google.android.libraries.stitch.sslguard;

import android.util.Log;
import com.google.android.apps.common.proguard.UsedByReflection;
import ids;
import idt;
import idv;
import ihg;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kdd;
import kde;

@UsedByReflection
public final class SslGuardSocketFactory extends SSLSocketFactory {
    private static final String a;
    private static ihg b;
    private static idv c;

    static {
        a = SslGuardSocketFactory.class.getSimpleName();
    }

    private static SSLSocketFactory a(Provider provider) {
        if (provider == null) {
            return SSLContext.getInstance("Default").getSocketFactory();
        }
        try {
            return SSLContext.getInstance("Default", provider).getSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static void a(ihg ihg, idv idv) {
        if (ihg == null || idv == null) {
            throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
        }
        b = ihg;
        c = idv;
    }

    public Socket createSocket() {
        return a().createSocket();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a().createSocket(socket, str, i, z);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a().createSocket(inetAddress, i, inetAddress2, i2);
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return a().createSocket(inetAddress, i);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a().createSocket(str, i, inetAddress, i2);
    }

    public Socket createSocket(String str, int i) {
        return a().createSocket(str, i);
    }

    public String[] getSupportedCipherSuites() {
        try {
            return a().getSupportedCipherSuites();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public String[] getDefaultCipherSuites() {
        try {
            return a().getDefaultCipherSuites();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private SSLSocketFactory a() {
        int i = 0;
        if (kdd.a.c == kde.a) {
            throw new RuntimeException("Attempted to use SSL stack while in refuse mode.");
        }
        try {
            b.a(kdd.a.b);
        } catch (idt e) {
            c.a(e.a(), kdd.a.b);
            if (kdd.a.c == kde.b || kdd.a.c == kde.d) {
                throw new IOException("Attempted to use SSL unpatched. Google Play Services needs update.");
            }
        } catch (ids e2) {
            Log.e(a, "Attempted to use SSL unpatched. Google Play Services unavailable.");
            c.a(e2.a, kdd.a.b);
            if (kdd.a.c == kde.b || kdd.a.c == kde.d) {
                throw new IOException("Blocked unpatched use of SSL stack.");
            }
        }
        SSLSocketFactory a = a(null);
        if (kdd.a.c == kde.c && (a instanceof SslGuardSocketFactory)) {
            for (Provider provider : Security.getProviders()) {
                if (provider.stringPropertyNames().contains("SSLContext.Default")) {
                    a = a(provider);
                    if (!(a instanceof SslGuardSocketFactory)) {
                        break;
                    }
                }
            }
        }
        if (a instanceof SslGuardSocketFactory) {
            Object obj = "[";
            Provider[] providers = Security.getProviders();
            int length = providers.length;
            while (i < length) {
                Provider provider2 = providers[i];
                String valueOf = String.valueOf(obj);
                String valueOf2 = String.valueOf(provider2.toString());
                obj = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                if (provider2.stringPropertyNames().contains("SSLContext.Default")) {
                    obj = String.valueOf(obj).concat("(true), ");
                } else {
                    obj = String.valueOf(obj).concat("(false), ");
                }
                i++;
            }
            Log.e(a, String.valueOf(obj).concat("]"));
            throw new RuntimeException("Unable to find a default SSL provider.");
        }
        return a;
    }
}
