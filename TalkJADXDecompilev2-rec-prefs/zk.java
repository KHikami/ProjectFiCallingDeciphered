package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;

final class zk extends aap implements zo {
    final /* synthetic */ zh f35908a;
    private final float[] f35909b = new float[2];

    public zk(zh zhVar, Context context) {
        this.f35908a = zhVar;
        super(context, null, gwb.A);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setOnTouchListener(new zl(this, this, zhVar));
    }

    public boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.f35908a.m41580d();
        }
        return true;
    }

    public boolean mo4550f() {
        return false;
    }

    public boolean mo4551g() {
        return false;
    }

    protected boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            jb.a(background, width - max, height - max, width + max, height + max);
        }
        return frame;
    }
}
