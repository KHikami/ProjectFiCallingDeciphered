package defpackage;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: lit */
public final class lit implements onc {
    private final onc<ScheduledExecutorService> a;
    private final onc<Set<Boolean>> b;

    public /* synthetic */ Object a() {
        return b();
    }

    public lit(onc<ScheduledExecutorService> onc_java_util_concurrent_ScheduledExecutorService, onc<Set<Boolean>> onc_java_util_Set_java_lang_Boolean) {
        this.a = onc_java_util_concurrent_ScheduledExecutorService;
        this.b = onc_java_util_Set_java_lang_Boolean;
    }

    private lio b() {
        return new lio((ScheduledExecutorService) this.a.a(), (Set) this.b.a());
    }
}
