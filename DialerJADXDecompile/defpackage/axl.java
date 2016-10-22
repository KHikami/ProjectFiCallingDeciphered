package defpackage;

import android.graphics.Paint;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: axl */
public final class axl {
    static {
        axm axm = new axm();
    }

    public static void a(TextView textView, int i, int i2) {
        Paint paint = textView.getPaint();
        int width = textView.getWidth();
        if (width != 0) {
            textView.setTextSize(0, (float) i);
            float measureText = ((float) width) / paint.measureText(textView.getText().toString());
            if (measureText <= 1.0f) {
                textView.setTextSize(0, Math.max((float) i2, measureText * ((float) i)));
            }
        }
    }
}
