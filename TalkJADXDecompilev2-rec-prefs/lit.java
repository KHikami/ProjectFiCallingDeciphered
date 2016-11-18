package p000;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

public final class lit implements onc {
    private final onc<ScheduledExecutorService> f25061a;
    private final onc<Set<Boolean>> f25062b;

    public /* synthetic */ Object mo1297a() {
        return m29110b();
    }

    public lit(onc<ScheduledExecutorService> onc_java_util_concurrent_ScheduledExecutorService, onc<Set<Boolean>> onc_java_util_Set_java_lang_Boolean) {
        this.f25061a = onc_java_util_concurrent_ScheduledExecutorService;
        this.f25062b = onc_java_util_Set_java_lang_Boolean;
    }

    private lio m29110b() {
        return new lio((ScheduledExecutorService) this.f25061a.mo1297a(), (Set) this.f25062b.mo1297a());
    }
}
