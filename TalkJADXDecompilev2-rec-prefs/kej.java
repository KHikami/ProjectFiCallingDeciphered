package p000;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public class kej {
    final Proxy f21489a;

    public HttpURLConnection m25660a(URL url) {
        return (HttpURLConnection) (this.f21489a == null ? url.openConnection() : url.openConnection(this.f21489a));
    }

    public kej() {
        this(null);
    }

    public kej(Proxy proxy) {
        this.f21489a = null;
    }
}
