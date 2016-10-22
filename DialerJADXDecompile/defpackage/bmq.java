package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

@TargetApi(14)
/* renamed from: bmq */
final class bmq implements ActivityLifecycleCallbacks {
    private /* synthetic */ bmo a;

    bmq(bmo bmo) {
        this.a = bmo;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.a.a(activity);
    }

    public final void onActivityStopped(Activity activity) {
        this.a.b(activity);
    }
}
