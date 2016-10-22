import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

final class hbd implements HostnameVerifier {
    hbd() {
    }

    public boolean verify(String str, SSLSession sSLSession) {
        HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
        return defaultHostnameVerifier.verify(str, sSLSession) ? true : "android.clients.google.com".equalsIgnoreCase(str) ? defaultHostnameVerifier.verify("clients.google.com", sSLSession) : false;
    }
}
