import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

final class irs extends CaptureCallback {
    final /* synthetic */ irq a;

    irs(irq irq) {
        this.a = irq;
    }

    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        if (captureFailure.getReason() == 1) {
            itx.a(3, "vclib", "Capture failed since we are currently aborting captures.");
            return;
        }
        synchronized (this.a.y) {
            irq irq = this.a;
            irq.p++;
            if (this.a.q) {
                itx.a(6, "vclib", "Camera not in recoverable state. Closing camera.");
                gwb.a(this.a.f);
                this.a.c(true);
                this.a.l();
            } else if (this.a.p > 10) {
                itx.a(6, "vclib", "Capture failed 10 consecutive times. Reopening the camera.");
                this.a.q = true;
                this.a.v.removeCallbacks(this.a.d);
                this.a.c(false);
                this.a.m();
            }
        }
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.a.p = 0;
        if (this.a.q) {
            itx.a(4, "vclib", "Camera was able to recover. Continuing on.");
            gwb.a(this.a.e);
            this.a.q = false;
        }
    }

    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        itx.a(3, "vclib", "Capture sequence aborted.");
    }
}
