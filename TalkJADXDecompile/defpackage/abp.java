package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: abp */
final class abp implements aex {
    final /* synthetic */ abo a;

    abp(abo abo) {
        this.a = abo;
    }

    public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
        canvas.drawRoundRect(rectF, f, f, paint);
    }
}
