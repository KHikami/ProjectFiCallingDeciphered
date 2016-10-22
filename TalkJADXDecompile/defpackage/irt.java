package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;

/* renamed from: irt */
final class irt extends StateCallback {
    final /* synthetic */ irq a;

    irt(irq irq) {
        this.a = irq;
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        iil.d();
        itx.a(3, "vclib", "Camera disconnected");
        this.a.c(true);
    }

    public void onError(CameraDevice cameraDevice, int i) {
        iil.d();
        itx.a(5, "vclib", "Camera error - " + i);
        this.a.c(true);
        this.a.l();
    }

    public void onOpened(CameraDevice cameraDevice) {
        iil.d();
        itx.a(4, "vclib", "Camera opened");
        synchronized (this.a.y) {
            this.a.m = cameraDevice;
            this.a.o = this.a.f();
            try {
                this.a.b(((Integer) this.a.a.getCameraCharacteristics(this.a.m.getId()).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue());
            } catch (Throwable e) {
                itx.a("vclib", "Failed to start capture request", e);
                this.a.l();
            }
        }
    }
}
