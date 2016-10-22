import android.app.Activity;
import android.app.ProgressDialog;
import java.util.ArrayList;

public final class epi extends iiq<Void, Void, ArrayList<edk>> {
    public final Activity a;
    public final boolean b;
    public final int c;
    public final long d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public dhz h;
    public ArrayList<edk> i;
    private final String k;
    private final bko l;
    private final int m;
    private final boolean n;

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    public epi(Activity activity, bko bko, String str, boolean z, int i, boolean z2, int i2) {
        this(activity, bko, str, z, i, true, i2, 0, false, false);
    }

    public epi(Activity activity, bko bko, String str, boolean z, int i, boolean z2, int i2, int i3, boolean z3, boolean z4) {
        this.a = activity;
        this.l = bko;
        this.k = str;
        this.n = z;
        this.m = i;
        this.b = z2;
        this.c = i2;
        this.d = glj.b();
        this.e = i3;
        this.f = z3;
        this.g = z4;
    }

    private ArrayList<edk> a() {
        return (ArrayList) new blo(this.a, this.l.g()).H(this.k);
    }

    private void a(ArrayList<edk> arrayList) {
        int i;
        Object obj;
        int i2;
        if (this.m == 1) {
            i = 2;
        } else {
            i = 1;
        }
        edo b = this.l.b();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            obj = arrayList2.get(i3);
            i3++;
            obj = (edk) obj;
            if (obj.b.a(b)) {
                break;
            }
        }
        obj = null;
        arrayList.remove(obj);
        this.i = arrayList;
        boolean b2 = fdq.R.b(((jca) jyn.a(this.a, jca.class)).a());
        if (this.n && b2) {
            i2 = 7;
        } else {
            i2 = 1;
        }
        this.h = new dib(this.l.a(), i2).a(i).a("conversation").b(this.k).a();
        dlh dlh = (dlh) jyn.a(this.a, dlh.class);
        if (this.n) {
            String str = "Babel_calls";
            String str2 = i2 == 1 ? "CONSUMER" : "EXPRESS_LANE";
            glk.a(str, new StringBuilder(String.valueOf(str2).length() + 80).append("StartHangoutTask: starting new call; canCreateExpressLane = ").append(b2).append(" HangoutType = ").append(str2).toString(), new Object[0]);
            dlh.a(this.h, this.i);
            this.a.startActivity(gwb.a(this.h, this.i, this.b, this.c, this.d, this.e, this.f, this.g, b2));
        } else if (this.b) {
            glk.a("Babel_calls", "StartHangoutTask: starting and joining existing call", new Object[0]);
            ProgressDialog show = ProgressDialog.show(this.a, null, this.a.getString(bc.fG));
            show.setProgressStyle(0);
            dlh.a(this.h, new dli(this, show), true, false, false, false);
        } else {
            glk.a("Babel_calls", "StartHangoutTask: starting existing call but not joining", new Object[0]);
            this.a.startActivity(gwb.a(this.h, this.i != null, null, i == 1, this.b, this.c, 2, this.d, this.e, this.f, this.g, true));
        }
    }
}
