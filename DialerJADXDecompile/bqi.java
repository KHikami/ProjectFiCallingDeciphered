import android.content.Context;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.TimeZone;

public final class bqi {
    public final clg a;
    private int b;
    private String c;
    private String d;
    private String e;
    private int f;
    private final bqj g;
    private ArrayList h;
    private boolean i;
    private /* synthetic */ bqg j;

    bqi(bqg bqg, bqj bqj) {
        this(bqg, null, bqj);
    }

    bqi(bqg bqg, byte[] bArr) {
        this(bqg, bArr, null);
    }

    private bqi(bqg bqg, byte[] bArr, bqj bqj) {
        this.j = bqg;
        this.b = this.j.i;
        this.c = this.j.h;
        this.d = this.j.j;
        this.e = this.j.k;
        this.f = 0;
        this.h = null;
        this.a = new clg();
        this.i = false;
        this.d = bqg.j;
        this.e = bqg.k;
        this.a.c = bqg.o.a();
        this.a.d = bqg.o.b();
        clg clg = this.a;
        bqg.p;
        Context g = bqg.e;
        if (bqf.a < 0) {
            bqf.a = g.getSharedPreferences("bootCount", 0).getInt("bootCount", 1);
        }
        clg.i = (long) bqf.a;
        clg = this.a;
        bqg.q;
        clg.g = (long) (TimeZone.getDefault().getOffset(this.a.c) / 1000);
        if (bArr != null) {
            this.a.f = bArr;
        }
        this.g = bqj;
    }

    private LogEventParcelable b() {
        return new LogEventParcelable(new PlayLoggerContext(this.j.f, this.j.g, this.b, this.c, this.d, this.e, this.j.l, this.f), this.a, this.g, null, bqg.a(null));
    }

    public final bri a() {
        if (this.i) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.i = true;
        return this.j.n.a(this.j.e, b());
    }

    public final bri a(brc brc) {
        if (this.i) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.i = true;
        return this.j.n.a(brc, b());
    }
}
