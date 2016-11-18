package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.hangout.HangoutFragment;
import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;
import com.google.android.apps.hangouts.hangout.ParticipantTrayView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class djd implements dht, dkn, dkp {
    static final long a = TimeUnit.SECONDS.toMillis(1);
    private static final long j = TimeUnit.SECONDS.toMillis(5);
    private static final mjx<isr, isq> t = mjx.a(isr.SPEAKERPHONE_ON, isq.SPEAKERPHONE, isr.BLUETOOTH_ON, isq.BLUETOOTH_HEADSET, isr.EARPIECE_ON, isq.EARPIECE, isr.WIRED_HEADSET_ON, isq.WIRED_HEADSET);
    private static final mjx<isq, Integer> u = mjx.a(isq.SPEAKERPHONE, Integer.valueOf(2063), isq.BLUETOOTH_HEADSET, Integer.valueOf(2062), isq.EARPIECE, Integer.valueOf(2064), isq.WIRED_HEADSET, Integer.valueOf(2065));
    final dgg b = dgg.a();
    final Runnable c = new dje(this);
    final Runnable d = new djf(this);
    final HangoutSelfMenu e;
    final HangoutSelfMenu f;
    dhu g;
    boolean h;
    djm i = djm.NONE;
    private final djl k = new djl(this);
    private final HangoutActivity l;
    private final dr m;
    private final View n;
    private final ParticipantTrayView o;
    private final int p;
    private boolean q;
    private boolean r = false;
    private tr s = new djg(this);
    private final OnClickListener v = new djh(this);

    public djd(HangoutFragment hangoutFragment, ViewGroup viewGroup) {
        this.n = viewGroup;
        this.m = hangoutFragment;
        this.l = (HangoutActivity) hangoutFragment.getActivity();
        this.p = this.l.getResources().getDimensionPixelSize(gwb.eS);
        this.o = (ParticipantTrayView) viewGroup.findViewById(ba.cb);
        this.e = (HangoutSelfMenu) viewGroup.findViewById(ba.cc);
        this.f = (HangoutSelfMenu) viewGroup.findViewById(ba.bL);
        this.o.setVisibility(4);
        this.h = false;
        ((Button) viewGroup.findViewById(ba.cQ)).setOnClickListener(this.v);
    }

    void b() {
        c();
        k();
        this.g.j();
        s();
        q();
        if (this.g.c() == 2) {
            String valueOf = String.valueOf(this.i);
            glk.a("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 18).append("animateControlsUp ").append(valueOf).toString(), new Object[0]);
            if (this.i != djm.SELF_MENU) {
                b(true);
            }
            if (this.i == djm.PARTICIPANT_TRAY) {
                this.o.a(false);
            }
            this.o.setVisibility(4);
        }
        i();
        this.i = djm.SELF_MENU;
    }

    void c() {
        int i;
        int i2;
        int i3;
        Collection collection = null;
        int i4 = 1;
        int i5 = 0;
        did s = this.b.s();
        ikd p = s == null ? null : s.p();
        if (p != null) {
            collection = p.j();
        }
        boolean u = this.b.u();
        int i6 = collection == null ? 1 : collection.size() == 0 ? 1 : 0;
        if (this.g == null) {
            i = 0;
        } else {
            i = this.g.g();
        }
        if ((i & 1) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        iry l = this.b.l();
        if (l == null || !l.a()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (l != null && l.b()) {
            i3++;
        }
        i6 = (i2 == 0 || (!n() && i6 == 0)) ? 0 : 1;
        if (i6 != 0 || r3 == 0 || u || r4 <= 1 || l == null || !l.g()) {
            i4 = 0;
        }
        if (this.g != null) {
            dhu dhu = this.g;
            if (i4 == 0) {
                i5 = 8;
            }
            dhu.b(i5);
        }
    }

    private boolean n() {
        Collection collection = null;
        did s = this.b.s();
        ikd p = s == null ? null : s.p();
        if (p != null) {
            collection = p.j();
        }
        if (collection == null || collection.size() != 1) {
            return false;
        }
        return true;
    }

    public void d() {
        bcj bcj;
        did s = this.b.s();
        Object obj = (s == null || !s.i()) ? null : 1;
        bxt bxt = s.K() ? bxt.AUDIO_CALL : bxt.VIDEO_CALL;
        bko a = this.g.a();
        Collection arrayList = new ArrayList();
        for (itl itl : this.b.q()) {
            if (!itl.f() && itl.k()) {
                arrayList.add(gwb.a(gwb.b(gwb.H(), itl.g(), null, null), itl.b(), null, null, itl.c(), null));
            }
        }
        if (obj != null) {
            bcj = bcj.INVITE_MORE_TO_HANGOUT;
        } else {
            bcj = bcj.INVITE_GAIA_IDS_TO_HANGOUT;
        }
        this.m.startActivityForResult(gwb.a(a, null, arrayList, bcj, bxt), 2);
    }

    public void e() {
        gwb.f(1533);
        iry l = this.b.l();
        if (l.h() == 1) {
            l.a(2);
            glk.a("Babel_calls", "Switching to rear camera", new Object[0]);
        } else {
            l.a(1);
            glk.a("Babel_calls", "Switching to front camera", new Object[0]);
        }
        i();
        this.g.j();
        if (giv.b()) {
            iil.b("Switch camera button view is null after being tapped.", this.n.findViewById(ba.bT));
        }
    }

    public void f() {
        gwb.f(1531);
        isq o = o();
        if (o != null) {
            iil.a("Expected condition to be true", u.containsKey(o));
            this.b.k().a(o);
            this.g.k();
            gwb.f(gwb.a((Integer) u.get(o)));
        }
    }

    private isq o() {
        int i = 0;
        ism k = this.b.k();
        if (k == null) {
            return null;
        }
        isr c = k.c();
        Set d = k.d();
        if (c == isr.BLUETOOTH_TURNING_ON || c == isr.BLUETOOTH_TURNING_OFF) {
            return null;
        }
        isq isq = (isq) t.get(c);
        isq[] isqArr = (isq[]) d.toArray(new isq[d.size()]);
        isq isq2 = isqArr[0];
        while (i < isqArr.length) {
            if (isqArr[i].equals(isq)) {
                return isqArr[(i + 1) % isqArr.length];
            }
            i++;
        }
        return isq2;
    }

    private int p() {
        LayoutParams layoutParams = this.e.getLayoutParams();
        if (layoutParams == null || layoutParams.height < 0) {
            return this.l.getResources().getDimensionPixelSize(gwb.eR);
        }
        return layoutParams.height;
    }

    private void q() {
        Animation animation = this.e.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        animation = this.o.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
    }

    private void b(boolean z) {
        if (z) {
            this.e.startAnimation(a(-p(), this.p + giw.a(this.n, this.l), this.e, true));
        } else {
            this.e.startAnimation(a(this.p + giw.b(this.l), -p(), this.e, false));
        }
    }

    public Animation a(int i, int i2, LinearLayout linearLayout, boolean z) {
        LayoutParams layoutParams = linearLayout.getLayoutParams();
        int i3 = i2 - i;
        String str = "Babel_calls";
        String str2 = linearLayout == this.e ? "menu" : "filmstrip";
        String str3 = z ? "up" : "down";
        glk.a(str, new StringBuilder((String.valueOf(str2).length() + 68) + String.valueOf(str3).length()).append("createAnimation for ").append(str2).append(" ").append(i2).append(" -> ").append(i).append(" (").append(str3).append(") delta=").append(i3).toString(), new Object[0]);
        Animation dji = new dji(this, layoutParams, i, i3, linearLayout, z);
        dji.setDuration((long) this.l.getResources().getInteger(gwb.fA));
        return dji;
    }

    void g() {
        glk.a("Babel_calls", "MenuController.dismissAllMenus", new Object[0]);
        if (h()) {
            r();
            q();
            glk.a("Babel_calls", "MenuController.animateControlsDown uiState=" + this.g.c(), new Object[0]);
            if (this.g.c() == 2) {
                String valueOf = String.valueOf(this.i);
                glk.a("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 47).append("MenuController.animateControlsDown visibleMenu=").append(valueOf).toString(), new Object[0]);
                if (this.i == djm.SELF_MENU) {
                    b(false);
                }
                if (this.i != djm.PARTICIPANT_TRAY) {
                    this.o.a(true);
                }
                this.o.setVisibility(0);
                if (!this.r) {
                    this.o.b();
                    this.r = true;
                }
            }
            this.i = djm.PARTICIPANT_TRAY;
            gwb.b(this.c);
            return;
        }
        b();
    }

    void a(HangoutSelfMenu hangoutSelfMenu) {
        if (!hangoutSelfMenu.a()) {
            hangoutSelfMenu.a(this.g, new itl().c(true), this.b.s());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        ViewGroup viewGroup = this.e;
        Runnable djj = new djj(this);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        viewGroup.setLayoutTransition(null);
        djj.run();
        viewGroup.setLayoutTransition(layoutTransition);
        k();
    }

    public void a(dhu dhu) {
        this.g = dhu;
        this.l.g().a(this.s);
        if (dhu.c() == 1) {
            dhu.a(0);
            a(this.f);
        } else {
            a(this.e);
        }
        this.q = giv.b();
        if (!h() || this.q) {
            this.i = djm.SELF_MENU;
            b();
        } else {
            this.i = djm.PARTICIPANT_TRAY;
            this.o.setVisibility(0);
            r();
        }
        this.b.a(this.k);
        c();
        k();
        ((dmn) jyn.a(dhu.b(), dmn.class)).a(new djk(this));
    }

    public void y_() {
        this.b.b(this.k);
        this.e.b();
        this.f.b();
        gwb.b(this.c);
        gwb.b(this.d);
        this.l.g().b(this.s);
        this.g = null;
    }

    public void a(int i) {
        if (i == 2) {
            b();
        }
    }

    boolean h() {
        if (this.b.u()) {
            return false;
        }
        did s = this.b.s();
        if ((s != null && (s.J() & 2) == 0 && n()) || this.g.i() || !this.b.t()) {
            return false;
        }
        return true;
    }

    void i() {
        if (!this.q && h()) {
            gwb.b(this.c);
            gwb.a(this.c, j);
        }
    }

    public void a(boolean z) {
        if (z) {
            gwb.b(this.c);
        } else {
            i();
        }
    }

    void j() {
        i();
    }

    public String a(Context context) {
        String str = "";
        if (this.i == djm.SELF_MENU) {
            return context.getString(bc.ex);
        }
        if (this.i == djm.PARTICIPANT_TRAY) {
            return context.getString(bc.fb);
        }
        return str;
    }

    String b(Context context) {
        String str = "";
        if (this.i == djm.SELF_MENU) {
            return context.getString(bc.dd);
        }
        if (this.i == djm.PARTICIPANT_TRAY) {
            return context.getString(bc.de);
        }
        return str;
    }

    void k() {
        int a;
        float f;
        int a2;
        Object obj = 1;
        float f2 = 1.0f;
        q();
        Object obj2 = this.i == djm.SELF_MENU ? 1 : null;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        if (obj2 != null) {
            a = this.p + giw.a(this.n, this.l);
        } else {
            a = -p();
        }
        layoutParams.bottomMargin = a;
        this.e.setLayoutParams(layoutParams);
        HangoutSelfMenu hangoutSelfMenu = this.e;
        if (obj2 != null) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        hangoutSelfMenu.setAlpha(f);
        if (this.i != djm.PARTICIPANT_TRAY) {
            obj = null;
        }
        layoutParams = (FrameLayout.LayoutParams) this.o.getLayoutParams();
        if (obj != null) {
            a2 = this.p + giw.a(this.n, this.l);
        } else {
            LayoutParams layoutParams2 = this.o.getLayoutParams();
            if (layoutParams2 == null || layoutParams2.height < 0) {
                a2 = this.l.getResources().getDimensionPixelSize(gwb.eU);
            } else {
                a2 = layoutParams2.height;
            }
            a2 = -a2;
        }
        layoutParams.bottomMargin = a2;
        this.o.setLayoutParams(layoutParams);
        ParticipantTrayView participantTrayView = this.o;
        if (obj == null) {
            f2 = 0.0f;
        }
        participantTrayView.setAlpha(f2);
    }

    void l() {
        if (this.i != djm.PARTICIPANT_TRAY) {
            g();
        } else if (this.o.j()) {
            this.o.a(true);
        } else {
            b();
        }
    }

    public void a(boolean z, boolean z2) {
        if (!z2) {
            if (z) {
                r();
            } else if (this.i != djm.NONE) {
                s();
                k();
            }
        }
    }

    public boolean m() {
        ism k = this.b.k();
        return k != null && k.c() == isr.EARPIECE_ON;
    }

    public boolean a() {
        return m();
    }

    private void r() {
        this.l.g().d();
        giw.a(this.n);
    }

    private void s() {
        this.l.g().c();
        giw.a(this.n, true);
    }
}
