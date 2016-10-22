package defpackage;

import java.util.Random;

/* renamed from: mfp */
final class mfp extends Random {
    private static final long serialVersionUID = 898001275432099254L;
    private boolean a;

    mfp() {
        this.a = false;
        this.a = true;
    }

    public void setSeed(long j) {
        if (this.a) {
            throw new UnsupportedOperationException("Setting the seed on the shared Random object is not permitted");
        }
        super.setSeed(j);
    }
}
