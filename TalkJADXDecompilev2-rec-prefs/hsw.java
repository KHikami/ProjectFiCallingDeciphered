package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

public final class hsw extends hsz {
    public hsw(Context context, gui gui) {
        super(context, gui, false);
    }

    public void m20807a(ImageView imageView, hwn hwn, int i) {
        if (gwb.m1927a(hwn)) {
            m20795a(new hsx(this, imageView, hwn.mo1778a(), hwn.mo1781d(), i));
        }
    }

    protected void mo2944a(hta hta, Bitmap bitmap) {
        if (bitmap == null) {
            hta.f17217f.setImageBitmap(hsw.m20806a(this.b));
        } else {
            super.mo2944a(hta, bitmap);
        }
    }

    public static Bitmap m20806a(Context context) {
        return BitmapFactory.decodeResource(context.getResources(), gwb.xk);
    }
}
