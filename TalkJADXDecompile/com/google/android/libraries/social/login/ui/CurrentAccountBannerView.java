package com.google.android.libraries.social.login.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import gwb;
import jpa;

public final class CurrentAccountBannerView extends LinearLayout {
    public String a;
    private TextView b;
    private TextView c;
    private boolean d;
    private boolean e;

    public CurrentAccountBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CurrentAccountBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(gwb.zE);
        this.c = (TextView) findViewById(gwb.zD);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d = true;
        if (this.e) {
            this.e = false;
            if (this.a != null && !gwb.as(getContext())) {
                gwb.a(new jpa(this), 2000);
            }
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = false;
    }
}
