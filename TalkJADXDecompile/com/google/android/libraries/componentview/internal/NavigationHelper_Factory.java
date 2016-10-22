package com.google.android.libraries.componentview.internal;

import android.content.Context;
import com.google.android.libraries.componentview.services.application.Fetcher;
import com.google.android.libraries.componentview.services.application.Logger;
import com.google.android.libraries.componentview.services.application.Navigator;
import com.google.android.libraries.componentview.services.application.Notification;
import java.util.concurrent.Executor;
import onc;

public final class NavigationHelper_Factory implements onc {
    private final onc<Navigator> a;
    private final onc<Logger> b;
    private final onc<Notification> c;
    private final onc<Fetcher> d;
    private final onc<Executor> e;
    private final onc<Context> f;

    public /* synthetic */ Object a() {
        return b();
    }

    private NavigationHelper b() {
        return new NavigationHelper((Navigator) this.a.a(), (Logger) this.b.a(), (Notification) this.c.a(), (Fetcher) this.d.a(), (Executor) this.e.a(), (Context) this.f.a());
    }
}
