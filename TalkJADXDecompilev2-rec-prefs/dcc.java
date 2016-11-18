package p000;

import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class dcc implements OnItemClickListener {
    final /* synthetic */ dca f9502a;
    private final int f9503b;
    private final SparseArray<Pair<Integer, Integer>> f9504c;

    public dcc(dca dca, int i) {
        this.f9502a = dca;
        this.f9503b = i;
        if (this.f9503b == 0 || this.f9503b == 4 || this.f9503b == 5) {
            this.f9504c = new SparseArray();
        } else {
            this.f9504c = null;
        }
        if (this.f9503b == 0 || this.f9503b == 4) {
            this.f9504c.put(1041637, new Pair(Integer.valueOf(127471), Integer.valueOf(127477)));
            this.f9504c.put(1041638, new Pair(Integer.valueOf(127482), Integer.valueOf(127480)));
            this.f9504c.put(1041639, new Pair(Integer.valueOf(127467), Integer.valueOf(127479)));
            this.f9504c.put(1041640, new Pair(Integer.valueOf(127465), Integer.valueOf(127466)));
            this.f9504c.put(1041641, new Pair(Integer.valueOf(127470), Integer.valueOf(127481)));
            this.f9504c.put(1041642, new Pair(Integer.valueOf(127468), Integer.valueOf(127463)));
            this.f9504c.put(1041643, new Pair(Integer.valueOf(127466), Integer.valueOf(127480)));
            this.f9504c.put(1041644, new Pair(Integer.valueOf(127479), Integer.valueOf(127482)));
            this.f9504c.put(1041645, new Pair(Integer.valueOf(127464), Integer.valueOf(127475)));
            this.f9504c.put(1041646, new Pair(Integer.valueOf(127472), Integer.valueOf(127479)));
        }
        if (this.f9503b == 0 || this.f9503b == 5) {
            this.f9504c.put(1042478, new Pair(Integer.valueOf(49), Integer.valueOf(8419)));
            this.f9504c.put(1042479, new Pair(Integer.valueOf(50), Integer.valueOf(8419)));
            this.f9504c.put(1042480, new Pair(Integer.valueOf(51), Integer.valueOf(8419)));
            this.f9504c.put(1042481, new Pair(Integer.valueOf(52), Integer.valueOf(8419)));
            this.f9504c.put(1042482, new Pair(Integer.valueOf(53), Integer.valueOf(8419)));
            this.f9504c.put(1042483, new Pair(Integer.valueOf(54), Integer.valueOf(8419)));
            this.f9504c.put(1042484, new Pair(Integer.valueOf(55), Integer.valueOf(8419)));
            this.f9504c.put(1042485, new Pair(Integer.valueOf(56), Integer.valueOf(8419)));
            this.f9504c.put(1042486, new Pair(Integer.valueOf(57), Integer.valueOf(8419)));
            this.f9504c.put(1042487, new Pair(Integer.valueOf(48), Integer.valueOf(8419)));
            this.f9504c.put(1042476, new Pair(Integer.valueOf(35), Integer.valueOf(8419)));
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int a;
        int i2 = (int) j;
        if (this.f9503b > 0) {
            this.f9502a.f9490a.m11442a(i2);
        }
        CharSequence stringBuilder = new StringBuilder();
        if (this.f9504c != null) {
            Pair pair = (Pair) this.f9504c.get(i2);
            if (pair != null) {
                stringBuilder.appendCodePoint(gwb.m1507a((Integer) pair.first));
                a = gwb.m1507a((Integer) pair.second);
                stringBuilder.appendCodePoint(a);
                this.f9502a.f9491b.mo997a(stringBuilder);
            }
        }
        a = i2;
        stringBuilder.appendCodePoint(a);
        this.f9502a.f9491b.mo997a(stringBuilder);
    }
}
