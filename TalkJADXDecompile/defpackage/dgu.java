package defpackage;

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
import oa;

/* renamed from: dgu */
public final class dgu implements kcj, kcm, kcq {
    private static final boolean k;
    final dgg a;
    private final dgx b;
    private final dw c;
    private final Resources d;
    private final Handler e;
    private int f;
    private dgy g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final Runnable l;

    static {
        k = VERSION.SDK_INT >= 21;
    }

    public dgu(dw dwVar, kbu kbu) {
        this.a = dgg.a();
        this.b = new dgx(this);
        this.e = new Handler(Looper.getMainLooper());
        this.f = 0;
        this.g = dgy.NONE;
        this.l = new dgv(this);
        this.c = dwVar;
        this.d = dwVar.getResources();
        kbu.a((kcq) this);
    }

    public void R_() {
        this.a.a(this.b);
        this.h = true;
        c();
    }

    public void T_() {
        this.a.b(this.b);
        this.h = false;
        c();
    }

    public void a(int i) {
        this.f = i;
        c();
    }

    void c() {
        dgy dgy;
        did s = this.a.s();
        if (!this.h || this.f != 2 || s == null || s.N()) {
            dgy = dgy.NONE;
        } else {
            boolean z;
            boolean C = s.C();
            if (s.H() == 0) {
                z = true;
            } else {
                z = false;
            }
            dgy = (C && z) ? s.K() ? dgy.OUTGOING_AUDIO : dgy.OUTGOING_VIDEO : (C || this.a.m()) ? dgy.NONE : dgy.STILL_JOINING;
        }
        if (dgy != this.g) {
            boolean z2;
            if (this.g == dgy.STILL_JOINING) {
                z2 = true;
            } else {
                z2 = false;
            }
            View findViewById = this.c.findViewById(ba.by);
            ((FixedParticipantsView) findViewById.findViewById(ba.bv)).a();
            findViewById.setVisibility(8);
            findViewById = this.c.findViewById(ba.bE);
            ((FixedParticipantsView) this.c.findViewById(ba.bv)).a();
            findViewById.animate().setDuration(z2 ? (long) this.d.getInteger(gwb.fA) : 0).translationY(this.d.getDimension(gwb.eQ));
            this.e.removeCallbacks(this.l);
            a(false, z2);
            this.g = dgy;
            TextView textView;
            FixedParticipantsView fixedParticipantsView;
            CharSequence string;
            switch (dgw.a[this.g.ordinal()]) {
                case wi.j /*1*/:
                    findViewById = this.c.findViewById(ba.by);
                    textView = (TextView) findViewById.findViewById(ba.dR);
                    fixedParticipantsView = (FixedParticipantsView) findViewById.findViewById(ba.bv);
                    List<edk> F = s.F();
                    fixedParticipantsView.setBackgroundResource(F.size() == 1 ? R$drawable.az : 0);
                    fixedParticipantsView.a(s.k(), F);
                    if (s.K()) {
                        bko k = s.k();
                        for (edk edk : F) {
                            if (edk.e() != null) {
                                string = this.d.getString(bc.et, new Object[]{glq.a(this.c, edk.e(), glu.b)});
                            } else if (edk.h() && k.s()) {
                                int i;
                                Resources resources = this.d;
                                if (k.M()) {
                                    i = bc.ev;
                                } else {
                                    i = bc.eu;
                                }
                                string = resources.getString(i, new Object[]{glq.i(this.c, k.u())});
                            }
                            textView.setText(string);
                            textView.setVisibility(0);
                            findViewById.setVisibility(0);
                        }
                        string = this.d.getString(bc.eo);
                        textView.setText(string);
                        textView.setVisibility(0);
                        findViewById.setVisibility(0);
                    }
                    a(s);
                case wi.l /*2*/:
                    List F2 = s.F();
                    textView = (TextView) this.c.findViewById(ba.bE).findViewById(ba.dR);
                    fixedParticipantsView = (FixedParticipantsView) this.c.findViewById(ba.bv);
                    fixedParticipantsView.a(s.k(), F2);
                    fixedParticipantsView.setVisibility(0);
                    switch (F2.size()) {
                        case wi.w /*0*/:
                            string = this.d.getString(bc.eo);
                            break;
                        case wi.j /*1*/:
                            string = String.format(this.d.getString(bc.ep), new Object[]{gwb.a(this.c, (edk) F2.get(0), true)});
                            break;
                        case wi.l /*2*/:
                            string = String.format(this.d.getString(bc.eq), new Object[]{gwb.a(this.c, (edk) F2.get(0), true), gwb.a(this.c, (edk) F2.get(1), true)});
                            break;
                        case wi.z /*3*/:
                            string = String.format(this.d.getString(bc.er), new Object[]{gwb.a(this.c, (edk) F2.get(0), true), gwb.a(this.c, (edk) F2.get(1), true), gwb.a(this.c, (edk) F2.get(2), true)});
                            break;
                        case wi.h /*4*/:
                            string = String.format(this.d.getString(bc.es), new Object[]{gwb.a(this.c, (edk) F2.get(0), true), gwb.a(this.c, (edk) F2.get(1), true), gwb.a(this.c, (edk) F2.get(2), true), gwb.a(this.c, (edk) F2.get(3), true)});
                            break;
                        default:
                            string = String.format(this.d.getString(bc.ew), new Object[]{gwb.a(this.c, (edk) F2.get(0), true), gwb.a(this.c, (edk) F2.get(1), true), gwb.a(this.c, (edk) F2.get(2), true), Integer.valueOf(F2.size() - 3)});
                            break;
                    }
                    textView.setText(string);
                    a(false);
                case wi.z /*3*/:
                    View findViewById2 = this.c.findViewById(ba.bE);
                    textView = (TextView) findViewById2.findViewById(ba.dR);
                    fixedParticipantsView = (FixedParticipantsView) this.c.findViewById(ba.bv);
                    CharSequence string2 = this.d.getString(bc.ek);
                    textView.setText(string2);
                    fixedParticipantsView.a();
                    fixedParticipantsView.setVisibility(8);
                    this.e.postDelayed(this.l, 4000);
                    gld.a(findViewById2, null, string2);
                case wi.h /*4*/:
                default:
                    String valueOf = String.valueOf(this.g);
                    iil.a(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Unsupported overlay type: ").append(valueOf).toString());
            }
        }
    }

    void a(boolean z) {
        this.c.findViewById(ba.bE).animate().setDuration(z ? (long) this.d.getInteger(gwb.fA) : 0).translationY(0.0f);
        a(true, z);
    }

    private void a(boolean z, boolean z2) {
        if (this.i != z) {
            int i;
            this.i = z;
            View findViewById = this.c.findViewById(ba.bK);
            int integer = this.d.getInteger(gwb.fA);
            findViewById.animate().setDuration(z2 ? (long) integer : 0).setListener(new bbu(findViewById)).alpha(z ? 1.0f : 0.0f);
            TransitionDrawable transitionDrawable = (TransitionDrawable) this.c.findViewById(ba.cm).getBackground();
            transitionDrawable.setCrossFadeEnabled(true);
            if (z2) {
                i = integer;
            } else {
                i = 0;
            }
            transitionDrawable.reverseTransition(i);
        }
    }

    void a(did did) {
        int i;
        int i2 = 0;
        boolean z = true;
        View view = (TextView) this.c.findViewById(ba.by).findViewById(ba.U);
        if (k) {
            i = 1;
        } else {
            i = 0;
        }
        oa.d(view, i);
        if (did != null && did.F().size() == 1 && did.J() == 1) {
            List T = did.T();
            if (T.size() == 1) {
                if (!TextUtils.isEmpty(((dii) T.get(0)).b())) {
                    view.setText(this.d.getString(bc.bo, new Object[]{r1}));
                    view.setContentDescription(this.d.getString(bc.bp, new Object[]{r1}));
                    if (!this.j) {
                        this.j = true;
                        gwb.f(1631);
                    }
                    if (!z) {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                    if (z && !k) {
                        gld.a(view, null, view.getContentDescription());
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
