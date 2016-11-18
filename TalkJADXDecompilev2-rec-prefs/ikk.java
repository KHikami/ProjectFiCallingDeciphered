package p000;

import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

final class ikk {
    boolean f17894a;
    int f17895b = 6;
    long f17896c = -1;
    final String f17897d;
    final long f17898e;
    long f17899f = -1;
    long f17900g = -1;
    final iin<ikn> f17901h = new iin(1200);
    final ikl f17902i = new ikl();
    long f17903j = -1;

    ikk() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.f17897d = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        this.f17898e = SystemClock.elapsedRealtime();
    }

    void m22182a() {
        this.f17903j = SystemClock.elapsedRealtime();
        if (!this.f17902i.m22184b()) {
            for (Object a : this.f17902i.m22185c()) {
                this.f17901h.m21890a(a);
            }
            this.f17902i.m22183a();
        }
    }

    static iin<ikn> m22181a(iin<ikn> iin_ikn, iin<ikn> iin_ikn2) {
        iin<ikn> iin = new iin(1200);
        int i;
        if (iin_ikn2 == null) {
            for (i = 0; i < iin_ikn.m21888a(); i++) {
                iin.m21890a((ikn) iin_ikn.m21889a(i));
            }
            return iin;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i3 < iin_ikn.m21888a() && i < iin_ikn2.m21888a()) {
            if (((ikn) iin_ikn.m21889a(i3)).f17912b < ((ikn) iin_ikn2.m21889a(i)).f17912b) {
                i2 = i3 + 1;
                iin.m21890a((ikn) iin_ikn.m21889a(i3));
                i3 = i2;
            } else {
                i2 = i + 1;
                iin.m21890a((ikn) iin_ikn2.m21889a(i));
                i = i2;
            }
        }
        while (i3 < iin_ikn.m21888a()) {
            i2 = i3 + 1;
            iin.m21890a((ikn) iin_ikn.m21889a(i3));
            i3 = i2;
        }
        while (i < iin_ikn2.m21888a()) {
            i2 = i + 1;
            iin.m21890a((ikn) iin_ikn2.m21889a(i));
            i = i2;
        }
        return iin;
    }
}
