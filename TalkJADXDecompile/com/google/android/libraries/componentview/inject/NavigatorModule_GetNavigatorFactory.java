package com.google.android.libraries.componentview.inject;

import android.content.Context;
import bn;
import com.google.android.libraries.componentview.services.application.DefaultNavigator;
import com.google.android.libraries.componentview.services.application.Navigator;
import onc;

public final class NavigatorModule_GetNavigatorFactory implements onc {
    private final onc<Context> a;

    public /* synthetic */ Object a() {
        return b();
    }

    private Navigator b() {
        return (Navigator) bn.a(new DefaultNavigator((Context) this.a.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
