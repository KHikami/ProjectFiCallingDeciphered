package p000;

import android.os.Bundle;

final class bfg implements fh<beq> {
    final /* synthetic */ bfd f3189a;

    bfg(bfd bfd) {
        this.f3189a = bfd;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m5050a((beq) obj);
    }

    public ig<beq> onCreateLoader(int i, Bundle bundle) {
        return new bga(this.f3189a.f3181b, this.f3189a.f3182c);
    }

    private void m5050a(beq beq) {
        bfd bfd = this.f3189a;
        if (beq != null) {
            bfd.f3180a.setText(bfd.f3181b.getString(ba.gv, new Object[]{glq.m18038i(bfd.f3181b, beq.m5011c())}));
            bfd.f3180a.setVisibility(0);
            return;
        }
        bfd.f3180a.setText("");
        bfd.f3180a.setVisibility(8);
    }

    public void onLoaderReset(ig<beq> igVar) {
    }
}
