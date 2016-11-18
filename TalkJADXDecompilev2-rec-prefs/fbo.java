package p000;

import android.content.Context;
import io.grpc.internal.C0196c;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.CronetEngine;

class fbo {
    private final CronetEngine f12639a;
    private final Context f12640b;

    fbo(Context context) {
        this.f12640b = context.getApplicationContext();
        this.f12639a = (CronetEngine) jyn.m25426a(context, CronetEngine.class);
    }

    ojn m14896a(int i, fbr fbr) {
        String str;
        Collection arrayList = new ArrayList();
        okw okw = new okw();
        okw.m33488a(olf.a("X-Goog-Api-Key", okw.f28746b), (Object) "AIzaSyDEyIUMKSiOW-j3IqAzerwecUE4nfFBnfY");
        gmp gmp = (gmp) jyn.m25426a(this.f12640b, gmp.class);
        okw.m33488a(olf.a("client-application-name", okw.f28746b), (Object) "ANDROID");
        okw.m33488a(olf.a("client-application-version", okw.f28746b), gmp.mo2300c());
        arrayList.add(gwb.m1724a(okw));
        dzh a = dzg.m13144a(fbr.m14912a());
        String a2 = fde.m15018e(i).m5629a();
        if (a == null) {
            str = null;
        } else {
            str = a.m13145a(a2);
        }
        arrayList.add(new omd(new fbp(str)));
        C0196c a3 = ome.a(fbr.m14913a(this.f12640b.getSharedPreferences("rpc", 0).getString("grpc_server_type", fbs.PROD.name())), 443, this.f12639a);
        a3.f18409b.addAll(arrayList);
        return a3.c();
    }
}
