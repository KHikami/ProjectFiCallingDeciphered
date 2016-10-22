import android.media.MediaFormat;
import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class ilv implements Runnable {
    final /* synthetic */ MediaFormat a;
    final /* synthetic */ MediaCodecDecoder b;

    public ilv(MediaCodecDecoder mediaCodecDecoder, MediaFormat mediaFormat) {
        this.b = mediaCodecDecoder;
        this.a = mediaFormat;
    }

    public void run() {
        this.b.b.a(this.a);
    }
}
