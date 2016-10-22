package com.google.android.libraries.componentview.inject;

import android.content.Context;
import bn;
import com.google.android.libraries.componentview.services.application.DefaultDialogLauncher;
import com.google.android.libraries.componentview.services.application.DialogLauncher;
import com.google.android.libraries.componentview.services.internal.ComponentInflator;
import onc;

public final class DialogLauncherModule_GetDialogLauncherFactory implements onc {
    private final onc<Context> a;
    private final onc<ComponentInflator> b;

    public /* synthetic */ Object a() {
        return b();
    }

    private DialogLauncher b() {
        return (DialogLauncher) bn.a(new DefaultDialogLauncher((Context) this.a.a(), (ComponentInflator) this.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
