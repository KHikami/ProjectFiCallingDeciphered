package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import java.util.List;

final class ece extends ebf {
    final List<String> f11163h;

    static void m13495b(Context context, int i) {
        String c = ecm.m13303c(context, i);
        gw a = gw.m18748a(context);
        ecm.m13301a(c, 2);
        a.m18751a(c, 2);
    }

    ece(Context context, int i, gjj gjj, int i2, List<String> list, long j) {
        boolean z;
        super(context, i, i2, gjj, j);
        String string = context.getString(bc.cB);
        if (list.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        this.f11163h = list;
        if (list.size() == 1) {
            this.b = (String) list.get(0);
            this.f = gjj.m17807a();
            this.c = context.getString(bc.eR);
            m13308b(this.f);
            m13312c(this.f);
            return;
        }
        this.b = context.getString(bc.eT, new Object[]{Integer.valueOf(r0)});
        this.c = m13493a(string);
    }

    private StringBuilder m13493a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (String str2 : this.f11163h) {
            i++;
            if (i == 8 && this.f11163h.size() > 8) {
                stringBuilder.append("...");
                break;
            }
            if (i > 1) {
                stringBuilder.append(str);
            }
            stringBuilder.append(str2);
        }
        return stringBuilder;
    }

    protected void mo1807a(boolean z) {
        this.w.m16429a(this.b).m16440c(this.c).m16436b(this.c).m16419a(this.d);
        if (this.f11163h.size() > 1) {
            this.y.m16429a(this.b);
        } else {
            this.y.m16429a(this.c);
        }
        ga gaVar = new ga(this.w);
        m13494a(gaVar);
        this.v = gaVar;
        super.mo1807a(z);
    }

    private void m13494a(ga gaVar) {
        int size = this.f11163h.size();
        if (size == 1) {
            gaVar.m16798b(this.c);
            return;
        }
        int i = 0;
        for (String str : this.f11163h) {
            i++;
            if (i != 8 || size <= 8) {
                gaVar.m16798b(str);
            } else {
                gaVar.m16798b("...");
                return;
            }
        }
    }

    protected void mo1806a() {
        if (((fuz) jyn.m25426a(this.r, fuz.class)).m16294b(this.s)) {
            if (eao.m13368a(this.r) && this.t.size() == 1) {
                hg a = ecm.m13296a(this.r);
                Intent a2 = BabelGatewayActivity.m8799a(this.r, this.s, this.t.m17807a());
                a2.setFlags(268468224);
                a2.putExtra("opened_from_impression", 2259);
                fs fsVar = new fs(R$drawable.bc, this.r.getString(bc.ht), PendingIntent.getActivity(this.r, m13331w(), a2, 134217728));
                fsVar.m16109a(a);
                this.x.m18069a(fsVar.m16111b());
            }
            super.mo1806a();
        }
    }

    protected int mo1810f() {
        return 2;
    }

    protected boolean mo1815k() {
        return false;
    }

    protected boolean mo1808b() {
        return true;
    }

    protected Intent mo1813i() {
        if (this.f11163h.size() != 1) {
            return gwb.m2228h(fde.m15018e(this.s));
        }
        Intent a = gwb.m1537a(this.s, this.f, this.e);
        a.putExtra("opened_from_impression", 1638);
        return a;
    }

    protected int mo1811g() {
        return 1;
    }

    protected int mo1816l() {
        return R$drawable.cr;
    }
}
