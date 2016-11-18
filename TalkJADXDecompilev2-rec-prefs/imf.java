package p000;

import com.google.android.libraries.hangouts.video.internal.DecoderManager;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;
import java.nio.ByteBuffer;

public final class imf extends MediaCodecDecoder {
    final Runnable f18030g = new img(this);
    ByteBuffer[] f18031h;
    private ByteBuffer[] f18032i;
    private int f18033j = -1;

    public imf(DecoderManager decoderManager, ime ime) {
        super(decoderManager, ime);
    }

    protected void mo3261a() {
        this.f18032i = m10379d().getInputBuffers();
        this.f18031h = m10379d().getOutputBuffers();
        m10381e().post(this.f18030g);
    }

    protected void mo3262b() {
        m10381e().removeCallbacks(this.f18030g);
    }

    protected ByteBuffer mo3260a(int i) {
        return this.f18032i[i];
    }

    protected int mo3264c() {
        if (this.f18033j == -1) {
            this.f18033j = m10379d().dequeueInputBuffer(0);
        }
        return this.f18033j;
    }

    protected void mo3263b(int i) {
        boolean z;
        if (i == -1 || i == this.f18033j) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        this.f18033j = -1;
    }
}
