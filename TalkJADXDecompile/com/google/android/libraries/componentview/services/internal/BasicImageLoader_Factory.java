package com.google.android.libraries.componentview.services.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.libraries.componentview.services.application.Fetcher;
import java.util.concurrent.Executor;
import oiv;
import onc;

public final class BasicImageLoader_Factory implements onc {
    private final onc<Fetcher> a;
    private final onc<Executor> b;
    private final onc<DisplayMetrics> c;
    private final onc<Context> d;

    public /* synthetic */ Object a() {
        return b();
    }

    private BasicImageLoader b() {
        return new BasicImageLoader((Fetcher) this.a.a(), (Executor) this.b.a(), oiv.b(this.c), (Context) this.d.a());
    }
}
