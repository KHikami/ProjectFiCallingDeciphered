package defpackage;

import org.chromium.base.library_loader.LegacyLinker;

public final class ouf implements Runnable {
    final /* synthetic */ long a;

    public ouf(long j) {
        this.a = j;
    }

    public void run() {
        LegacyLinker.nativeRunCallbackOnUiThread(this.a);
    }
}
