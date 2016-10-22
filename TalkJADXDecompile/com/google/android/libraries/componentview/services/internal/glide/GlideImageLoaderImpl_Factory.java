package com.google.android.libraries.componentview.services.internal.glide;

import android.content.Context;
import com.google.android.libraries.componentview.services.application.Fetcher;
import com.google.android.libraries.componentview.services.application.Logger;
import java.util.concurrent.ExecutorService;
import onc;

public final class GlideImageLoaderImpl_Factory implements onc {
    private final onc<Fetcher> a;
    private final onc<ExecutorService> b;
    private final onc<Context> c;
    private final onc<Logger> d;

    public /* synthetic */ Object a() {
        return b();
    }

    private GlideImageLoaderImpl b() {
        return new GlideImageLoaderImpl((Fetcher) this.a.a(), (ExecutorService) this.b.a(), (Context) this.c.a(), (Logger) this.d.a());
    }
}
