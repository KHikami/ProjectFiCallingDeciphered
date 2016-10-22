package com.google.android.libraries.componentview.internal;

import com.google.android.libraries.componentview.services.application.Logger;
import com.google.android.libraries.componentview.services.internal.ComponentInflator;
import com.google.android.libraries.componentview.services.internal.DeferredImageHelper;
import java.util.concurrent.ExecutorService;
import onc;

public final class ComponentViewImpl_Factory implements onc {
    private final onc<ComponentInflator> a;
    private final onc<Logger> b;
    private final onc<DeferredImageHelper> c;
    private final onc<ExecutorService> d;

    public /* synthetic */ Object a() {
        return b();
    }

    private ComponentViewImpl b() {
        return new ComponentViewImpl((ComponentInflator) this.a.a(), (Logger) this.b.a(), (DeferredImageHelper) this.c.a(), (ExecutorService) this.d.a());
    }
}
