import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class ilz implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ MediaCodecDecoder b;

    public ilz(MediaCodecDecoder mediaCodecDecoder, int i) {
        this.b = mediaCodecDecoder;
        this.a = i;
    }

    public void run() {
        this.b.b.a(this.a);
    }
}
