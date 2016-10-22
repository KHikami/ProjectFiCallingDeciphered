package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: brq */
public abstract class brq extends brw implements brr, bsx {
    final brb a;
    private AtomicReference f;

    public brq(brb brb, brc brc) {
        super((brc) buf.d((Object) brc, (Object) "GoogleApiClient must not be null"));
        this.f = new AtomicReference();
        this.a = (brb) buf.A((Object) brb);
    }

    private final void a(RemoteException remoteException) {
        a(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public final void a(bra bra) {
        try {
            b(bra);
        } catch (RemoteException e) {
            a(e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    public final void a(bsw bsw) {
        this.f.set(bsw);
    }

    public final void a(Status status) {
        buf.b(!status.b(), (Object) "Failed result must not be success");
        a(c(status));
    }

    public final /* synthetic */ void a(Object obj) {
        super.a((brl) obj);
    }

    public final brb b() {
        return this.a;
    }

    public abstract void b(bra bra);

    public final void c() {
        a(null);
    }

    protected final void d() {
        bsw bsw = (bsw) this.f.getAndSet(null);
        if (bsw != null) {
            bsw.a(this);
        }
    }

    public brq(brc brc) {
        this(bqg.a, brc);
    }

    public brq(brc brc, byte b) {
        this(cre.a, brc);
    }

    public brq(brc brc, char c) {
        this(coo.a, brc);
    }
}
