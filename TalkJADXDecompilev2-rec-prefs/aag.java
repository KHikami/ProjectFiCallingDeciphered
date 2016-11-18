package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.TextView;

public final class aag extends CheckedTextView {
    private static final int[] f24a = new int[]{16843016};
    private abf f25b;

    public aag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    private aag(Context context, AttributeSet attributeSet, int i) {
        super(afm.m924a(context), attributeSet, 16843720);
        this.f25b = abf.m178a((TextView) this);
        this.f25b.mo17a(attributeSet, 16843720);
        this.f25b.mo16a();
        afp a = afp.m927a(getContext(), attributeSet, f24a, 16843720, 0);
        setCheckMarkDrawable(a.m930a(0));
        a.m931a();
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(wk.b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f25b != null) {
            this.f25b.m181a(context, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f25b != null) {
            this.f25b.mo16a();
        }
    }
}
