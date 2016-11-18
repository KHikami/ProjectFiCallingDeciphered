package defpackage;

import io.grpc.internal.br;
import io.grpc.internal.y;
import java.util.List;

public class olm {
    public final okr<y> a;
    public final /* synthetic */ br b;

    public void a(List<? extends List<olt>> list, ojh ojh) {
        if (br.a(list)) {
            a(olv.q.a("NameResolver returned an empty list"));
            return;
        }
        try {
            this.a.a((List) list);
        } catch (Throwable th) {
            okr okr = this.a;
            olv b = olv.p.b(th);
            String valueOf = String.valueOf(th);
            okr.a(b.a(new StringBuilder(String.valueOf(valueOf).length() + 39).append("Thrown from handleResolvedAddresses(): ").append(valueOf).toString()));
        }
    }

    public void a(olv olv) {
        bm.a(!olv.d(), "the error status must not be OK");
        this.a.a(olv);
    }

    public olm(br brVar, okr<y> okr_io_grpc_internal_y) {
        this.b = brVar;
        this.a = okr_io_grpc_internal_y;
    }
}
