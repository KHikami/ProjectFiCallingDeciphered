package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import onc;

public final class DefaultFetcher_Factory implements onc {
    private final onc<Context> a;
    private final onc<ExecutorService> b;

    public /* synthetic */ Object a() {
        return b();
    }

    private DefaultFetcher b() {
        return new DefaultFetcher((Context) this.a.a(), (ExecutorService) this.b.a());
    }
}
