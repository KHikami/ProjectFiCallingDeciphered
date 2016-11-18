package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

public class bn implements bl {
    public static final int f4005a = 2131558401;
    public static final int f4006b = 2131559268;
    public static final int f4007c = 2131559269;
    public static final int f4008d = 2131558462;
    public static final int f4009e = 2131559226;
    public static final int f4010f = 2131558669;
    public static final int f4011g = 2131559340;
    public static final int f4012h = 2131559341;
    public static final int f4013i = 2131559339;
    public static final int f4014j = 2131559346;
    public static final int f4015k = 2131559344;
    public static final int f4016l = 2131559348;
    public static final int f4017m = 2131559342;
    public static final int f4018n = 2131559347;
    public static final int f4019o = 2131559345;
    public static final int f4020p = 2131559349;
    public static final int f4021q = 2131559343;
    public static final int f4022r = 2131558645;
    public static final int f4023s = 2131558598;
    public static final int f4024t = 2131559073;
    public static final int f4025u = 2131558599;

    bn() {
    }

    public void mo612a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix;
        Matrix matrix2 = (Matrix) bo.f4078a.get();
        if (matrix2 == null) {
            matrix2 = new Matrix();
            bo.f4078a.set(matrix2);
            matrix = matrix2;
        } else {
            matrix2.reset();
            matrix = matrix2;
        }
        bo.m6283a(viewGroup, view, matrix);
        RectF rectF = (RectF) bo.f4079b.get();
        if (rectF == null) {
            rectF = new RectF();
            bo.f4079b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static <T> T m6214a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T m6215a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
