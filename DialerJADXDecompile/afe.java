import android.content.Context;

/* compiled from: PG */
final class afe implements Runnable {
    private /* synthetic */ afc a;

    afe(afc afc) {
        this.a = afc;
    }

    public final void run() {
        Context context = this.a.c;
        if (adp.a == null) {
            adp.a = new adq(context);
        }
        adp.a.a(true);
    }
}
