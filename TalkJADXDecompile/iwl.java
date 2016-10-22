import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class iwl implements ActivityLifecycleCallbacks {
    final List<iwa> a;
    final List<iwf> b;
    final List<iwd> c;
    final List<iwc> d;
    final List<iwg> e;
    final List<iwe> f;
    final List<iwb> g;
    final List<iwi> h;
    final List<iwh> i;
    private Boolean j;

    iwl() {
        this.a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.g = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        a("onActivityCreated", activity.getApplicationContext());
        for (iwa a : this.a) {
            a.a();
        }
    }

    public void onActivityStarted(Activity activity) {
        a("onActivityStarted", activity.getApplicationContext());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        a(activity);
    }

    public void onActivityResumed(Activity activity) {
        a("onActivityResumed", activity.getApplicationContext());
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onActivityPaused(Activity activity) {
        a("onActivityPaused", activity.getApplicationContext());
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onActivityStopped(Activity activity) {
        a("onActivityStopped", activity.getApplicationContext());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            it.next();
        }
        a(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a("onActivitySaveInstanceState", activity.getApplicationContext());
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public void onActivityDestroyed(Activity activity) {
        a("onActivityDestroyed", activity.getApplicationContext());
        for (iwb a : this.g) {
            a.a(activity);
        }
    }

    private void a(Activity activity) {
        Boolean valueOf = Boolean.valueOf(izr.b(activity.getApplicationContext()));
        if (valueOf != this.j) {
            if (valueOf.booleanValue()) {
                for (iwi a : this.h) {
                    a.a(activity);
                }
            } else {
                for (iwh a2 : this.i) {
                    a2.a(activity);
                }
            }
            this.j = valueOf;
        }
    }

    private static void a(String str, Context context) {
        if (Log.isLoggable("AppLifecycleTracker", 2)) {
            new StringBuilder(String.valueOf(str).length() + 7).append(str).append(": ").append(izr.b(context));
        }
    }
}
