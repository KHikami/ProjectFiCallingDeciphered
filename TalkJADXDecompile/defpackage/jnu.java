package defpackage;

import android.content.Context;

/* renamed from: jnu */
public final class jnu implements onc {
    private final onc<Context> a;

    public /* synthetic */ Object a() {
        return b();
    }

    public jnu(onc<Context> onc_android_content_Context) {
        this.a = onc_android_content_Context;
    }

    private jno b() {
        return (jno) bn.a(gwb.aq((Context) this.a.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
