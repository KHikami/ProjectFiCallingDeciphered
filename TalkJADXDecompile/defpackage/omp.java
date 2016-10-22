package defpackage;

import java.io.InputStream;
import nyt;
import omo;

/* renamed from: omp */
public final class omp implements oli<T> {
    final /* synthetic */ omn a;

    public omp(omn omn) {
        this.a = omn;
    }

    public /* synthetic */ InputStream a(Object obj) {
        return new omo((nzf) obj);
    }

    public /* synthetic */ Object a(InputStream inputStream) {
        return b(inputStream);
    }

    private T b(InputStream inputStream) {
        try {
            byte[] a = mqy.a(inputStream);
            nyt a2 = nyt.a(a, 0, a.length);
            a2.c(Integer.MAX_VALUE);
            T a3 = this.a.a();
            a3.a(a2);
            return a3;
        } catch (Throwable e) {
            throw olv.p.a("Failed parsing nano proto message").b(e).e();
        }
    }
}
