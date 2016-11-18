package defpackage;

import android.graphics.Bitmap;

final class jhl implements jkl {
    final /* synthetic */ jhh a;

    jhl(jhh jhh) {
        this.a = jhh;
    }

    public Object a(jtw jtw, Object obj) {
        Bitmap bitmap = null;
        if (obj instanceof Bitmap) {
            bitmap = (Bitmap) obj;
        } else if (obj instanceof jjz) {
            jjz jjz = (jjz) obj;
            Bitmap bitmap2 = ((jjz) obj).a;
            if (jjz.b < bitmap2.getWidth() || jjz.c < bitmap2.getHeight()) {
                bitmap = Bitmap.createBitmap(bitmap2, 0, 0, jjz.b, jjz.c);
            } else {
                bitmap = bitmap2;
            }
        }
        if (bitmap == null) {
            return obj;
        }
        obj = jyd.a(bitmap, gwb.an(this.a.a), this.a.b.a(bitmap.getWidth(), bitmap.getHeight()));
        this.a.b.a(bitmap);
        return obj;
    }
}
