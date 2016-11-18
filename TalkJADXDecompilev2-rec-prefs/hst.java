package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

public final class hst extends hsz {
    public hst(Context context, gui gui) {
        super(context, gui, true);
    }

    public void m20799a(ImageView imageView, hwn hwn, int i) {
        m20795a(new hsu(this, imageView, hwn, i));
    }

    protected void mo2944a(hta hta, Bitmap bitmap) {
        if (bitmap == null) {
            hta.f17217f.setImageBitmap(hst.m20797a(this.b));
        } else {
            super.mo2944a(hta, bitmap);
        }
    }

    public static Bitmap m20797a(Context context) {
        return gwb.m1978b(BitmapFactory.decodeResource(context.getResources(), gwb.xl));
    }
}
