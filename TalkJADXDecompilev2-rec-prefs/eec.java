package p000;

import android.widget.Toast;

final class eec implements Runnable {
    final /* synthetic */ String f11294a;
    final /* synthetic */ edv f11295b;

    eec(edv edv, String str) {
        this.f11295b = edv;
        this.f11294a = str;
    }

    public void run() {
        Toast.makeText(this.f11295b.ak, this.f11294a, 0).show();
    }
}
