package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

public final class aaw extends SeekBar {
    private aax f68a;

    public aaw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.f880Z);
    }

    private aaw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68a = new aax(this);
        this.f68a.mo9a(attributeSet, i);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f68a.m115a(canvas);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f68a.m118c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f68a.m117b();
    }
}
