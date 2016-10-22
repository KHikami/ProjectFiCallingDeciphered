import android.content.Context;
import android.graphics.Bitmap;

public abstract class awa implements aoc<Bitmap> {
    private final ard b;

    public abstract Bitmap a(ard ard, Bitmap bitmap, int i, int i2);

    public awa(Context context) {
        this(ami.a(context).a());
    }

    private awa(ard ard) {
        this.b = ard;
    }

    public final aqr<Bitmap> a(aqr<Bitmap> aqr_android_graphics_Bitmap, int i, int i2) {
        if (baq.a(i, i2)) {
            Bitmap bitmap = (Bitmap) aqr_android_graphics_Bitmap.c();
            if (i == nzf.UNSET_ENUM_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == nzf.UNSET_ENUM_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = a(this.b, bitmap, i, i2);
            if (bitmap.equals(a)) {
                return aqr_android_graphics_Bitmap;
            }
            return avz.a(a, this.b);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }
}
