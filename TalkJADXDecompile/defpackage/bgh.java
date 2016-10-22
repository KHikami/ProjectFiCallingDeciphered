package defpackage;

import android.os.Bundle;

/* renamed from: bgh */
final class bgh implements fh<beq> {
    final /* synthetic */ bgg a;

    bgh(bgg bgg) {
        this.a = bgg;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((beq) obj);
    }

    public ig<beq> onCreateLoader(int i, Bundle bundle) {
        return new bfz(this.a.b, false);
    }

    private void a(beq beq) {
        bgg bgg = this.a;
        fdv fdv = this.a.a;
        mfa c = mfa.c(beq);
        ba.b(!glq.a(gwb.H(), fdv.b()), (Object) "If CallerId is blocked, CallerId settings should never be loaded");
        if (!c.a() || ((beq) c.b()).a()) {
            fdv.a(c);
            if (c.a()) {
                bgg.e.a(2249);
            }
            bgg.b.startActivity(fdv.a(gwb.H(), bgg.c, bgg.d));
            bgg.b.finish();
            return;
        }
        gwb.a(bgg.b, bgg.e, (beq) c.b(), bgg.a, bgg.c, bgg.d).show();
    }

    public void onLoaderReset(ig<beq> igVar) {
    }
}
