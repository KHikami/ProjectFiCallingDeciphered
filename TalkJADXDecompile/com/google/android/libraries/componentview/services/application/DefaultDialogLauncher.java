package com.google.android.libraries.componentview.services.application;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.componentview.services.internal.ComponentInflator;

public class DefaultDialogLauncher extends DialogLauncher {
    final Context a;
    private final ComponentInflator d;

    class 1 implements ActivityLifecycleCallbacks {
        final /* synthetic */ DefaultDialogLauncher a;

        1(DefaultDialogLauncher defaultDialogLauncher) {
            this.a = defaultDialogLauncher;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity == this.a.a && this.a.b()) {
                this.a.a();
            }
        }
    }

    public DefaultDialogLauncher(Context context, ComponentInflator componentInflator) {
        this.a = context;
        this.d = componentInflator;
        Activity a = a(this.a);
        if (a == null) {
            Log.e("DefaultDialogLauncher", "Unable to register ActivityLifecycleCallbacks because provided Context is not an Activity");
        } else {
            a.getApplication().registerActivityLifecycleCallbacks(new 1(this));
        }
    }

    private Activity a(Context context) {
        Context context2 = context;
        while (!(context2 instanceof Activity)) {
            if (!(context2 instanceof ContextWrapper)) {
                return null;
            }
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        return (Activity) context2;
    }
}
