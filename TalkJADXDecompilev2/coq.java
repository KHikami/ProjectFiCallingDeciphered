package defpackage;

import android.accounts.NetworkErrorException;
import android.content.Context;

public class coq extends fhb implements bhi, bhj, bhm {
    private final String a;
    private final String b = blo.i();
    private final String g;

    public coq(bko bko, String str, String str2) {
        super(bko);
        this.g = str2;
        this.a = str;
    }

    public int a(Context context, bhb bhb) {
        blo blo = new blo(context, this.c.a);
        a(blo);
        blf.d(blo, this.a);
        return bhn.a;
    }

    public String b() {
        return this.a;
    }

    public bhk c() {
        return bhk.NONE;
    }

    void a(blo blo) {
        if (!blo.a(this.a) && blo.s(this.a) == 2 && czj.i()) {
            this.c.c.a(new coo(this.b, this.a, this.g), -1);
            return;
        }
        ayo bow = new bow(this.a, blo.h(), box.REMOVE_PARTICIPANT_FROM_CONVERSATION);
        ((gid) jyn.a(blo.f(), gid.class)).a(bow, new NetworkErrorException(), bow.a());
    }
}
