package p000;

import io.grpc.internal.br;
import io.grpc.internal.y;
import java.util.List;

public class olm {
    public final okr<y> f33168a;
    public final /* synthetic */ br f33169b;

    public void m38686a(List<? extends List<olt>> list, ojh ojh) {
        if (br.a(list)) {
            m38687a(olv.q.a("NameResolver returned an empty list"));
            return;
        }
        try {
            this.f33168a.mo4173a((List) list);
        } catch (Throwable th) {
            okr okr = this.f33168a;
            olv b = olv.p.b(th);
            String valueOf = String.valueOf(th);
            okr.mo4174a(b.a(new StringBuilder(String.valueOf(valueOf).length() + 39).append("Thrown from handleResolvedAddresses(): ").append(valueOf).toString()));
        }
    }

    public void m38687a(olv olv) {
        bm.a(!olv.d(), "the error status must not be OK");
        this.f33168a.mo4174a(olv);
    }

    public olm(br brVar, okr<y> okr_io_grpc_internal_y) {
        this.f33169b = brVar;
        this.f33168a = okr_io_grpc_internal_y;
    }
}
