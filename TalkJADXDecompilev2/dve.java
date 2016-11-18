package defpackage;

import android.os.Bundle;
import java.util.List;

final class dve implements eib {
    final /* synthetic */ duu a;
    final /* synthetic */ dvd b;

    dve(dvd dvd, duu duu) {
        this.b = dvd;
        this.a = duu;
    }

    public void a(List<eic> list, Bundle bundle) {
        boolean z = false;
        iil.a(Integer.valueOf(list.size()), Integer.valueOf(2));
        for (eic eic : list) {
            boolean z2;
            if (eic.a.equals("android.permission.ACCESS_FINE_LOCATION") || eic.a.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                z2 = true;
            } else {
                z2 = false;
            }
            iil.a("Expected condition to be true", z2);
            if (!eic.b) {
                break;
            }
        }
        z = true;
        this.a.a(z);
    }
}
