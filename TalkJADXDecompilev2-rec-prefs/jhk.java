package p000;

import android.graphics.Bitmap;

final class jhk implements jkl {
    final /* synthetic */ jhh f20109a;

    jhk(jhh jhh) {
        this.f20109a = jhh;
    }

    public Object mo3522a(jtw jtw, Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2 = null;
        if (obj instanceof Bitmap) {
            bitmap2 = (Bitmap) obj;
        } else if (obj instanceof jjz) {
            jjz jjz = (jjz) obj;
            bitmap = ((jjz) obj).f20320a;
            if (jjz.f20321b < bitmap.getWidth() || jjz.f20322c < bitmap.getHeight()) {
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, jjz.f20321b, jjz.f20322c);
            } else {
                bitmap2 = bitmap;
            }
        }
        if (bitmap2 == null) {
            return obj;
        }
        int a = ((jhi) jtw).m24226a();
        if (bitmap2.getWidth() < a || bitmap2.getHeight() < a) {
            Bitmap a2 = this.f20109a.f20065b.mo3537a(a, a);
            bitmap = kdh.m25584a(bitmap2, a, a, a2);
            if (bitmap != a2) {
                this.f20109a.f20065b.mo3540a(a2);
            }
            if (bitmap != bitmap2) {
                this.f20109a.f20065b.mo3540a(bitmap2);
                bitmap2 = bitmap;
            }
        }
        return jyd.m25407a(bitmap2);
    }
}
