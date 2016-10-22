import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

public class bn implements bl {
    public static final int a = 2131558401;
    public static final int b = 2131559268;
    public static final int c = 2131559269;
    public static final int d = 2131558462;
    public static final int e = 2131559226;
    public static final int f = 2131558669;
    public static final int g = 2131559340;
    public static final int h = 2131559341;
    public static final int i = 2131559339;
    public static final int j = 2131559346;
    public static final int k = 2131559344;
    public static final int l = 2131559348;
    public static final int m = 2131559342;
    public static final int n = 2131559347;
    public static final int o = 2131559345;
    public static final int p = 2131559349;
    public static final int q = 2131559343;
    public static final int r = 2131558645;
    public static final int s = 2131558598;
    public static final int t = 2131559073;
    public static final int u = 2131558599;

    bn() {
    }

    public void a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix;
        Matrix matrix2 = (Matrix) bo.a.get();
        if (matrix2 == null) {
            matrix2 = new Matrix();
            bo.a.set(matrix2);
            matrix = matrix2;
        } else {
            matrix2.reset();
            matrix = matrix2;
        }
        bo.a(viewGroup, view, matrix);
        RectF rectF = (RectF) bo.b.get();
        if (rectF == null) {
            rectF = new RectF();
            bo.b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
