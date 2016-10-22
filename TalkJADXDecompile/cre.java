import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

final class cre implements jej {
    final /* synthetic */ cqx a;

    cre(cqx cqx) {
        this.a = cqx;
    }

    public void a(int i, Intent intent) {
        if (i == -1) {
            juh juh = (juh) intent.getSerializableExtra("audience");
            glk.a("Babel_explane_actionbar", "Add people data: {%s}", intent);
            List arrayList = new ArrayList(juh.h());
            for (bcn h : juh.g()) {
                arrayList.add(h.h());
            }
            this.a.b.j().a(arrayList, false);
            return;
        }
        glk.a("Babel_explane_actionbar", "Add people cancelled", new Object[0]);
    }
}
