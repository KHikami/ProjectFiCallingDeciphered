import java.util.concurrent.TimeUnit;

final class cqt implements cqp {
    cqt() {
    }

    public float a(int i, long j, int i2, long j2) {
        if (i > i2) {
            throw new IllegalArgumentException("Share count " + i + " must be less than " + i2);
        }
        float f;
        float f2;
        if (i2 == 0) {
            f = 0.0f;
        } else {
            f = ((float) i) / ((float) i2);
        }
        if (j == 0 || j2 < j) {
            f2 = 0.0f;
        } else {
            f2 = ((float) (j2 - j)) / ((float) TimeUnit.DAYS.toMillis(1));
            f2 = f2 <= 7.0f ? (f2 * -0.071428575f) + 1.0f : f2 <= 28.0f ? (f2 * -0.023809524f) + 0.6666667f : 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, f2 * f));
    }
}
