package defpackage;

import io.grpc.internal.an;
import io.grpc.internal.x;
import io.grpc.internal.y;

public class ojl {
    public final y a;
    public final olh<?, ?> b;
    public final okw c;
    public final ojm d;
    public final ojz e;
    public final Object f = new Object();
    public x g;
    public an h;

    public ojl(y yVar, olh<?, ?> olh___, okw okw, ojm ojm) {
        this.a = yVar;
        this.b = olh___;
        this.c = okw;
        this.d = ojm;
        this.e = ojz.a();
    }

    public x a() {
        x xVar;
        synchronized (this.f) {
            if (this.g == null) {
                this.h = new an();
                xVar = this.h;
                this.g = xVar;
            } else {
                xVar = this.g;
            }
        }
        return xVar;
    }
}
