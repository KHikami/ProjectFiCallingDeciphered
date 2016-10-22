package defpackage;

import android.os.SystemClock;
import java.util.Random;

/* renamed from: izv */
public final class izv {
    private final float a;
    private final Random b;

    public izv(float f) {
        this(f, new Random(SystemClock.elapsedRealtime()));
    }

    private izv(float f, Random random) {
        boolean z = f > 0.0f && f <= 1.0f;
        ba.a(z, (Object) "Sampling rate should be a floating number > 0 and <= 1.");
        this.a = f;
        this.b = random;
    }

    public boolean a() {
        return this.a == 1.0f || this.b.nextFloat() <= this.a;
    }
}
