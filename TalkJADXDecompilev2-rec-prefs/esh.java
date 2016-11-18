package p000;

import android.animation.TypeEvaluator;
import android.graphics.Color;

public final class esh implements TypeEvaluator<Integer> {
    public /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        return Integer.valueOf(Color.rgb((int) ((((float) Color.red(gwb.m1507a(num))) * (1.0f - f)) + (((float) Color.red(gwb.m1507a(num2))) * f)), (int) ((((float) Color.green(gwb.m1507a(num))) * (1.0f - f)) + (((float) Color.green(gwb.m1507a(num2))) * f)), (int) ((((float) Color.blue(gwb.m1507a(num))) * (1.0f - f)) + (((float) Color.blue(gwb.m1507a(num2))) * f))));
    }
}
