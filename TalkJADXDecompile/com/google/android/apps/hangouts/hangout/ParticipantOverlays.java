package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.common.proguard.UsedByReflection;
import dgg;
import djy;
import djz;
import dkm;
import iil;
import itl;
import java.util.ArrayList;
import java.util.List;
import jyn;

@UsedByReflection
public class ParticipantOverlays extends LinearLayout {
    public itl a;
    public List<djy> b;
    private final djz c;
    private final dgg d;

    @UsedByReflection
    public ParticipantOverlays(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new djz(this);
        this.d = dgg.a();
    }

    public void a(itl itl) {
        iil.a("Expected null", this.b);
        this.a = itl;
        this.b = new ArrayList();
        Context context = getContext();
        for (dkm a : jyn.c(context, dkm.class)) {
            this.b.add(a.a(context, itl));
        }
        for (djy a2 : this.b) {
            addView(a2.a());
        }
        this.d.a(this.c);
    }

    public void a() {
        iil.b("Expected non-null", this.b);
        this.d.b(this.c);
        removeAllViews();
        this.b = null;
    }
}
