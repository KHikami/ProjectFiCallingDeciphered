package p000;

import android.text.TextPaint;
import android.text.style.SuperscriptSpan;

public final class jyg extends SuperscriptSpan {
    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() / 4.0f);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) (textPaint.ascent() / 4.0f);
    }
}
