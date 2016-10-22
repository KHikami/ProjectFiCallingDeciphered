package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.common.proguard.UsedByReflection;
import dgg;
import dhu;
import dhw;
import did;
import djx;
import dku;
import gwb;
import itl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jyn;

@UsedByReflection
public class RemoteParticipantPopupMenu extends LinearLayout {
    public final dgg a;
    public List<dhw> b;
    private boolean c;
    private final dku d;

    @UsedByReflection
    public RemoteParticipantPopupMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new dku(this);
        this.a = dgg.a();
    }

    public void a(dhu dhu, itl itl, did did) {
        removeAllViews();
        List<djx> c = jyn.c(getContext(), djx.class);
        Collections.sort(c);
        this.b = new ArrayList();
        for (djx a : c) {
            this.b.addAll(a.a(getContext(), dhu, itl, did));
        }
        for (dhw a2 : this.b) {
            addView(a2.a(LayoutInflater.from(getContext()), gwb.gG, (ViewGroup) getParent()));
        }
        this.c = true;
        this.a.a(this.d);
    }

    public boolean a() {
        return this.c;
    }

    public void b() {
        this.a.b(this.d);
        removeAllViews();
        this.b = null;
        this.c = false;
    }
}
