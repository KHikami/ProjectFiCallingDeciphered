package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: iue */
public final class iue implements TypeEvaluator<Integer> {
    public static final iue a;

    public /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        int intValue = ((Integer) obj).intValue();
        int i = intValue >>> 24;
        int i2 = (intValue >> 16) & 255;
        int i3 = (intValue >> 8) & 255;
        intValue &= 255;
        int intValue2 = num.intValue();
        return Integer.valueOf((intValue + ((int) (((float) ((intValue2 & 255) - intValue)) * f))) | ((((i + ((int) (((float) ((intValue2 >>> 24) - i)) * f))) << 24) | ((i2 + ((int) (((float) (((intValue2 >> 16) & 255) - i2)) * f))) << 16)) | ((((int) (((float) (((intValue2 >> 8) & 255) - i3)) * f)) + i3) << 8)));
    }

    static {
        a = new iue();
    }

    private iue() {
    }
}
