package io.grpc.internal;

import bm;
import java.util.concurrent.Executor;
import ojm;
import ojn;
import ojo;
import olh;

final class bz extends ojn {
    final /* synthetic */ br a;

    bz(br brVar) {
        this.a = brVar;
    }

    public <ReqT, RespT> ojo<ReqT, RespT> a(olh<ReqT, RespT> olh_ReqT__RespT, ojm ojm) {
        Executor f = ojm.f();
        if (f == null) {
            f = this.a.i;
        }
        return new n(olh_ReqT__RespT, f, ojm, this.a.z, this.a.n).a(this.a.l).a(this.a.m);
    }

    public String a() {
        return (String) bm.a(this.a.q.a(), (Object) "authority");
    }
}
