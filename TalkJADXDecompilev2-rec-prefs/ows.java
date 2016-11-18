package p000;

import org.chromium.net.UrlResponseInfo.HeaderBlock;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class ows implements Runnable {
    final /* synthetic */ HeaderBlock f34450a;
    final /* synthetic */ CronetBidirectionalStream f34451b;

    public ows(CronetBidirectionalStream cronetBidirectionalStream, HeaderBlock headerBlock) {
        this.f34451b = cronetBidirectionalStream;
        this.f34450a = headerBlock;
    }

    public void run() {
        synchronized (this.f34451b.c) {
            if (this.f34451b.d()) {
                return;
            }
            try {
                this.f34451b.a.mo4181a(this.f34450a);
            } catch (Exception e) {
                this.f34451b.a(e);
            }
        }
    }
}
