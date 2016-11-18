package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

public final class imk extends imj {
    final Runnable f18068a = new iml(this);
    final Handler f18069b;
    ByteBuffer[] f18070c;

    public imk(ijn ijn, irc irc, long j, int i, int i2, int i3, int i4, int i5, int i6, Handler handler) {
        super(ijn, irc, j, i, i2, i3, i4, i5, i6, null);
        this.f18069b = handler;
    }

    protected void mo3268a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    protected void mo3267a() {
        this.f18070c = m22290c().getOutputBuffers();
        this.f18069b.post(this.f18068a);
    }

    protected ByteBuffer mo3266a(int i) {
        return this.f18070c[i];
    }

    protected int mo3269b() {
        return -1;
    }
}
