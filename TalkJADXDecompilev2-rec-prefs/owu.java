package p000;

import org.chromium.net.CronetException;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class owu implements Runnable {
    final /* synthetic */ CronetException f34453a;
    final /* synthetic */ CronetBidirectionalStream f34454b;

    public owu(CronetBidirectionalStream cronetBidirectionalStream, CronetException cronetException) {
        this.f34454b = cronetBidirectionalStream;
        this.f34453a = cronetException;
    }

    public void run() {
        this.f34454b.a(this.f34453a);
    }
}
