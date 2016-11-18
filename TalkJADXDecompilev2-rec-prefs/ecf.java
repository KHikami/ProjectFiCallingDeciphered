package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.notifications.DndDialogActivity;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class ecf extends ebz {
    private final boolean f11164a;

    static void m13504a(Context context, int i) {
        String c = ecm.m13303c(context, i);
        gw a = gw.m18748a(context);
        ecm.m13301a(c, 0);
        a.m18751a(c, 0);
        if (d) {
            new StringBuilder(String.valueOf(c).length() + 56).append("MultiConversationNotifier.cancel [tag=]").append(c).append(" [id=]0");
        }
    }

    ecf(Context context, int i, eap eap, ebz ebz, boolean z) {
        super(context, i, eap);
        this.f11164a = z;
        this.j = null;
        this.k = 0;
        this.e = ebz.f11041g;
        this.f = ebz.f11042h;
        this.g = context.getResources().getQuantityString(gwb.ik, eap.f11059a, new Object[]{Integer.valueOf(eap.f11059a)});
        this.i = gwb.m2228h(fde.m15018e(i));
        this.i.putExtra("is_chat_notification", true);
        int i2 = 0;
        while (i2 < eap.f11060b.size()) {
            ear ear = (ear) eap.f11060b.get(i2);
            if (ear.f11068h.get(0) instanceof ebs) {
                m13312c(ear.f11061a);
                if (eao.m13372c(context) && i2 < 10) {
                    List arrayList = new ArrayList();
                    arrayList.add(ear);
                    this.m.add(new ean(context, i, new eap(ear.f11069i, arrayList), i2, false));
                }
            }
            i2++;
        }
    }

    protected void mo1807a(boolean z) {
        gl gaVar = new ga(this.w);
        this.v = gaVar;
        this.w.m16429a(this.g);
        String string = this.r.getString(bc.cB);
        CharSequence stringBuilder = new StringBuilder();
        long j = 0;
        for (int i = 0; i < this.n.f11060b.size(); i++) {
            String quantityString;
            CharSequence stringBuilder2;
            ear ear = (ear) this.n.f11060b.get(i);
            if (ear.f11067g > j) {
                j = ear.f11067g;
            }
            ecj ecj = (ecj) ear.f11068h.get(0);
            if (ecj instanceof ebq) {
                StringBuilder stringBuilder3 = new StringBuilder(((ebq) ecj).r);
                for (int i2 = 1; i2 < ear.f11068h.size(); i2++) {
                    stringBuilder3.append(", ");
                    stringBuilder3.append(((ecj) ear.f11068h.get(i2)).f11114r);
                }
                quantityString = this.r.getResources().getQuantityString(gwb.ii, ear.f11069i, new Object[]{Integer.valueOf(ear.f11069i)});
                stringBuilder2 = stringBuilder3.toString();
                this.j = null;
                this.k = 0;
            } else if (ear.f11063c) {
                quantityString = ear.f11066f;
                stringBuilder2 = null;
                this.j = null;
                this.k = 0;
            } else {
                ebs ebs = (ebs) ecj;
                stringBuilder2 = ebs.f11124b;
                this.j = ebs.f11125c;
                this.k = ebs.f11126d;
                quantityString = ebs.s;
            }
            gaVar.m16798b(m13335a(quantityString, stringBuilder2, this.j, this.k));
            if (quantityString != null) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(string);
                }
                stringBuilder.append(quantityString);
            }
        }
        this.h = stringBuilder;
        this.w.m16436b(stringBuilder).m16440c(m13348m()).m16419a(j / 1000);
        super.mo1807a(z);
    }

    protected void mo1806a() {
        this.w.m16437b(Integer.toString(this.s)).m16449f(true);
        this.w.m16418a(R$drawable.by, this.r.getString(bc.bu), PendingIntent.getActivity(this.r, super.m13330v(), DndDialogActivity.m8757a(this.r, this.s), 134217728));
        if (eao.m13368a(this.r)) {
            Intent a = DndDialogActivity.m8757a(this.r, this.s);
            a.putExtra("opened_from_impression", 2258);
            fs fsVar = new fs(R$drawable.bb, this.r.getString(bc.bu), PendingIntent.getActivity(this.r, super.m13330v() + 1, a, 134217728));
            Collection a2 = ((fuz) jyn.m25426a(this.r, fuz.class)).m16287a();
            fsVar.m16109a(new hh("dnd_duration_choice").m19778a(this.r.getString(bc.bt)).m19780a((CharSequence[]) a2.toArray(new String[a2.size()])).m19779a(false).m19777a());
            this.x.m18069a(fsVar.m16111b());
        }
        super.mo1806a();
    }

    protected int mo1821p() {
        return super.mo1821p() + 2;
    }

    protected void mo1809c() {
        super.mo1809c();
        gwb.m1823a(fde.m15018e(this.s), 1928);
        m13338b(this.f11164a);
        ebs.m13479a(this.s, this.n.f11060b, (int) HttpStatusCodes.STATUS_CODE_METHOD_NOT_ALLOWED, 463, this.f11164a, null);
    }

    protected void mo1820e() {
        ebs.m13479a(this.s, this.n.f11060b, 406, 0, this.f11164a, null);
    }
}
