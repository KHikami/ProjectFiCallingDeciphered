package defpackage;

import io.grpc.internal.bb;
import java.util.List;

/* compiled from: PG */
/* renamed from: dhh */
public class dhh {
    public final /* synthetic */ bb a;

    public void a(List list, dfc dfc) {
        if (list.isEmpty()) {
            a(dhn.j.a("NameResolver returned an empty list"));
            return;
        }
        try {
            this.a.m.a(list);
        } catch (Throwable th) {
            dhn b = dhn.i.b(th);
            String valueOf = String.valueOf(th);
            a(b.a(new StringBuilder(String.valueOf(valueOf).length() + 39).append("Thrown from handleResolvedAddresses(): ").append(valueOf).toString()));
        }
    }

    public void a(dhn dhn) {
        cob.a(!dhn.a(), (Object) "the error status must not be OK");
        this.a.m.a(dhn);
    }

    public dhh(bb bbVar) {
        this.a = bbVar;
    }
}
