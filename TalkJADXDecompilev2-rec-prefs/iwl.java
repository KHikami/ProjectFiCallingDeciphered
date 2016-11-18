package p000;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class iwl implements ActivityLifecycleCallbacks {
    final List<iwa> f19259a = new CopyOnWriteArrayList();
    final List<iwf> f19260b = new CopyOnWriteArrayList();
    final List<iwd> f19261c = new CopyOnWriteArrayList();
    final List<iwc> f19262d = new CopyOnWriteArrayList();
    final List<iwg> f19263e = new CopyOnWriteArrayList();
    final List<iwe> f19264f = new CopyOnWriteArrayList();
    final List<iwb> f19265g = new CopyOnWriteArrayList();
    final List<iwi> f19266h = new CopyOnWriteArrayList();
    final List<iwh> f19267i = new CopyOnWriteArrayList();
    private Boolean f19268j;

    iwl() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        iwl.m23396a("onActivityCreated", activity.getApplicationContext());
        for (iwa a : this.f19259a) {
            a.m23384a();
        }
    }

    public void onActivityStarted(Activity activity) {
        iwl.m23396a("onActivityStarted", activity.getApplicationContext());
        Iterator it = this.f19260b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        m23395a(activity);
    }

    public void onActivityResumed(Activity activity) {
        iwl.m23396a("onActivityResumed", activity.getApplicationContext());
        Iterator it = this.f19261c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onActivityPaused(Activity activity) {
        iwl.m23396a("onActivityPaused", activity.getApplicationContext());
        Iterator it = this.f19262d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onActivityStopped(Activity activity) {
        iwl.m23396a("onActivityStopped", activity.getApplicationContext());
        Iterator it = this.f19263e.iterator();
        while (it.hasNext()) {
            it.next();
        }
        m23395a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        iwl.m23396a("onActivitySaveInstanceState", activity.getApplicationContext());
        Iterator it = this.f19264f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        iwl.m23396a("onActivityDestroyed", activity.getApplicationContext());
        for (iwb a : this.f19265g) {
            a.mo3412a(activity);
        }
    }

    private void m23395a(Activity activity) {
        Boolean valueOf = Boolean.valueOf(izr.m23605b(activity.getApplicationContext()));
        if (valueOf != this.f19268j) {
            if (valueOf.booleanValue()) {
                for (iwi a : this.f19266h) {
                    a.m23387a(activity);
                }
            } else {
                for (iwh a2 : this.f19267i) {
                    a2.mo3413a(activity);
                }
            }
            this.f19268j = valueOf;
        }
    }

    private static void m23396a(String str, Context context) {
        if (Log.isLoggable("AppLifecycleTracker", 2)) {
            new StringBuilder(String.valueOf(str).length() + 7).append(str).append(": ").append(izr.m23605b(context));
        }
    }
}
