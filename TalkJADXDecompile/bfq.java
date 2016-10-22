import android.os.Bundle;

final class bfq implements fh<beq> {
    final /* synthetic */ bfj a;

    bfq(bfj bfj) {
        this.a = bfj;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((beq) obj);
    }

    public ig<beq> onCreateLoader(int i, Bundle bundle) {
        return new bga(this.a.b, this.a.d);
    }

    private void a(beq beq) {
        bfj bfj = this.a;
        if (beq == null) {
            bfj.e.b(bfj.b.getString(ba.gE));
            bfj.e.a(new bfm(bfj));
            return;
        }
        bfj.e.a_(true);
        bfj.e.b(bfj.b.getString(ba.gF, new Object[]{glq.h(bfj.b, beq.c())}));
        bfj.e.a(new bfo(bfj, beq, gwb.a(bfj.b, bfj.i, bfj, beq.c())));
    }

    public void onLoaderReset(ig<beq> igVar) {
    }
}
