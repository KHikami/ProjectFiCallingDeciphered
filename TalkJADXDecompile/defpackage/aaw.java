package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: aaw */
public final class aaw extends SeekBar {
    private aax a;

    public aaw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.Z);
    }

    private aaw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new aax(this);
        this.a.a(attributeSet, i);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.a(canvas);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.a.c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.a.b();
    }
}
