package p000;

import android.text.TextUtils;

public class hsi {
    public final /* synthetic */ frq f17163a;

    public void m20768a(String str, String str2, int i) {
        if (glk.m17973a("BabelPeopleCache", 3)) {
            String str3 = "BabelPeopleCache";
            String b = TextUtils.isEmpty(str) ? "" : glk.m17974b(str);
            glk.m17976b(str3, new StringBuilder((String.valueOf(b).length() + 68) + String.valueOf(str2).length()).append("GmsPeopleCache.onDataChanged. Account: ").append(b).append(" gaiaId: ").append(str2).append(" scopes: ").append(i).toString(), new Object[0]);
        }
        long f = frq.m16060f();
        if (f != 0) {
            this.f17163a.f13833e.removeCallbacks(this.f17163a.f13835h);
            this.f17163a.f13833e.postDelayed(this.f17163a.f13835h, f);
        }
    }

    public hsi(frq frq) {
        this.f17163a = frq;
    }
}
