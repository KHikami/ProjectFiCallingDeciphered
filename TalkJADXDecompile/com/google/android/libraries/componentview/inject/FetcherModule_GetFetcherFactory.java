package com.google.android.libraries.componentview.inject;

import android.content.Context;
import bn;
import com.google.android.libraries.componentview.services.application.DefaultFetcher;
import com.google.android.libraries.componentview.services.application.Fetcher;
import java.util.concurrent.ExecutorService;
import onc;

public final class FetcherModule_GetFetcherFactory implements onc {
    private final onc<Context> a;
    private final onc<ExecutorService> b;

    public /* synthetic */ Object a() {
        return b();
    }

    private Fetcher b() {
        return (Fetcher) bn.a(new DefaultFetcher((Context) this.a.a(), (ExecutorService) this.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
