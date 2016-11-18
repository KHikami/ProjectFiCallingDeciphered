package p000;

import com.google.android.libraries.hangouts.video.internal.Libjingle;

final class iju implements Runnable {
    final /* synthetic */ ijt f17827a;

    iju(ijt ijt) {
        this.f17827a = ijt;
    }

    public void run() {
        itx.m23277a(6, "vclib", "Call termination timed out");
        Libjingle.nativeAbort("Call termination timed out");
    }
}
