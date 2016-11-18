package p000;

import java.util.Calendar;
import java.util.Date;

public final class mpx extends mpz {
    final String f28097a;

    protected /* synthetic */ Object mo3910a(Object obj, mon mon) {
        return m32679b(obj, mon);
    }

    public mpx(mog mog, int i, mpw mpw, boolean z) {
        super(mog, i);
        this.f28097a = mog.m32617a(new StringBuilder("%")).append(z ? 'T' : 't').append(mpw.m32678a()).toString();
    }

    public String mo3911a() {
        return this.f28097a;
    }

    private mps<Object> m32679b(Object obj, mon mon) {
        Object obj2;
        if ((obj instanceof Long) || (obj instanceof Date) || (obj instanceof Calendar)) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj2 != null) {
            return new mpy(this, obj, mon);
        }
        return mon.m32632a((mpz) this, obj);
    }
}
