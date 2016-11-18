package p000;

import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.RequestFinishedInfo$Listener;

public final class jsg implements onc {
    private final onc<CronetEngine> f20979a;
    private final onc<Set<RequestFinishedInfo$Listener>> f20980b;

    public /* synthetic */ Object mo1297a() {
        return m25161b();
    }

    public jsg(onc<CronetEngine> onc_org_chromium_net_CronetEngine, onc<Set<RequestFinishedInfo$Listener>> onc_java_util_Set_org_chromium_net_RequestFinishedInfo_Listener) {
        this.f20979a = onc_org_chromium_net_CronetEngine;
        this.f20980b = onc_java_util_Set_org_chromium_net_RequestFinishedInfo_Listener;
    }

    private CronetEngine m25161b() {
        return (CronetEngine) bn.m6215a(gwb.m1729a((CronetEngine) this.f20979a.mo1297a(), (Set) this.f20980b.mo1297a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
