package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.util.Range;
import android.view.Surface;

/* renamed from: iru */
final class iru extends StateCallback {
    final /* synthetic */ irq a;

    iru(irq irq) {
        this.a = irq;
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        iil.d();
        itx.a(3, "vclib", "Camera capture session closed: %s", cameraCaptureSession);
        if (cameraCaptureSession == this.a.n) {
            this.a.n = null;
        }
    }

    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        iil.d();
        itx.c("vclib", "Unable to start camera capture session: %s", cameraCaptureSession);
        this.a.c(true);
        this.a.l();
    }

    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        iil.d();
        itx.a(3, "vclib", "Camera capture session configured: %s", cameraCaptureSession);
        synchronized (this.a.y) {
            if (this.a.m == null) {
                itx.a(5, "vclib", "Session configured without an open device");
                return;
            }
            try {
                String str;
                Builder createCaptureRequest = this.a.m.createCaptureRequest(3);
                if (this.a.C == 1) {
                    str = this.a.k;
                } else {
                    str = this.a.l;
                }
                Range[] rangeArr = (Range[]) this.a.a.getCameraCharacteristics(str).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                Range range = rangeArr[rangeArr.length - 1];
                int i = this.a.z.c;
                int i2;
                if (((Integer) range.getUpper()).intValue() > 1000) {
                    int i3 = i * 1000;
                    itx.a(3, "vclib", "Appears to be a LEGACY camera; multiplying fps by 1000");
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
                    itx.a(3, "vclib", "Camera FPS range: %s", range);
                    if (((Integer) range.getUpper()).intValue() > ((Integer) range2.getUpper()).intValue() || ((Integer) range.getUpper()).intValue() < r5 || (((Integer) range.getUpper()).intValue() >= ((Integer) range2.getUpper()).intValue() && ((Integer) range.getLower()).intValue() > ((Integer) range2.getLower()).intValue())) {
                        range3 = range2;
                    } else {
                        range3 = range;
                    }
                    i++;
                    range2 = range3;
                }
                itx.a("vclib", "Using camera FPS range: %s", range2);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range2);
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                createCaptureRequest.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
                for (Surface addTarget : this.a.h) {
                    createCaptureRequest.addTarget(addTarget);
                }
                cameraCaptureSession.setRepeatingRequest(createCaptureRequest.build(), this.a.c, this.a.v);
                this.a.n = cameraCaptureSession;
                itx.a(3, "vclib", "Camera capture session fully configured: %s", cameraCaptureSession);
            } catch (Throwable e) {
                itx.a("vclib", "Failed to start capture request", e);
                this.a.l();
            }
        }
    }
}
