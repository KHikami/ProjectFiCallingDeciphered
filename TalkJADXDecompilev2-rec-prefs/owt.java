package p000;

import org.chromium.net.impl.CronetBidirectionalStream;

public final class owt implements Runnable {
    final /* synthetic */ CronetBidirectionalStream f34452a;

    public owt(CronetBidirectionalStream cronetBidirectionalStream) {
        this.f34452a = cronetBidirectionalStream;
    }

    public void run() {
        try {
            this.f34452a.a.mo4183b(this.f34452a.g);
        } catch (Exception e) {
            ots.m39717d("ChromiumNetwork", "Exception in onCanceled method", e);
        }
    }
}
