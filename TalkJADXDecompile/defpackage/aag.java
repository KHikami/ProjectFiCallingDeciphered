package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.TextView;
import wk;

/* renamed from: aag */
public final class aag extends CheckedTextView {
    private static final int[] a;
    private abf b;

    static {
        a = new int[]{16843016};
    }

    public aag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    private aag(Context context, AttributeSet attributeSet, int i) {
        super(afm.a(context), attributeSet, 16843720);
        this.b = abf.a((TextView) this);
        this.b.a(attributeSet, 16843720);
        this.b.a();
        afp a = afp.a(getContext(), attributeSet, a, 16843720, 0);
        setCheckMarkDrawable(a.a(0));
        a.a();
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(wk.b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.b != null) {
            this.b.a(context, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.a();
        }
    }
}
