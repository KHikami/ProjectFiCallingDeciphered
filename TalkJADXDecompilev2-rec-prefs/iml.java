package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;

final class iml implements Runnable {
    final /* synthetic */ imk f18071a;

    iml(imk imk) {
        this.f18071a = imk;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        MediaCodec c = this.f18071a.m22290c();
        if (c != null) {
            BufferInfo bufferInfo = new BufferInfo();
            try {
                int dequeueOutputBuffer = c.dequeueOutputBuffer(bufferInfo, 0);
                if (dequeueOutputBuffer >= 0) {
                    this.f18071a.m22283a(dequeueOutputBuffer, bufferInfo);
                } else if (dequeueOutputBuffer == -2) {
                    this.f18071a.m22285a(c.getOutputFormat());
                } else if (dequeueOutputBuffer == -3) {
                    this.f18071a.f18070c = c.getOutputBuffers();
                }
                this.f18071a.f18069b.postDelayed(this.f18071a.f18068a, Math.max(0, 10 - (System.currentTimeMillis() - currentTimeMillis)));
            } catch (IllegalStateException e) {
                this.f18071a.m22286a(e);
            }
        }
    }
}
