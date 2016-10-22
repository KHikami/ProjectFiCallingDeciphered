package com.android.dialer.app.list;

import adg;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageButton;
import android.widget.TextView;
import aq;
import aqm;
import aqn;
import buf;

/* compiled from: PG */
public class PhoneFavoriteSquareTileView extends aqn {
    public adg a;
    private final float i;
    private ImageButton j;

    static {
        PhoneFavoriteSquareTileView.class.getSimpleName();
    }

    public PhoneFavoriteSquareTileView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = getResources().getFraction(buf.hm, 1, 1);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((TextView) findViewById(aq.O)).setElegantTextHeight(false);
        ((TextView) findViewById(aq.P)).setElegantTextHeight(false);
        this.j = (ImageButton) findViewById(aq.Q);
    }

    protected final int b() {
        return getWidth();
    }

    public final void a(adg adg) {
        super.a(adg);
        if (adg != null) {
            this.j.setOnClickListener(new aqm(this));
        }
        this.a = adg;
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int i3 = (int) (this.i * ((float) size));
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            getChildAt(i4).measure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(i3, 1073741824));
        }
        setMeasuredDimension(size, i3);
    }

    protected final String b(adg adg) {
        if (adg.d == -1 || adg.d == 1 || TextUtils.isEmpty(adg.c)) {
            return adg.b;
        }
        return adg.c;
    }
}
