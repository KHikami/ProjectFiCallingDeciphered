import android.os.Bundle;
import java.util.List;

final class egw implements eib {
    final /* synthetic */ egv a;

    egw(egv egv) {
        this.a = egv;
    }

    public void a(List<eic> list, Bundle bundle) {
        boolean z = ((eic) list.get(0)).b && ((eic) list.get(1)).b;
        glk.c("Babel", "granted:" + z, new Object[0]);
        if (z) {
            this.a.a(true);
            ((dwt) this.a.binder.a(dwt.class)).a();
        }
    }
}
