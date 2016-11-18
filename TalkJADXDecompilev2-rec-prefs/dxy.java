package p000;

import android.content.Context;

final class dxy {
    private final cxd f10787a = new cxe().m11190a("use_merged_contacts_instead_of_gmspeoplecache").m11192b("Use merged contacts instead of GmsPeopleCache.").m11191a(true).m11189a();

    dxy() {
    }

    public cxd[] m13008a() {
        return new cxd[]{this.f10787a};
    }

    public dwt m13007a(Context context) {
        return new dxz(this, context);
    }

    dwu[] m13009b(Context context) {
        if (this.f10787a.mo1450a(context)) {
            return new dwu[]{new dyd(context), (dwu) jyn.m25426a(context, dxu.class)};
        }
        return new dwu[]{(dwu) jyn.m25426a(context, dxu.class)};
    }

    bjn m13010c(Context context) {
        if (this.f10787a.mo1450a(context)) {
            return new dxw(context);
        }
        return new fsa(context);
    }
}
