import android.content.Context;
import android.net.Uri.Builder;
import java.util.ArrayList;
import java.util.List;

final class dxv implements bjm {
    private final Context a;
    private final int b;

    dxv(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public void a() {
    }

    public bjg a(String str) {
        List a = a("phone_number", str);
        if (a.size() == 1) {
            return (bjg) a.get(0);
        }
        return null;
    }

    public Iterable<bjg> b(String str) {
        return a("phone_number", str);
    }

    public Iterable<bjg> c(String str) {
        return a("gaia_id", str);
    }

    private List<bjg> a(String str, String str2) {
        List<bjg> arrayList = new ArrayList();
        Builder buildUpon = dwz.g.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(this.b));
        buildUpon.appendQueryParameter(str, str2);
        dxb dxb = new dxb(null, this.a.getContentResolver().query(buildUpon.build(), dxa.c(), null, null, null));
        while (dxb.moveToNext()) {
            try {
                arrayList.add(dxb.a());
            } finally {
                dxb.close();
            }
        }
        return arrayList;
    }

    public boolean b() {
        return true;
    }
}
