package io.grpc.internal;

import a;
import bm;
import java.util.concurrent.Executor;
import ojm;
import okw;
import olh;
import olv;

final class bf implements y {
    final olv a;

    bf(olv olv) {
        bm.a(!olv.d(), (Object) "error must not be OK");
        this.a = olv;
    }

    public x a(olh<?, ?> olh___, okw okw, ojm ojm) {
        return new be(this.a);
    }

    public void a(a aVar, Executor executor) {
        executor.execute(new bg(this, aVar));
    }
}
