package defpackage;

import android.content.Context;

/* renamed from: lim */
public final class lim implements onc {
    private final onc<Context> a;
    private final onc<ihg> b;
    private final onc<idv> c;

    public /* synthetic */ Object a() {
        return b();
    }

    public lim(onc<Context> onc_android_content_Context, onc<ihg> onc_ihg, onc<idv> onc_idv) {
        this.a = onc_android_content_Context;
        this.b = onc_ihg;
        this.c = onc_idv;
    }

    private lhi b() {
        return (lhi) bn.a(gwb.a((Context) this.a.a(), (ihg) this.b.a(), (idv) this.c.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
