package p000;

import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.views.FixedParticipantsView;
import java.util.List;

public final class dgu implements kcj, kcm, kcq {
    private static final boolean f9714k = (VERSION.SDK_INT >= 21);
    final dgg f9715a = dgg.m11692a();
    private final dgx f9716b = new dgx(this);
    private final dw f9717c;
    private final Resources f9718d;
    private final Handler f9719e = new Handler(Looper.getMainLooper());
    private int f9720f = 0;
    private dgy f9721g = dgy.NONE;
    private boolean f9722h;
    private boolean f9723i;
    private boolean f9724j;
    private final Runnable f9725l = new dgv(this);

    public dgu(dw dwVar, kbu kbu) {
        this.f9717c = dwVar;
        this.f9718d = dwVar.getResources();
        kbu.m25514a((kcq) this);
    }

    public void R_() {
        this.f9715a.m11701a(this.f9716b);
        this.f9722h = true;
        m11789c();
    }

    public void T_() {
        this.f9715a.m11705b(this.f9716b);
        this.f9722h = false;
        m11789c();
    }

    public void m11786a(int i) {
        this.f9720f = i;
        m11789c();
    }

    void m11789c() {
        dgy dgy;
        did s = this.f9715a.m11727s();
        if (!this.f9722h || this.f9720f != 2 || s == null || s.m11948N()) {
            dgy = dgy.NONE;
        } else {
            boolean z;
            boolean C = s.m11940C();
            if (s.m11943H() == 0) {
                z = true;
            } else {
                z = false;
            }
            dgy = (C && z) ? s.m11946K() ? dgy.OUTGOING_AUDIO : dgy.OUTGOING_VIDEO : (C || this.f9715a.m11721m()) ? dgy.NONE : dgy.STILL_JOINING;
        }
        if (dgy != this.f9721g) {
            boolean z2;
            if (this.f9721g == dgy.STILL_JOINING) {
                z2 = true;
            } else {
                z2 = false;
            }
            View findViewById = this.f9717c.findViewById(ba.by);
            ((FixedParticipantsView) findViewById.findViewById(ba.bv)).m9397a();
            findViewById.setVisibility(8);
            findViewById = this.f9717c.findViewById(ba.bE);
            ((FixedParticipantsView) this.f9717c.findViewById(ba.bv)).m9397a();
            findViewById.animate().setDuration(z2 ? (long) this.f9718d.getInteger(gwb.fA) : 0).translationY(this.f9718d.getDimension(gwb.eQ));
            this.f9719e.removeCallbacks(this.f9725l);
            m11785a(false, z2);
            this.f9721g = dgy;
            TextView textView;
            FixedParticipantsView fixedParticipantsView;
            CharSequence string;
            switch (dgw.f9727a[this.f9721g.ordinal()]) {
                case 1:
                    findViewById = this.f9717c.findViewById(ba.by);
                    textView = (TextView) findViewById.findViewById(ba.dR);
                    fixedParticipantsView = (FixedParticipantsView) findViewById.findViewById(ba.bv);
                    List<edk> F = s.m11941F();
                    fixedParticipantsView.setBackgroundResource(F.size() == 1 ? R$drawable.az : 0);
                    fixedParticipantsView.m9398a(s.m11989k(), F);
                    if (s.m11946K()) {
                        bko k = s.m11989k();
                        for (edk edk : F) {
                            if (edk.m13595e() != null) {
                                string = this.f9718d.getString(bc.et, new Object[]{glq.m18002a(this.f9717c, edk.m13595e(), glu.f15610b)});
                            } else if (edk.m13598h() && k.m5650s()) {
                                int i;
                                Resources resources = this.f9718d;
                                if (k.m5626M()) {
                                    i = bc.ev;
                                } else {
                                    i = bc.eu;
                                }
                                string = resources.getString(i, new Object[]{glq.m18038i(this.f9717c, k.m5652u())});
                            }
                            textView.setText(string);
                            textView.setVisibility(0);
                            findViewById.setVisibility(0);
                        }
                        string = this.f9718d.getString(bc.eo);
                        textView.setText(string);
                        textView.setVisibility(0);
                        findViewById.setVisibility(0);
                    }
                    m11787a(s);
                    return;
                case 2:
                    List F2 = s.m11941F();
                    textView = (TextView) this.f9717c.findViewById(ba.bE).findViewById(ba.dR);
                    fixedParticipantsView = (FixedParticipantsView) this.f9717c.findViewById(ba.bv);
                    fixedParticipantsView.m9398a(s.m11989k(), F2);
                    fixedParticipantsView.setVisibility(0);
                    switch (F2.size()) {
                        case 0:
                            string = this.f9718d.getString(bc.eo);
                            break;
                        case 1:
                            string = String.format(this.f9718d.getString(bc.ep), new Object[]{gwb.m1648a(this.f9717c, (edk) F2.get(0), true)});
                            break;
                        case 2:
                            string = String.format(this.f9718d.getString(bc.eq), new Object[]{gwb.m1648a(this.f9717c, (edk) F2.get(0), true), gwb.m1648a(this.f9717c, (edk) F2.get(1), true)});
                            break;
                        case 3:
                            string = String.format(this.f9718d.getString(bc.er), new Object[]{gwb.m1648a(this.f9717c, (edk) F2.get(0), true), gwb.m1648a(this.f9717c, (edk) F2.get(1), true), gwb.m1648a(this.f9717c, (edk) F2.get(2), true)});
                            break;
                        case 4:
                            string = String.format(this.f9718d.getString(bc.es), new Object[]{gwb.m1648a(this.f9717c, (edk) F2.get(0), true), gwb.m1648a(this.f9717c, (edk) F2.get(1), true), gwb.m1648a(this.f9717c, (edk) F2.get(2), true), gwb.m1648a(this.f9717c, (edk) F2.get(3), true)});
                            break;
                        default:
                            string = String.format(this.f9718d.getString(bc.ew), new Object[]{gwb.m1648a(this.f9717c, (edk) F2.get(0), true), gwb.m1648a(this.f9717c, (edk) F2.get(1), true), gwb.m1648a(this.f9717c, (edk) F2.get(2), true), Integer.valueOf(F2.size() - 3)});
                            break;
                    }
                    textView.setText(string);
                    m11788a(false);
                    return;
                case 3:
                    View findViewById2 = this.f9717c.findViewById(ba.bE);
                    textView = (TextView) findViewById2.findViewById(ba.dR);
                    fixedParticipantsView = (FixedParticipantsView) this.f9717c.findViewById(ba.bv);
                    CharSequence string2 = this.f9718d.getString(bc.ek);
                    textView.setText(string2);
                    fixedParticipantsView.m9397a();
                    fixedParticipantsView.setVisibility(8);
                    this.f9719e.postDelayed(this.f9725l, 4000);
                    gld.m17933a(findViewById2, null, string2);
                    return;
                case 4:
                    return;
                default:
                    String valueOf = String.valueOf(this.f9721g);
                    iil.m21870a(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Unsupported overlay type: ").append(valueOf).toString());
                    return;
            }
        }
    }

    void m11788a(boolean z) {
        this.f9717c.findViewById(ba.bE).animate().setDuration(z ? (long) this.f9718d.getInteger(gwb.fA) : 0).translationY(0.0f);
        m11785a(true, z);
    }

    private void m11785a(boolean z, boolean z2) {
        if (this.f9723i != z) {
            int i;
            this.f9723i = z;
            View findViewById = this.f9717c.findViewById(ba.bK);
            int integer = this.f9718d.getInteger(gwb.fA);
            findViewById.animate().setDuration(z2 ? (long) integer : 0).setListener(new bbu(findViewById)).alpha(z ? 1.0f : 0.0f);
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.f9717c.findViewById(ba.cm).getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (z2) {
                i = integer;
            } else {
                i = 0;
            }
            transitionDrawable.reverseTransition(i);
        }
    }

    void m11787a(did did) {
        int i;
        int i2 = 0;
        boolean z = true;
        View view = (TextView) this.f9717c.findViewById(ba.by).findViewById(ba.f2682U);
        if (f9714k) {
            i = 1;
        } else {
            i = 0;
        }
        oa.d(view, i);
        if (did != null && did.m11941F().size() == 1 && did.m11945J() == 1) {
            List T = did.m11954T();
            if (T.size() == 1) {
                if (!TextUtils.isEmpty(((dii) T.get(0)).m12006b())) {
                    view.setText(this.f9718d.getString(bc.bo, new Object[]{r1}));
                    view.setContentDescription(this.f9718d.getString(bc.bp, new Object[]{r1}));
                    if (!this.f9724j) {
                        this.f9724j = true;
                        gwb.m2198f(1631);
                    }
                    if (!z) {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                    if (z && !f9714k) {
                        gld.m17933a(view, null, view.getContentDescription());
                        return;
                    }
                    return;
                }
            }
            z = false;
            if (z) {
                i2 = 8;
            }
            view.setVisibility(i2);
            if (z) {
                return;
            }
            return;
        }
        view.setVisibility(8);
    }
}
