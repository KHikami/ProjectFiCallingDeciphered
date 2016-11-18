package p000;

import android.content.Context;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.TimeZone;

public final class gtk {
    final /* synthetic */ gti f16116a;
    private int f16117b;
    private String f16118c;
    private String f16119d;
    private String f16120e;
    private int f16121f;
    private final C0000a f16122g;
    private C0000a f16123h;
    private ArrayList<Integer> f16124i;
    private final hcw f16125j;
    private boolean f16126k;

    gtk(gti gti, byte[] bArr) {
        this(gti, bArr, null);
    }

    private gtk(gti gti, byte[] bArr, C0000a c0000a) {
        this.f16116a = gti;
        this.f16117b = this.f16116a.f16107i;
        this.f16118c = this.f16116a.f16106h;
        this.f16119d = this.f16116a.f16108j;
        this.f16120e = this.f16116a.f16109k;
        this.f16121f = this.f16116a.f16111m;
        this.f16124i = null;
        this.f16125j = new hcw();
        this.f16126k = false;
        this.f16119d = gti.f16108j;
        this.f16120e = gti.f16109k;
        this.f16125j.f16643a = gti.f16113o.mo2412a();
        this.f16125j.f16644b = gti.f16113o.mo2413b();
        hcw hcw = this.f16125j;
        gti.f16114p;
        Context g = gti.f16103e;
        if (gth.f16097a < 0) {
            gth.f16097a = g.getSharedPreferences("bootCount", 0).getInt("bootCount", 1);
        }
        hcw.f16662v = (long) gth.f16097a;
        hcw = this.f16125j;
        gti.f16115q;
        hcw.f16657q = (long) (TimeZone.getDefault().getOffset(this.f16125j.f16643a) / 1000);
        if (bArr != null) {
            this.f16125j.f16652j = bArr;
        }
        this.f16122g = null;
    }

    private LogEventParcelable m18532b() {
        return new LogEventParcelable(new PlayLoggerContext(this.f16116a.f16104f, this.f16116a.f16105g, this.f16117b, this.f16118c, this.f16119d, this.f16120e, this.f16116a.f16110l, this.f16121f), this.f16125j, this.f16122g, this.f16123h, gti.m18513a(this.f16124i));
    }

    public gtk m18533a(int i) {
        this.f16125j.f16647e = i;
        return this;
    }

    public gum<Status> m18534a() {
        if (this.f16126k) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.f16126k = true;
        return this.f16116a.f16112n.mo2459a(this.f16116a.f16103e, m18532b());
    }

    public gum<Status> m18535a(gui gui) {
        if (this.f16126k) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.f16126k = true;
        return this.f16116a.f16112n.mo2460a(gui, m18532b());
    }

    public gum<Status> m18536b(gui gui) {
        if (this.f16126k) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.f16126k = true;
        return this.f16116a.f16112n.mo2463b(gui, m18532b());
    }
}
