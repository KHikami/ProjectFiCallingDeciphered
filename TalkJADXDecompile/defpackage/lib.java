package defpackage;

import java.util.Set;

/* renamed from: lib */
public final class lib implements onc {
    private final onc<kbu> a;
    private final onc<Set<kbu>> b;

    public /* synthetic */ Object a() {
        return b();
    }

    public lib(onc<kbu> onc_kbu, onc<Set<kbu>> onc_java_util_Set_kbu) {
        this.a = onc_kbu;
        this.b = onc_java_util_Set_kbu;
    }

    private kbu b() {
        return (kbu) bn.a(gwb.a(this.a, (Set) this.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
