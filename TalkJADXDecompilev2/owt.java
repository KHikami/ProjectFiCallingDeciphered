package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

public final class owt implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;

    public owt(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    public void run() {
        try {
            this.a.a.b(this.a.g);
        } catch (Exception e) {
            ots.d("ChromiumNetwork", "Exception in onCanceled method", e);
        }
    }
}
