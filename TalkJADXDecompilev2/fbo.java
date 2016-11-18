package defpackage;

import android.content.Context;
import io.grpc.internal.c;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.CronetEngine;

class fbo {
    private final CronetEngine a;
    private final Context b;

    fbo(Context context) {
        this.b = context.getApplicationContext();
        this.a = (CronetEngine) jyn.a(context, CronetEngine.class);
    }

    ojn a(int i, fbr fbr) {
        String str;
        Collection arrayList = new ArrayList();
        okw okw = new okw();
        okw.a(olf.a("X-Goog-Api-Key", okw.b), (Object) "AIzaSyDEyIUMKSiOW-j3IqAzerwecUE4nfFBnfY");
        gmp gmp = (gmp) jyn.a(this.b, gmp.class);
        okw.a(olf.a("client-application-name", okw.b), (Object) "ANDROID");
        okw.a(olf.a("client-application-version", okw.b), gmp.c());
        arrayList.add(gwb.a(okw));
        dzh a = dzg.a(fbr.a());
        String a2 = fde.e(i).a();
        if (a == null) {
            str = null;
        } else {
            str = a.a(a2);
        }
        arrayList.add(new omd(new fbp(str)));
        c a3 = ome.a(fbr.a(this.b.getSharedPreferences("rpc", 0).getString("grpc_server_type", fbs.PROD.name())), 443, this.a);
        a3.b.addAll(arrayList);
        return a3.c();
    }
}
