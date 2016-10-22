package defpackage;

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: clu */
final class clu extends brq {
    private final LogEventParcelable f;

    clu(clo clo, LogEventParcelable logEventParcelable, brc brc) {
        super(brc);
        this.f = logEventParcelable;
    }

    protected final /* synthetic */ void b(bra bra) {
        clx clx = (clx) bra;
        cly clv = new clv(this);
        try {
            clo.b(this.f);
            ((cmb) clx.l()).a(clv, this.f);
        } catch (Throwable th) {
            Log.e("ClearcutLoggerApiImpl", "MessageNanoProducer " + this.f.f.toString() + " threw: " + th.toString());
        }
    }

    protected final /* synthetic */ brl c(Status status) {
        return status;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof clu)) {
            return false;
        }
        return this.f.equals(((clu) obj).f);
    }

    public final String toString() {
        return "MethodImpl(" + this.f + ")";
    }
}
