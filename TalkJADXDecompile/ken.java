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
    private static final String[] a;
    private final kej b;
    private final SSLSocketFactory c;
    private final HostnameVerifier d;

    protected /* synthetic */ LowLevelHttpRequest buildRequest(String str, String str2) {
        return a(str, str2);
    }

    static {
        String[] strArr = new String[]{HttpMethods.DELETE, HttpMethods.GET, HttpMethods.HEAD, HttpMethods.OPTIONS, HttpMethods.POST, HttpMethods.PUT, HttpMethods.TRACE};
        a = strArr;
        Arrays.sort(strArr);
    }

    public ken() {
        this(null, null, null);
    }

    private ken(kej kej, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        this.b = new kej();
        this.c = null;
        this.d = null;
    }

    public boolean supportsMethod(String str) {
        return Arrays.binarySearch(a, str) >= 0;
    }

    private kek a(String str, String str2) {
        bc.a(supportsMethod(str), "HTTP method %s not supported", str);
        HttpURLConnection a = this.b.a(new URL(str2));
        a.setRequestMethod(str);
        if (a instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) a;
            if (this.d != null) {
                httpsURLConnection.setHostnameVerifier(this.d);
            }
            if (this.c != null) {
                httpsURLConnection.setSSLSocketFactory(this.c);
            }
        }
        return new kek(a);
    }
}
