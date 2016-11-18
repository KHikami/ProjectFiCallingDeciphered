package defpackage;

import com.google.api.client.http.HttpMethods;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map.Entry;

final class ovd implements ovn {
    final /* synthetic */ oup a;

    ovd(oup oup) {
        this.a = oup;
    }

    public void a() {
        if (this.a.f.get() != ovw.CANCELLED) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.a.l).openConnection();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.a.p.getAndSet(httpURLConnection);
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            httpURLConnection.setInstanceFollowRedirects(false);
            if (!this.a.d.containsKey("User-Agent")) {
                this.a.d.put("User-Agent", this.a.c);
            }
            for (Entry entry : this.a.d.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (this.a.h == null) {
                this.a.h = HttpMethods.GET;
            }
            httpURLConnection.setRequestMethod(this.a.h);
            if (this.a.i != null) {
                new ovo(this.a, this.a.j, this.a.b, httpURLConnection, this.a.i).b(this.a.e.size() == 1);
                return;
            }
            this.a.k = 10;
            httpURLConnection.connect();
            oup oup = this.a;
            oup.k = 13;
            oup.b.execute(oup.a(ovw.STARTED, new ouz(oup)));
        }
    }
}
