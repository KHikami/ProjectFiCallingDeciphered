import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: PG */
public final class vx extends SeekBar {
    private vy a;
    private vi b;

    public vx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, buf.W);
    }

    private vx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = vi.a();
        this.a = new vy(this, this.b);
        this.a.a(attributeSet, i);
    }

    protected final void onDraw(Canvas canvas) {
        int i = 1;
        super.onDraw(canvas);
        vy vyVar = this.a;
        if (vyVar.c != null) {
            int max = vyVar.b.getMax();
            if (max > 1) {
                int intrinsicWidth = vyVar.c.getIntrinsicWidth();
                int intrinsicHeight = vyVar.c.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                vyVar.c.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                float width = ((float) ((vyVar.b.getWidth() - vyVar.b.getPaddingLeft()) - vyVar.b.getPaddingRight())) / ((float) max);
                intrinsicHeight = canvas.save();
                canvas.translate((float) vyVar.b.getPaddingLeft(), (float) (vyVar.b.getHeight() / 2));
                for (i = 0; i <= max; i++) {
                    vyVar.c.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(intrinsicHeight);
            }
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        vy vyVar = this.a;
        Drawable drawable = vyVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(vyVar.b.getDrawableState())) {
            vyVar.b.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        vy vyVar = this.a;
        if (vyVar.c != null) {
            vyVar.c.jumpToCurrentState();
        }
    }
}
