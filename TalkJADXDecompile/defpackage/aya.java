package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: aya */
public final class aya implements ayc<Bitmap, BitmapDrawable> {
    private final Resources a;
    private final ard b;

    public aya(Resources resources, ard ard) {
        this.a = (Resources) gwb.I((Object) resources);
        this.b = (ard) gwb.I((Object) ard);
    }

    public aqr<BitmapDrawable> a(aqr<Bitmap> aqr_android_graphics_Bitmap) {
        return awv.a(this.a, this.b, (Bitmap) aqr_android_graphics_Bitmap.c());
    }
}
