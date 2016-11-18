package p000;

import java.util.Random;

final class mfp extends Random {
    private static final long serialVersionUID = 898001275432099254L;
    private boolean f27619a;

    mfp() {
        this.f27619a = false;
        this.f27619a = true;
    }

    public void setSeed(long j) {
        if (this.f27619a) {
            throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
        }
        super.setSeed(j);
    }
}
