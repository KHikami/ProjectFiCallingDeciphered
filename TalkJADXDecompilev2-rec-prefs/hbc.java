package p000;

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
    public int f16500a = ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS;
    public int f16501b = ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS;
    public SSLSocketFactory f16502c;
    private Context f16503d;
    private HostnameVerifier f16504e;
    private hbf f16505f;

    public hbc(Context context, boolean z) {
        SSLSessionCache sSLSessionCache = null;
        this.f16503d = context;
        this.f16505f = new hbf(this.f16503d);
        this.f16502c = z ? new hha(this.f16503d, ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS, true, true, null) : null;
        if (this.f16502c == null) {
            if (context != null && VERSION.SDK_INT > 18) {
                sSLSessionCache = new SSLSessionCache(context);
            }
            this.f16502c = SSLCertificateSocketFactory.getDefault(ExponentialBackOffPolicy.DEFAULT_MAX_INTERVAL_MILLIS, sSLSessionCache);
        }
        this.f16504e = new hbd();
    }

    public HttpURLConnection m19124a(URL url, Network network) {
        URLConnection openConnection;
        gwb.m1419L((Object) url);
        Bundle a = this.f16505f.m19134a(url.toString());
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
            this.f16503d.getSystemService("connectivity");
            openConnection = network.openConnection(url);
        }
        openConnection.setConnectTimeout(this.f16501b);
        openConnection.setReadTimeout(this.f16500a);
        if (openConnection instanceof HttpsURLConnection) {
            if (this.f16502c != null) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(this.f16502c);
            }
            if (this.f16504e != null) {
                ((HttpsURLConnection) openConnection).setHostnameVerifier(this.f16504e);
            }
        }
        return (HttpURLConnection) openConnection;
    }

    void m19125a(String str, int i) {
        this.f16505f.m19135a(str, i);
    }

    @Deprecated
    public void close() {
    }
}
