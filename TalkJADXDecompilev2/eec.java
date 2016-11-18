package defpackage;

import android.widget.Toast;

final class eec implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ edv b;

    eec(edv edv, String str) {
        this.b = edv;
        this.a = str;
    }

    public void run() {
        Toast.makeText(this.b.ak, this.a, 0).show();
    }
}
