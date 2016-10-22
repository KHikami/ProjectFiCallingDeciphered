package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* renamed from: bhk */
final class bhk implements Runnable {
    private /* synthetic */ Activity a;

    bhk(bhj bhj, Activity activity) {
        this.a = activity;
    }

    public final void run() {
        bmo a = bmo.a(this.a);
        Activity activity = this.a;
        if (!a.e) {
            a.a(activity);
        }
    }
}
