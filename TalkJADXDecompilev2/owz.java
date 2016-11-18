package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

public final class owz implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public owz(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    public void run() {
        synchronized (this.a.c) {
            if (this.a.d == 0) {
                return;
            }
            this.a.a(oxc.NOT_IN_CALLBACK);
            if (this.a.b == null) {
                throw new IllegalStateException("Unexpected readData call. Buffer is null");
            }
            this.a.e = oxc.READ;
            try {
                this.a.a.a(this.a, this.a.b);
            } catch (Throwable e) {
                this.a.a(e);
            }
        }
    }
}
