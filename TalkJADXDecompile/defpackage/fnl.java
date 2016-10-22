package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import omq;

/* renamed from: fnl */
class fnl extends fbq<mvp> {
    protected /* synthetic */ omq a(fbn fbn, AtomicReference atomicReference, AtomicReference atomicReference2) {
        return b(fbn, atomicReference, atomicReference2);
    }

    protected mvp b(fbn fbn, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2) {
        return fbn.a(this.a, atomicReference, atomicReference2);
    }

    protected int a(Context context, fdo fdo) {
        glk.e("Babel_Registration", "Registration failed for account " + this.a, new Object[0]);
        ((fnq) jyn.a(context, fnc.class)).a(this.a, fdo);
        if (fdo.c() == 141) {
            return bhn.c;
        }
        return bhn.d;
    }

    public final void a(Context context) {
        super.a(context);
        ((fnq) jyn.a(context, fnc.class)).a(this.a, new fdo(120));
    }

    protected void a(Context context, mvp mvp) {
        fnh fnh = (fnh) jyn.a(context, fnh.class);
        if (fnh.c()) {
            String b = fnh.b();
            ((iih) jyn.a(context, iih.class)).a(this.a).b().c(3226);
            long a = giw.a();
            mvi mvi = new mvi();
            mvi.a = "social";
            mvi.b = context.getPackageName();
            mvl mvl = new mvl();
            mvi.c = mvl;
            mvw mvw = new mvw();
            mvl.b = mvw;
            mvw.a = 1;
            mvw.b = false;
            mvl.d = Locale.getDefault().toString();
            List arrayList = new ArrayList();
            mvm mvm = new mvm();
            mvm.a = context.getPackageName();
            String g = fde.g(this.a);
            mvm.b = new fng((gmp) jyn.a(context, gmp.class), g).a(context.getResources().getConfiguration().smallestScreenWidthDp).a(context, this.a).a(dgg.a()).a(this.a, (fvv) jyn.a(context, fvv.class)).a();
            List arrayList2 = new ArrayList();
            mvq mvq = new mvq();
            mvq.b = new mvt();
            mvq.b.b = a;
            mvq.b.a = b;
            mvq.b.d = context.getPackageName();
            arrayList2.add(mvq);
            mvm.c = (mvq[]) arrayList2.toArray(new mvq[arrayList2.size()]);
            List arrayList3 = new ArrayList();
            mvx mvx = new mvx();
            mvx.a = "conserver.google.com";
            mvx.b = "babel";
            arrayList3.add(mvx);
            mvx mvx2 = new mvx();
            mvx2.a = "mesi.google.com";
            String str = "call/";
            String valueOf = String.valueOf(g);
            mvx2.b = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            arrayList3.add(mvx2);
            mvm.e = (mvx[]) arrayList3.toArray(new mvx[arrayList3.size()]);
            arrayList.add(mvm);
            mvl.f = (mvm[]) arrayList.toArray(new mvm[arrayList.size()]);
            b = String.valueOf(mvi);
            glk.a("Babel_Registration", new StringBuilder(String.valueOf(b).length() + 31).append("Send register account request: ").append(b).toString(), new Object[0]);
            valueOf = String.valueOf(mvp.a(mvi));
            glk.a("Babel_Registration", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Receive register account response: ").append(valueOf).toString(), new Object[0]);
            return;
        }
        throw new fdo(141);
    }

    public String b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString();
    }

    public bhk c() {
        return bhk.NONE;
    }
}
