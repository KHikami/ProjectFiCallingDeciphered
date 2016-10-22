import android.media.MediaCodec;
import com.google.android.libraries.hangouts.video.internal.DecoderManager;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class imh extends MediaCodecDecoder {
    final ConcurrentLinkedQueue<Integer> g;
    private final imi h;

    public imh(DecoderManager decoderManager, ime ime) {
        super(decoderManager, ime);
        this.h = new imi(this);
        this.g = new ConcurrentLinkedQueue();
    }

    protected void a(MediaCodec mediaCodec) {
        mediaCodec.setCallback(this.h);
        this.g.clear();
    }

    protected ByteBuffer a(int i) {
        return d().getInputBuffer(i);
    }

    protected int c() {
        Integer num = (Integer) this.g.peek();
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    protected void b(int i) {
        boolean z;
        if (i == -1 || i == ((Integer) this.g.peek()).intValue()) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        if (i == -1) {
            this.g.clear();
        } else {
            this.g.poll();
        }
    }
}
