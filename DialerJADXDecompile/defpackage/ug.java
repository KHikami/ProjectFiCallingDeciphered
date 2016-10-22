package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: ug */
final class ug extends vq implements uk {
    final /* synthetic */ ud a;

    public ug(ud udVar, Context context) {
        this.a = udVar;
        super(context, null, buf.z);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setOnTouchListener(new uh(this, this, udVar));
    }

    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.a.b();
        }
        return true;
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return false;
    }

    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            gr.a(background, width - max, height - max, width + max, height + max);
        }
        return frame;
    }
}
