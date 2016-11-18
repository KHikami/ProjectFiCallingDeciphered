package p000;

import android.accounts.NetworkErrorException;
import android.content.Context;

public class coq extends fhb implements bhi, bhj, bhm {
    private final String f8726a;
    private final String f8727b = blo.m5900i();
    private final String f8728g;

    public coq(bko bko, String str, String str2) {
        super(bko);
        this.f8728g = str2;
        this.f8726a = str;
    }

    public int mo539a(Context context, bhb bhb) {
        blo blo = new blo(context, this.f5736c.f12721a);
        m10547a(blo);
        blf.m5821d(blo, this.f8726a);
        return bhn.f3348a;
    }

    public String mo542b() {
        return this.f8726a;
    }

    public bhk mo543c() {
        return bhk.NONE;
    }

    void m10547a(blo blo) {
        if (!blo.m5871a(this.f8726a) && blo.m6102s(this.f8726a) == 2 && czj.m11296i()) {
            this.f5736c.f12723c.m15078a(new coo(this.f8727b, this.f8726a, this.f8728g), -1);
            return;
        }
        ayo bow = new bow(this.f8726a, blo.m6061h(), box.REMOVE_PARTICIPANT_FROM_CONVERSATION);
        ((gid) jyn.m25426a(blo.m6049f(), gid.class)).mo2277a(bow, new NetworkErrorException(), bow.m6328a());
    }
}
