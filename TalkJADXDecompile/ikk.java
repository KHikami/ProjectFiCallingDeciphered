import android.os.SystemClock;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

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
        i = 0;
        int i2 = 0;
        while (i2 < iin_ikn.a() && i < iin_ikn2.a()) {
            int i3;
            if (((ikn) iin_ikn.a(i2)).b < ((ikn) iin_ikn2.a(i)).b) {
                i3 = i2 + 1;
                iin.a((ikn) iin_ikn.a(i2));
                i2 = i3;
            } else {
                i3 = i + 1;
                iin.a((ikn) iin_ikn2.a(i));
                i = i3;
            }
        }
        while (i2 < iin_ikn.a()) {
            i3 = i2 + 1;
            iin.a((ikn) iin_ikn.a(i2));
            i2 = i3;
        }
        while (i < iin_ikn2.a()) {
            i3 = i + 1;
            iin.a((ikn) iin_ikn2.a(i));
            i = i3;
        }
        return iin;
    }
}
