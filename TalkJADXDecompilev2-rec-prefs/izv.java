package p000;

import android.os.SystemClock;
import java.util.Random;

public final class izv {
    private final float f19501a;
    private final Random f19502b;

    public izv(float f) {
        this(f, new Random(SystemClock.elapsedRealtime()));
    }

    private izv(float f, Random random) {
        boolean z = f > 0.0f && f <= 1.0f;
        ba.m4578a(z, (Object) "Sampling rate should be a floating number > 0 and <= 1.");
        this.f19501a = f;
        this.f19502b = random;
    }

    public boolean m23611a() {
        return this.f19501a == 1.0f || this.f19502b.nextFloat() <= this.f19501a;
    }
}
