package defpackage;

import java.net.HttpURLConnection;

final class ouv implements Runnable {
    final /* synthetic */ HttpURLConnection a;
    final /* synthetic */ oup b;

    ouv(oup oup, HttpURLConnection httpURLConnection) {
        this.b = oup;
        this.a = httpURLConnection;
    }

    public void run() {
        this.a.disconnect();
    }
}
