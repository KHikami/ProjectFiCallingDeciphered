package p000;

import org.chromium.net.impl.CronetUploadDataStream;

public final class oxa implements Runnable {
    final /* synthetic */ CronetUploadDataStream f34477a;

    public oxa(CronetUploadDataStream cronetUploadDataStream) {
        this.f34477a = cronetUploadDataStream;
    }

    public void run() {
        synchronized (this.f34477a.c) {
            if (this.f34477a.d == 0) {
                return;
            }
            this.f34477a.a(oxc.NOT_IN_CALLBACK);
            this.f34477a.e = oxc.REWIND;
            try {
                this.f34477a.a.mo4189a(this.f34477a);
            } catch (Throwable e) {
                this.f34477a.a(e);
            }
        }
    }
}
