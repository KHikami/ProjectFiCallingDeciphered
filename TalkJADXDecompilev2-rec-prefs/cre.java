package p000;

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

final class cre implements jej {
    final /* synthetic */ cqx f8934a;

    cre(cqx cqx) {
        this.f8934a = cqx;
    }

    public void mo747a(int i, Intent intent) {
        if (i == -1) {
            juh juh = (juh) intent.getSerializableExtra("audience");
            glk.m17970a("Babel_explane_actionbar", "Add people data: {%s}", intent);
            List arrayList = new ArrayList(juh.m25223h());
            for (bcn h : juh.m25222g()) {
                arrayList.add(h.m4899h());
            }
            this.f8934a.f8905b.m10978j().m11029a(arrayList, false);
            return;
        }
        glk.m17970a("Babel_explane_actionbar", "Add people cancelled", new Object[0]);
    }
}
