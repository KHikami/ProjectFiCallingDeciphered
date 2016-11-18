package p000;

import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUrlRequestContext;

public final class oxm implements Runnable {
    final /* synthetic */ Builder f34502a;
    final /* synthetic */ CronetUrlRequestContext f34503b;

    public oxm(CronetUrlRequestContext cronetUrlRequestContext, Builder builder) {
        this.f34503b = cronetUrlRequestContext;
        this.f34502a = builder;
    }

    public void run() {
        CronetLibraryLoader.a(this.f34502a.x());
        synchronized (this.f34503b.a) {
            CronetUrlRequestContext.a(this.f34503b, this.f34503b.b);
        }
    }
}
