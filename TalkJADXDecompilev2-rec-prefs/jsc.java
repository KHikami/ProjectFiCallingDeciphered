package p000;

import android.content.Context;
import java.util.Set;
import org.chromium.net.CronetEngine;

public final class jsc implements onc {
    private final onc<Context> f20972a;
    private final onc<Set<jsf>> f20973b;
    private final onc<Set<jsd>> f20974c;

    public /* synthetic */ Object mo1297a() {
        return m25155b();
    }

    public jsc(onc<Context> onc_android_content_Context, onc<Set<jsf>> onc_java_util_Set_jsf, onc<Set<jsd>> onc_java_util_Set_jsd) {
        this.f20972a = onc_android_content_Context;
        this.f20973b = onc_java_util_Set_jsf;
        this.f20974c = onc_java_util_Set_jsd;
    }

    private CronetEngine m25155b() {
        return (CronetEngine) bn.m6215a(gwb.m1728a((Context) this.f20972a.mo1297a(), (Set) this.f20973b.mo1297a(), (Set) this.f20974c.mo1297a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
