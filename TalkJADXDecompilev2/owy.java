package defpackage;

import android.content.Context;
import org.chromium.net.impl.CronetLibraryLoader;

public final class owy implements Runnable {
    final /* synthetic */ Context a;

    public owy(Context context) {
        this.a = context;
    }

    public void run() {
        CronetLibraryLoader.a(this.a);
    }
}
