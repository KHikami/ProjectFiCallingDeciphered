package com.google.android.libraries.componentview.services.internal;

import com.google.android.libraries.componentview.internal.ComponentRegistry;
import com.google.android.libraries.componentview.services.application.Logger;
import onc;

public final class SimpleComponentInflator_Factory implements onc {
    private final onc<ComponentRegistry> a;
    private final onc<EventManager> b;
    private final onc<Logger> c;

    public /* synthetic */ Object a() {
        return b();
    }

    private SimpleComponentInflator b() {
        return new SimpleComponentInflator(this.a, (EventManager) this.b.a(), (Logger) this.c.a());
    }
}
