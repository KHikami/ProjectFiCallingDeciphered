package p000;

import android.view.animation.Interpolator;

class rm implements Interpolator {
    private final float[] f35045a;
    private final float f35046b = (1.0f / ((float) (this.f35045a.length - 1)));

    public rm(float[] fArr) {
        this.f35045a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f35045a.length - 1)) * f), this.f35045a.length - 2);
        float f2 = (f - (((float) min) * this.f35046b)) / this.f35046b;
        return ((this.f35045a[min + 1] - this.f35045a[min]) * f2) + this.f35045a[min];
    }
}
