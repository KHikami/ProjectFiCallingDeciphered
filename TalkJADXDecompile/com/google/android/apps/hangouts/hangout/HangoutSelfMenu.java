package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dgg;
import dhu;
import dhw;
import dic;
import did;
import djx;
import gwb;
import iil;
import itl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import jyn;

public final class HangoutSelfMenu extends LinearLayout {
    public final dgg a;
    public List<dhw> b;
    private boolean c;
    private final dic d;

    public HangoutSelfMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new dic(this);
        this.a = dgg.a();
    }

    public void a(dhu dhu, itl itl, did did) {
        removeAllViews();
        List<djx> c = jyn.c(getContext(), djx.class);
        Collections.sort(c);
        this.b = new ArrayList();
        for (djx a : c) {
            Collection a2 = a.a(getContext(), dhu, itl, did);
            if (a2 != null) {
                this.b.addAll(a2);
            }
        }
        for (dhw a3 : this.b) {
            addView(a3.a(LayoutInflater.from(getContext()), gwb.gI, (ViewGroup) getParent()));
        }
        iil.b("Expected condition to be false", this.c);
        this.a.a(this.d);
        setVisibility(0);
        this.c = true;
    }

    public boolean a() {
        return this.c;
    }

    public void b() {
        if (this.c) {
            setVisibility(8);
            this.a.b(this.d);
            this.c = false;
            this.b = null;
        }
    }
}
