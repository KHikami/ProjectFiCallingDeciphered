package com.google.android.libraries.componentview.inject;

import bn;
import com.google.android.libraries.componentview.services.internal.ComponentInflator;
import com.google.android.libraries.componentview.services.internal.SimpleComponentInflator;
import onc;

public final class ComponentInflatorModule_ComponentInflatorFactory implements onc {
    private final ComponentInflatorModule a;
    private final onc<SimpleComponentInflator> b;

    public /* synthetic */ Object a() {
        return b();
    }

    private ComponentInflator b() {
        return (ComponentInflator) bn.a(this.a.a((SimpleComponentInflator) this.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
