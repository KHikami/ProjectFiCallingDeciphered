package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class DefaultNavigator implements Navigator {
    private final Context a;

    public DefaultNavigator(Context context) {
        this.a = context;
    }

    public void a(String str) {
        try {
            Intent component = Intent.parseUri(str, 1).addCategory("android.intent.category.BROWSABLE").setComponent(null);
            component.setFlags(268435456);
            this.a.startActivity(component);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "DefaultNavigator";
            String str3 = "Failed to execute action: ";
            String valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
        }
    }
}
