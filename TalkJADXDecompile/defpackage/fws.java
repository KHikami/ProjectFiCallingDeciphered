package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: fws */
final class fws implements eib {
    final /* synthetic */ jyn a;
    final /* synthetic */ fwr b;

    fws(fwr fwr, jyn jyn) {
        this.b = fwr;
        this.a = jyn;
    }

    public void a(List<eic> list, Bundle bundle) {
        synchronized (this.b) {
            fwo fwo = (fwo) this.a.b(fwo.class);
            if (fwo != null) {
                if (((eic) list.get(0)).b) {
                    fwo.a();
                } else {
                    fwo.b();
                }
            }
            this.b.a = false;
        }
    }
}
