import android.view.View;

/* compiled from: PG */
final class zt implements Runnable {
    private /* synthetic */ View a;
    private /* synthetic */ zs b;

    zt(zs zsVar, View view) {
        this.b = zsVar;
        this.a = view;
    }

    public final void run() {
        this.b.smoothScrollTo(this.a.getLeft() - ((this.b.getWidth() - this.a.getWidth()) / 2), 0);
        this.b.a = null;
    }
}
