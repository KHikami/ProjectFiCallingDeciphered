package p000;

import android.content.Context;

final class dco implements Runnable {
    final /* synthetic */ dcl f9518a;

    dco(dcl dcl) {
        this.f9518a = dcl;
    }

    public void run() {
        if (!(this.f9518a.m8326k() || this.f9518a.isFinishing())) {
            Context context = this.f9518a;
            String simpleName = this.f9518a.getClass().getSimpleName();
            if (dph.m12416a(context)) {
                glk.m17979c("Babel_Prime", "recordMemory", new Object[0]);
                ((ixk) jyn.m25426a(context, ixk.class)).m23448a(simpleName);
            } else {
                glk.m17970a("Babel_Prime", "recordMemory disabled", new Object[0]);
            }
        }
        this.f9518a.f6049n = null;
    }
}
