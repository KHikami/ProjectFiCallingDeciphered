package defpackage;

import android.graphics.Bitmap;

final class jhk implements jkl {
    final /* synthetic */ jhh a;

    jhk(jhh jhh) {
        this.a = jhh;
    }

    public Object a(jtw jtw, Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (obj instanceof Bitmap) {
            bitmap2 = (Bitmap) obj;
        } else if (obj instanceof jjz) {
            jjz jjz = (jjz) obj;
            bitmap = ((jjz) obj).a;
            if (jjz.b < bitmap.getWidth() || jjz.c < bitmap.getHeight()) {
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, jjz.b, jjz.c);
            } else {
                bitmap2 = bitmap;
            }
        }
        if (bitmap2 == null) {
            return obj;
        }
        int a = ((jhi) jtw).a();
        if (bitmap2.getWidth() < a || bitmap2.getHeight() < a) {
            Bitmap a2 = this.a.b.a(a, a);
            bitmap = kdh.a(bitmap2, a, a, a2);
            if (bitmap != a2) {
                this.a.b.a(a2);
            }
            if (bitmap != bitmap2) {
                this.a.b.a(bitmap2);
                bitmap2 = bitmap;
            }
        }
        return jyd.a(bitmap2);
    }
}
