package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;

final class irt extends StateCallback {
    final /* synthetic */ irq f18838a;

    irt(irq irq) {
        this.f18838a = irq;
    }

    public void onDisconnected(CameraDevice cameraDevice) {
        iil.m21881d();
        itx.m23277a(3, "vclib", "Camera disconnected");
        this.f18838a.m23066c(true);
    }

    public void onError(CameraDevice cameraDevice, int i) {
        iil.m21881d();
        itx.m23277a(5, "vclib", "Camera error - " + i);
        this.f18838a.m23066c(true);
        this.f18838a.m23074l();
    }

    public void onOpened(CameraDevice cameraDevice) {
        iil.m21881d();
        itx.m23277a(4, "vclib", "Camera opened");
        synchronized (this.f18838a.y) {
            this.f18838a.f18831m = cameraDevice;
            this.f18838a.f18833o = this.f18838a.mo3393f();
            try {
                this.f18838a.m23061b(((Integer) this.f18838a.f18819a.getCameraCharacteristics(this.f18838a.f18831m.getId()).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue());
            } catch (Throwable e) {
                itx.m23281a("vclib", "Failed to start capture request", e);
                this.f18838a.m23074l();
            }
        }
    }
}
