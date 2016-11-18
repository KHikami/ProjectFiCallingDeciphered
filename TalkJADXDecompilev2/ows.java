package defpackage;

import org.chromium.net.UrlResponseInfo.HeaderBlock;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class ows implements Runnable {
    final /* synthetic */ HeaderBlock a;
    final /* synthetic */ CronetBidirectionalStream b;

    public ows(CronetBidirectionalStream cronetBidirectionalStream, HeaderBlock headerBlock) {
        this.b = cronetBidirectionalStream;
        this.a = headerBlock;
    }

    public void run() {
        synchronized (this.b.c) {
            if (this.b.d()) {
                return;
            }
            try {
                this.b.a.a(this.a);
            } catch (Exception e) {
                this.b.a(e);
            }
        }
    }
}
