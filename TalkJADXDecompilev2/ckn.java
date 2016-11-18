package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;

final class ckn implements SurfaceTextureListener {
    final /* synthetic */ ckm a;

    ckn(ckm ckm) {
        this.a = ckm;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        float f = 1.0f;
        this.a.w.setSurface(new Surface(surfaceTexture));
        this.a.x = (float) i;
        this.a.y = (float) i2;
        this.a.z = true;
        ckm ckm = this.a;
        if (ckm.z && ckm.p != null) {
            float f2;
            float f3;
            if (ckm.p.l == 90 || ckm.p.l == 270) {
                f2 = (float) ckm.p.j;
                f3 = (float) ckm.p.k;
            } else {
                f2 = (float) ckm.p.k;
                f3 = (float) ckm.p.j;
            }
            f3 = f2 / f3;
            f2 = ckm.x / ckm.y;
            if (f3 > f2) {
                f = f3 / f2;
                f3 = 1.0f;
            } else {
                f3 = f2 / f3;
            }
            f2 = ckm.x / 2.0f;
            float f4 = ckm.y / 2.0f;
            Matrix matrix = new Matrix();
            matrix.setScale(f, f3, f2, f4);
            ckm.s.setTransform(matrix);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        float f = 1.0f;
        this.a.x = (float) i;
        this.a.y = (float) i2;
        ckm ckm = this.a;
        if (ckm.z && ckm.p != null) {
            float f2;
            float f3;
            if (ckm.p.l == 90 || ckm.p.l == 270) {
                f2 = (float) ckm.p.j;
                f3 = (float) ckm.p.k;
            } else {
                f2 = (float) ckm.p.k;
                f3 = (float) ckm.p.j;
            }
            f3 = f2 / f3;
            f2 = ckm.x / ckm.y;
            if (f3 > f2) {
                f = f3 / f2;
                f3 = 1.0f;
            } else {
                f3 = f2 / f3;
            }
            f2 = ckm.x / 2.0f;
            float f4 = ckm.y / 2.0f;
            Matrix matrix = new Matrix();
            matrix.setScale(f, f3, f2, f4);
            ckm.s.setTransform(matrix);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.w.setSurface(null);
        return true;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
