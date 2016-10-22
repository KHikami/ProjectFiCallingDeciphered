import android.view.animation.Interpolator;

public final class iuy implements Interpolator {
    private float[] a;
    private float[] b;

    public iuy(float f, float f2, float f3, float f4) {
        iuz iuz = new iuz();
        iuz.a(0.0f, 0.0f);
        iuz.a(f, f2, f3, f4, 1.0f, 1.0f);
        a(iuz);
    }

    private void a(iuz iuz) {
        int i = 0;
        float[] a = iuz.a(0.002f);
        int length = a.length / 3;
        if (a[1] == 0.0f && a[2] == 0.0f && a[a.length - 2] == 1.0f && a[a.length - 1] == 1.0f) {
            this.a = new float[length];
            this.b = new float[length];
            float f = 0.0f;
            float f2 = 0.0f;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                float f3 = a[i2];
                int i4 = i3 + 1;
                float f4 = a[i3];
                i2 = i4 + 1;
                float f5 = a[i4];
                if (f3 == f && f4 != f2) {
                    throw new IllegalArgumentException("The Path cannot have discontinuity in the X axis.");
                } else if (f4 < f2) {
                    throw new IllegalArgumentException("The Path cannot loop back on itself.");
                } else {
                    this.a[i] = f4;
                    this.b[i] = f5;
                    i++;
                    f = f3;
                    f2 = f4;
                }
            }
            return;
        }
        throw new IllegalArgumentException("The Path must start at (0,0) and end at (1,1)");
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.a.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = this.a[length] - this.a[i];
        if (f2 == 0.0f) {
            return this.b[i];
        }
        float f3 = (f - this.a[i]) / f2;
        f2 = this.b[i];
        return (f3 * (this.b[length] - f2)) + f2;
    }
}
