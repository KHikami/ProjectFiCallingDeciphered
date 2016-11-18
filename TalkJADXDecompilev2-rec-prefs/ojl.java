package p000;

import io.grpc.internal.an;
import io.grpc.internal.x;
import io.grpc.internal.y;

public class ojl {
    public final y f33087a;
    public final olh<?, ?> f33088b;
    public final okw f33089c;
    public final ojm f33090d;
    public final ojz f33091e;
    public final Object f33092f = new Object();
    public x f33093g;
    public an f33094h;

    public ojl(y yVar, olh<?, ?> olh___, okw okw, ojm ojm) {
        this.f33087a = yVar;
        this.f33088b = olh___;
        this.f33089c = okw;
        this.f33090d = ojm;
        this.f33091e = ojz.a();
    }

    public x m38567a() {
        x xVar;
        synchronized (this.f33092f) {
            if (this.f33093g == null) {
                this.f33094h = new an();
                xVar = this.f33094h;
                this.f33093g = xVar;
            } else {
                xVar = this.f33093g;
            }
        }
        return xVar;
    }
}
