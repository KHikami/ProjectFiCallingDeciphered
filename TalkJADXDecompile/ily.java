import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class ily implements Runnable {
    final /* synthetic */ MediaCodecDecoder a;

    public ily(MediaCodecDecoder mediaCodecDecoder) {
        this.a = mediaCodecDecoder;
    }

    public void run() {
        this.a.d.removeCallbacks(this.a.f);
        this.a.d.postDelayed(this.a.f, 10);
        try {
            this.a.i();
        } catch (Exception e) {
            this.a.a(e);
        }
    }
}
