package p000;

import android.content.Context;
import org.chromium.net.impl.CronetLibraryLoader;

public final class owy implements Runnable {
    final /* synthetic */ Context f34473a;

    public owy(Context context) {
        this.f34473a = context;
    }

    public void run() {
        CronetLibraryLoader.a(this.f34473a);
    }
}
