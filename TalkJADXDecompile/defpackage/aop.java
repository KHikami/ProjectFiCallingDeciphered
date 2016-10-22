package defpackage;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: aop */
class aop {
    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    aop() {
    }
}
