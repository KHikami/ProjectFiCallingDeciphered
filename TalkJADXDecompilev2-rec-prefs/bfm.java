package p000;

import android.app.AlertDialog.Builder;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;

final class bfm implements jwn {
    final /* synthetic */ bfj f3215a;

    bfm(bfj bfj) {
        this.f3215a = bfj;
    }

    public boolean mo516a() {
        Iterable b;
        bfj bfj = this.f3215a;
        ba.m4537a(bfj.f3203b, (Object) "Expected setupCallerIdPreferences to be called first.");
        String c = glq.m18012c(bfj.f3203b, bfj.f3202a);
        mkt mkt = new mkt();
        Object e = fde.m15018e(bfj.f3204c);
        ba.m4536a(e);
        ArrayList r = e.m5649r();
        int size = r.size();
        int i = 0;
        while (i < size) {
            Object obj = r.get(i);
            i++;
            String str = (String) obj;
            String c2 = glq.m18012c(bfj.f3203b, str);
            if (c2 != null) {
                if (c2.equals(c)) {
                    b = mks.m32259b(bfj.f3202a);
                    break;
                }
                mkt.mo3879c(str);
            }
        }
        b = mkt.mo3877a();
        if (b.isEmpty()) {
            Toast.makeText(this.f3215a.f3203b, ba.gA, 0).show();
        } else if (b.size() == 1) {
            bfj bfj2 = this.f3215a;
            bfj2.f3203b.startActivity(gwb.m1541a(bfj2.f3203b, false, bfj2.f3204c, (String) gwb.m1992b(b)));
        } else {
            bfj bfj3 = this.f3215a;
            CharSequence[] charSequenceArr = new String[b.size()];
            Iterator a = b.mo3806a();
            int i2 = 0;
            while (a.hasNext()) {
                int i3 = i2 + 1;
                charSequenceArr[i2] = glq.m18038i(bfj3.f3203b, (String) a.next());
                i2 = i3;
            }
            new Builder(bfj3.f3203b).setTitle(ba.gE).setItems(charSequenceArr, new bfn(bfj3, charSequenceArr)).setNegativeButton(17039360, null).show();
        }
        return true;
    }
}
