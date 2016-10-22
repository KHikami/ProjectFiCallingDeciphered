package defpackage;

import android.view.Surface;
import com.google.android.libraries.hangouts.video.sdk.ScreenVideoCapturer;

/* renamed from: isx */
public final class isx extends itr {
    final /* synthetic */ ScreenVideoCapturer a;

    public isx(ScreenVideoCapturer screenVideoCapturer) {
        this.a = screenVideoCapturer;
    }

    public void a(itt itt) {
        if (this.a.b != itt.b.get(0)) {
            this.a.b = (Surface) itt.b.get(0);
            if (this.a.c == null) {
                itx.a(4, "vclib", "ScreenVideoCapturer - creating virtual display");
                ScreenVideoCapturer screenVideoCapturer = this.a;
                if (screenVideoCapturer.b != null) {
                    iuc b = screenVideoCapturer.b();
                    screenVideoCapturer.a.a(new itp().a(b.a, b.b).a(true));
                    screenVideoCapturer.a.a(screenVideoCapturer.a().c());
                }
                screenVideoCapturer.c();
            }
        }
    }

    public void a() {
        this.a.d = null;
        ScreenVideoCapturer screenVideoCapturer = this.a;
        if (screenVideoCapturer.b != null) {
            iuc b = screenVideoCapturer.b();
            screenVideoCapturer.a.a(new itp().a(b.a, b.b).a(true));
            screenVideoCapturer.a.a(screenVideoCapturer.a().c());
        }
        screenVideoCapturer.c();
    }
}
