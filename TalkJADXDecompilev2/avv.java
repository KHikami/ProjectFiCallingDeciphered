package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

public final class avv<DataType> implements aoa<DataType, BitmapDrawable> {
    private final aoa<DataType, Bitmap> a;
    private final Resources b;
    private final ard c;

    public avv(Resources resources, ard ard, aoa<DataType, Bitmap> aoa_DataType__android_graphics_Bitmap) {
        this.b = (Resources) gwb.I((Object) resources);
        this.c = (ard) gwb.I((Object) ard);
        this.a = (aoa) gwb.I((Object) aoa_DataType__android_graphics_Bitmap);
    }

    public boolean a(DataType dataType, anz anz) {
        return this.a.a(dataType, anz);
    }

    public aqr<BitmapDrawable> a(DataType dataType, int i, int i2, anz anz) {
        aqr a = this.a.a(dataType, i, i2, anz);
        if (a == null) {
            return null;
        }
        return awv.a(this.b, this.c, (Bitmap) a.c());
    }
}
