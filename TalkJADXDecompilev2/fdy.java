package defpackage;

import com.google.api.client.http.HttpStatusCodes;

final class fdy implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ blr b;
    final /* synthetic */ fhc c;
    final /* synthetic */ long d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fle f;

    fdy(fle fle, int i, blr blr, fhc fhc, long j, boolean z) {
        this.f = fle;
        this.a = i;
        this.b = blr;
        this.c = fhc;
        this.d = j;
        this.e = z;
    }

    public void run() {
        dvm a;
        if (this.f.u) {
            a = ba.c().c(this.f.a).a(this.f.e).b(this.f.b).a(this.f.f);
            if (((fuz) jyn.a(gwb.H(), fuz.class)).a(this.a) || this.b.d || this.c.f() != fhe.LOUD) {
                ba.a(this.a, this.f.O / 1000, 10, a.a(411).a(this.b));
            } else {
                ba.a(this.a, this.f.O / 1000, 10, a.a((int) HttpStatusCodes.STATUS_CODE_UNAUTHORIZED).a(this.b));
                ba.a(this.a, this.d, 10, a.a(402));
            }
            ba.a(this.a, this.f.r / 1000, 1, a.a(1).a(!this.e).a(null));
            ba.a(this.a, this.f.s / 1000, 10, a.a(206).a(null));
            ba.a(this.a, this.f.t / 1000, 10, a.a(207).a(null));
            ba.a(this.a, this.f.N / 1000, 10, a.a(107).a(null));
            ba.a(this.a, this.d, 4, a.a(0).a(this.b));
            return;
        }
        a = ba.c().c(this.f.a).b(this.f.b).a(this.f.f);
        ba.a(this.a, this.f.r / 1000, 1, a.a(this.f.I).b(this.f.J).a(!this.e).a(this.b));
        ba.a(this.a, this.f.t / 1000, 10, a.a((int) HttpStatusCodes.STATUS_CODE_NO_CONTENT).a(null));
        ba.a(this.a, this.f.N / 1000, 10, a.a(108).a(null));
        ba.a(this.a, this.d, 4, a.a(0).a(this.b));
        ba.a(this.a, this.d, 10, a.a(461).a(this.b));
    }
}
