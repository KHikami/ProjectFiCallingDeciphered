package defpackage;

import android.text.TextPaint;
import android.text.style.SuperscriptSpan;

/* renamed from: jyg */
public final class jyg extends SuperscriptSpan {
    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() / 4.0f);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() / 4.0f);
    }
}
