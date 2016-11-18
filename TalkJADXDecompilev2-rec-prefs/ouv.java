package p000;

import java.net.HttpURLConnection;

final class ouv implements Runnable {
    final /* synthetic */ HttpURLConnection f34344a;
    final /* synthetic */ oup f34345b;

    ouv(oup oup, HttpURLConnection httpURLConnection) {
        this.f34345b = oup;
        this.f34344a = httpURLConnection;
    }

    public void run() {
        this.f34344a.disconnect();
    }
}
