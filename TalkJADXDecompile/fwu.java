import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils;

public final class fwu {
    private static final Typeface a;

    static {
        Typeface create;
        if (VERSION.SDK_INT >= 21) {
            create = Typeface.create("sans-serif-medium", 0);
        } else {
            create = Typeface.create("sans-serif", 1);
        }
        a = create;
    }

    public boolean a(Context context, Bitmap bitmap, String str, float f, float f2, float f3, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String ch;
        char[] toCharArray = str.toCharArray();
        int length = toCharArray.length;
        int i3 = 0;
        while (i3 < length) {
            char c = toCharArray[i3];
            if (!Character.isLetter(c)) {
                if (Character.isDigit(c)) {
                    break;
                }
                i3++;
            } else {
                ch = Character.toString(Character.toUpperCase(c));
                break;
            }
        }
        ch = null;
        if (ch == null) {
            return false;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, Mode.CLEAR);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(context.getResources().getColor(i2));
        RectF rectF = new RectF(0.0f, 0.0f, 0.0f + f3, 0.0f + f3);
        switch (fwv.a[i - 1]) {
            case wi.j /*1*/:
                canvas.drawRect(rectF, paint);
                break;
            default:
                canvas.drawOval(rectF, paint);
                break;
        }
        paint = new Paint();
        paint.setTextAlign(Align.CENTER);
        paint.setColor(context.getResources().getColor(17170443));
        paint.setTypeface(a);
        paint.setTextSize(0.6f * f3);
        paint.setAntiAlias(true);
        Rect rect = new Rect();
        paint.getTextBounds(ch, 0, 1, rect);
        canvas.drawText(ch, 0.0f + (f3 / 2.0f), (((((float) rect.bottom) + f3) - ((float) rect.top)) / 2.0f) + 0.0f, paint);
        return true;
    }
}
