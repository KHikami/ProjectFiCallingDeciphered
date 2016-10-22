package com.android.incallui;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import ayc;
import bby;
import bcj;
import bdf;
import buf;
import com.android.incallui.widget.multiwaveview.GlowPadView;
import com.android.incallui.widget.multiwaveview.GlowPadView.OnTriggerListener;

/* compiled from: PG */
public class GlowPadWrapper extends GlowPadView implements OnTriggerListener {
    public ayc a;
    public int b;
    private boolean c;
    private final Handler d;
    private boolean e;

    public GlowPadWrapper(Context context) {
        super(context);
        this.c = true;
        this.d = new bby(this);
        this.e = false;
        this.b = 3;
        String valueOf = String.valueOf(this);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 15).append("class created ").append(valueOf).append(" ").toString());
    }

    public GlowPadWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
        this.d = new bby(this);
        this.e = false;
        this.b = 3;
        String valueOf = String.valueOf(this);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 14).append("class created ").append(valueOf).toString());
    }

    protected void onFinishInflate() {
        bdf.a((Object) this, "onFinishInflate()");
        super.onFinishInflate();
        setOnTriggerListener(this);
    }

    public final void a() {
        bdf.a((Object) this, "startPing");
        this.c = true;
        c();
    }

    public final void b() {
        bdf.a((Object) this, "stopPing");
        this.c = false;
        this.d.removeMessages(101);
    }

    public final void c() {
        boolean z = this.c;
        String valueOf = String.valueOf(this);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 21).append("triggerPing(): ").append(z).append(" ").append(valueOf).toString());
        if (this.c && !this.d.hasMessages(101)) {
            ping();
            this.d.sendEmptyMessageDelayed(101, 1200);
        }
    }

    public void onGrabbed(View view, int i) {
        bdf.a((Object) this, "onGrabbed()");
        b();
    }

    public void onReleased(View view, int i) {
        bdf.a((Object) this, "onReleased()");
        if (this.e) {
            this.e = false;
        } else {
            a();
        }
    }

    public void onTrigger(View view, int i) {
        String valueOf = String.valueOf(view);
        bdf.a((Object) this, new StringBuilder(String.valueOf(valueOf).length() + 36).append("onTrigger() view=").append(valueOf).append(" target=").append(i).toString());
        int resourceIdForTarget = getResourceIdForTarget(i);
        if (resourceIdForTarget == buf.ku) {
            this.a.a(0, getContext());
            this.e = true;
        } else if (resourceIdForTarget == buf.kw) {
            this.a.a(getContext());
            this.e = true;
        } else if (resourceIdForTarget == buf.ky) {
            this.a.e();
            this.e = true;
        } else if (resourceIdForTarget == buf.kC || resourceIdForTarget == buf.kv) {
            this.a.a(this.b, getContext());
            this.e = true;
        } else if (resourceIdForTarget == buf.kx) {
            bcj.b().c(getContext());
            this.e = true;
        } else {
            bdf.c((Object) this, "Trigger detected on unhandled resource. Skipping.");
        }
    }

    public void onGrabbedStateChange(View view, int i) {
    }

    public void onFinishFinalAnimation() {
    }
}
