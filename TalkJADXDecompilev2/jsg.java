package defpackage;

import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.RequestFinishedInfo$Listener;

public final class jsg implements onc {
    private final onc<CronetEngine> a;
    private final onc<Set<RequestFinishedInfo$Listener>> b;

    public /* synthetic */ Object a() {
        return b();
    }

    public jsg(onc<CronetEngine> onc_org_chromium_net_CronetEngine, onc<Set<RequestFinishedInfo$Listener>> onc_java_util_Set_org_chromium_net_RequestFinishedInfo_Listener) {
        this.a = onc_org_chromium_net_CronetEngine;
        this.b = onc_java_util_Set_org_chromium_net_RequestFinishedInfo_Listener;
    }

    private CronetEngine b() {
        return (CronetEngine) bn.a(gwb.a((CronetEngine) this.a.a(), (Set) this.b.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
