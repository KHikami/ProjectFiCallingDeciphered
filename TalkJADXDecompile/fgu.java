import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

public final class fgu implements fgx {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Context b;

    public fgu(ArrayList arrayList, Context context) {
        this.a = arrayList;
        this.b = context;
    }

    public void a(fbw fbw, bcg bcg) {
    }

    public void a(fbw fbw, bcn bcn) {
        String d = bcn.d();
        String g = bcn.g();
        if (TextUtils.isEmpty(fbw.a)) {
            this.a.add(gwb.a(this.b, fbw.d, d, g));
            return;
        }
        String str;
        String E = gwb.D(d);
        Context H = gwb.H();
        String str2 = fbw.a;
        String str3 = fbw.b;
        String str4 = fbw.d;
        if (TextUtils.isEmpty(d)) {
            str = fbw.e;
        } else {
            str = d;
        }
        edk a = gwb.a(H, str2, str3, null, str4, d, E, str, g, null, null);
        a.E = bcn.l();
        a.B = bcn.j();
        a.A = bcn.k();
        this.a.add(a);
    }
}
