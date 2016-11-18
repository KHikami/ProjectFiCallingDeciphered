package p000;

import com.google.api.client.http.HttpStatusCodes;

final class fdy implements Runnable {
    final /* synthetic */ int f12834a;
    final /* synthetic */ blr f12835b;
    final /* synthetic */ fhc f12836c;
    final /* synthetic */ long f12837d;
    final /* synthetic */ boolean f12838e;
    final /* synthetic */ fle f12839f;

    fdy(fle fle, int i, blr blr, fhc fhc, long j, boolean z) {
        this.f12839f = fle;
        this.f12834a = i;
        this.f12835b = blr;
        this.f12836c = fhc;
        this.f12837d = j;
        this.f12838e = z;
    }

    public void run() {
        dvm a;
        if (this.f12839f.f13395u) {
            a = ba.m4618c().m12798c(this.f12839f.a).m12787a(this.f12839f.e).m12794b(this.f12839f.b).m12789a(this.f12839f.f);
            if (((fuz) jyn.m25426a(gwb.m1400H(), fuz.class)).m16291a(this.f12834a) || this.f12835b.f3744d || this.f12836c.m15317f() != fhe.LOUD) {
                ba.m4548a(this.f12834a, this.f12839f.f13384O / 1000, 10, a.m12786a(411).m12788a(this.f12835b));
            } else {
                ba.m4548a(this.f12834a, this.f12839f.f13384O / 1000, 10, a.m12786a((int) HttpStatusCodes.STATUS_CODE_UNAUTHORIZED).m12788a(this.f12835b));
                ba.m4548a(this.f12834a, this.f12837d, 10, a.m12786a(402));
            }
            ba.m4548a(this.f12834a, this.f12839f.f13392r / 1000, 1, a.m12786a(1).m12791a(!this.f12838e).m12788a(null));
            ba.m4548a(this.f12834a, this.f12839f.f13393s / 1000, 10, a.m12786a(206).m12788a(null));
            ba.m4548a(this.f12834a, this.f12839f.f13394t / 1000, 10, a.m12786a(207).m12788a(null));
            ba.m4548a(this.f12834a, this.f12839f.f13383N / 1000, 10, a.m12786a(107).m12788a(null));
            ba.m4548a(this.f12834a, this.f12837d, 4, a.m12786a(0).m12788a(this.f12835b));
            return;
        }
        a = ba.m4618c().m12798c(this.f12839f.a).m12794b(this.f12839f.b).m12789a(this.f12839f.f);
        ba.m4548a(this.f12834a, this.f12839f.f13392r / 1000, 1, a.m12786a(this.f12839f.f13378I).m12792b(this.f12839f.f13379J).m12791a(!this.f12838e).m12788a(this.f12835b));
        ba.m4548a(this.f12834a, this.f12839f.f13394t / 1000, 10, a.m12786a((int) HttpStatusCodes.STATUS_CODE_NO_CONTENT).m12788a(null));
        ba.m4548a(this.f12834a, this.f12839f.f13383N / 1000, 10, a.m12786a(108).m12788a(null));
        ba.m4548a(this.f12834a, this.f12837d, 4, a.m12786a(0).m12788a(this.f12835b));
        ba.m4548a(this.f12834a, this.f12837d, 10, a.m12786a(461).m12788a(this.f12835b));
    }
}
