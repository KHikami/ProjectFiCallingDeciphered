package defpackage;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;

/* compiled from: PG */
/* renamed from: alj */
public final class alj implements amy {
    final Context a;
    final ys b;
    final aup c;
    private final FragmentManager d;

    public alj(Context context, FragmentManager fragmentManager, ys ysVar, aup aup) {
        this.a = context;
        this.d = fragmentManager;
        this.b = ysVar;
        this.c = aup;
    }

    public final void a(String str, String str2, String str3, int i) {
        auc.a(str, buf.J(this.a).d(), new alk(this, str2, str3, i), null).show(this.d, "BlockReportSpamDialog");
    }

    public final void b(String str, String str2, String str3, int i) {
        boolean a = buf.J(this.a).a();
        aug alm = new alm(this, str2, str3, i);
        DialogFragment aub = new aub();
        aub.c = str;
        aub.d = alm;
        aub.e = null;
        aub.a = a;
        aub.show(this.d, "BlockDialog");
    }

    public final void a(String str, String str2, String str3, Integer num, boolean z, int i) {
        aug alo = new alo(this, z, str2, str3, i, num);
        DialogFragment auj = new auj();
        auj.c = str;
        auj.a = z;
        auj.d = alo;
        auj.e = null;
        auj.show(this.d, "UnblockDialog");
    }

    public final void c(String str, String str2, String str3, int i) {
        aui.a(str, new alq(this, str2, str3, i), null).show(this.d, "NotSpamDialog");
    }
}
