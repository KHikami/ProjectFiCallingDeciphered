package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: awv */
public final class awv implements aqr<BitmapDrawable> {
    private final Bitmap a;
    private final Resources b;
    private final ard c;

    public /* synthetic */ Object c() {
        return a();
    }

    public static awv a(Resources resources, ard ard, Bitmap bitmap) {
        return new awv(resources, ard, bitmap);
    }

    private awv(Resources resources, ard ard, Bitmap bitmap) {
        this.b = (Resources) gwb.I((Object) resources);
        this.c = (ard) gwb.I((Object) ard);
        this.a = (Bitmap) gwb.I((Object) bitmap);
    }

    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    private BitmapDrawable a() {
        return new BitmapDrawable(this.b, this.a);
    }

    public int d() {
        return baq.a(this.a);
    }

    public void e() {
        this.c.a(this.a);
    }
}
