package defpackage;

import android.text.TextUtils;

/* renamed from: hsi */
public class hsi {
    public final /* synthetic */ frq a;

    public void a(String str, String str2, int i) {
        if (glk.a("BabelPeopleCache", 3)) {
            String str3 = "BabelPeopleCache";
            String b = TextUtils.isEmpty(str) ? "" : glk.b(str);
            glk.b(str3, new StringBuilder((String.valueOf(b).length() + 68) + String.valueOf(str2).length()).append("GmsPeopleCache.onDataChanged. Account: ").append(b).append(" gaiaId: ").append(str2).append(" scopes: ").append(i).toString(), new Object[0]);
        }
        long f = frq.f();
        if (f != 0) {
            this.a.e.removeCallbacks(this.a.h);
            this.a.e.postDelayed(this.a.h, f);
        }
    }

    public hsi(frq frq) {
        this.a = frq;
    }
}
