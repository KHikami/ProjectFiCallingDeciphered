package defpackage;

import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: ikk */
final class ikk {
    boolean a;
    int b;
    long c;
    final String d;
    final long e;
    long f;
    long g;
    final iin<ikn> h;
    final ikl i;
    long j;

    ikk() {
        this.b = 6;
        this.h = new iin(1200);
        this.i = new ikl();
        this.c = -1;
        this.f = -1;
        this.g = -1;
        this.j = -1;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        this.d = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        this.e = SystemClock.elapsedRealtime();
    }

    void a() {
        this.j = SystemClock.elapsedRealtime();
        if (!this.i.b()) {
            for (Object a : this.i.c()) {
                this.h.a(a);
            }
            this.i.a();
        }
    }

    static iin<ikn> a(iin<ikn> iin_ikn, iin<ikn> iin_ikn2) {
        iin<ikn> iin = new iin(1200);
        int i;
        if (iin_ikn2 == null) {
            for (i = 0; i < iin_ikn.a(); i++) {
                iin.a((ikn) iin_ikn.a(i));
            }
            return iin;
        }
        int i2;
        i = 0;
        int i3 = 0;
        while (i3 < iin_ikn.a() && i < iin_ikn2.a()) {
            if (((ikn) iin_ikn.a(i3)).b < ((ikn) iin_ikn2.a(i)).b) {
                i2 = i3 + 1;
                iin.a((ikn) iin_ikn.a(i3));
                i3 = i2;
            } else {
                i2 = i + 1;
                iin.a((ikn) iin_ikn2.a(i));
                i = i2;
            }
        }
        while (i3 < iin_ikn.a()) {
            i2 = i3 + 1;
            iin.a((ikn) iin_ikn.a(i3));
            i3 = i2;
        }
        while (i < iin_ikn2.a()) {
            i2 = i + 1;
            iin.a((ikn) iin_ikn2.a(i));
            i = i2;
        }
        return iin;
    }
}
