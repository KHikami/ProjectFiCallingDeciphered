package defpackage;

import android.text.TextPaint;
import android.text.style.UnderlineSpan;

public final class jyf extends UnderlineSpan {
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
