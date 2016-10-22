package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.apps.hangouts.R$drawable;

/* renamed from: bpc */
final class bpc implements boz {
    private final Resources a;
    private int b;
    private Bitmap c;
    private Bitmap d;

    bpc(Context context) {
        this.a = context.getResources();
    }

    public int a() {
        if (this.b == 0) {
            this.b = this.a.getDimensionPixelSize(gwb.eZ);
        }
        return this.b;
    }

    public Bitmap b() {
        if (this.c == null) {
            this.c = Bitmap.createScaledBitmap(gkd.a(R$drawable.f), a(), a(), false);
        }
        return this.c;
    }

    public Bitmap c() {
        if (this.d == null) {
            this.d = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.a, R$drawable.f), a(), a(), false);
        }
        return this.d;
    }

    public boolean a(Bitmap bitmap) {
        return bitmap != null && (bitmap == this.c || bitmap == this.d);
    }
}
