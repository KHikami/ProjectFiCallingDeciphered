package p000;

import android.os.Bundle;
import java.util.List;

final class fws implements eib {
    final /* synthetic */ jyn f14169a;
    final /* synthetic */ fwr f14170b;

    fws(fwr fwr, jyn jyn) {
        this.f14170b = fwr;
        this.f14169a = jyn;
    }

    public void mo748a(List<eic> list, Bundle bundle) {
        synchronized (this.f14170b) {
            fwo fwo = (fwo) this.f14169a.m25454b(fwo.class);
            if (fwo != null) {
                if (((eic) list.get(0)).f11581b) {
                    fwo.mo978a();
                } else {
                    fwo.mo979b();
                }
            }
            this.f14170b.f14167a = false;
        }
    }
}
