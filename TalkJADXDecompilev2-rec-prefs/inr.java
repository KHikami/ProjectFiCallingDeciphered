package p000;

import com.google.android.libraries.hangouts.video.internal.VideoViewRequest;

final class inr implements Runnable {
    final /* synthetic */ inj f18163a;
    private VideoViewRequest f18164b;

    inr(inj inj) {
        this.f18163a = inj;
    }

    public void run() {
        iqo c = this.f18163a.l.m22335c();
        if (this.f18163a.f18142f == 0) {
            itx.m23277a(4, "vclib", "No ssrc for renderer; not sending ViewRequest");
            return;
        }
        int i;
        int i2;
        int i3;
        if (c.m22973o() || this.f18163a.p == null) {
            String valueOf = String.valueOf(this.f18163a.l.m22332a());
            boolean o = c.m22973o();
            String valueOf2 = String.valueOf(this.f18163a.p);
            itx.m23277a(4, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 42) + String.valueOf(valueOf2).length()).append("No view request for ").append(valueOf).append(" muted=").append(o).append(", surface=").append(valueOf2).toString());
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            int i4;
            iud a;
            if (this.f18163a.f18143g == 0) {
                i4 = 1;
            } else {
                i4 = this.f18163a.f18143g;
            }
            switch (i4) {
                case 2:
                case 3:
                    a = iks.m22202a(this.f18163a.m22386k());
                    break;
                case 4:
                    a = null;
                    break;
                default:
                    a = iks.m22203b(this.f18163a.m22386k());
                    break;
            }
            i2 = a == null ? 0 : a.m23302a().f19032a;
            if (a == null) {
                i = 0;
                i3 = i2;
            } else {
                i = a.m23304c();
                i3 = i2;
            }
        }
        VideoViewRequest videoViewRequest = new VideoViewRequest(this.f18163a.f18142f, this.f18163a.f18141e, i3, i2, i);
        if (videoViewRequest.equals(this.f18164b)) {
            itx.m23279a(3, "vclib", "Not sending duplicate request %s", videoViewRequest);
            return;
        }
        this.f18164b = videoViewRequest;
        itx.m23279a(3, "vclib", "Sending view request %s", videoViewRequest);
        this.f18163a.f18137a.m22050a(new VideoViewRequest[]{videoViewRequest});
    }
}
