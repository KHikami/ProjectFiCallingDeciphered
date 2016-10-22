import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;

final class img implements Runnable {
    final /* synthetic */ imf a;

    img(imf imf) {
        this.a = imf;
    }

    public void run() {
        this.a.e().removeCallbacks(this.a.g);
        long currentTimeMillis = System.currentTimeMillis();
        MediaCodec d = this.a.d();
        if (d != null) {
            try {
                BufferInfo bufferInfo = new BufferInfo();
                int dequeueOutputBuffer = d.dequeueOutputBuffer(bufferInfo, 0);
                if (dequeueOutputBuffer >= 0) {
                    this.a.a(dequeueOutputBuffer, bufferInfo);
                } else if (dequeueOutputBuffer == -2) {
                    this.a.a(d.getOutputFormat());
                } else if (dequeueOutputBuffer == -3) {
                    this.a.h = d.getOutputBuffers();
                }
                this.a.e().postDelayed(this.a.g, Math.max(0, 10 - (System.currentTimeMillis() - currentTimeMillis)));
            } catch (Exception e) {
                this.a.a(e);
            }
        }
    }
}
