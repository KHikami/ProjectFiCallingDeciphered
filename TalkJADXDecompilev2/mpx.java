package defpackage;

import java.util.Calendar;
import java.util.Date;

public final class mpx extends mpz {
    final String a;

    protected /* synthetic */ Object a(Object obj, mon mon) {
        return b(obj, mon);
    }

    public mpx(mog mog, int i, mpw mpw, boolean z) {
        super(mog, i);
        this.a = mog.a(new StringBuilder("%")).append(z ? 'T' : 't').append(mpw.a()).toString();
    }

    public String a() {
        return this.a;
    }

    private mps<Object> b(Object obj, mon mon) {
        Object obj2;
        if ((obj instanceof Long) || (obj instanceof Date) || (obj instanceof Calendar)) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            return new mpy(this, obj, mon);
        }
        return mon.a((mpz) this, obj);
    }
}
