import android.view.View;

final class aa implements Runnable {
    final /* synthetic */ y a;
    private final View b;
    private final int c;

    aa(y yVar, View view, int i) {
        this.a = yVar;
        this.b = view;
        this.c = i;
    }

    public void run() {
        if (this.a.e == null || !this.a.e.a(true)) {
            this.a.a(this.c);
        } else {
            oa.a(this.b, this);
        }
    }
}
