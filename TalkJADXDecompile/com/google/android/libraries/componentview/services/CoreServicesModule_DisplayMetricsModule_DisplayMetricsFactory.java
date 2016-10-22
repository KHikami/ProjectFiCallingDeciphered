package com.google.android.libraries.componentview.services;

import android.content.Context;
import android.util.DisplayMetrics;
import bn;
import com.google.android.libraries.componentview.services.CoreServicesModule.DisplayMetricsModule;
import onc;

public final class CoreServicesModule_DisplayMetricsModule_DisplayMetricsFactory implements onc {
    private final DisplayMetricsModule a;
    private final onc<Context> b;

    public /* synthetic */ Object a() {
        return b();
    }

    private DisplayMetrics b() {
        return (DisplayMetrics) bn.a(this.a.a((Context) this.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
