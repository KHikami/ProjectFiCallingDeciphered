package p000;

import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class ken extends HttpTransport {
    private static final String[] f21498a;
    private final kej f21499b;
    private final SSLSocketFactory f21500c;
    private final HostnameVerifier f21501d;

    protected /* synthetic */ LowLevelHttpRequest buildRequest(String str, String str2) {
        return m25662a(str, str2);
    }

    static {
        String[] strArr = new String[]{HttpMethods.DELETE, HttpMethods.GET, HttpMethods.HEAD, HttpMethods.OPTIONS, HttpMethods.POST, HttpMethods.PUT, HttpMethods.TRACE};
        f21498a = strArr;
        Arrays.sort(strArr);
    }

    public ken() {
        this(null, null, null);
    }

    private ken(kej kej, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this.f21499b = new kej();
        this.f21500c = null;
        this.f21501d = null;
    }

    public boolean supportsMethod(String str) {
        return Arrays.binarySearch(f21498a, str) >= 0;
    }

    private kek m25662a(String str, String str2) {
        bc.m4816a(supportsMethod(str), "HTTP method %s not supported", str);
        HttpURLConnection a = this.f21499b.m25660a(new URL(str2));
        a.setRequestMethod(str);
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
            if (this.f21501d != null) {
                httpsURLConnection.setHostnameVerifier(this.f21501d);
            }
            if (this.f21500c != null) {
                httpsURLConnection.setSSLSocketFactory(this.f21500c);
            }
        }
        return new kek(a);
    }
}
