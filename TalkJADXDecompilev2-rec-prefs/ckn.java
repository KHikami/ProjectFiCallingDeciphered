package p000;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;

final class ckn implements SurfaceTextureListener {
    final /* synthetic */ ckm f5525a;

    ckn(ckm ckm) {
        this.f5525a = ckm;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        float f = 1.0f;
        this.f5525a.f5521w.setSurface(new Surface(surfaceTexture));
        this.f5525a.f5522x = (float) i;
        this.f5525a.f5523y = (float) i2;
        this.f5525a.f5524z = true;
        ckm ckm = this.f5525a;
        if (ckm.f5524z && ckm.f5514p != null) {
            float f2;
            float f3;
            if (ckm.f5514p.f5454l == 90 || ckm.f5514p.f5454l == 270) {
                f2 = (float) ckm.f5514p.f5452j;
                f3 = (float) ckm.f5514p.f5453k;
            } else {
                f2 = (float) ckm.f5514p.f5453k;
                f3 = (float) ckm.f5514p.f5452j;
            }
            f3 = f2 / f3;
            f2 = ckm.f5522x / ckm.f5523y;
            if (f3 > f2) {
                f = f3 / f2;
                f3 = 1.0f;
            } else {
                f3 = f2 / f3;
            }
            f2 = ckm.f5522x / 2.0f;
            float f4 = ckm.f5523y / 2.0f;
            Matrix matrix = new Matrix();
            matrix.setScale(f, f3, f2, f4);
            ckm.f5517s.setTransform(matrix);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        float f = 1.0f;
        this.f5525a.f5522x = (float) i;
        this.f5525a.f5523y = (float) i2;
        ckm ckm = this.f5525a;
        if (ckm.f5524z && ckm.f5514p != null) {
            float f2;
            float f3;
            if (ckm.f5514p.f5454l == 90 || ckm.f5514p.f5454l == 270) {
                f2 = (float) ckm.f5514p.f5452j;
                f3 = (float) ckm.f5514p.f5453k;
            } else {
                f2 = (float) ckm.f5514p.f5453k;
                f3 = (float) ckm.f5514p.f5452j;
            }
            f3 = f2 / f3;
            f2 = ckm.f5522x / ckm.f5523y;
            if (f3 > f2) {
                f = f3 / f2;
                f3 = 1.0f;
            } else {
                f3 = f2 / f3;
            }
            f2 = ckm.f5522x / 2.0f;
            float f4 = ckm.f5523y / 2.0f;
            Matrix matrix = new Matrix();
            matrix.setScale(f, f3, f2, f4);
            ckm.f5517s.setTransform(matrix);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f5525a.f5521w.setSurface(null);
        return true;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
