package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

class fnl extends fbq<mvp> {
    protected /* synthetic */ omq mo2041a(fbn fbn, AtomicReference atomicReference, AtomicReference atomicReference2) {
        return m15724b(fbn, atomicReference, atomicReference2);
    }

    protected mvp m15724b(fbn fbn, AtomicReference<okw> atomicReference, AtomicReference<okw> atomicReference2) {
        return fbn.m14894a(this.a, atomicReference, atomicReference2);
    }

    protected int mo2040a(Context context, fdo fdo) {
        glk.m17982e("Babel_Registration", "Registration failed for account " + this.a, new Object[0]);
        ((fnq) jyn.m25426a(context, fnc.class)).m15754a(this.a, fdo);
        if (fdo.m15084c() == 141) {
            return bhn.f3350c;
        }
        return bhn.f3351d;
    }

    public final void mo541a(Context context) {
        super.mo541a(context);
        ((fnq) jyn.m25426a(context, fnc.class)).m15754a(this.a, new fdo(120));
    }

    protected void m15721a(Context context, mvp mvp) {
        fnh fnh = (fnh) jyn.m25426a(context, fnh.class);
        if (fnh.m15708c()) {
            String b = fnh.m15707b();
            ((iih) jyn.m25426a(context, iih.class)).mo1979a(this.a).mo1693b().mo1714c(3226);
            long a = giw.m17752a();
            mvi mvi = new mvi();
            mvi.f28473a = "social";
            mvi.f28474b = context.getPackageName();
            mvl mvl = new mvl();
            mvi.f28475c = mvl;
            mvw mvw = new mvw();
            mvl.f28487b = mvw;
            mvw.f28524a = 1;
            mvw.f28525b = false;
            mvl.f28489d = Locale.getDefault().toString();
            List arrayList = new ArrayList();
            mvm mvm = new mvm();
            mvm.f28493a = context.getPackageName();
            String g = fde.m15023g(this.a);
            mvm.f28494b = new fng((gmp) jyn.m25426a(context, gmp.class), g).m15700a(context.getResources().getConfiguration().smallestScreenWidthDp).m15702a(context, this.a).m15703a(dgg.m11692a()).m15701a(this.a, (fvv) jyn.m25426a(context, fvv.class)).m15704a();
            List arrayList2 = new ArrayList();
            mvq mvq = new mvq();
            mvq.f28505b = new mvt();
            mvq.f28505b.f28518b = a;
            mvq.f28505b.f28517a = b;
            mvq.f28505b.f28520d = context.getPackageName();
            arrayList2.add(mvq);
            mvm.f28495c = (mvq[]) arrayList2.toArray(new mvq[arrayList2.size()]);
            List arrayList3 = new ArrayList();
            mvx mvx = new mvx();
            mvx.f28527a = "conserver.google.com";
            mvx.f28528b = "babel";
            arrayList3.add(mvx);
            mvx mvx2 = new mvx();
            mvx2.f28527a = "mesi.google.com";
            String str = "call/";
            String valueOf = String.valueOf(g);
            mvx2.f28528b = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
            arrayList3.add(mvx2);
            mvm.f28497e = (mvx[]) arrayList3.toArray(new mvx[arrayList3.size()]);
            arrayList.add(mvm);
            mvl.f28491f = (mvm[]) arrayList.toArray(new mvm[arrayList.size()]);
            b = String.valueOf(mvi);
            glk.m17970a("Babel_Registration", new StringBuilder(String.valueOf(b).length() + 31).append("Send register account request: ").append(b).toString(), new Object[0]);
            valueOf = String.valueOf(mvp.m33110a(mvi));
            glk.m17970a("Babel_Registration", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Receive register account response: ").append(valueOf).toString(), new Object[0]);
            return;
        }
        throw new fdo(141);
    }

    public String mo542b() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.a).toString();
    }

    public bhk mo543c() {
        return bhk.NONE;
    }
}
