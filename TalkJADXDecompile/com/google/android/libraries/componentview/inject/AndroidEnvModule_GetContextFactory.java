package com.google.android.libraries.componentview.inject;

import android.content.Context;
import bn;
import onc;

public final class AndroidEnvModule_GetContextFactory implements onc {
    private final AndroidEnvModule a;

    public /* synthetic */ Object a() {
        return b();
    }

    private Context b() {
        return (Context) bn.a(this.a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
