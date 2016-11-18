package p000;

import android.os.Bundle;

final class bfq implements fh<beq> {
    final /* synthetic */ bfj f3222a;

    bfq(bfj bfj) {
        this.f3222a = bfj;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m5077a((beq) obj);
    }

    public ig<beq> onCreateLoader(int i, Bundle bundle) {
        return new bga(this.f3222a.f3203b, this.f3222a.f3205d);
    }

    private void m5077a(beq beq) {
        bfj bfj = this.f3222a;
        if (beq == null) {
            bfj.f3206e.mo2102b(bfj.f3203b.getString(ba.gE));
            bfj.f3206e.m5122a(new bfm(bfj));
            return;
        }
        bfj.f3206e.a_(true);
        bfj.f3206e.mo2102b(bfj.f3203b.getString(ba.gF, new Object[]{glq.m18033h(bfj.f3203b, beq.m5011c())}));
        bfj.f3206e.m5122a(new bfo(bfj, beq, gwb.m1530a(bfj.f3203b, bfj.f3210i, bfj, beq.m5011c())));
    }

    public void onLoaderReset(ig<beq> igVar) {
    }
}
