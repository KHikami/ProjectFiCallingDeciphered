package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.security.MessageDigest;

/* renamed from: avx */
public final class avx implements aoc<BitmapDrawable> {
    private final Context b;
    private final ard c;
    private final aoc<Bitmap> d;

    public avx(Context context, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        this(context, ami.a(context).a(), aoc_android_graphics_Bitmap);
    }

    private avx(Context context, ard ard, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        this.b = context.getApplicationContext();
        this.c = (ard) gwb.I((Object) ard);
        this.d = (aoc) gwb.I((Object) aoc_android_graphics_Bitmap);
    }

    public aqr<BitmapDrawable> a(aqr<BitmapDrawable> aqr_android_graphics_drawable_BitmapDrawable, int i, int i2) {
        aqr a = avz.a(((BitmapDrawable) aqr_android_graphics_drawable_BitmapDrawable.c()).getBitmap(), this.c);
        aqr a2 = this.d.a(a, i, i2);
        if (a2.equals(a)) {
            return aqr_android_graphics_drawable_BitmapDrawable;
        }
        Context context = this.b;
        return awv.a(context.getResources(), ami.a(context).a(), (Bitmap) a2.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof avx)) {
            return false;
        }
        return this.d.equals(((avx) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public void a(MessageDigest messageDigest) {
        this.d.a(messageDigest);
    }
}
