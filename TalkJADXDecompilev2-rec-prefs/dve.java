package p000;

import android.os.Bundle;
import java.util.List;

final class dve implements eib {
    final /* synthetic */ duu f10605a;
    final /* synthetic */ dvd f10606b;

    dve(dvd dvd, duu duu) {
        this.f10606b = dvd;
        this.f10605a = duu;
    }

    public void mo748a(List<eic> list, Bundle bundle) {
        boolean z = false;
        iil.m21869a(Integer.valueOf(list.size()), Integer.valueOf(2));
        for (eic eic : list) {
            boolean z2;
            if (eic.f11580a.equals("android.permission.ACCESS_FINE_LOCATION") || eic.f11580a.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                z2 = true;
            } else {
                z2 = false;
            }
            iil.m21874a("Expected condition to be true", z2);
            if (!eic.f11581b) {
                break;
            }
        }
        z = true;
        this.f10605a.mo749a(z);
    }
}
