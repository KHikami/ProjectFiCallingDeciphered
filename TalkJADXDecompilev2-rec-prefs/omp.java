package p000;

import java.io.InputStream;

public final class omp implements oli<T> {
    final /* synthetic */ omn f28795a;

    public omp(omn omn) {
        this.f28795a = omn;
    }

    public /* synthetic */ InputStream mo3955a(Object obj) {
        return new omo((nzf) obj);
    }

    public /* synthetic */ Object mo3956a(InputStream inputStream) {
        return m33511b(inputStream);
    }

    private T m33511b(InputStream inputStream) {
        try {
            byte[] a = mqy.m32744a(inputStream);
            nyt a2 = nyt.a(a, 0, a.length);
            a2.c(Integer.MAX_VALUE);
            T a3 = this.f28795a.m33510a();
            a3.mo150a(a2);
            return a3;
        } catch (Throwable e) {
            throw olv.f28765p.m33498a("Failed parsing nano proto message").m33503b(e).m33506e();
        }
    }
}
