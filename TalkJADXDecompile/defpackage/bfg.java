package defpackage;

import android.os.Bundle;

/* renamed from: bfg */
final class bfg implements fh<beq> {
    final /* synthetic */ bfd a;

    bfg(bfd bfd) {
        this.a = bfd;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a((beq) obj);
    }

    public ig<beq> onCreateLoader(int i, Bundle bundle) {
        return new bga(this.a.b, this.a.c);
    }

    private void a(beq beq) {
        bfd bfd = this.a;
        if (beq != null) {
            bfd.a.setText(bfd.b.getString(ba.gv, new Object[]{glq.i(bfd.b, beq.c())}));
            bfd.a.setVisibility(0);
            return;
        }
        bfd.a.setText("");
        bfd.a.setVisibility(8);
    }

    public void onLoaderReset(ig<beq> igVar) {
    }
}
