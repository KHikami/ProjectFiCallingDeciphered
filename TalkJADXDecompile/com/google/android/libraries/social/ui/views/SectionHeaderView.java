package com.google.android.libraries.social.ui.views;

import android.content.Context;
import android.text.style.SuperscriptSpan;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import jyg;

public final class SectionHeaderView extends RelativeLayout {
    private static final SuperscriptSpan a;

    static {
        a = new jyg();
    }

    public SectionHeaderView(Context context) {
        super(context);
    }

    public SectionHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SectionHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
