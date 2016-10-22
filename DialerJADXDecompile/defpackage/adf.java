package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/* compiled from: PG */
/* renamed from: adf */
public class adf extends ListView {
    private int a;

    public adf(Context context) {
        super(context);
        this.a = -1;
    }

    public adf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
    }

    public adf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
    }

    protected void layoutChildren() {
        super.layoutChildren();
        if (this.a != -1) {
            int i = this.a;
            this.a = -1;
            int firstVisiblePosition = getFirstVisiblePosition() + 1;
            int lastVisiblePosition = getLastVisiblePosition();
            if (i < firstVisiblePosition || i > lastVisiblePosition) {
                setSelectionFromTop(i, (int) (((float) getHeight()) * 0.33f));
                super.layoutChildren();
            }
        }
    }
}
