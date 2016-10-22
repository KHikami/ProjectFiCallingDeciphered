package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.R$drawable;
import com.google.android.apps.hangouts.notifications.DndDialogActivity;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ecf */
final class ecf extends ebz {
    private final boolean a;

    static void a(Context context, int i) {
        String c = ecm.c(context, i);
        gw a = gw.a(context);
        ecm.a(c, 0);
        a.a(c, 0);
        if (d) {
            new StringBuilder(String.valueOf(c).length() + 56).append("MultiConversationNotifier.cancel [tag=]").append(c).append(" [id=]0");
        }
    }

    ecf(Context context, int i, eap eap, ebz ebz, boolean z) {
        super(context, i, eap);
        this.a = z;
        this.j = null;
        this.k = 0;
        this.e = ebz.g;
        this.f = ebz.h;
        this.g = context.getResources().getQuantityString(gwb.ik, eap.a, new Object[]{Integer.valueOf(eap.a)});
        this.i = gwb.h(fde.e(i));
        this.i.putExtra("is_chat_notification", true);
        int i2 = 0;
        while (i2 < eap.b.size()) {
            ear ear = (ear) eap.b.get(i2);
            if (ear.h.get(0) instanceof ebs) {
                c(ear.a);
                if (eao.c(context) && i2 < 10) {
                    List arrayList = new ArrayList();
                    arrayList.add(ear);
                    this.m.add(new ean(context, i, new eap(ear.i, arrayList), i2, false));
                }
            }
            i2++;
        }
    }

    protected void a(boolean z) {
        gl gaVar = new ga(this.w);
        this.v = gaVar;
        this.w.a(this.g);
        String string = this.r.getString(bc.cB);
        CharSequence stringBuilder = new StringBuilder();
        long j = 0;
        for (int i = 0; i < this.n.b.size(); i++) {
            String quantityString;
            CharSequence stringBuilder2;
            ear ear = (ear) this.n.b.get(i);
            if (ear.g > j) {
                j = ear.g;
            }
            ecj ecj = (ecj) ear.h.get(0);
            if (ecj instanceof ebq) {
                StringBuilder stringBuilder3 = new StringBuilder(((ebq) ecj).r);
                for (int i2 = 1; i2 < ear.h.size(); i2++) {
                    stringBuilder3.append(", ");
                    stringBuilder3.append(((ecj) ear.h.get(i2)).r);
                }
                quantityString = this.r.getResources().getQuantityString(gwb.ii, ear.i, new Object[]{Integer.valueOf(ear.i)});
                stringBuilder2 = stringBuilder3.toString();
                this.j = null;
                this.k = 0;
            } else if (ear.c) {
                quantityString = ear.f;
                stringBuilder2 = null;
                this.j = null;
                this.k = 0;
            } else {
                ebs ebs = (ebs) ecj;
                stringBuilder2 = ebs.b;
                this.j = ebs.c;
                this.k = ebs.d;
                quantityString = ebs.s;
            }
            gaVar.b(a(quantityString, stringBuilder2, this.j, this.k));
            if (quantityString != null) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(string);
                }
                stringBuilder.append(quantityString);
            }
        }
        this.h = stringBuilder;
        this.w.b(stringBuilder).c(m()).a(j / 1000);
        super.a(z);
    }

    protected void a() {
        this.w.b(Integer.toString(this.s)).f(true);
        this.w.a(R$drawable.by, this.r.getString(bc.bu), PendingIntent.getActivity(this.r, super.v(), DndDialogActivity.a(this.r, this.s), 134217728));
        if (eao.a(this.r)) {
            Intent a = DndDialogActivity.a(this.r, this.s);
            a.putExtra("opened_from_impression", 2258);
            fs fsVar = new fs(R$drawable.bb, this.r.getString(bc.bu), PendingIntent.getActivity(this.r, super.v() + 1, a, 134217728));
            Collection a2 = ((fuz) jyn.a(this.r, fuz.class)).a();
            fsVar.a(new hh("dnd_duration_choice").a(this.r.getString(bc.bt)).a((CharSequence[]) a2.toArray(new String[a2.size()])).a(false).a());
            this.x.a(fsVar.b());
        }
        super.a();
    }

    protected int p() {
        return super.p() + 2;
    }

    protected void c() {
        super.c();
        gwb.a(fde.e(this.s), 1928);
        b(this.a);
        ebs.a(this.s, this.n.b, (int) HttpStatusCodes.STATUS_CODE_METHOD_NOT_ALLOWED, 463, this.a, null);
    }

    protected void e() {
        ebs.a(this.s, this.n.b, 406, 0, this.a, null);
    }
}
