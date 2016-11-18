package p000;

import android.content.Intent;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

final class eii implements jej {
    final /* synthetic */ eih f11606a;

    eii(eih eih) {
        this.f11606a = eih;
    }

    public void mo747a(int i, Intent intent) {
        boolean z;
        eip eip = new eip(intent.getIntExtra("original_request_code", 0), (ArrayList) intent.getSerializableExtra("permission_results"));
        eie eie = (eie) this.f11606a.f11599c.get(eip.f11616a);
        eih eih = this.f11606a;
        int i2 = eie.f11593a;
        List list = eip.f11617b;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        eih.m13967a(i2, list, true, z);
        eih = this.f11606a;
        i2 = eip.f11616a;
        List<eic> list2 = eip.f11617b;
        for (eic eic : list2) {
            if (!eic.f11581b) {
                Toast.makeText(eih.f11597a, gwb.tt, 0).show();
                break;
            }
        }
        eib eib = (eib) eih.f11598b.get(i2);
        eie eie2 = (eie) eih.f11599c.get(i2);
        eih.f11599c.remove(i2);
        eib.mo748a(list2, eie2.f11594b);
    }
}
