package p000;

import android.os.Bundle;
import java.util.List;

final class cdb implements eib {
    final /* synthetic */ ccz f5052a;

    cdb(ccz ccz) {
        this.f5052a = ccz;
    }

    public void mo748a(List<eic> list, Bundle bundle) {
        if (gwb.m2208f((List) list) && this.f5052a.f5029a != null) {
            String string = bundle.getString("permission_picker_name");
            int i = 0;
            while (i < this.f5052a.f5029a.size()) {
                if (string.equals(((cdd) this.f5052a.f5029a.get(i)).m7251a())) {
                    break;
                }
                i++;
            }
            i = -1;
            this.f5052a.m7244b(i);
        }
    }
}
