package com.google.android.apps.hangouts.elane;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import ctj;
import ctm;
import cuj;
import cur;
import cvo;
import cvq;
import cws;
import gwb;
import jyn;

public class MainFeedViewController extends FrameLayout implements cvq {
    public FocusedParticipantAvatarView a;
    public final cvo b;
    private final ctj c;
    private final ctm d;

    public MainFeedViewController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new cur(this);
        cws A = gwb.A((View) this);
        this.c = A.b();
        this.b = new cvo(A.a(), this);
        this.b.a(3);
        this.b.a(0.4f);
    }

    protected void onFinishInflate() {
        this.a = (FocusedParticipantAvatarView) findViewById(gwb.oB);
        super.onFinishInflate();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.a(this.d);
        this.b.a(this.c.d(), 1);
    }

    protected void onDetachedFromWindow() {
        this.c.b(this.d);
        this.b.a(null, 1);
        super.onDetachedFromWindow();
    }

    public void a(boolean z) {
        this.a.setVisibility(z ? 4 : 0);
        if (!TextUtils.equals(this.c.d(), "localParticipant") && z) {
            ((cuj) jyn.a(getContext(), cuj.class)).a().p();
        }
    }

    public void a(TextureView textureView, TextureView textureView2) {
        if (textureView != null) {
            removeView(textureView);
        }
        if (textureView2 != null) {
            addView(textureView2, 0);
        }
    }
}
