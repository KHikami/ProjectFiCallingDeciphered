package p000;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;

public final class owo implements own {
    private final X509TrustManagerExtensions f34445a;

    public owo(X509TrustManager x509TrustManager) {
        this.f34445a = new X509TrustManagerExtensions(x509TrustManager);
    }

    public List<X509Certificate> mo4244a(X509Certificate[] x509CertificateArr, String str, String str2) {
        return this.f34445a.checkServerTrusted(x509CertificateArr, str, str2);
    }
}
