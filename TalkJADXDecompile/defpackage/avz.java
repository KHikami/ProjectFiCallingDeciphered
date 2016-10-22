package defpackage;

import android.graphics.Bitmap;

/* renamed from: avz */
public final class avz implements aqr<Bitmap> {
    private final Bitmap a;
    private final ard b;

    public /* synthetic */ Object c() {
        return a();
    }

    public static avz a(Bitmap bitmap, ard ard) {
        if (bitmap == null) {
            return null;
        }
        return new avz(bitmap, ard);
    }

    public avz(Bitmap bitmap, ard ard) {
        this.a = (Bitmap) gwb.a((Object) bitmap, "Bitmap must not be null");
        this.b = (ard) gwb.a((Object) ard, "BitmapPool must not be null");
    }

    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    private Bitmap a() {
        return this.a;
    }

    public int d() {
        return baq.a(this.a);
    }

    public void e() {
        this.b.a(this.a);
    }
}
