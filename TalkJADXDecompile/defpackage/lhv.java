package defpackage;

import android.content.Context;

/* renamed from: lhv */
public final class lhv implements onc {
    private final lhu a;

    public /* synthetic */ Object a() {
        return b();
    }

    public lhv(lhu lhu) {
        this.a = lhu;
    }

    private Context b() {
        return (Context) bn.a(this.a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
