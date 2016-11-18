package defpackage;

import java.util.concurrent.TimeUnit;

public final class bfy {
    public final long a;
    public final byte[] b;
    final /* synthetic */ beq c;

    public bfy(beq beq, long j, String str, mdu mdu) {
        this.c = beq;
        ba.b(mdu.a.a.equals(str), (Object) "CallerIdPhone number does not match token data");
        this.b = nzf.a((nzf) mdu);
        this.a = (TimeUnit.MICROSECONDS.toMillis(gwb.a(mdu.c)) + j) - bew.a;
    }
}
