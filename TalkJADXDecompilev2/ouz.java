package defpackage;

import com.google.api.client.http.HttpStatusCodes;
import java.net.HttpURLConnection;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlResponseInfo;

final class ouz implements ovn {
    final /* synthetic */ oup a;

    ouz(oup oup) {
        this.a = oup;
    }

    public void a() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.a.p.get();
        if (httpURLConnection != null) {
            List arrayList = new ArrayList();
            String str = "http/1.1";
            int i = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    str = httpURLConnection.getHeaderField(i);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new SimpleEntry(headerFieldKey, httpURLConnection.getHeaderField(i)));
                }
                i++;
            }
            int responseCode = httpURLConnection.getResponseCode();
            this.a.n = new UrlResponseInfo(new ArrayList(this.a.e), responseCode, httpURLConnection.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "");
            if (responseCode < HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES || responseCode >= 400) {
                this.a.c();
                if (responseCode >= 400) {
                    this.a.m = oul.a(httpURLConnection.getErrorStream());
                    this.a.a.a();
                    return;
                }
                this.a.m = oul.a(httpURLConnection.getInputStream());
                this.a.a.a();
                return;
            }
            oup oup = this.a;
            oup.a(ovw.STARTED, ovw.REDIRECT_RECEIVED, new ovb(oup, this.a.n.e()));
        }
    }
}
