import com.google.android.libraries.hangouts.video.internal.DecoderManager;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;
import java.nio.ByteBuffer;

public final class imf extends MediaCodecDecoder {
    final Runnable g;
    ByteBuffer[] h;
    private ByteBuffer[] i;
    private int j;

    public imf(DecoderManager decoderManager, ime ime) {
        super(decoderManager, ime);
        this.g = new img(this);
        this.j = -1;
    }

    protected void a() {
        this.i = d().getInputBuffers();
        this.h = d().getOutputBuffers();
        e().post(this.g);
    }

    protected void b() {
        e().removeCallbacks(this.g);
    }

    protected ByteBuffer a(int i) {
        return this.i[i];
    }

    protected int c() {
        if (this.j == -1) {
            this.j = d().dequeueInputBuffer(0);
        }
        return this.j;
    }

    protected void b(int i) {
        boolean z;
        if (i == -1 || i == this.j) {
            z = true;
        } else {
            z = false;
        }
        iil.a("Expected condition to be true", z);
        this.j = -1;
    }
}
