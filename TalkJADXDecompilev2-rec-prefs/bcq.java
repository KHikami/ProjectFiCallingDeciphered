package p000;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public class bcq implements ActivityLifecycleCallbacks {
    private Set<Activity> f3053a = new HashSet();
    private Set<Activity> f3054b = new HashSet();
    private Set<Activity> f3055c = new HashSet();

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f3053a.add(activity)) {
            glk.m17981d("Babel", "activity being created that was already created: %s", activity);
        } else if (this.f3053a.size() == 1) {
            k_();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (this.f3055c.remove(activity)) {
            glk.m17981d("Babel", "activity being destroyed that wasn't paused: %s", activity);
        }
        if (this.f3054b.remove(activity)) {
            glk.m17981d("Babel", "activity being destroyed that wasn't stopped: %s", activity);
            if (this.f3054b.isEmpty()) {
                mo467b(activity);
            }
        }
        if (!this.f3053a.remove(activity)) {
            glk.m17981d("Babel", "activity being destroyed that wasn't created: %s", activity);
        } else if (this.f3053a.isEmpty()) {
            l_();
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f3053a.add(activity)) {
            glk.m17981d("Babel", "activity being started that wasn't created: %s", activity);
            if (this.f3053a.size() == 1) {
                k_();
            }
        }
        if (!this.f3054b.add(activity)) {
            glk.m17981d("Babel", "activity being started that was already started: %s", activity);
        } else if (this.f3054b.size() == 1) {
            mo465a(activity);
        }
        mo2023c(activity);
    }

    public final void onActivityStopped(Activity activity) {
        if (this.f3055c.remove(activity)) {
            glk.m17981d("Babel", "activity being stopped that wasn't paused: %s", activity);
        }
        if (!this.f3053a.contains(activity)) {
            glk.m17981d("Babel", "activity being stopped that wasn't created: %s", activity);
        }
        if (!this.f3054b.remove(activity)) {
            glk.m17981d("Babel", "activity being stopped that wasn't started: %s", activity);
        } else if (this.f3054b.isEmpty()) {
            mo467b(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        if (this.f3053a.add(activity)) {
            glk.m17981d("Babel", "activity being resumed that wasn't created: %s", activity);
            if (this.f3053a.size() == 1) {
                k_();
            }
        }
        if (this.f3054b.add(activity)) {
            glk.m17981d("Babel", "activity being resumed that wasn't started: %s", activity);
            if (this.f3054b.size() == 1) {
                mo465a(activity);
            }
        }
        if (!this.f3055c.add(activity)) {
            glk.m17981d("Babel", "activity being resumed that was already running: %s", activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        if (!this.f3054b.contains(activity)) {
            glk.m17981d("Babel", "activity being paused that wasn't started: %s", activity);
        }
        if (!this.f3053a.contains(activity)) {
            glk.m17981d("Babel", "activity being paused that wasn't created: %s", activity);
        }
        if (!this.f3055c.remove(activity)) {
            glk.m17981d("Babel", "activity being paused that wasn't running: %s", activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void k_() {
    }

    public void mo465a(Activity activity) {
    }

    public void mo467b(Activity activity) {
    }

    public void l_() {
    }

    public void mo2023c(Activity activity) {
    }
}
