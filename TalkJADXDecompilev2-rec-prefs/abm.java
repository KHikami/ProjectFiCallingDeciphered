package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

final class abm implements aex {
    final /* synthetic */ abl f167a;

    abm(abl abl) {
        this.f167a = abl;
    }

    public void mo22a(Canvas canvas, RectF rectF, float f, Paint paint) {
        float f2 = 2.0f * f;
        float width = (rectF.width() - f2) - 1.0f;
        float height = (rectF.height() - f2) - 1.0f;
        if (f >= 1.0f) {
            float f3 = f + 0.5f;
            this.f167a.f166a.set(-f3, -f3, f3, f3);
            int save = canvas.save();
            canvas.translate(rectF.left + f3, rectF.top + f3);
            canvas.drawArc(this.f167a.f166a, 180.0f, 90.0f, true, paint);
            canvas.translate(width, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.f167a.f166a, 180.0f, 90.0f, true, paint);
            canvas.translate(height, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.f167a.f166a, 180.0f, 90.0f, true, paint);
            canvas.translate(width, 0.0f);
            canvas.rotate(90.0f);
            canvas.drawArc(this.f167a.f166a, 180.0f, 90.0f, true, paint);
            canvas.restoreToCount(save);
            canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, 1.0f + (rectF.right - f3), rectF.top + f3, paint);
            canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, 1.0f + (rectF.right - f3), rectF.bottom, paint);
        }
        canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
    }
}
