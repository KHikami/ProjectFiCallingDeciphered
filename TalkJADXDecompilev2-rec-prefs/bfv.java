package p000;

import android.os.Bundle;

final class bfv implements fh<beq> {
    private final bfr f3235a;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m5082a((beq) obj);
    }

    bfv(bfr bfr) {
        this.f3235a = bfr;
    }

    public ig<beq> onCreateLoader(int i, Bundle bundle) {
        return new bfz(this.f3235a.getActivity(), false);
    }

    private void m5082a(beq beq) {
        this.f3235a.m5081b();
        if (beq != null) {
            this.f3235a.mo517a(gwb.ja);
        }
    }

    public void onLoaderReset(ig<beq> igVar) {
    }
}
