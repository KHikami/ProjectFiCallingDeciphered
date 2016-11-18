package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public class bcq implements ActivityLifecycleCallbacks {
    private Set<Activity> a = new HashSet();
    private Set<Activity> b = new HashSet();
    private Set<Activity> c = new HashSet();

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.a.add(activity)) {
            glk.d("Babel", "activity being created that was already created: %s", activity);
        } else if (this.a.size() == 1) {
            k_();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.c.remove(activity)) {
            glk.d("Babel", "activity being destroyed that wasn't paused: %s", activity);
        }
        if (this.b.remove(activity)) {
            glk.d("Babel", "activity being destroyed that wasn't stopped: %s", activity);
            if (this.b.isEmpty()) {
                b(activity);
            }
        }
        if (!this.a.remove(activity)) {
            glk.d("Babel", "activity being destroyed that wasn't created: %s", activity);
        } else if (this.a.isEmpty()) {
            l_();
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.a.add(activity)) {
            glk.d("Babel", "activity being started that wasn't created: %s", activity);
            if (this.a.size() == 1) {
                k_();
            }
        }
        if (!this.b.add(activity)) {
            glk.d("Babel", "activity being started that was already started: %s", activity);
        } else if (this.b.size() == 1) {
            a(activity);
        }
        c(activity);
    }

    public final void onActivityStopped(Activity activity) {
        if (this.c.remove(activity)) {
            glk.d("Babel", "activity being stopped that wasn't paused: %s", activity);
        }
        if (!this.a.contains(activity)) {
            glk.d("Babel", "activity being stopped that wasn't created: %s", activity);
        }
        if (!this.b.remove(activity)) {
            glk.d("Babel", "activity being stopped that wasn't started: %s", activity);
        } else if (this.b.isEmpty()) {
            b(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.a.add(activity)) {
            glk.d("Babel", "activity being resumed that wasn't created: %s", activity);
            if (this.a.size() == 1) {
                k_();
            }
        }
        if (this.b.add(activity)) {
            glk.d("Babel", "activity being resumed that wasn't started: %s", activity);
            if (this.b.size() == 1) {
                a(activity);
            }
        }
        if (!this.c.add(activity)) {
            glk.d("Babel", "activity being resumed that was already running: %s", activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (!this.b.contains(activity)) {
            glk.d("Babel", "activity being paused that wasn't started: %s", activity);
        }
        if (!this.a.contains(activity)) {
            glk.d("Babel", "activity being paused that wasn't created: %s", activity);
        }
        if (!this.c.remove(activity)) {
            glk.d("Babel", "activity being paused that wasn't running: %s", activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void k_() {
    }

    public void a(Activity activity) {
    }

    public void b(Activity activity) {
    }

    public void l_() {
    }

    public void c(Activity activity) {
    }
}
