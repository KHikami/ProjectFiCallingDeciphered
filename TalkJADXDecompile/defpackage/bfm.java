package defpackage;

import android.app.AlertDialog.Builder;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: bfm */
final class bfm implements jwn {
    final /* synthetic */ bfj a;

    bfm(bfj bfj) {
        this.a = bfj;
    }

    public boolean a() {
        Iterable b;
        bfj bfj = this.a;
        ba.a(bfj.b, (Object) "Expected setupCallerIdPreferences to be called first.");
        String c = glq.c(bfj.b, bfj.a);
        mkt mkt = new mkt();
        Object e = fde.e(bfj.c);
        ba.a(e);
        ArrayList r = e.r();
        int size = r.size();
        int i = 0;
        while (i < size) {
            Object obj = r.get(i);
            i++;
            String str = (String) obj;
            String c2 = glq.c(bfj.b, str);
            if (c2 != null) {
                if (c2.equals(c)) {
                    b = mks.b(bfj.a);
                    break;
                }
                mkt.c(str);
            }
        }
        b = mkt.a();
        if (b.isEmpty()) {
            Toast.makeText(this.a.b, ba.gA, 0).show();
        } else if (b.size() == 1) {
            bfj bfj2 = this.a;
            bfj2.b.startActivity(gwb.a(bfj2.b, false, bfj2.c, (String) gwb.b(b)));
        } else {
            bfj bfj3 = this.a;
            CharSequence[] charSequenceArr = new String[b.size()];
            Iterator a = b.a();
            int i2 = 0;
            while (a.hasNext()) {
                int i3 = i2 + 1;
                charSequenceArr[i2] = glq.i(bfj3.b, (String) a.next());
                i2 = i3;
            }
            new Builder(bfj3.b).setTitle(ba.gE).setItems(charSequenceArr, new bfn(bfj3, charSequenceArr)).setNegativeButton(17039360, null).show();
        }
        return true;
    }
}
