package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

/* renamed from: imk */
public final class imk extends imj {
    final Runnable a;
    final Handler b;
    ByteBuffer[] c;

    public imk(ijn ijn, irc irc, long j, int i, int i2, int i3, int i4, int i5, int i6, Handler handler) {
        super(ijn, irc, j, i, i2, i3, i4, i5, i6, null);
        this.a = new iml(this);
        this.b = handler;
    }

    protected void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    protected void a() {
        this.c = c().getOutputBuffers();
        this.b.post(this.a);
    }

    protected ByteBuffer a(int i) {
        return this.c[i];
    }

    protected int b() {
        return -1;
    }
}
