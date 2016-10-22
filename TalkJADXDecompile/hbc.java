import android.content.Context;
import android.net.Network;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.webkit.URLUtil;
import com.google.api.client.http.ExponentialBackOffPolicy;
import java.io.Closeable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class hbc implements Closeable {
    public int a;
    public int b;
    public SSLSocketFactory c;
    private Context d;
    private HostnameVerifier e;
    private hbf f;

    public hbc(Context context, boolean z) {
        SSLSessionCache sSLSessionCache = null;
        this.a = ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS;
        this.b = ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS;
        this.d = context;
        this.f = new hbf(this.d);
        this.c = z ? new hha(this.d, ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS, true, true, null) : null;
        if (this.c == null) {
            if (context != null && VERSION.SDK_INT > 18) {
                sSLSessionCache = new SSLSessionCache(context);
            }
            this.c = SSLCertificateSocketFactory.getDefault(ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS, sSLSessionCache);
        }
        this.e = new hbd();
    }

    public HttpURLConnection a(URL url, Network network) {
        URLConnection openConnection;
        gwb.L((Object) url);
        Bundle a = this.f.a(url.toString());
        if (a != null) {
            String valueOf;
            if (a.getString("block") != null) {
                valueOf = String.valueOf(a.getString("name"));
                String valueOf2 = String.valueOf(url);
                new StringBuilder((String.valueOf(valueOf).length() + 13) + String.valueOf(valueOf2).length()).append("Blocked by ").append(valueOf).append(": ").append(valueOf2);
                throw new awx(a);
            }
            String string = a.getString("rewrite");
            if (string != null && (URLUtil.isHttpUrl(string) || URLUtil.isHttpsUrl(string))) {
                if (Log.isLoggable("GoogleURLConnFactory", 3)) {
                    valueOf = String.valueOf(url.toString());
                    new StringBuilder((String.valueOf(valueOf).length() + 12) + String.valueOf(string).length()).append("Rewrote ").append(valueOf).append(" to ").append(string);
                }
                url = new URL(string);
            }
        }
        if (network == null) {
            openConnection = url.openConnection();
        } else {
            this.d.getSystemService("connectivity");
            openConnection = network.openConnection(url);
        }
        openConnection.setConnectTimeout(this.b);
        openConnection.setReadTimeout(this.a);
        if (openConnection instanceof HttpsURLConnection) {
            if (this.c != null) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(this.c);
            }
            if (this.e != null) {
                ((HttpsURLConnection) openConnection).setHostnameVerifier(this.e);
            }
        }
        return (HttpURLConnection) openConnection;
    }

    void a(String str, int i) {
        this.f.a(str, i);
    }

    @Deprecated
    public void close() {
    }
}
