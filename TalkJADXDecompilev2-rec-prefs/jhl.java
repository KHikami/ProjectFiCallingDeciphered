package p000;

import android.graphics.Bitmap;

final class jhl implements jkl {
    final /* synthetic */ jhh f20110a;

    jhl(jhh jhh) {
        this.f20110a = jhh;
    }

    public Object mo3522a(jtw jtw, Object obj) {
        Bitmap bitmap = null;
        if (obj instanceof Bitmap) {
            bitmap = (Bitmap) obj;
        } else if (obj instanceof jjz) {
            jjz jjz = (jjz) obj;
            Bitmap bitmap2 = ((jjz) obj).f20320a;
            if (jjz.f20321b < bitmap2.getWidth() || jjz.f20322c < bitmap2.getHeight()) {
                bitmap = Bitmap.createBitmap(bitmap2, 0, 0, jjz.f20321b, jjz.f20322c);
            } else {
                bitmap = bitmap2;
            }
        }
        if (bitmap == null) {
            return obj;
        }
        obj = jyd.m25409a(bitmap, gwb.an(this.f20110a.f20064a), this.f20110a.f20065b.mo3537a(bitmap.getWidth(), bitmap.getHeight()));
        this.f20110a.f20065b.mo3540a(bitmap);
        return obj;
    }
}
