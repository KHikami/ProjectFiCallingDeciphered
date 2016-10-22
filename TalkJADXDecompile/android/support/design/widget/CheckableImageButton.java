package android.support.design.widget;

import aan;
import ab;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import gwb;
import oa;

public class CheckableImageButton extends aan implements Checkable {
    private static final int[] a;
    private boolean b;

    static {
        a = new int[]{16842912};
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gwb.T);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        oa.a(this, new ab(this));
    }

    public void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public boolean isChecked() {
        return this.b;
    }

    public void toggle() {
        setChecked(!this.b);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.b) {
            return mergeDrawableStates(super.onCreateDrawableState(a.length + i), a);
        }
        return super.onCreateDrawableState(i);
    }
}
