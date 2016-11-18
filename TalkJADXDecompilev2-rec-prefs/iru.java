package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.util.Range;
import android.view.Surface;

final class iru extends StateCallback {
    final /* synthetic */ irq f18839a;

    iru(irq irq) {
        this.f18839a = irq;
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        iil.m21881d();
        itx.m23279a(3, "vclib", "Camera capture session closed: %s", cameraCaptureSession);
        if (cameraCaptureSession == this.f18839a.f18832n) {
            this.f18839a.f18832n = null;
        }
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        iil.m21881d();
        itx.m23288c("vclib", "Unable to start camera capture session: %s", cameraCaptureSession);
        this.f18839a.m23066c(true);
        this.f18839a.m23074l();
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        iil.m21881d();
        itx.m23279a(3, "vclib", "Camera capture session configured: %s", cameraCaptureSession);
        synchronized (this.f18839a.y) {
            if (this.f18839a.f18831m == null) {
                itx.m23277a(5, "vclib", "Session configured without an open device");
                return;
            }
            try {
                String str;
                Builder createCaptureRequest = this.f18839a.f18831m.createCaptureRequest(3);
                if (this.f18839a.C == 1) {
                    str = this.f18839a.f18829k;
                } else {
                    str = this.f18839a.f18830l;
                }
                Range[] rangeArr = (Range[]) this.f18839a.f18819a.getCameraCharacteristics(str).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                Range range = rangeArr[rangeArr.length - 1];
                int i = this.f18839a.z.f19002c;
                int i2;
                if (((Integer) range.getUpper()).intValue() > 1000) {
                    int i3 = i * 1000;
                    itx.m23277a(3, "vclib", "Appears to be a LEGACY camera; multiplying fps by 1000");
                    i2 = i3;
                } else {
                    i2 = i;
                }
                int length = rangeArr.length;
                i = 0;
                Range range2 = range;
                while (i < length) {
                    Range range3;
                    range = rangeArr[i];
                    itx.m23279a(3, "vclib", "Camera FPS range: %s", range);
                    if (((Integer) range.getUpper()).intValue() > ((Integer) range2.getUpper()).intValue() || ((Integer) range.getUpper()).intValue() < r5 || (((Integer) range.getUpper()).intValue() >= ((Integer) range2.getUpper()).intValue() && ((Integer) range.getLower()).intValue() > ((Integer) range2.getLower()).intValue())) {
                        range3 = range2;
                    } else {
                        range3 = range;
                    }
                    i++;
                    range2 = range3;
                }
                itx.m23282a("vclib", "Using camera FPS range: %s", range2);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
                for (Surface addTarget : this.f18839a.f18826h) {
                    createCaptureRequest.addTarget(addTarget);
                }
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), this.f18839a.f18821c, this.f18839a.v);
                this.f18839a.f18832n = cameraCaptureSession;
                itx.m23279a(3, "vclib", "Camera capture session fully configured: %s", cameraCaptureSession);
            } catch (Throwable e) {
                itx.m23281a("vclib", "Failed to start capture request", e);
                this.f18839a.m23074l();
            }
        }
    }
}
