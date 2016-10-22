package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: dcc */
final class dcc implements OnItemClickListener {
    final /* synthetic */ dca a;
    private final int b;
    private final SparseArray<Pair<Integer, Integer>> c;

    public dcc(dca dca, int i) {
        this.a = dca;
        this.b = i;
        if (this.b == 0 || this.b == 4 || this.b == 5) {
            this.c = new SparseArray();
        } else {
            this.c = null;
        }
        if (this.b == 0 || this.b == 4) {
            this.c.put(1041637, new Pair(Integer.valueOf(127471), Integer.valueOf(127477)));
            this.c.put(1041638, new Pair(Integer.valueOf(127482), Integer.valueOf(127480)));
            this.c.put(1041639, new Pair(Integer.valueOf(127467), Integer.valueOf(127479)));
            this.c.put(1041640, new Pair(Integer.valueOf(127465), Integer.valueOf(127466)));
            this.c.put(1041641, new Pair(Integer.valueOf(127470), Integer.valueOf(127481)));
            this.c.put(1041642, new Pair(Integer.valueOf(127468), Integer.valueOf(127463)));
            this.c.put(1041643, new Pair(Integer.valueOf(127466), Integer.valueOf(127480)));
            this.c.put(1041644, new Pair(Integer.valueOf(127479), Integer.valueOf(127482)));
            this.c.put(1041645, new Pair(Integer.valueOf(127464), Integer.valueOf(127475)));
            this.c.put(1041646, new Pair(Integer.valueOf(127472), Integer.valueOf(127479)));
        }
        if (this.b == 0 || this.b == 5) {
            this.c.put(1042478, new Pair(Integer.valueOf(49), Integer.valueOf(8419)));
            this.c.put(1042479, new Pair(Integer.valueOf(50), Integer.valueOf(8419)));
            this.c.put(1042480, new Pair(Integer.valueOf(51), Integer.valueOf(8419)));
            this.c.put(1042481, new Pair(Integer.valueOf(52), Integer.valueOf(8419)));
            this.c.put(1042482, new Pair(Integer.valueOf(53), Integer.valueOf(8419)));
            this.c.put(1042483, new Pair(Integer.valueOf(54), Integer.valueOf(8419)));
            this.c.put(1042484, new Pair(Integer.valueOf(55), Integer.valueOf(8419)));
            this.c.put(1042485, new Pair(Integer.valueOf(56), Integer.valueOf(8419)));
            this.c.put(1042486, new Pair(Integer.valueOf(57), Integer.valueOf(8419)));
            this.c.put(1042487, new Pair(Integer.valueOf(48), Integer.valueOf(8419)));
            this.c.put(1042476, new Pair(Integer.valueOf(35), Integer.valueOf(8419)));
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int a;
        int i2 = (int) j;
        if (this.b > 0) {
            this.a.a.a(i2);
        }
        CharSequence stringBuilder = new StringBuilder();
        if (this.c != null) {
            Pair pair = (Pair) this.c.get(i2);
            if (pair != null) {
                stringBuilder.appendCodePoint(gwb.a((Integer) pair.first));
                a = gwb.a((Integer) pair.second);
                stringBuilder.appendCodePoint(a);
                this.a.b.a(stringBuilder);
            }
        }
        a = i2;
        stringBuilder.appendCodePoint(a);
        this.a.b.a(stringBuilder);
    }
}
