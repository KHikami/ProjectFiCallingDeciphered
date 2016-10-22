package com.google.android.apps.hangouts.elane;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cth;
import cti;
import ctn;
import cuj;
import cvh;
import cvn;
import gkd;
import gwb;
import jyn;
import lym;

public class FocusedParticipantAvatarView extends FrameLayout {
    public VolumeCircle a;
    public ImageView b;
    public boolean c;
    private final cvh d;
    private final ctn e;
    private String f;
    private final cvn g;

    public FocusedParticipantAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new cth(this);
        this.e = ((cuj) jyn.a(context, cuj.class)).a();
        this.d = this.e.h();
    }

    protected void onFinishInflate() {
        this.b = (ImageView) findViewById(gwb.oF);
        this.a = (VolumeCircle) findViewById(gwb.oX);
        super.onFinishInflate();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.a(this.f, this.g);
    }

    protected void onDetachedFromWindow() {
        this.d.b(this.f, this.g);
        super.onDetachedFromWindow();
    }

    public void a(boolean z) {
        this.c = z;
        if (z) {
            this.a.a(0);
        }
    }

    public void a(String str) {
        lym c = this.d.c(str);
        this.d.b(this.f, this.g);
        this.d.a(str, this.g);
        this.f = str;
        if (c == null || c.e == null) {
            this.b.setImageBitmap(gkd.a(gwb.oj));
        } else {
            gwb.a(getContext(), this.e.b(), c.e, new cti(this));
        }
        a(this.d.a(str));
    }
}
