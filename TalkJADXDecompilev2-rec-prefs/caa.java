package p000;

import android.widget.Toast;

final class caa implements Runnable {
    final /* synthetic */ int f4893a;
    final /* synthetic */ bzy f4894b;

    caa(bzy bzy, int i) {
        this.f4894b = bzy;
        this.f4893a = i;
    }

    public void run() {
        Toast.makeText(this.f4894b.c, this.f4893a, 0).show();
    }
}
