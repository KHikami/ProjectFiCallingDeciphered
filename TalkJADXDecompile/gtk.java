import android.content.Context;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.TimeZone;

public final class gtk {
    final /* synthetic */ gti a;
    private int b;
    private String c;
    private String d;
    private String e;
    private int f;
    private final a g;
    private a h;
    private ArrayList<Integer> i;
    private final hcw j;
    private boolean k;

    gtk(gti gti, byte[] bArr) {
        this(gti, bArr, null);
    }

    private gtk(gti gti, byte[] bArr, a aVar) {
        this.a = gti;
        this.b = this.a.i;
        this.c = this.a.h;
        this.d = this.a.j;
        this.e = this.a.k;
        this.f = this.a.m;
        this.i = null;
        this.j = new hcw();
        this.k = false;
        this.d = gti.j;
        this.e = gti.k;
        this.j.a = gti.o.a();
        this.j.b = gti.o.b();
        hcw hcw = this.j;
        gti.p;
        Context g = gti.e;
        if (gth.a < 0) {
            gth.a = g.getSharedPreferences("bootCount", 0).getInt("bootCount", 1);
        }
        hcw.v = (long) gth.a;
        hcw = this.j;
        gti.q;
        hcw.q = (long) (TimeZone.getDefault().getOffset(this.j.a) / 1000);
        if (bArr != null) {
            this.j.j = bArr;
        }
        this.g = null;
    }

    private LogEventParcelable b() {
        return new LogEventParcelable(new PlayLoggerContext(this.a.f, this.a.g, this.b, this.c, this.d, this.e, this.a.l, this.f), this.j, this.g, this.h, gti.a(this.i));
    }

    public gtk a(int i) {
        this.j.e = i;
        return this;
    }

    public gum<Status> a() {
        if (this.k) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.k = true;
        return this.a.n.a(this.a.e, b());
    }

    public gum<Status> a(gui gui) {
        if (this.k) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.k = true;
        return this.a.n.a(gui, b());
    }

    public gum<Status> b(gui gui) {
        if (this.k) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.k = true;
        return this.a.n.b(gui, b());
    }
}
