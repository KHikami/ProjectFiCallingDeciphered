package p000;

import android.content.Context;
import android.net.Uri.Builder;
import java.util.ArrayList;
import java.util.List;

final class dxv implements bjm {
    private final Context f10783a;
    private final int f10784b;

    dxv(Context context, int i) {
        this.f10783a = context;
        this.f10784b = i;
    }

    public void mo1753a() {
    }

    public bjg mo1752a(String str) {
        List a = m12998a("phone_number", str);
        if (a.size() == 1) {
            return (bjg) a.get(0);
        }
        return null;
    }

    public Iterable<bjg> mo1754b(String str) {
        return m12998a("phone_number", str);
    }

    public Iterable<bjg> mo1756c(String str) {
        return m12998a("gaia_id", str);
    }

    private List<bjg> m12998a(String str, String str2) {
        List<bjg> arrayList = new ArrayList();
        Builder buildUpon = dwz.f6496g.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(this.f10784b));
        buildUpon.appendQueryParameter(str, str2);
        dxb dxb = new dxb(null, this.f10783a.getContentResolver().query(buildUpon.build(), dxa.m12954c(), null, null, null));
        while (dxb.moveToNext()) {
            try {
                arrayList.add(dxb.mo592a());
            } finally {
                dxb.close();
            }
        }
        return arrayList;
    }

    public boolean mo1755b() {
        return true;
    }
}
