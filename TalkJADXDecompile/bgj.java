import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class bgj implements bhf, bhh, bhj, bhm {
    private final int a;
    private final long b;
    private final List<String> c;
    private final bhr d;
    private transient blo e;

    bgj(int i, long j, List<String> list) {
        this.a = i;
        this.b = j;
        this.c = list;
        this.d = new bhs().d(j).a();
    }

    public bhr a() {
        return this.d;
    }

    public void a(Context context) {
    }

    public String b() {
        return getClass().getName();
    }

    public bhk c() {
        return bhk.USE_OLD;
    }

    public bhu d() {
        return new bhv().a();
    }

    public int a(Context context, bhb bhb) {
        if (this.e == null) {
            this.e = new blo(context, this.a);
        }
        List v = this.e.v();
        Collection arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (String str : this.c) {
            if (v.contains(str)) {
                arrayList.add(new euw(str, true, false, false, null, 0, null, 0, null));
                arrayList2.add(str);
            }
        }
        if (arrayList.size() > 0) {
            bko e = fde.e(this.a);
            if (e != null) {
                fdn e2 = fde.e(e);
                if (e2 != null) {
                    e2.a(arrayList, -1);
                    long a = gwb.a(context, "babel_call_media_type_refresh_log_delay_ms", fls.x);
                    ((bhl) jyn.a(context, bhl.class)).a(new bgk(this.a, a, arrayList2));
                    glk.a("Babel_CMTRTask", "call_media_type refresh logging task scheduled with a delay of %d ms and %d conversations for account %d.", Long.valueOf(a), Integer.valueOf(arrayList2.size()), Integer.valueOf(this.a));
                } else {
                    glk.d("Babel_CMTRTask", "BabelClient is null for account %d.", Integer.valueOf(this.a));
                }
            } else {
                glk.d("Babel_CMTRTask", "Account id is not valid: %d.", Integer.valueOf(this.a));
            }
        }
        return bhn.a;
    }
}
