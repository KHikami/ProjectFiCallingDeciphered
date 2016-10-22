import android.app.Activity;

/* compiled from: PG */
final class bhl implements Runnable {
    private /* synthetic */ Activity a;

    bhl(bhj bhj, Activity activity) {
        this.a = activity;
    }

    public final void run() {
        bmo a = bmo.a(this.a);
        Activity activity = this.a;
        if (!a.e) {
            a.b(activity);
        }
    }
}
