package p000;

import android.widget.Toast;

final class gmy implements Runnable {
    final /* synthetic */ gmx f15684a;

    gmy(gmx gmx) {
        this.f15684a = gmx;
    }

    public void run() {
        if (this.f15684a.f15673e == 1 || this.f15684a.f15673e == 2 || this.f15684a.f15673e == 3) {
            Toast.makeText(this.f15684a.f15671c, this.f15684a.f15671c.getString(bc.f2966v), 0).show();
            this.f15684a.m18143j();
            this.f15684a.f15672d = null;
        }
    }
}
