package p000;

import com.google.android.libraries.hangouts.video.internal.MediaCodecDecoder;

public final class ily implements Runnable {
    final /* synthetic */ MediaCodecDecoder f18016a;

    public ily(MediaCodecDecoder mediaCodecDecoder) {
        this.f18016a = mediaCodecDecoder;
    }

    public void run() {
        this.f18016a.f8439d.removeCallbacks(this.f18016a.f8441f);
        this.f18016a.f8439d.postDelayed(this.f18016a.f8441f, 10);
        try {
            this.f18016a.m10385i();
        } catch (Exception e) {
            this.f18016a.m10374a(e);
        }
    }
}
