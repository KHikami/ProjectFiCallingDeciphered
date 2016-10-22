package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* compiled from: PG */
/* renamed from: cxb */
public final class cxb {
    public final float a;
    public final Random b;

    public cxb(float f) {
        this(f, new Random(SystemClock.elapsedRealtime()));
    }

    private cxb(float f, Random random) {
        boolean z = f > 0.0f && f <= 1.0f;
        buf.c(z, (Object) "Sampling rate should be a floating number > 0 and <= 1.");
        this.a = f;
        this.b = random;
    }
}
