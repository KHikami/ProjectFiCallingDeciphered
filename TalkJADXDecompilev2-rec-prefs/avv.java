package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class avv<DataType> implements aoa<DataType, BitmapDrawable> {
    private final aoa<DataType, Bitmap> f2408a;
    private final Resources f2409b;
    private final ard f2410c;

    public avv(Resources resources, ard ard, aoa<DataType, Bitmap> aoa_DataType__android_graphics_Bitmap) {
        this.f2409b = (Resources) gwb.m1404I((Object) resources);
        this.f2410c = (ard) gwb.m1404I((Object) ard);
        this.f2408a = (aoa) gwb.m1404I((Object) aoa_DataType__android_graphics_Bitmap);
    }

    public boolean mo395a(DataType dataType, anz anz) {
        return this.f2408a.mo395a(dataType, anz);
    }

    public aqr<BitmapDrawable> mo394a(DataType dataType, int i, int i2, anz anz) {
        aqr a = this.f2408a.mo394a(dataType, i, i2, anz);
        if (a == null) {
            return null;
        }
        return awv.m4225a(this.f2409b, this.f2410c, (Bitmap) a.mo346c());
    }
}
