package p000;

import com.google.android.libraries.hangouts.video.internal.GlRemoteRenderer;

public final class ilk implements Runnable {
    final /* synthetic */ GlRemoteRenderer f17991a;

    public ilk(GlRemoteRenderer glRemoteRenderer) {
        this.f17991a = glRemoteRenderer;
    }

    public void run() {
        if (this.f17991a.f8408b != null) {
            this.f17991a.f8408b.release();
            this.f17991a.f8408b = null;
            this.f17991a.f8409c.release();
            this.f17991a.f8409c = null;
            int i = this.f17991a.f8407a;
            this.f17991a.f8407a = 0;
            gwb.m1387E(i);
        }
    }
}
