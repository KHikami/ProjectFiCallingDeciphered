package defpackage;

import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class oxm implements Runnable {
    final /* synthetic */ Builder a;
    final /* synthetic */ CronetUrlRequestContext b;

    public oxm(CronetUrlRequestContext cronetUrlRequestContext, Builder builder) {
        this.b = cronetUrlRequestContext;
        this.a = builder;
    }

    public void run() {
        CronetLibraryLoader.a(this.a.x());
        synchronized (this.b.a) {
            CronetUrlRequestContext.a(this.b, this.b.b);
        }
    }
}
