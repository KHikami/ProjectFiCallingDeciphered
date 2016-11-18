package defpackage;

import org.chromium.net.impl.ChromiumUrlRequestContext;

public final class owp implements Runnable {
    final /* synthetic */ ChromiumUrlRequestContext a;

    public owp(ChromiumUrlRequestContext chromiumUrlRequestContext) {
        this.a = chromiumUrlRequestContext;
    }

    public void run() {
        ChromiumUrlRequestContext.a(this.a, this.a.a);
    }
}
