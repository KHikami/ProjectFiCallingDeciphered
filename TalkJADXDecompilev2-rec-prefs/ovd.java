package p000;

import com.google.api.client.http.HttpMethods;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map.Entry;

final class ovd implements ovn {
    final /* synthetic */ oup f34354a;

    ovd(oup oup) {
        this.f34354a = oup;
    }

    public void mo4235a() {
        if (this.f34354a.f34323f.get() != ovw.CANCELLED) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f34354a.f34329l).openConnection();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f34354a.f34333p.getAndSet(httpURLConnection);
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            httpURLConnection.setInstanceFollowRedirects(false);
            if (!this.f34354a.f34321d.containsKey("User-Agent")) {
                this.f34354a.f34321d.put("User-Agent", this.f34354a.f34320c);
            }
            for (Entry entry : this.f34354a.f34321d.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (this.f34354a.f34325h == null) {
                this.f34354a.f34325h = HttpMethods.GET;
            }
            httpURLConnection.setRequestMethod(this.f34354a.f34325h);
            if (this.f34354a.f34326i != null) {
                new ovo(this.f34354a, this.f34354a.f34327j, this.f34354a.f34319b, httpURLConnection, this.f34354a.f34326i).m39773b(this.f34354a.f34322e.size() == 1);
                return;
            }
            this.f34354a.f34328k = 10;
            httpURLConnection.connect();
            oup oup = this.f34354a;
            oup.f34328k = 13;
            oup.f34319b.execute(oup.m39741a(ovw.STARTED, new ouz(oup)));
        }
    }
}
