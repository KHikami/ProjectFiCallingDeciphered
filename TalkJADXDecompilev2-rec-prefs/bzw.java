package p000;

import android.widget.Toast;

final class bzw implements Runnable {
    final /* synthetic */ int f4853a;
    final /* synthetic */ bzt f4854b;

    bzw(bzt bzt, int i) {
        this.f4854b = bzt;
        this.f4853a = i;
    }

    public void run() {
        Toast.makeText(this.f4854b.c, this.f4853a, 0).show();
    }
}
