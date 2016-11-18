package p000;

import android.os.SystemClock;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams;
import java.util.List;

public final class imr implements Runnable {
    final /* synthetic */ MediaCodecSimulcastEncoder f18080a;

    public imr(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder) {
        this.f18080a = mediaCodecSimulcastEncoder;
    }

    public void run() {
        boolean z = false;
        this.f18080a.f8465g.removeCallbacks(this.f18080a.f8470l);
        if (!this.f18080a.f8463e) {
            this.f18080a.m10400g();
        } else if (!this.f18080a.m10397d()) {
            MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder = this.f18080a;
            iil.m21883f();
            List e = mediaCodecSimulcastEncoder.m10398e();
            if (e == null) {
                itx.m23277a(4, "vclib", "Native encoders have been reset.");
                mediaCodecSimulcastEncoder.f8462d = false;
                z = true;
            } else if (e.size() != mediaCodecSimulcastEncoder.f8459a.size()) {
                itx.m23277a(5, "vclib", "New number of simulcast streams forcing a reset: " + e.size());
                z = true;
            } else {
                int i = 0;
                while (i < mediaCodecSimulcastEncoder.f8459a.size()) {
                    imj imj = (imj) mediaCodecSimulcastEncoder.f8459a.get(i);
                    EncoderConfigurationOutputParams encoderConfigurationOutputParams = (EncoderConfigurationOutputParams) e.get(i);
                    if (encoderConfigurationOutputParams.nativeEncoderId != imj.m22294f()) {
                        itx.m23277a(5, "vclib", "Encoder setup has changed. Resetting.");
                        z = true;
                        break;
                    } else if (encoderConfigurationOutputParams.codecType != imj.m22295g()) {
                        itx.m23277a(5, "vclib", "Encoder codec has changed. Resetting.");
                        z = true;
                        break;
                    } else if (encoderConfigurationOutputParams.width != imj.m22296h() || encoderConfigurationOutputParams.height != imj.m22297i()) {
                        itx.m23277a(5, "vclib", "Encoder setup(resolution) has changed. Resetting.");
                        z = true;
                        break;
                    } else {
                        if (!encoderConfigurationOutputParams.requiresKeyFrame) {
                            boolean z2;
                            if (mediaCodecSimulcastEncoder.f8466h && mediaCodecSimulcastEncoder.f8461c && mediaCodecSimulcastEncoder.mo1316b() == 0 && SystemClock.elapsedRealtime() > mediaCodecSimulcastEncoder.f8464f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                imj.m22291c(encoderConfigurationOutputParams.targetBitRate);
                                i++;
                            }
                        }
                        imj.m22302n();
                        mediaCodecSimulcastEncoder.f8464f = SystemClock.elapsedRealtime() + 5000;
                        imj.m22291c(encoderConfigurationOutputParams.targetBitRate);
                        i++;
                    }
                }
            }
            if (z) {
                this.f18080a.m10400g();
            } else {
                this.f18080a.f8465g.postDelayed(this.f18080a.f8470l, 200);
            }
        }
    }
}
