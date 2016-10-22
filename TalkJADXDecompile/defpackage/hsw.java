package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* renamed from: hsw */
public final class hsw extends hsz {
    public hsw(Context context, gui gui) {
        super(context, gui, false);
    }

    public void a(ImageView imageView, hwn hwn, int i) {
        if (gwb.a(hwn)) {
            a(new hsx(this, imageView, hwn.a(), hwn.d(), i));
        }
    }

    protected void a(hta hta, Bitmap bitmap) {
        if (bitmap == null) {
            hta.f.setImageBitmap(hsw.a(this.b));
        } else {
            super.a(hta, bitmap);
        }
    }

    public static Bitmap a(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), gwb.xk);
    }
}
