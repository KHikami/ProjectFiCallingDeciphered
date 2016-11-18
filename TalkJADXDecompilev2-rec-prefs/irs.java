package p000;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

final class irs extends CaptureCallback {
    final /* synthetic */ irq f18837a;

    irs(irq irq) {
        this.f18837a = irq;
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        if (captureFailure.getReason() == 1) {
            itx.m23277a(3, "vclib", "Capture failed since we are currently aborting captures.");
            return;
        }
        synchronized (this.f18837a.y) {
            irq irq = this.f18837a;
            irq.f18834p++;
            if (this.f18837a.f18835q) {
                itx.m23277a(6, "vclib", "Camera not in recoverable state. Closing camera.");
                gwb.m1863a(this.f18837a.f18824f);
                this.f18837a.m23066c(true);
                this.f18837a.m23074l();
            } else if (this.f18837a.f18834p > 10) {
                itx.m23277a(6, "vclib", "Capture failed 10 consecutive times. Reopening the camera.");
                this.f18837a.f18835q = true;
                this.f18837a.v.removeCallbacks(this.f18837a.f18822d);
                this.f18837a.m23066c(false);
                this.f18837a.m23075m();
            }
        }
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f18837a.f18834p = 0;
        if (this.f18837a.f18835q) {
            itx.m23277a(4, "vclib", "Camera was able to recover. Continuing on.");
            gwb.m1863a(this.f18837a.f18823e);
            this.f18837a.f18835q = false;
        }
    }

    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        itx.m23277a(3, "vclib", "Capture sequence aborted.");
    }
}
