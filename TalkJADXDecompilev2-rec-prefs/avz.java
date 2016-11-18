package p000;

import android.graphics.Bitmap;

public final class avz implements aqr<Bitmap> {
    private final Bitmap f2418a;
    private final ard f2419b;

    public /* synthetic */ Object mo346c() {
        return m4151a();
    }

    public static avz m4152a(Bitmap bitmap, ard ard) {
        if (bitmap == null) {
            return null;
        }
        return new avz(bitmap, ard);
    }

    public avz(Bitmap bitmap, ard ard) {
        this.f2418a = (Bitmap) gwb.m1637a((Object) bitmap, "Bitmap must not be null");
        this.f2419b = (ard) gwb.m1637a((Object) ard, "BitmapPool must not be null");
    }

    public Class<Bitmap> mo345b() {
        return Bitmap.class;
    }

    private Bitmap m4151a() {
        return this.f2418a;
    }

    public int mo347d() {
        return baq.m4681a(this.f2418a);
    }

    public void mo348e() {
        this.f2419b.mo361a(this.f2418a);
    }
}
