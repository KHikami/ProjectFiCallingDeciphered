package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: cio */
final class cio extends AsyncTask<Void, Integer, ArrayList<bxn>> {
    final Context a;
    final int b;
    private final cis c;
    private final List<bxn> d;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    cio(Context context, List<bxn> list, cis cis) {
        this.a = context;
        this.b = ((jca) jyn.a(context, jca.class)).a();
        this.d = list;
        this.c = cis;
    }

    private ArrayList<bxn> a() {
        ArrayList<bxn> arrayList = new ArrayList();
        for (bxn bxn : this.d) {
            if (!ba.i(bxn.a)) {
                arrayList.add(bxn);
            } else if (bxn.c == bxo.PHOTO || bxn.c == bxo.VIDEO) {
                bxy a = ccy.a(this.a, this.b, bxn.c, null, bxn.b, bxn.d);
                if (a != null) {
                    if (a.c == bxo.VIDEO) {
                        ((bpe) jyn.a(this.a, bpe.class)).a(new cip(this, a));
                    }
                    a.b = bxn.b;
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    private void a(ArrayList<bxn> arrayList) {
        if (!isCancelled()) {
            ba.a((Object) arrayList);
            this.c.a(mjq.a((Collection) arrayList));
        }
    }
}
