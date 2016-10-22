package com.google.android.apps.hangouts.elane;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ba;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import ctn;
import cuj;
import cuz;
import cwc;
import cwd;
import cwe;
import cwf;
import cwg;
import cwh;
import eia;
import gwb;
import ia;
import jyn;

public class SelfMenuViewController extends LinearLayout {
    public final ctn a;
    private FloatingActionButton b;
    private FloatingActionButton c;
    private cuz d;

    public SelfMenuViewController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new cwc(this);
        this.a = ((cuj) jyn.a(context, cuj.class)).a();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        eia eia = (eia) jyn.a(getContext(), eia.class);
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(gwb.oD);
        this.b = (FloatingActionButton) findViewById(gwb.oG);
        this.c = (FloatingActionButton) findViewById(gwb.oH);
        floatingActionButton.setOnClickListener(new cwd(this));
        this.b.setOnClickListener(new cwe(this));
        this.c.setOnClickListener(new cwf(this, eia));
        this.a.f().a(new cwg(this));
        eia.a(gwb.oV, new cwh(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.g().a(this.d);
        a(this.a.g().i());
        b(this.a.g().c());
    }

    protected void onDetachedFromWindow() {
        this.a.g().b(this.d);
        super.onDetachedFromWindow();
    }

    public void a(boolean z) {
        a(this.b, z, ba.jY, ba.jX);
    }

    public void b(boolean z) {
        a(this.c, z, ba.jW, ba.jV);
    }

    private void a(FloatingActionButton floatingActionButton, boolean z, int i, int i2) {
        if (z) {
            floatingActionButton.a(ia.c(getContext(), gwb.nQ), ia.c(getContext(), gwb.nS));
            floatingActionButton.setColorFilter(ia.c(getContext(), gwb.nR));
            floatingActionButton.setContentDescription(getContext().getString(i));
            return;
        }
        floatingActionButton.a(ia.c(getContext(), gwb.nT), ia.c(getContext(), gwb.nV));
        floatingActionButton.setColorFilter(ia.c(getContext(), gwb.nU));
        floatingActionButton.setContentDescription(getContext().getString(i2));
    }
}
