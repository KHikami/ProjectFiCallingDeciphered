package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: avw */
public final class avw implements aob<BitmapDrawable> {
    private final ard a;
    private final aob<Bitmap> b;

    public avw(ard ard, aob<Bitmap> aob_android_graphics_Bitmap) {
        this.a = ard;
        this.b = aob_android_graphics_Bitmap;
    }

    private boolean a(aqr<BitmapDrawable> aqr_android_graphics_drawable_BitmapDrawable, File file, anz anz) {
        return this.b.a(new avz(((BitmapDrawable) aqr_android_graphics_drawable_BitmapDrawable.c()).getBitmap(), this.a), file, anz);
    }

    public ans a(anz anz) {
        return this.b.a(anz);
    }
}
