import android.view.View;

final class ax implements Runnable {
    final /* synthetic */ au a;
    private final View b;
    private final boolean c;

    ax(au auVar, View view, boolean z) {
        this.a = auVar;
        this.b = view;
        this.c = z;
    }

    public void run() {
        if (this.a.b != null && this.a.b.a(true)) {
            oa.a(this.b, this);
        } else if (this.c && this.a.c != null) {
            this.a.c.a(this.b);
        }
    }
}
