package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

public final class fgu implements fgx {
    final /* synthetic */ ArrayList f13029a;
    final /* synthetic */ Context f13030b;

    public fgu(ArrayList arrayList, Context context) {
        this.f13029a = arrayList;
        this.f13030b = context;
    }

    public void mo1992a(fbw fbw, bcg bcg) {
    }

    public void mo1993a(fbw fbw, bcn bcn) {
        String d = bcn.m4895d();
        String g = bcn.m4898g();
        if (TextUtils.isEmpty(fbw.f12666a)) {
            this.f13029a.add(gwb.m1597a(this.f13030b, fbw.f12669d, d, g));
            return;
        }
        String str;
        String E = gwb.m1382D(d);
        Context H = gwb.m1400H();
        String str2 = fbw.f12666a;
        String str3 = fbw.f12667b;
        String str4 = fbw.f12669d;
        if (TextUtils.isEmpty(d)) {
            str = fbw.f12670e;
        } else {
            str = d;
        }
        edk a = gwb.m1598a(H, str2, str3, null, str4, d, E, str, g, null, null);
        a.f11207E = bcn.m4903l();
        a.f11204B = bcn.m4901j();
        a.f11203A = bcn.m4902k();
        this.f13029a.add(a);
    }
}
