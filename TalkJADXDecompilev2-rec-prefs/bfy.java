package p000;

import java.util.concurrent.TimeUnit;

public final class bfy {
    public final long f3238a;
    public final byte[] f3239b;
    final /* synthetic */ beq f3240c;

    public bfy(beq beq, long j, String str, mdu mdu) {
        this.f3240c = beq;
        ba.m4610b(mdu.f27534a.f28411a.equals(str), (Object) "CallerIdPhone number does not match token data");
        this.f3239b = nzf.m1029a((nzf) mdu);
        this.f3238a = (TimeUnit.MICROSECONDS.toMillis(gwb.m1523a(mdu.f27536c)) + j) - bew.f3165a;
    }
}
