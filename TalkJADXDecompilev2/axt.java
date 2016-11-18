package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;

final class axt extends azv<Bitmap> {
    final int a;
    private final Handler b;
    private final long d;
    private Bitmap e;

    public /* bridge */ /* synthetic */ void a(Object obj, bac bac) {
        a((Bitmap) obj);
    }

    axt(Handler handler, int i, long j) {
        this.b = handler;
        this.a = i;
        this.d = j;
    }

    Bitmap a() {
        return this.e;
    }

    private void a(Bitmap bitmap) {
        this.e = bitmap;
        this.b.sendMessageAtTime(this.b.obtainMessage(1, this), this.d);
    }
}
