import android.view.View;

final class l implements Runnable {
    private final View a;
    private final int b;
    private /* synthetic */ j c;

    l(j jVar, View view, int i) {
        this.c = jVar;
        this.a = view;
        this.b = i;
    }

    public final void run() {
        if (this.c.e == null || !this.c.e.a(true)) {
            this.c.a(this.b);
        } else {
            kn.a(this.a, (Runnable) this);
        }
    }
}
