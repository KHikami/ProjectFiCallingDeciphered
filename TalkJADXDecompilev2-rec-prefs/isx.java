package p000;

import android.view.Surface;
import com.google.android.libraries.hangouts.video.sdk.ScreenVideoCapturer;

public final class isx extends itr {
    final /* synthetic */ ScreenVideoCapturer f18913a;

    public isx(ScreenVideoCapturer screenVideoCapturer) {
        this.f18913a = screenVideoCapturer;
    }

    public void mo3392a(itt itt) {
        if (this.f18913a.f8593b != itt.f19007b.get(0)) {
            this.f18913a.f8593b = (Surface) itt.f19007b.get(0);
            if (this.f18913a.f8594c == null) {
                itx.m23277a(4, "vclib", "ScreenVideoCapturer - creating virtual display");
                ScreenVideoCapturer screenVideoCapturer = this.f18913a;
                if (screenVideoCapturer.f8593b != null) {
                    iuc b = screenVideoCapturer.m10424b();
                    screenVideoCapturer.f8592a.mo3283a(new itp().m23259a(b.f19032a, b.f19033b).m23262a(true));
                    screenVideoCapturer.f8592a.mo3282a(screenVideoCapturer.m10420a().m23304c());
                }
                screenVideoCapturer.m10425c();
            }
        }
    }

    public void mo3398a() {
        this.f18913a.f8595d = null;
        ScreenVideoCapturer screenVideoCapturer = this.f18913a;
        if (screenVideoCapturer.f8593b != null) {
            iuc b = screenVideoCapturer.m10424b();
            screenVideoCapturer.f8592a.mo3283a(new itp().m23259a(b.f19032a, b.f19033b).m23262a(true));
            screenVideoCapturer.f8592a.mo3282a(screenVideoCapturer.m10420a().m23304c());
        }
        screenVideoCapturer.m10425c();
    }
}
