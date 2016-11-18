package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class aya implements ayc<Bitmap, BitmapDrawable> {
    private final Resources f2531a;
    private final ard f2532b;

    public aya(Resources resources, ard ard) {
        this.f2531a = (Resources) gwb.m1404I((Object) resources);
        this.f2532b = (ard) gwb.m1404I((Object) ard);
    }

    public aqr<BitmapDrawable> mo408a(aqr<Bitmap> aqr_android_graphics_Bitmap) {
        return awv.m4225a(this.f2531a, this.f2532b, (Bitmap) aqr_android_graphics_Bitmap.mo346c());
    }
}
