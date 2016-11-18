package defpackage;

import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public class kej {
    final Proxy a;

    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) (this.a == null ? url.openConnection() : url.openConnection(this.a));
    }

    public kej() {
        this(null);
    }

    public kej(Proxy proxy) {
        this.a = null;
    }
}
