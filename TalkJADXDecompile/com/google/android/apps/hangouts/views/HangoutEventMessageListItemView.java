package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ba;
import bko;
import com.google.android.apps.hangouts.R$drawable;
import dyg;
import edo;
import gld;
import glj;
import java.util.List;

public class HangoutEventMessageListItemView extends RelativeLayout implements dyg {
    List<edo> a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private FixedParticipantsGalleryView e;
    private CharSequence f;
    private long g;
    private bko h;

    public HangoutEventMessageListItemView(Context context) {
        this(context, null);
    }

    public HangoutEventMessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        this.b = (ImageView) findViewById(ba.cr);
        this.c = (TextView) findViewById(ba.fC);
        this.e = (FixedParticipantsGalleryView) findViewById(ba.bU);
        this.d = (TextView) findViewById(ba.R);
    }

    public void a(CharSequence charSequence, long j, bko bko, List<edo> list, int i) {
        Object obj;
        this.f = charSequence;
        a(j);
        this.h = bko;
        if (this.a == null && list == null) {
            obj = null;
        } else if (this.a == null || list == null || this.a.size() != list.size()) {
            r2 = 1;
        } else {
            for (r2 = 0; r2 < this.a.size(); r2++) {
                if (!((edo) this.a.get(r2)).a((edo) this.a.get(r2))) {
                    r2 = 1;
                    break;
                }
            }
            obj = null;
        }
        if (obj != null) {
            this.a = list;
        }
        this.c.setText(this.f);
        this.d.setText(glj.b(this.g, glj.a(), false));
        this.d.setContentDescription(glj.b(this.g, glj.a(), true));
        edo b = this.h.b();
        Object obj2 = (!(this.a != null ? this.a.contains(b) : false) || (this.a != null && this.a.size() == 1)) ? 1 : null;
        int i2 = obj2 != null ? R$drawable.bO : i == 1 ? R$drawable.bN : R$drawable.bY;
        this.b.setImageResource(i2);
        if (obj != null) {
            this.e.a(this.h, this.a, b);
        }
    }

    public void a(long j) {
        this.g = j;
    }

    public void c() {
        StringBuilder stringBuilder = new StringBuilder();
        gld.a(stringBuilder, this.c.getText());
        gld.a(stringBuilder, this.d.getContentDescription());
        setContentDescription(stringBuilder);
    }

    public long a() {
        return this.g;
    }

    public View b() {
        return this;
    }
}
