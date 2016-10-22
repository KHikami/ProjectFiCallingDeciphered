import android.content.Context;

final class dco implements Runnable {
    final /* synthetic */ dcl a;

    dco(dcl dcl) {
        this.a = dcl;
    }

    public void run() {
        if (!(this.a.k() || this.a.isFinishing())) {
            Context context = this.a;
            String simpleName = this.a.getClass().getSimpleName();
            if (dph.a(context)) {
                glk.c("Babel_Prime", "recordMemory", new Object[0]);
                ((ixk) jyn.a(context, ixk.class)).a(simpleName);
            } else {
                glk.a("Babel_Prime", "recordMemory disabled", new Object[0]);
            }
        }
        this.a.n = null;
    }
}
