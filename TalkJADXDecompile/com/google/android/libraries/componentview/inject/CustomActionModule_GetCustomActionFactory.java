package com.google.android.libraries.componentview.inject;

import bn;
import com.google.android.libraries.componentview.services.application.CustomAction;
import com.google.android.libraries.componentview.services.application.DefaultCustomAction;
import onc;

public final class CustomActionModule_GetCustomActionFactory implements onc {
    private final onc<DefaultCustomAction> a;

    public /* synthetic */ Object a() {
        return b();
    }

    private CustomAction b() {
        return (CustomAction) bn.a((DefaultCustomAction) this.a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
