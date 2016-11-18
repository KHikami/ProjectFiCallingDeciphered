package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import java.util.List;

final class ece extends ebf {
    final List<String> h;

    static void b(Context context, int i) {
        String c = ecm.c(context, i);
        gw a = gw.a(context);
        ecm.a(c, 2);
        a.a(c, 2);
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
        iil.a("Expected condition to be true", z);
        this.h = list;
        if (list.size() == 1) {
            this.b = (String) list.get(0);
            this.f = gjj.a();
            this.c = context.getString(bc.eR);
            b(this.f);
            c(this.f);
            return;
        }
        this.b = context.getString(bc.eT, new Object[]{Integer.valueOf(r0)});
        this.c = a(string);
    }

    private StringBuilder a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        for (String str2 : this.h) {
            i++;
            if (i == 8 && this.h.size() > 8) {
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

    protected void a(boolean z) {
        this.w.a(this.b).c(this.c).b(this.c).a(this.d);
        if (this.h.size() > 1) {
            this.y.a(this.b);
        } else {
            this.y.a(this.c);
        }
        ga gaVar = new ga(this.w);
        a(gaVar);
        this.v = gaVar;
        super.a(z);
    }

    private void a(ga gaVar) {
        int size = this.h.size();
        if (size == 1) {
            gaVar.b(this.c);
            return;
        }
        int i = 0;
        for (String str : this.h) {
            i++;
            if (i != 8 || size <= 8) {
                gaVar.b(str);
            } else {
                gaVar.b("...");
                return;
            }
        }
    }

    protected void a() {
        if (((fuz) jyn.a(this.r, fuz.class)).b(this.s)) {
            if (eao.a(this.r) && this.t.size() == 1) {
                hg a = ecm.a(this.r);
                Intent a2 = BabelGatewayActivity.a(this.r, this.s, this.t.a());
                a2.setFlags(268468224);
                a2.putExtra("opened_from_impression", 2259);
                fs fsVar = new fs(R$drawable.bc, this.r.getString(bc.ht), PendingIntent.getActivity(this.r, w(), a2, 134217728));
                fsVar.a(a);
                this.x.a(fsVar.b());
            }
            super.a();
        }
    }

    protected int f() {
        return 2;
    }

    protected boolean k() {
        return false;
    }

    protected boolean b() {
        return true;
    }

    protected Intent i() {
        if (this.h.size() != 1) {
            return gwb.h(fde.e(this.s));
        }
        Intent a = gwb.a(this.s, this.f, this.e);
        a.putExtra("opened_from_impression", 1638);
        return a;
    }

    protected int g() {
        return 1;
    }

    protected int l() {
        return R$drawable.cr;
    }
}
