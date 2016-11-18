package defpackage;

import android.widget.Toast;

final class caa implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bzy b;

    caa(bzy bzy, int i) {
        this.b = bzy;
        this.a = i;
    }

    public void run() {
        Toast.makeText(this.b.c, this.a, 0).show();
    }
}
