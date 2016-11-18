package p000;

import android.util.Log;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

final class kdg implements TrustManager, X509TrustManager {
    private static final String f21407a = kdg.class.getSimpleName();

    kdg() {
    }

    private static void m25582a() {
        Log.e(f21407a, "App is using openSSL stack, but is not using ProviderInstaller. Please Fix.");
        throw new RuntimeException("Unsafe use of platform SSL stack.");
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        kdg.m25582a();
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        kdg.m25582a();
    }

    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
