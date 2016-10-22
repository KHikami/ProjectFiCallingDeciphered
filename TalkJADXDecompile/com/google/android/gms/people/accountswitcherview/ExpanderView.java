package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import bm;

public class ExpanderView extends ImageButton {
    private static final int[] a;
    private boolean b;
    private String c;
    private String d;

    static {
        a = new int[]{16842920};
    }

    public ExpanderView(Context context) {
        this(context, null);
    }

    public ExpanderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public ExpanderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private void a(Context context) {
        Resources resources = context.getResources();
        this.c = resources.getString(bm.ao);
        this.d = resources.getString(bm.am);
    }

    public void a(boolean z) {
        this.b = z;
        setContentDescription(this.b ? this.d : this.c);
        refreshDrawableState();
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b) {
            mergeDrawableStates(onCreateDrawableState, a);
        }
        return onCreateDrawableState;
    }
}
