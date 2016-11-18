package p000;

import org.chromium.base.library_loader.LegacyLinker;

public final class ouf implements Runnable {
    final /* synthetic */ long f34299a;

    public ouf(long j) {
        this.f34299a = j;
    }

    public void run() {
        LegacyLinker.nativeRunCallbackOnUiThread(this.f34299a);
    }
}
