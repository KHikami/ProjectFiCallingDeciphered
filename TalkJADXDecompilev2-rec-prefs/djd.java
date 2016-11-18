package p000;

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
    static final long f9918a = TimeUnit.SECONDS.toMillis(1);
    private static final long f9919j = TimeUnit.SECONDS.toMillis(5);
    private static final mjx<isr, isq> f9920t = mjx.m32327a(isr.SPEAKERPHONE_ON, isq.SPEAKERPHONE, isr.BLUETOOTH_ON, isq.BLUETOOTH_HEADSET, isr.EARPIECE_ON, isq.EARPIECE, isr.WIRED_HEADSET_ON, isq.WIRED_HEADSET);
    private static final mjx<isq, Integer> f9921u = mjx.m32327a(isq.SPEAKERPHONE, Integer.valueOf(2063), isq.BLUETOOTH_HEADSET, Integer.valueOf(2062), isq.EARPIECE, Integer.valueOf(2064), isq.WIRED_HEADSET, Integer.valueOf(2065));
    final dgg f9922b = dgg.m11692a();
    final Runnable f9923c = new dje(this);
    final Runnable f9924d = new djf(this);
    final HangoutSelfMenu f9925e;
    final HangoutSelfMenu f9926f;
    dhu f9927g;
    boolean f9928h;
    djm f9929i = djm.NONE;
    private final djl f9930k = new djl(this);
    private final HangoutActivity f9931l;
    private final dr f9932m;
    private final View f9933n;
    private final ParticipantTrayView f9934o;
    private final int f9935p;
    private boolean f9936q;
    private boolean f9937r = false;
    private tr f9938s = new djg(this);
    private final OnClickListener f9939v = new djh(this);

    public djd(HangoutFragment hangoutFragment, ViewGroup viewGroup) {
        this.f9933n = viewGroup;
        this.f9932m = hangoutFragment;
        this.f9931l = (HangoutActivity) hangoutFragment.getActivity();
        this.f9935p = this.f9931l.getResources().getDimensionPixelSize(gwb.eS);
        this.f9934o = (ParticipantTrayView) viewGroup.findViewById(ba.cb);
        this.f9925e = (HangoutSelfMenu) viewGroup.findViewById(ba.cc);
        this.f9926f = (HangoutSelfMenu) viewGroup.findViewById(ba.bL);
        this.f9934o.setVisibility(4);
        this.f9928h = false;
        ((Button) viewGroup.findViewById(ba.cQ)).setOnClickListener(this.f9939v);
    }

    void m12043b() {
        m12044c();
        m12052k();
        this.f9927g.m11860j();
        m12033s();
        m12031q();
        if (this.f9927g.m11853c() == 2) {
            String valueOf = String.valueOf(this.f9929i);
            glk.m17970a("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 18).append("animateControlsUp ").append(valueOf).toString(), new Object[0]);
            if (this.f9929i != djm.SELF_MENU) {
                m12027b(true);
            }
            if (this.f9929i == djm.PARTICIPANT_TRAY) {
                this.f9934o.m8663a(false);
            }
            this.f9934o.setVisibility(4);
        }
        m12050i();
        this.f9929i = djm.SELF_MENU;
    }

    void m12044c() {
        int i;
        int i2;
        int i3;
        Collection collection = null;
        int i4 = 1;
        int i5 = 0;
        did s = this.f9922b.m11727s();
        ikd p = s == null ? null : s.m11994p();
        if (p != null) {
            collection = p.m22138j();
        }
        boolean u = this.f9922b.m11729u();
        int i6 = collection == null ? 1 : collection.size() == 0 ? 1 : 0;
        if (this.f9927g == null) {
            i = 0;
        } else {
            i = this.f9927g.m11857g();
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
        iry l = this.f9922b.m11720l();
        if (l == null || !l.mo3387a()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        if (l != null && l.mo3388b()) {
            i3++;
        }
        i6 = (i2 == 0 || (!m12028n() && i6 == 0)) ? 0 : 1;
        if (i6 != 0 || r3 == 0 || u || r4 <= 1 || l == null || !l.mo1322g()) {
            i4 = 0;
        }
        if (this.f9927g != null) {
            dhu dhu = this.f9927g;
            if (i4 == 0) {
                i5 = 8;
            }
            dhu.m11852b(i5);
        }
    }

    private boolean m12028n() {
        Collection collection = null;
        did s = this.f9922b.m11727s();
        ikd p = s == null ? null : s.m11994p();
        if (p != null) {
            collection = p.m22138j();
        }
        if (collection == null || collection.size() != 1) {
            return false;
        }
        return true;
    }

    public void m12045d() {
        bcj bcj;
        did s = this.f9922b.m11727s();
        Object obj = (s == null || !s.m11987i()) ? null : 1;
        bxt bxt = s.m11946K() ? bxt.AUDIO_CALL : bxt.VIDEO_CALL;
        bko a = this.f9927g.m11848a();
        Collection arrayList = new ArrayList();
        for (itl itl : this.f9922b.m11725q()) {
            if (!itl.m23242f() && itl.m23250k()) {
                arrayList.add(gwb.m1601a(gwb.m1986b(gwb.m1400H(), itl.m23244g(), null, null), itl.m23232b(), null, null, itl.m23235c(), null));
            }
        }
        if (obj != null) {
            bcj = bcj.INVITE_MORE_TO_HANGOUT;
        } else {
            bcj = bcj.INVITE_GAIA_IDS_TO_HANGOUT;
        }
        this.f9932m.startActivityForResult(gwb.m1545a(a, null, arrayList, bcj, bxt), 2);
    }

    public void m12046e() {
        gwb.m2198f(1533);
        iry l = this.f9922b.m11720l();
        if (l.m23070h() == 1) {
            l.m23055a(2);
            glk.m17970a("Babel_calls", "Switching to rear camera", new Object[0]);
        } else {
            l.m23055a(1);
            glk.m17970a("Babel_calls", "Switching to front camera", new Object[0]);
        }
        m12050i();
        this.f9927g.m11860j();
        if (giv.m17746b()) {
            iil.m21875b("Switch camera button view is null after being tapped.", this.f9933n.findViewById(ba.bT));
        }
    }

    public void m12047f() {
        gwb.m2198f(1531);
        isq o = m12029o();
        if (o != null) {
            iil.m21874a("Expected condition to be true", f9921u.containsKey(o));
            this.f9922b.m11719k().m23124a(o);
            this.f9927g.m11861k();
            gwb.m2198f(gwb.m1507a((Integer) f9921u.get(o)));
        }
    }

    private isq m12029o() {
        int i = 0;
        ism k = this.f9922b.m11719k();
        if (k == null) {
            return null;
        }
        isr c = k.m23129c();
        Set d = k.m23130d();
        if (c == isr.BLUETOOTH_TURNING_ON || c == isr.BLUETOOTH_TURNING_OFF) {
            return null;
        }
        isq isq = (isq) f9920t.get(c);
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

    private int m12030p() {
        LayoutParams layoutParams = this.f9925e.getLayoutParams();
        if (layoutParams == null || layoutParams.height < 0) {
            return this.f9931l.getResources().getDimensionPixelSize(gwb.eR);
        }
        return layoutParams.height;
    }

    private void m12031q() {
        Animation animation = this.f9925e.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        animation = this.f9934o.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
    }

    private void m12027b(boolean z) {
        if (z) {
            this.f9925e.startAnimation(m12034a(-m12030p(), this.f9935p + giw.m17751a(this.f9933n, this.f9931l), this.f9925e, true));
        } else {
            this.f9925e.startAnimation(m12034a(this.f9935p + giw.m17755b(this.f9931l), -m12030p(), this.f9925e, false));
        }
    }

    public Animation m12034a(int i, int i2, LinearLayout linearLayout, boolean z) {
        LayoutParams layoutParams = linearLayout.getLayoutParams();
        int i3 = i2 - i;
        String str = "Babel_calls";
        String str2 = linearLayout == this.f9925e ? "menu" : "filmstrip";
        String str3 = z ? "up" : "down";
        glk.m17970a(str, new StringBuilder((String.valueOf(str2).length() + 68) + String.valueOf(str3).length()).append("createAnimation for ").append(str2).append(" ").append(i2).append(" -> ").append(i).append(" (").append(str3).append(") delta=").append(i3).toString(), new Object[0]);
        Animation dji = new dji(this, layoutParams, i, i3, linearLayout, z);
        dji.setDuration((long) this.f9931l.getResources().getInteger(gwb.fA));
        return dji;
    }

    void m12048g() {
        glk.m17970a("Babel_calls", "MenuController.dismissAllMenus", new Object[0]);
        if (m12049h()) {
            m12032r();
            m12031q();
            glk.m17970a("Babel_calls", "MenuController.animateControlsDown uiState=" + this.f9927g.m11853c(), new Object[0]);
            if (this.f9927g.m11853c() == 2) {
                String valueOf = String.valueOf(this.f9929i);
                glk.m17970a("Babel_calls", new StringBuilder(String.valueOf(valueOf).length() + 47).append("MenuController.animateControlsDown visibleMenu=").append(valueOf).toString(), new Object[0]);
                if (this.f9929i == djm.SELF_MENU) {
                    m12027b(false);
                }
                if (this.f9929i != djm.PARTICIPANT_TRAY) {
                    this.f9934o.m8663a(true);
                }
                this.f9934o.setVisibility(0);
                if (!this.f9937r) {
                    this.f9934o.m8664b();
                    this.f9937r = true;
                }
            }
            this.f9929i = djm.PARTICIPANT_TRAY;
            gwb.m2042b(this.f9923c);
            return;
        }
        m12043b();
    }

    void m12037a(HangoutSelfMenu hangoutSelfMenu) {
        if (!hangoutSelfMenu.m8598a()) {
            hangoutSelfMenu.m8597a(this.f9927g, new itl().m23234c(true), this.f9922b.m11727s());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        ViewGroup viewGroup = this.f9925e;
        Runnable djj = new djj(this);
        LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
        viewGroup.setLayoutTransition(null);
        djj.run();
        viewGroup.setLayoutTransition(layoutTransition);
        m12052k();
    }

    public void mo1110a(dhu dhu) {
        this.f9927g = dhu;
        this.f9931l.m8308g().a(this.f9938s);
        if (dhu.m11853c() == 1) {
            dhu.m11849a(0);
            m12037a(this.f9926f);
        } else {
            m12037a(this.f9925e);
        }
        this.f9936q = giv.m17746b();
        if (!m12049h() || this.f9936q) {
            this.f9929i = djm.SELF_MENU;
            m12043b();
        } else {
            this.f9929i = djm.PARTICIPANT_TRAY;
            this.f9934o.setVisibility(0);
            m12032r();
        }
        this.f9922b.m11701a(this.f9930k);
        m12044c();
        m12052k();
        ((dmn) jyn.m25426a(dhu.m11851b(), dmn.class)).mo1604a(new djk(this));
    }

    public void y_() {
        this.f9922b.m11705b(this.f9930k);
        this.f9925e.m8599b();
        this.f9926f.m8599b();
        gwb.m2042b(this.f9923c);
        gwb.m2042b(this.f9924d);
        this.f9931l.m8308g().b(this.f9938s);
        this.f9927g = null;
    }

    public void mo1109a(int i) {
        if (i == 2) {
            m12043b();
        }
    }

    boolean m12049h() {
        if (this.f9922b.m11729u()) {
            return false;
        }
        did s = this.f9922b.m11727s();
        if ((s != null && (s.m11945J() & 2) == 0 && m12028n()) || this.f9927g.m11859i() || !this.f9922b.m11728t()) {
            return false;
        }
        return true;
    }

    void m12050i() {
        if (!this.f9936q && m12049h()) {
            gwb.m2042b(this.f9923c);
            gwb.m1864a(this.f9923c, f9919j);
        }
    }

    public void m12039a(boolean z) {
        if (z) {
            gwb.m2042b(this.f9923c);
        } else {
            m12050i();
        }
    }

    void m12051j() {
        m12050i();
    }

    public String m12035a(Context context) {
        String str = "";
        if (this.f9929i == djm.SELF_MENU) {
            return context.getString(bc.ex);
        }
        if (this.f9929i == djm.PARTICIPANT_TRAY) {
            return context.getString(bc.fb);
        }
        return str;
    }

    String m12042b(Context context) {
        String str = "";
        if (this.f9929i == djm.SELF_MENU) {
            return context.getString(bc.dd);
        }
        if (this.f9929i == djm.PARTICIPANT_TRAY) {
            return context.getString(bc.de);
        }
        return str;
    }

    void m12052k() {
        int a;
        float f;
        int a2;
        Object obj = 1;
        float f2 = 1.0f;
        m12031q();
        Object obj2 = this.f9929i == djm.SELF_MENU ? 1 : null;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9925e.getLayoutParams();
        if (obj2 != null) {
            a = this.f9935p + giw.m17751a(this.f9933n, this.f9931l);
        } else {
            a = -m12030p();
        }
        layoutParams.bottomMargin = a;
        this.f9925e.setLayoutParams(layoutParams);
        HangoutSelfMenu hangoutSelfMenu = this.f9925e;
        if (obj2 != null) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        hangoutSelfMenu.setAlpha(f);
        if (this.f9929i != djm.PARTICIPANT_TRAY) {
            obj = null;
        }
        layoutParams = (FrameLayout.LayoutParams) this.f9934o.getLayoutParams();
        if (obj != null) {
            a2 = this.f9935p + giw.m17751a(this.f9933n, this.f9931l);
        } else {
            LayoutParams layoutParams2 = this.f9934o.getLayoutParams();
            if (layoutParams2 == null || layoutParams2.height < 0) {
                a2 = this.f9931l.getResources().getDimensionPixelSize(gwb.eU);
            } else {
                a2 = layoutParams2.height;
            }
            a2 = -a2;
        }
        layoutParams.bottomMargin = a2;
        this.f9934o.setLayoutParams(layoutParams);
        ParticipantTrayView participantTrayView = this.f9934o;
        if (obj == null) {
            f2 = 0.0f;
        }
        participantTrayView.setAlpha(f2);
    }

    void m12053l() {
        if (this.f9929i != djm.PARTICIPANT_TRAY) {
            m12048g();
        } else if (this.f9934o.m8672j()) {
            this.f9934o.m8663a(true);
        } else {
            m12043b();
        }
    }

    public void mo900a(boolean z, boolean z2) {
        if (!z2) {
            if (z) {
                m12032r();
            } else if (this.f9929i != djm.NONE) {
                m12033s();
                m12052k();
            }
        }
    }

    public boolean m12054m() {
        ism k = this.f9922b.m11719k();
        return k != null && k.m23129c() == isr.EARPIECE_ON;
    }

    public boolean mo899a() {
        return m12054m();
    }

    private void m12032r() {
        this.f9931l.m8308g().d();
        giw.m17753a(this.f9933n);
    }

    private void m12033s() {
        this.f9931l.m8308g().c();
        giw.m17754a(this.f9933n, true);
    }
}
