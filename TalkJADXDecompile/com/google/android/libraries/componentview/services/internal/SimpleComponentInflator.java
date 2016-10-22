package com.google.android.libraries.componentview.services.internal;

import com.google.android.libraries.componentview.api.external.ComponentViewErrorCode.Error;
import com.google.android.libraries.componentview.core.ComponentInterface;
import com.google.android.libraries.componentview.internal.ComponentFactory;
import com.google.android.libraries.componentview.internal.ComponentRegistry;
import com.google.android.libraries.componentview.internal.L;
import com.google.android.libraries.componentview.services.application.Logger;
import ofd;
import onc;

public class SimpleComponentInflator implements ComponentInflator {
    private final ComponentRegistry a;
    private final Logger b;
    private EventManager c;

    public SimpleComponentInflator(onc<ComponentRegistry> onc_com_google_android_libraries_componentview_internal_ComponentRegistry, EventManager eventManager, Logger logger) {
        this.a = (ComponentRegistry) onc_com_google_android_libraries_componentview_internal_ComponentRegistry.a();
        this.c = eventManager;
        this.b = logger;
    }

    private ComponentInterface b(ofd ofd) {
        while (true) {
            ComponentFactory a = this.a.a();
            if (a != null) {
                return a.a();
            }
            int i;
            if (ofd.a == null || ofd.b == null || "".equals(ofd.b.d())) {
                i = 0;
            } else {
                i = 1;
            }
            if (i == 0) {
                L.a("SimpleComponentInflator", String.format("Unrecognized element: %s. Component not created.", new Object[]{ofd.g()}), Error.COMPONENT_INFLATION_FAILURE, this.b, null, new Object[0]);
                return null;
            } else if (ofd.a.b != null) {
                L.a("SimpleComponentInflator", String.format("Server side component: %s and its implRoot both have logInfo. Component not created.", new Object[]{ofd.g()}), Error.COMPONENT_INFLATION_FAILURE, this.b, null, new Object[0]);
                return null;
            } else {
                ofd.a.b = ofd.b;
                ofd = ofd.a;
            }
        }
    }

    public ComponentInterface a(ofd ofd) {
        ComponentInterface b = b(ofd);
        if (b != null) {
            this.c.a(b);
        }
        return b;
    }
}
