package defpackage;

import android.widget.Toast;

/* renamed from: bzw */
final class bzw implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bzt b;

    bzw(bzt bzt, int i) {
        this.b = bzt;
        this.a = i;
    }

    public void run() {
        Toast.makeText(this.b.c, this.a, 0).show();
    }
}
