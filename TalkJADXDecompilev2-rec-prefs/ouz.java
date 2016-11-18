package p000;

import com.google.api.client.http.HttpStatusCodes;
import java.net.HttpURLConnection;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlResponseInfo;

final class ouz implements ovn {
    final /* synthetic */ oup f34349a;

    ouz(oup oup) {
        this.f34349a = oup;
    }

    public void mo4235a() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f34349a.f34333p.get();
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
            this.f34349a.f34331n = new UrlResponseInfo(new ArrayList(this.f34349a.f34322e), responseCode, httpURLConnection.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "");
            if (responseCode < HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES || responseCode >= 400) {
                this.f34349a.m39752c();
                if (responseCode >= 400) {
                    this.f34349a.f34330m = oul.m39730a(httpURLConnection.getErrorStream());
                    this.f34349a.f34318a.m39761a();
                    return;
                }
                this.f34349a.f34330m = oul.m39730a(httpURLConnection.getInputStream());
                this.f34349a.f34318a.m39761a();
                return;
            }
            oup oup = this.f34349a;
            oup.m39749a(ovw.STARTED, ovw.REDIRECT_RECEIVED, new ovb(oup, this.f34349a.f34331n.m39400e()));
        }
    }
}
