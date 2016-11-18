package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.security.MessageDigest;

public final class avx implements aoc<BitmapDrawable> {
    private final Context f2413b;
    private final ard f2414c;
    private final aoc<Bitmap> f2415d;

    public avx(Context context, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        this(context, ami.m2900a(context).m2902a(), aoc_android_graphics_Bitmap);
    }

    private avx(Context context, ard ard, aoc<Bitmap> aoc_android_graphics_Bitmap) {
        this.f2413b = context.getApplicationContext();
        this.f2414c = (ard) gwb.m1404I((Object) ard);
        this.f2415d = (aoc) gwb.m1404I((Object) aoc_android_graphics_Bitmap);
    }

    public aqr<BitmapDrawable> mo393a(aqr<BitmapDrawable> aqr_android_graphics_drawable_BitmapDrawable, int i, int i2) {
        aqr a = avz.m4152a(((BitmapDrawable) aqr_android_graphics_drawable_BitmapDrawable.mo346c()).getBitmap(), this.f2414c);
        aqr a2 = this.f2415d.mo393a(a, i, i2);
        if (a2.equals(a)) {
            return aqr_android_graphics_drawable_BitmapDrawable;
        }
        Context context = this.f2413b;
        return awv.m4225a(context.getResources(), ami.m2900a(context).m2902a(), (Bitmap) a2.mo346c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof avx)) {
            return false;
        }
        return this.f2415d.equals(((avx) obj).f2415d);
    }

    public int hashCode() {
        return this.f2415d.hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        this.f2415d.mo308a(messageDigest);
    }
}
