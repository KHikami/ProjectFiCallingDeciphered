package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class owu implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ CronetBidirectionalStream b;

    public owu(CronetBidirectionalStream cronetBidirectionalStream, CronetException cronetException) {
        this.b = cronetBidirectionalStream;
        this.a = cronetException;
    }

    public void run() {
        this.b.a(this.a);
    }
}
