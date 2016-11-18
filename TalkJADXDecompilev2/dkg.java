package defpackage;

import android.graphics.Bitmap;

final class dkg extends azv<Bitmap> {
    final /* synthetic */ dkf a;

    dkg(dkf dkf) {
        this.a = dkf;
    }

    public /* bridge */ /* synthetic */ void a(Object obj, bac bac) {
        a((Bitmap) obj);
    }

    private void a(Bitmap bitmap) {
        this.a.h.setImageBitmap(bitmap);
        this.a.f.a(this.a.a.a());
        this.a.m = bitmap;
        this.a.n = gkd.a(this.a.m);
    }
}
