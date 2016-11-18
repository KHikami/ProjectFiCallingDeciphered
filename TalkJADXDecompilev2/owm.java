package defpackage;

import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.X509TrustManager;

public final class owm implements own {
    private final X509TrustManager a;

    public owm(X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
    }

    public List<X509Certificate> a(X509Certificate[] x509CertificateArr, String str, String str2) {
        this.a.checkServerTrusted(x509CertificateArr, str);
        return Collections.emptyList();
    }
}
