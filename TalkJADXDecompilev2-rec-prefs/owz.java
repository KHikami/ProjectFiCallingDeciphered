package p000;

import org.chromium.net.impl.CronetUploadDataStream;

public final class owz implements Runnable {
    final /* synthetic */ CronetUploadDataStream f34474a;

    public owz(CronetUploadDataStream cronetUploadDataStream) {
        this.f34474a = cronetUploadDataStream;
    }

    public void run() {
        synchronized (this.f34474a.c) {
            if (this.f34474a.d == 0) {
                return;
            }
            this.f34474a.a(oxc.NOT_IN_CALLBACK);
            if (this.f34474a.b == null) {
                throw new IllegalStateException("Unexpected readData call. Buffer is null");
            }
            this.f34474a.e = oxc.READ;
            try {
                this.f34474a.a.mo4190a(this.f34474a, this.f34474a.b);
            } catch (Throwable e) {
                this.f34474a.a(e);
            }
        }
    }
}
