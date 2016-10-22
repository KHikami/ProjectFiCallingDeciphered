package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* compiled from: PG */
/* renamed from: bhj */
final class bhj implements ActivityLifecycleCallbacks {
    bhj() {
    }

    public final void onActivityStarted(Activity activity) {
        bmo.a(new bhk(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        bmo.a(new bhl(this, activity));
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }
}
