import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* compiled from: PG */
public final class vg extends CheckedTextView {
    private static final int[] a;
    private vi b;
    private wg c;

    static {
        a = new int[]{16843016};
    }

    public vg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    private vg(Context context, AttributeSet attributeSet, int i) {
        super(aae.a(context), attributeSet, 16843720);
        this.c = wg.a((TextView) this);
        this.c.a(attributeSet, 16843720);
        this.c.a();
        this.b = vi.a();
        aah a = aah.a(getContext(), attributeSet, a, 16843720, 0);
        setCheckMarkDrawable(a.a(0));
        a.a.recycle();
    }

    public final void setCheckMarkDrawable(int i) {
        if (this.b != null) {
            setCheckMarkDrawable(this.b.a(getContext(), i, false));
        } else {
            super.setCheckMarkDrawable(i);
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.a();
        }
    }
}
