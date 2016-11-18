package p000;

import android.app.Activity;
import android.app.ProgressDialog;
import java.util.ArrayList;

public final class epi extends iiq<Void, Void, ArrayList<edk>> {
    public final Activity f11974a;
    public final boolean f11975b;
    public final int f11976c;
    public final long f11977d;
    public final int f11978e;
    public final boolean f11979f;
    public final boolean f11980g;
    public dhz f11981h;
    public ArrayList<edk> f11982i;
    private final String f11983k;
    private final bko f11984l;
    private final int f11985m;
    private final boolean f11986n;

    protected /* synthetic */ void onPostExecute(Object obj) {
        m14218a((ArrayList) obj);
    }

    public epi(Activity activity, bko bko, String str, boolean z, int i, boolean z2, int i2) {
        this(activity, bko, str, z, i, true, i2, 0, false, false);
    }

    public epi(Activity activity, bko bko, String str, boolean z, int i, boolean z2, int i2, int i3, boolean z3, boolean z4) {
        this.f11974a = activity;
        this.f11984l = bko;
        this.f11983k = str;
        this.f11986n = z;
        this.f11985m = i;
        this.f11975b = z2;
        this.f11976c = i2;
        this.f11977d = glj.m17963b();
        this.f11978e = i3;
        this.f11979f = z3;
        this.f11980g = z4;
    }

    private ArrayList<edk> m14217a() {
        return (ArrayList) new blo(this.f11974a, this.f11984l.m5638g()).m5916H(this.f11983k);
    }

    private void m14218a(ArrayList<edk> arrayList) {
        int i;
        Object obj;
        int i2;
        if (this.f11985m == 1) {
            i = 2;
        } else {
            i = 1;
        }
        edo b = this.f11984l.m5632b();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            obj = arrayList2.get(i3);
            i3++;
            obj = (edk) obj;
            if (obj.f11213b.m13608a(b)) {
                break;
            }
        }
        obj = null;
        arrayList.remove(obj);
        this.f11982i = arrayList;
        boolean b2 = fdq.f12776R.m14370b(((jca) jyn.m25426a(this.f11974a, jca.class)).mo2317a());
        if (this.f11986n && b2) {
            i2 = 7;
        } else {
            i2 = 1;
        }
        this.f11981h = new dib(this.f11984l.m5629a(), i2).m11911a(i).m11912a("conversation").m11913b(this.f11983k).m11910a();
        dlh dlh = (dlh) jyn.m25426a(this.f11974a, dlh.class);
        if (this.f11986n) {
            String str = "Babel_calls";
            String str2 = i2 == 1 ? "CONSUMER" : "EXPRESS_LANE";
            glk.m17970a(str, new StringBuilder(String.valueOf(str2).length() + 80).append("StartHangoutTask: starting new call; canCreateExpressLane = ").append(b2).append(" HangoutType = ").append(str2).toString(), new Object[0]);
            dlh.mo1410a(this.f11981h, this.f11982i);
            this.f11974a.startActivity(gwb.m1548a(this.f11981h, this.f11982i, this.f11975b, this.f11976c, this.f11977d, this.f11978e, this.f11979f, this.f11980g, b2));
        } else if (this.f11975b) {
            glk.m17970a("Babel_calls", "StartHangoutTask: starting and joining existing call", new Object[0]);
            ProgressDialog show = ProgressDialog.show(this.f11974a, null, this.f11974a.getString(bc.fG));
            show.setProgressStyle(0);
            dlh.mo1409a(this.f11981h, new dli(this, show), true, false, false, false);
        } else {
            glk.m17970a("Babel_calls", "StartHangoutTask: starting existing call but not joining", new Object[0]);
            this.f11974a.startActivity(gwb.m1552a(this.f11981h, this.f11982i != null, null, i == 1, this.f11975b, this.f11976c, 2, this.f11977d, this.f11978e, this.f11979f, this.f11980g, true));
        }
    }
}
