package p000;

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class cio extends AsyncTask<Void, Integer, ArrayList<bxn>> {
    final Context f5390a;
    final int f5391b;
    private final cis f5392c;
    private final List<bxn> f5393d;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7724a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7725a((ArrayList) obj);
    }

    cio(Context context, List<bxn> list, cis cis) {
        this.f5390a = context;
        this.f5391b = ((jca) jyn.m25426a(context, jca.class)).mo2317a();
        this.f5393d = list;
        this.f5392c = cis;
    }

    private ArrayList<bxn> m7724a() {
        ArrayList<bxn> arrayList = new ArrayList();
        for (bxn bxn : this.f5393d) {
            if (!ba.m4646i(bxn.f4739a)) {
                arrayList.add(bxn);
            } else if (bxn.f4741c == bxo.PHOTO || bxn.f4741c == bxo.VIDEO) {
                bxy a = ccy.m7222a(this.f5390a, this.f5391b, bxn.f4741c, null, bxn.f4740b, bxn.f4742d);
                if (a != null) {
                    if (a.c == bxo.VIDEO) {
                        ((bpe) jyn.m25426a(this.f5390a, bpe.class)).mo964a(new cip(this, a));
                    }
                    a.b = bxn.f4740b;
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    private void m7725a(ArrayList<bxn> arrayList) {
        if (!isCancelled()) {
            ba.m4536a((Object) arrayList);
            this.f5392c.mo841a(mjq.m32314a((Collection) arrayList));
        }
    }
}
