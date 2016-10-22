package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* renamed from: cuh */
final class cuh implements ActivityLifecycleCallbacks {
    final List a;
    final List b;
    final List c;
    final List d;
    final List e;
    final List f;
    final List g;

    cuh() {
        this.a = new CopyOnWriteArrayList();
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.f = new CopyOnWriteArrayList();
        this.g = new CopyOnWriteArrayList();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        for (ctx a : this.a) {
            a.a();
        }
    }

    public final void onActivityStarted(Activity activity) {
        for (cuc a : this.b) {
            a.a(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onActivityPaused(Activity activity) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onActivityStopped(Activity activity) {
        for (cud b : this.e) {
            b.b(activity);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
