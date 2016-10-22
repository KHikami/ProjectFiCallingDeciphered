package com.google.android.libraries.quantum.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import jbp;

public final class BottomSheetLinearLayout extends LinearLayout {
    private int a;
    private int b;
    private int c;

    public BottomSheetLinearLayout(Context context) {
        super(context);
        a();
    }

    public BottomSheetLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        if (size > this.a) {
            i = MeasureSpec.makeMeasureSpec(this.a, MeasureSpec.getMode(i));
        } else if (size < this.b) {
            i = MeasureSpec.makeMeasureSpec(this.b, MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    private void a() {
        this.c = jbp.a(getContext());
        if (this.c <= 600) {
            this.b = a(this.c);
            this.a = Integer.MAX_VALUE;
        } else if (this.c <= 960) {
            this.a = a(832);
            this.b = a(384);
        } else if (this.c <= 1280) {
            this.a = a(1024);
            this.b = a(512);
        } else {
            this.a = a(1056);
            this.b = a(576);
        }
    }

    private int a(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }
}
