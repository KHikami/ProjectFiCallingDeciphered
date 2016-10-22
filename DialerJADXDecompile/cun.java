import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* compiled from: PG */
final class cun implements ActivityLifecycleCallbacks {
    private /* synthetic */ cum a;

    cun(cum cum) {
        this.a = cum;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (!this.a.b.c && this.a.b.d) {
            this.a.a.a(activity, activity.getLocalClassName());
        }
    }
}
