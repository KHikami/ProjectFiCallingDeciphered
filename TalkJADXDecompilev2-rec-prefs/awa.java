package p000;

import android.content.Context;
import android.graphics.Bitmap;

public abstract class awa implements aoc<Bitmap> {
    private final ard f2421b;

    public abstract Bitmap mo397a(ard ard, Bitmap bitmap, int i, int i2);

    public awa(Context context) {
        this(ami.m2900a(context).m2902a());
    }

    private awa(ard ard) {
        this.f2421b = ard;
    }

    public final aqr<Bitmap> mo393a(aqr<Bitmap> aqr_android_graphics_Bitmap, int i, int i2) {
        if (baq.m4686a(i, i2)) {
            Bitmap bitmap = (Bitmap) aqr_android_graphics_Bitmap.mo346c();
            if (i == nzf.UNSET_ENUM_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == nzf.UNSET_ENUM_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo397a(this.f2421b, bitmap, i, i2);
            if (bitmap.equals(a)) {
                return aqr_android_graphics_Bitmap;
            }
            return avz.m4152a(a, this.f2421b);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}
