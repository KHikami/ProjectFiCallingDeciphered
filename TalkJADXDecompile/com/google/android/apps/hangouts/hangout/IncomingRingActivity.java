package com.google.android.apps.hangouts.hangout;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import ba;
import bc;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.hangout.multiwaveview.GlowPadView;
import com.google.android.apps.hangouts.views.AvatarView;
import com.google.android.apps.hangouts.views.FixedParticipantsGalleryView;
import diw;
import diy;
import diz;
import dja;
import djc;
import dw;
import edo;
import fde;
import giv;
import gje;
import gld;
import gwb;
import java.util.List;

public final class IncomingRingActivity extends dw implements diw {
    private final Runnable A;
    private final gje B;
    public IncomingRing n;
    public GlowPadView o;
    public final Handler p;
    private List<edo> q;
    private boolean r;
    private TextView s;
    private TextView t;
    private TextView u;
    private AvatarView v;
    private Button w;
    private Button x;
    private FixedParticipantsGalleryView y;
    private boolean z;

    public IncomingRingActivity() {
        this.p = new Handler(Looper.getMainLooper());
        this.A = new diy(this);
        this.B = new gje(this, "com.google.android.apps.hangouts.phone.notify_set_active", "com.google.android.apps.hangouts.phone.block_set_active");
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B.a();
        this.n = IncomingRing.b;
        if (this.n == null) {
            finish();
            return;
        }
        getWindow().addFlags(6815872);
        if (!giv.c()) {
            setRequestedOrientation(1);
        } else if (g()) {
            this.r = true;
            setTheme(gwb.iF);
        }
        setContentView(gwb.gH);
        if (this.r) {
            giv.a(this);
        }
        this.s = (TextView) findViewById(ba.cG);
        this.t = (TextView) findViewById(ba.cF);
        this.v = (AvatarView) findViewById(ba.cO);
        this.u = (TextView) findViewById(ba.cM);
        this.y = (FixedParticipantsGalleryView) findViewById(ba.bS);
        this.o = (GlowPadView) findViewById(ba.cC);
        if (giv.c() || !giv.a() || gld.a((Context) this)) {
            this.o.setVisibility(8);
            findViewById(ba.O).setVisibility(0);
            int i = ba.k;
            int i2 = ba.cu;
            this.w = (Button) findViewById(i);
            this.w.setOnClickListener(new diz(this));
            this.x = (Button) findViewById(i2);
            this.x.setOnClickListener(new dja(this));
            this.v.setBackgroundResource(17170443);
            return;
        }
        this.o.setOnTriggerListener(new djc(this));
        this.o.clearAnimation();
        this.o.setTargetResources(gwb.dv);
        this.o.setTargetDescriptionsResourceId(gwb.du);
        this.o.setDirectionDescriptionsResourceId(gwb.dt);
        GlowPadView glowPadView = this.o;
        Resources resources = getResources();
        if (this.n.h() || this.n.g()) {
            i = R$drawable.bg;
        } else {
            i = R$drawable.bh;
        }
        glowPadView.setHandleDrawable(resources, i);
        this.v.setBackgroundResource(17170444);
    }

    public boolean g() {
        return ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.n != IncomingRing.b) {
            finish();
            startActivity(gwb.C());
        }
    }

    protected void onStart() {
        super.onStart();
        if (IncomingRing.b != this.n) {
            finish();
            return;
        }
        this.n.a((diw) this);
        b();
        if (this.n.g()) {
            this.v.a(this.n.i(), true, this.n.b());
        } else {
            this.v.a(edo.a(this.n.e()), this.n.b());
        }
        if (this.o != null) {
            this.p.postDelayed(this.A, 1000);
        }
    }

    protected void onStop() {
        super.onStop();
        if (this.z && !((PowerManager) getSystemService("power")).isScreenOn()) {
            this.n.a(false);
        }
        this.n.b((diw) this);
        if (this.o != null) {
            this.p.removeCallbacks(this.A);
            this.o.reset(false);
        }
        this.y.a();
        this.y.setVisibility(8);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 24 && i != 25) {
            return false;
        }
        this.n.a(false);
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 24 || i == 25) {
            return true;
        }
        return false;
    }

    public void b() {
        this.s.setText(this.n.a(getResources()));
        this.s.setVisibility(0);
        IncomingRing incomingRing = this.n;
        getResources();
        CharSequence a = incomingRing.a();
        if (TextUtils.isEmpty(a)) {
            this.t.setVisibility(8);
        } else {
            this.t.setText(a);
            this.t.setVisibility(0);
        }
        if (fde.h()) {
            this.u.setText(this.n.b(getResources()));
            this.u.setVisibility(0);
        }
        h();
        if (this.n.c() != this.q) {
            this.q = this.n.c();
            this.y.a(this.n.b(), this.q, null);
            this.y.setVisibility(0);
        }
    }

    public void onWindowFocusChanged(boolean z) {
        this.z = z;
        h();
    }

    private void h() {
        if (this.z && !TextUtils.isEmpty(this.n.f())) {
            gld.a(this.s, null, getResources().getString(bc.eb, new Object[]{this.n.f()}));
        }
    }

    public void a() {
        finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.r) {
            giv.a(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.B.b();
    }
}
