package p000;

import android.graphics.Bitmap;
import android.os.Handler;

final class axt extends azv<Bitmap> {
    final int f2518a;
    private final Handler f2519b;
    private final long f2520d;
    private Bitmap f2521e;

    public /* bridge */ /* synthetic */ void mo264a(Object obj, bac bac) {
        m4313a((Bitmap) obj);
    }

    axt(Handler handler, int i, long j) {
        this.f2519b = handler;
        this.f2518a = i;
        this.f2520d = j;
    }

    Bitmap m4314a() {
        return this.f2521e;
    }

    private void m4313a(Bitmap bitmap) {
        this.f2521e = bitmap;
        this.f2519b.sendMessageAtTime(this.f2519b.obtainMessage(1, this), this.f2520d);
    }
}
