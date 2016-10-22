package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import ba;
import bbl;
import bko;
import edk;
import edq;
import goi;
import gwb;
import iil;
import java.util.List;
import wi;

public class FixedParticipantsView extends LinearLayout {
    private static final double a;
    private static final double b;
    private final LinearLayout c;
    private final LinearLayout d;
    private final int e;
    private final int f;
    private final int g;
    private final TextView h;

    static {
        a = Math.sqrt(2.0d);
        b = Math.sqrt(3.0d);
    }

    public FixedParticipantsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bbl.K, 0, 0);
        try {
            this.e = obtainStyledAttributes.getDimensionPixelSize(bbl.M, 36);
            this.f = obtainStyledAttributes.getDimensionPixelSize(bbl.O, 36);
            this.g = obtainStyledAttributes.getDimensionPixelSize(bbl.N, 12);
            LayoutInflater.from(context).inflate(gwb.gu, this, true);
            this.c = (LinearLayout) findViewById(ba.bk);
            this.d = (LinearLayout) findViewById(ba.bl);
            this.h = (TextView) findViewById(ba.bm);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void a(bko bko, List<edk> list) {
        a();
        if (list != null && list.size() != 0) {
            int i;
            int i2;
            int i3;
            int size = list.size();
            if (size > 4) {
                i = 3;
            } else {
                i = size;
            }
            if (size > 3) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            int i4 = 0;
            while (i4 < i) {
                View avatarView = new AvatarView(getContext());
                edk edk = (edk) list.get(i4);
                switch (goi.a[edk.a.ordinal()]) {
                    case wi.j /*1*/:
                        i3 = 1;
                        break;
                    case wi.l /*2*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
                avatarView.a(i3);
                if (i == 1) {
                    avatarView.b(4);
                }
                if (edk.h != null && (edk.f != null || edk.e != null)) {
                    avatarView.a(edk.e, edk.h, null, edk.f, bko);
                } else if (edk.a == edq.PHONE) {
                    iil.a("Expected condition to be true", edk.g());
                    avatarView.a(edk.f(), false, bko);
                } else {
                    avatarView.a(edk.b, bko);
                }
                i3 = size == 1 ? this.f : this.e;
                LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3, 1.0f);
                if (size >= 4 || size == 1 || (i4 == 0 && size == 2)) {
                    layoutParams.setMargins(0, 0, 0, 0);
                } else if (size == 3 && i4 == 0) {
                    layoutParams.setMargins(this.e / 2, 0, this.e / 2, 0);
                } else if (size == 3 && (i4 == 1 || i4 == 2)) {
                    layoutParams.setMargins(0, (this.e - ((int) Math.ceil(((double) (this.e / 2)) * b))) * -1, 0, 0);
                } else if (size == 2 && i4 == 1) {
                    i3 = (int) Math.abs(((double) this.e) / a);
                    layoutParams.setMargins(i3, (this.e - i3) * -1, 0, 0);
                } else {
                    iil.a("Incorrect avatar margin layout being calculated");
                }
                avatarView.setLayoutParams(layoutParams);
                if (i4 < i2) {
                    this.c.addView(avatarView);
                } else {
                    this.d.addView(avatarView);
                }
                i4++;
            }
            if (size > 4) {
                this.h.setLayoutParams(new LinearLayout.LayoutParams(this.e, this.e, 1.0f));
                this.h.setTextSize((float) this.g);
                this.h.setText(String.valueOf(size - 3));
                this.h.setVisibility(0);
                this.d.addView(this.h);
            }
            String[] strArr = new String[list.size()];
            i3 = 0;
            for (edk edk2 : list) {
                int i5 = i3 + 1;
                strArr[i3] = edk2.e;
                i3 = i5;
            }
            setContentDescription(gwb.a(strArr, i));
        }
    }

    public void a() {
        this.c.removeAllViews();
        this.d.removeAllViews();
        setContentDescription(null);
    }
}
