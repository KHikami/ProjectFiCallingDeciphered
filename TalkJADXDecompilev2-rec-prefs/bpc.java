package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.hangouts.R$drawable;

final class bpc implements boz {
    private final Resources f4142a;
    private int f4143b;
    private Bitmap f4144c;
    private Bitmap f4145d;

    bpc(Context context) {
        this.f4142a = context.getResources();
    }

    public int mo636a() {
        if (this.f4143b == 0) {
            this.f4143b = this.f4142a.getDimensionPixelSize(gwb.eZ);
        }
        return this.f4143b;
    }

    public Bitmap mo638b() {
        if (this.f4144c == null) {
            this.f4144c = Bitmap.createScaledBitmap(gkd.m17870a(R$drawable.f5932f), mo636a(), mo636a(), false);
        }
        return this.f4144c;
    }

    public Bitmap mo639c() {
        if (this.f4145d == null) {
            this.f4145d = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f4142a, R$drawable.f5932f), mo636a(), mo636a(), false);
        }
        return this.f4145d;
    }

    public boolean mo637a(Bitmap bitmap) {
        return bitmap != null && (bitmap == this.f4144c || bitmap == this.f4145d);
    }
}
