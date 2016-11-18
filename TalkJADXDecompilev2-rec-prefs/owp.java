package p000;

import org.chromium.net.impl.ChromiumUrlRequestContext;

public final class owp implements Runnable {
    final /* synthetic */ ChromiumUrlRequestContext f34446a;

    public owp(ChromiumUrlRequestContext chromiumUrlRequestContext) {
        this.f34446a = chromiumUrlRequestContext;
    }

    public void run() {
        ChromiumUrlRequestContext.a(this.f34446a, this.f34446a.a);
    }
}
