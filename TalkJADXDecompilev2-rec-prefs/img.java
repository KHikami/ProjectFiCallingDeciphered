package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;

final class img implements Runnable {
    final /* synthetic */ imf f18034a;

    img(imf imf) {
        this.f18034a = imf;
    }

    public void run() {
        this.f18034a.m10381e().removeCallbacks(this.f18034a.f18030g);
        long currentTimeMillis = System.currentTimeMillis();
        MediaCodec d = this.f18034a.m10379d();
        if (d != null) {
            try {
                BufferInfo bufferInfo = new BufferInfo();
                int dequeueOutputBuffer = d.dequeueOutputBuffer(bufferInfo, 0);
                if (dequeueOutputBuffer >= 0) {
                    this.f18034a.m10370a(dequeueOutputBuffer, bufferInfo);
                } else if (dequeueOutputBuffer == -2) {
                    this.f18034a.m10372a(d.getOutputFormat());
                } else if (dequeueOutputBuffer == -3) {
                    this.f18034a.f18031h = d.getOutputBuffers();
                }
                this.f18034a.m10381e().postDelayed(this.f18034a.f18030g, Math.max(0, 10 - (System.currentTimeMillis() - currentTimeMillis)));
            } catch (Exception e) {
                this.f18034a.m10374a(e);
            }
        }
    }
}
