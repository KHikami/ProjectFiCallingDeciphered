package defpackage;

import android.content.Context;
import java.util.Set;
import org.chromium.net.CronetEngine;

public final class jsc implements onc {
    private final onc<Context> a;
    private final onc<Set<jsf>> b;
    private final onc<Set<jsd>> c;

    public /* synthetic */ Object a() {
        return b();
    }

    public jsc(onc<Context> onc_android_content_Context, onc<Set<jsf>> onc_java_util_Set_jsf, onc<Set<jsd>> onc_java_util_Set_jsd) {
        this.a = onc_android_content_Context;
        this.b = onc_java_util_Set_jsf;
        this.c = onc_java_util_Set_jsd;
    }

    private CronetEngine b() {
        return (CronetEngine) bn.a(gwb.a((Context) this.a.a(), (Set) this.b.a(), (Set) this.c.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
