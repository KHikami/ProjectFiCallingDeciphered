package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import bbl;
import bko;
import edo;
import gwb;
import java.util.ArrayList;
import java.util.List;

public class FixedParticipantsGalleryView extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;
    private bko d;
    private List<edo> e;
    private edo f;
    private boolean g;

    public FixedParticipantsGalleryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bbl.K, 0, 0);
        try {
            this.a = obtainStyledAttributes.getDimensionPixelSize(bbl.M, 1);
            this.b = obtainStyledAttributes.getDimensionPixelSize(bbl.L, 0);
            this.c = obtainStyledAttributes.getInt(bbl.P, 100);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void a(bko bko, List<edo> list, edo edo) {
        if (!gwb.g(this.d, (Object) bko) || !gwb.g(this.e, (Object) list) || !gwb.g(this.f, (Object) edo)) {
            this.d = bko;
            if (list == null) {
                this.e = null;
            } else {
                this.e = new ArrayList(list);
            }
            this.f = edo;
            removeAllViews();
            if (list != null) {
                int i = 0;
                for (edo edo2 : list) {
                    int i2;
                    if (edo == null || !edo.a(edo2)) {
                        View avatarView = new AvatarView(getContext());
                        avatarView.a(edo2, bko);
                        avatarView.b(this.g);
                        LayoutParams layoutParams = new LinearLayout.LayoutParams(this.a, this.a, 1.0f);
                        layoutParams.setMargins(this.b, this.b, this.b, this.b);
                        layoutParams.gravity = 16;
                        layoutParams.weight = 0.0f;
                        avatarView.setLayoutParams(layoutParams);
                        addView(avatarView);
                        i2 = i + 1;
                    } else {
                        i2 = i;
                    }
                    if (i2 < this.c) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void a() {
        removeAllViews();
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public void a(boolean z) {
        this.g = false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int min = Math.min((i3 - i) / ((this.b << 1) + this.a), childCount);
        for (int i5 = 0; i5 < min; i5++) {
            getChildAt(i5).setVisibility(0);
        }
        while (min < childCount) {
            getChildAt(min).setVisibility(8);
            min++;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
