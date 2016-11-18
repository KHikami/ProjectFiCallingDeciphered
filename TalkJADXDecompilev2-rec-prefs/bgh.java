package p000;

import android.os.Bundle;

final class bgh implements fh<beq> {
    final /* synthetic */ bgg f3308a;

    bgh(bgg bgg) {
        this.f3308a = bgg;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m5192a((beq) obj);
    }

    public ig<beq> onCreateLoader(int i, Bundle bundle) {
        return new bfz(this.f3308a.f3304b, false);
    }

    private void m5192a(beq beq) {
        bgg bgg = this.f3308a;
        fdv fdv = this.f3308a.f3303a;
        mfa c = mfa.m31911c(beq);
        ba.m4610b(!glq.m18007a(gwb.m1400H(), fdv.m15107b()), (Object) "If CallerId is blocked, CallerId settings should never be loaded");
        if (!c.mo3733a() || ((beq) c.mo3734b()).m5009a()) {
            fdv.m15106a(c);
            if (c.mo3733a()) {
                bgg.f3307e.m5185a(2249);
            }
            bgg.f3304b.startActivity(fdv.m15104a(gwb.m1400H(), bgg.f3305c, bgg.f3306d));
            bgg.f3304b.finish();
            return;
        }
        gwb.m1529a(bgg.f3304b, bgg.f3307e, (beq) c.mo3734b(), bgg.f3303a, bgg.f3305c, bgg.f3306d).show();
    }

    public void onLoaderReset(ig<beq> igVar) {
    }
}
