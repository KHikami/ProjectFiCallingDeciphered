package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

public final class oxa implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public oxa(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    public void run() {
        synchronized (this.a.c) {
            if (this.a.d == 0) {
                return;
            }
            this.a.a(oxc.NOT_IN_CALLBACK);
            this.a.e = oxc.REWIND;
            try {
                this.a.a.a(this.a);
            } catch (Throwable e) {
                this.a.a(e);
            }
        }
    }
}
