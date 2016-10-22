package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Trace;

/* compiled from: PG */
/* renamed from: aiq */
public class aiq {
    private final TypedArray a;
    private final TypedArray b;

    public aiq(Resources resources) {
        this.a = resources.obtainTypedArray(buf.co);
        this.b = resources.obtainTypedArray(buf.cp);
    }

    private static float b(int i) {
        int i2 = (i >> 16) & 255;
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        int max = Math.max(i4, Math.max(i2, i3));
        int min = Math.min(i4, Math.min(i2, i3));
        if (max == min) {
            return 0.0f;
        }
        float f;
        float f2 = (float) (max - min);
        float f3 = ((float) (max - i2)) / f2;
        float f4 = ((float) (max - i3)) / f2;
        float f5 = ((float) (max - i4)) / f2;
        if (i2 == max) {
            f = f5 - f4;
        } else if (i3 == max) {
            f = (2.0f + f3) - f5;
        } else {
            f = (4.0f + f4) - f3;
        }
        f /= 6.0f;
        if (f < 0.0f) {
            return 1.0f + f;
        }
        return f;
    }

    public air a(int i) {
        Trace.beginSection("calculatePrimaryAndSecondaryColor");
        float b = aiq.b(i);
        int i2 = 0;
        float f = Float.MAX_VALUE;
        for (int i3 = 0; i3 < this.a.length(); i3++) {
            float abs = Math.abs(aiq.b(this.a.getColor(i3, 0)) - b);
            if (abs < f) {
                i2 = i3;
                f = abs;
            }
        }
        Trace.endSection();
        return new air(this.a.getColor(i2, 0), this.b.getColor(i2, 0));
    }
}
