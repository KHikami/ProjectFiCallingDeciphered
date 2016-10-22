import android.os.RemoteException;
import java.util.Collections;

public final class bnt extends bpb {
    final bnv a;
    bpj b;
    private final bpf c;
    private boz d;

    protected bnt(bnp bnp) {
        super(bnp);
        this.d = new boz(bnp.c);
        this.a = new bnv(this);
        this.c = new bnu(this, bnp);
    }

    protected final void a() {
    }

    public final boolean a(bos bos) {
        buf.A((Object) bos);
        cqn.b();
        o();
        bpj bpj = this.b;
        if (bpj == null) {
            return false;
        }
        try {
            bpj.a(bos.a, bos.d, bos.f ? bom.h() : bom.i(), Collections.emptyList());
            c();
            return true;
        } catch (RemoteException e) {
            b("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    final void c() {
        this.d.a();
        this.c.a(((Long) boq.A.a()).longValue());
    }

    public final boolean b() {
        cqn.b();
        o();
        return this.b != null;
    }

    public final void d() {
        cqn.b();
        o();
        try {
            bvr.a().a(g(), this.a);
        } catch (IllegalStateException e) {
        } catch (IllegalArgumentException e2) {
        }
        if (this.b != null) {
            this.b = null;
            bni c = this.f.c();
            c.o();
            cqn.b();
            bob bob = c.a;
            cqn.b();
            bob.o();
            bob.b("Service disconnected");
        }
    }
}
