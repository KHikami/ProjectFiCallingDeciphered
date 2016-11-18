package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

public final class avw implements aob<BitmapDrawable> {
    private final ard f2411a;
    private final aob<Bitmap> f2412b;

    public avw(ard ard, aob<Bitmap> aob_android_graphics_Bitmap) {
        this.f2411a = ard;
        this.f2412b = aob_android_graphics_Bitmap;
    }

    private boolean m4143a(aqr<BitmapDrawable> aqr_android_graphics_drawable_BitmapDrawable, File file, anz anz) {
        return this.f2412b.mo383a(new avz(((BitmapDrawable) aqr_android_graphics_drawable_BitmapDrawable.mo346c()).getBitmap(), this.f2411a), file, anz);
    }

    public ans mo396a(anz anz) {
        return this.f2412b.mo396a(anz);
    }
}
