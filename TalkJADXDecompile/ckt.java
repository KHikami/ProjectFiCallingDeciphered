import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

final class ckt implements jej {
    final /* synthetic */ cks a;

    ckt(cks cks) {
        this.a = cks;
    }

    public void a(int i, Intent intent) {
        cdg cdg = (cdg) this.a.binder.a(cdg.class);
        if (i == -1) {
            bxn bxn = (bxn) intent.getParcelableExtra("new_attachment");
            List arrayList = new ArrayList(1);
            arrayList.add(bxn);
            cdg.a(arrayList);
        }
    }
}
