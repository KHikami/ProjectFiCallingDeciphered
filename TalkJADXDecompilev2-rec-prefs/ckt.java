package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

final class ckt implements jej {
    final /* synthetic */ cks f5530a;

    ckt(cks cks) {
        this.f5530a = cks;
    }

    public void mo747a(int i, Intent intent) {
        cdg cdg = (cdg) this.f5530a.binder.m25443a(cdg.class);
        if (i == -1) {
            bxn bxn = (bxn) intent.getParcelableExtra("new_attachment");
            List arrayList = new ArrayList(1);
            arrayList.add(bxn);
            cdg.mo840a(arrayList);
        }
    }
}
