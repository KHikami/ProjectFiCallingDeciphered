package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

/* renamed from: itv */
public final class itv implements SurfaceHolder {
    private final Surface a;

    public itv(Surface surface) {
        this.a = surface;
    }

    public void addCallback(Callback callback) {
    }

    public void removeCallback(Callback callback) {
    }

    public boolean isCreating() {
        return false;
    }

    public void setType(int i) {
    }

    public void setFixedSize(int i, int i2) {
    }

    public void setSizeFromLayout() {
    }

    public void setFormat(int i) {
    }

    public void setKeepScreenOn(boolean z) {
    }

    public Canvas lockCanvas() {
        return null;
    }

    public Canvas lockCanvas(Rect rect) {
        return null;
    }

    public void unlockCanvasAndPost(Canvas canvas) {
    }

    public Rect getSurfaceFrame() {
        return null;
    }

    public Surface getSurface() {
        return this.a;
    }
}
