package defpackage;

import android.os.Bundle;

final class bfv implements fh<beq> {
    private final bfr a;

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((beq) obj);
    }

    bfv(bfr bfr) {
        this.a = bfr;
    }

    public ig<beq> onCreateLoader(int i, Bundle bundle) {
        return new bfz(this.a.getActivity(), false);
    }

    private void a(beq beq) {
        this.a.b();
        if (beq != null) {
            this.a.a(gwb.ja);
        }
    }

    public void onLoaderReset(ig<beq> igVar) {
    }
}
