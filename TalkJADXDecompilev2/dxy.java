package defpackage;

import android.content.Context;

final class dxy {
    private final cxd a = new cxe().a("use_merged_contacts_instead_of_gmspeoplecache").b("Use merged contacts instead of GmsPeopleCache.").a(true).a();

    dxy() {
    }

    public cxd[] a() {
        return new cxd[]{this.a};
    }

    public dwt a(Context context) {
        return new dxz(this, context);
    }

    dwu[] b(Context context) {
        if (this.a.a(context)) {
            return new dwu[]{new dyd(context), (dwu) jyn.a(context, dxu.class)};
        }
        return new dwu[]{(dwu) jyn.a(context, dxu.class)};
    }

    bjn c(Context context) {
        if (this.a.a(context)) {
            return new dxw(context);
        }
        return new fsa(context);
    }
}
