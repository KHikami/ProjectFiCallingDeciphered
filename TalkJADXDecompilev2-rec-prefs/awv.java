package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class awv implements aqr<BitmapDrawable> {
    private final Bitmap f2449a;
    private final Resources f2450b;
    private final ard f2451c;

    public /* synthetic */ Object mo346c() {
        return m4224a();
    }

    public static awv m4225a(Resources resources, ard ard, Bitmap bitmap) {
        return new awv(resources, ard, bitmap);
    }

    private awv(Resources resources, ard ard, Bitmap bitmap) {
        this.f2450b = (Resources) gwb.m1404I((Object) resources);
        this.f2451c = (ard) gwb.m1404I((Object) ard);
        this.f2449a = (Bitmap) gwb.m1404I((Object) bitmap);
    }

    public Class<BitmapDrawable> mo345b() {
        return BitmapDrawable.class;
    }

    private BitmapDrawable m4224a() {
        return new BitmapDrawable(this.f2450b, this.f2449a);
    }

    public int mo347d() {
        return baq.m4681a(this.f2449a);
    }

    public void mo348e() {
        this.f2451c.mo361a(this.f2449a);
    }
}
