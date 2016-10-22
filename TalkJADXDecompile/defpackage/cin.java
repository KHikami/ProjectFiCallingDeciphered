package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.widget.Toast;
import java.util.List;

/* renamed from: cin */
final class cin implements bnq {
    final SparseArray<List<fsr>> a;
    final /* synthetic */ cim b;
    private final Context c;

    cin(cim cim, Context context) {
        this.b = cim;
        this.a = new SparseArray();
        this.c = context;
    }

    public void a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        iil.a("Expected null", (Object) gkt);
        iil.a("Expected null", (Object) gjo);
        int a = gwb.a((Integer) bnn.l());
        List<fsr> list = (List) this.a.get(a);
        list.remove(bnn);
        if (!z) {
            for (fsr b : list) {
                b.b();
            }
            Toast.makeText(this.c, bc.sY, 0).show();
        } else if (list.isEmpty()) {
            this.a.remove(a);
            Toast.makeText(this.c, bc.sZ, 0).show();
        }
    }
}
