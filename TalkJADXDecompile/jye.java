import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;

final class jye extends jjv<Paint> {
    jye() {
    }

    protected /* synthetic */ Object a() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Style.STROKE);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(Mode.MULTIPLY));
        return paint;
    }
}
