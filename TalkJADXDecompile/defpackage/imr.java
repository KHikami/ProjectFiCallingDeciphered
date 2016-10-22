package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams;
import java.util.List;

/* renamed from: imr */
public final class imr implements Runnable {
    final /* synthetic */ MediaCodecSimulcastEncoder a;

    public imr(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder) {
        this.a = mediaCodecSimulcastEncoder;
    }

    public void run() {
        boolean z = false;
        this.a.g.removeCallbacks(this.a.l);
        if (!this.a.e) {
            this.a.g();
        } else if (!this.a.d()) {
            MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder = this.a;
            iil.f();
            List e = mediaCodecSimulcastEncoder.e();
            if (e == null) {
                itx.a(4, "vclib", "Native encoders have been reset.");
                mediaCodecSimulcastEncoder.d = false;
                z = true;
            } else if (e.size() != mediaCodecSimulcastEncoder.a.size()) {
                itx.a(5, "vclib", "New number of simulcast streams forcing a reset: " + e.size());
                z = true;
            } else {
                int i = 0;
                while (i < mediaCodecSimulcastEncoder.a.size()) {
                    imj imj = (imj) mediaCodecSimulcastEncoder.a.get(i);
                    EncoderConfigurationOutputParams encoderConfigurationOutputParams = (EncoderConfigurationOutputParams) e.get(i);
                    if (encoderConfigurationOutputParams.nativeEncoderId != imj.f()) {
                        itx.a(5, "vclib", "Encoder setup has changed. Resetting.");
                        z = true;
                        break;
                    } else if (encoderConfigurationOutputParams.codecType != imj.g()) {
                        itx.a(5, "vclib", "Encoder codec has changed. Resetting.");
                        z = true;
                        break;
                    } else if (encoderConfigurationOutputParams.width != imj.h() || encoderConfigurationOutputParams.height != imj.i()) {
                        itx.a(5, "vclib", "Encoder setup(resolution) has changed. Resetting.");
                        z = true;
                        break;
                    } else {
                        if (!encoderConfigurationOutputParams.requiresKeyFrame) {
                            boolean z2;
                            if (mediaCodecSimulcastEncoder.h && mediaCodecSimulcastEncoder.c && mediaCodecSimulcastEncoder.b() == 0 && SystemClock.elapsedRealtime() > mediaCodecSimulcastEncoder.f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                imj.c(encoderConfigurationOutputParams.targetBitRate);
                                i++;
                            }
                        }
                        imj.n();
                        mediaCodecSimulcastEncoder.f = SystemClock.elapsedRealtime() + 5000;
                        imj.c(encoderConfigurationOutputParams.targetBitRate);
                        i++;
                    }
                }
            }
            if (z) {
                this.a.g();
            } else {
                this.a.g.postDelayed(this.a.l, 200);
            }
        }
    }
}
