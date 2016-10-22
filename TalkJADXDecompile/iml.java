import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;

final class iml implements Runnable {
    final /* synthetic */ imk a;

    iml(imk imk) {
        this.a = imk;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        MediaCodec c = this.a.c();
        if (c != null) {
            BufferInfo bufferInfo = new BufferInfo();
            try {
                int dequeueOutputBuffer = c.dequeueOutputBuffer(bufferInfo, 0);
                if (dequeueOutputBuffer >= 0) {
                    this.a.a(dequeueOutputBuffer, bufferInfo);
                } else if (dequeueOutputBuffer == -2) {
                    this.a.a(c.getOutputFormat());
                } else if (dequeueOutputBuffer == -3) {
                    this.a.c = c.getOutputBuffers();
                }
                this.a.b.postDelayed(this.a.a, Math.max(0, 10 - (System.currentTimeMillis() - currentTimeMillis)));
            } catch (IllegalStateException e) {
                this.a.a(e);
            }
        }
    }
}
