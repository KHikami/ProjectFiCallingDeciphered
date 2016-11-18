package p000;

import android.media.MediaCodec;
import com.google.android.libraries.hangouts.video.internal.DecoderManager;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class imh extends MediaCodecDecoder {
    final ConcurrentLinkedQueue<Integer> f18035g = new ConcurrentLinkedQueue();
    private final imi f18036h = new imi(this);

    public imh(DecoderManager decoderManager, ime ime) {
        super(decoderManager, ime);
    }

    protected void mo3265a(MediaCodec mediaCodec) {
        mediaCodec.setCallback(this.f18036h);
        this.f18035g.clear();
    }

    protected ByteBuffer mo3260a(int i) {
        return m10379d().getInputBuffer(i);
    }

    protected int mo3264c() {
        Integer num = (Integer) this.f18035g.peek();
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected void mo3263b(int i) {
        boolean z;
        if (i == -1 || i == ((Integer) this.f18035g.peek()).intValue()) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        if (i == -1) {
            this.f18035g.clear();
        } else {
            this.f18035g.poll();
        }
    }
}
