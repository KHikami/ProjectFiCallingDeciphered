package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: dkj */
public final class dkj implements dhd {
    private /* synthetic */ dkh a;

    public dkj(dkh dkh) {
        this.a = dkh;
    }

    public final /* synthetic */ InputStream a(Object obj) {
        return new dki((dem) obj);
    }

    public final /* synthetic */ Object a(InputStream inputStream) {
        return b(inputStream);
    }

    private dem b(InputStream inputStream) {
        try {
            dee a = dee.a(dbv.a(inputStream));
            int i = a.c;
            a.c = Integer.MAX_VALUE;
            dem a2 = this.a.a();
            a2.a(a);
            return a2;
        } catch (Throwable e) {
            throw dhn.i.a("Failed parsing nano proto message").b(e).b();
        }
    }
}
