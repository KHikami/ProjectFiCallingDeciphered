package p000;

import android.content.Context;
import android.util.SparseArray;
import android.widget.Toast;
import java.util.List;

final class cin implements bnq {
    final SparseArray<List<fsr>> f5387a = new SparseArray();
    final /* synthetic */ cim f5388b;
    private final Context f5389c;

    cin(cim cim, Context context) {
        this.f5388b = cim;
        this.f5389c = context;
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.m21872a("Expected null", (Object) gkt);
        iil.m21872a("Expected null", (Object) gjo);
        int a = gwb.m1507a((Integer) bnn.m5506l());
        List<fsr> list = (List) this.f5387a.get(a);
        list.remove(bnn);
        if (!z) {
            for (fsr b : list) {
                b.mo607b();
            }
            Toast.makeText(this.f5389c, bc.sY, 0).show();
        } else if (list.isEmpty()) {
            this.f5387a.remove(a);
            Toast.makeText(this.f5389c, bc.sZ, 0).show();
        }
    }
}
