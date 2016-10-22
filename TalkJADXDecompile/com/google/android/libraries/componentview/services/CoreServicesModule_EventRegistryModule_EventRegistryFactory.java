package com.google.android.libraries.componentview.services;

import bn;
import com.google.android.libraries.componentview.services.CoreServicesModule.EventRegistryModule;
import com.google.android.libraries.componentview.services.internal.EventRegistry;
import com.google.android.libraries.componentview.services.internal.EventRegistryImpl;
import onc;

public final class CoreServicesModule_EventRegistryModule_EventRegistryFactory implements onc {
    private final EventRegistryModule a;
    private final onc<EventRegistryImpl> b;

    public /* synthetic */ Object a() {
        return b();
    }

    private EventRegistry b() {
        return (EventRegistry) bn.a(this.a.a((EventRegistryImpl) this.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
