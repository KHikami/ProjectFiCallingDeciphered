package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.R$drawable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class dca extends np {
    private static final boolean f9488e = false;
    private static final Integer[] f9489f = new Integer[]{Integer.valueOf(gwb.dl), Integer.valueOf(gwb.dn), Integer.valueOf(gwb.dm), Integer.valueOf(gwb.f881do), Integer.valueOf(gwb.dp)};
    final dcd f9490a;
    final dbx f9491b;
    final gjs f9492c;
    int f9493d = 0;
    private final Context f9494g;
    private final SparseArray<List<Integer>> f9495h;
    private final boolean f9496i;
    private final Integer f9497j;
    private int f9498k = 0;

    static {
        kae kae = glk.f15559f;
    }

    public dca(Context context, dbx dbx, int i, int i2, int i3, boolean z, Integer num) {
        boolean z2 = true;
        this.f9494g = context;
        m11433a(i, i2);
        this.f9490a = new dcd(this.f9494g);
        this.f9491b = dbx;
        this.f9492c = new gjs(context, i3);
        this.f9495h = new SparseArray(6);
        this.f9496i = z;
        this.f9497j = num;
        Set hashSet = new HashSet();
        if (VERSION.SDK_INT < 19 || !gwb.m1906a(gwb.m1400H(), "babel_prefer_emoji_system_font_rendering", true)) {
            z2 = false;
        }
        if (z2) {
            hashSet.add(Integer.valueOf(1041637));
            hashSet.add(Integer.valueOf(1041638));
            hashSet.add(Integer.valueOf(1041639));
            hashSet.add(Integer.valueOf(1041640));
            hashSet.add(Integer.valueOf(1041641));
            hashSet.add(Integer.valueOf(1041642));
            hashSet.add(Integer.valueOf(1041643));
            hashSet.add(Integer.valueOf(1041644));
            hashSet.add(Integer.valueOf(1041645));
            hashSet.add(Integer.valueOf(1041646));
            hashSet.add(Integer.valueOf(1042478));
            hashSet.add(Integer.valueOf(1042479));
            hashSet.add(Integer.valueOf(1042480));
            hashSet.add(Integer.valueOf(1042481));
            hashSet.add(Integer.valueOf(1042482));
            hashSet.add(Integer.valueOf(1042483));
            hashSet.add(Integer.valueOf(1042484));
            hashSet.add(Integer.valueOf(1042485));
            hashSet.add(Integer.valueOf(1042486));
            hashSet.add(Integer.valueOf(1042487));
            hashSet.add(Integer.valueOf(1042476));
        }
        for (int i4 = 0; i4 < f9489f.length; i4++) {
            TypedArray obtainTypedArray = this.f9494g.getResources().obtainTypedArray(gwb.m1507a(f9489f[i4]));
            List linkedList = new LinkedList();
            for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                int parseInt = Integer.parseInt(obtainTypedArray.getString(i5), 16);
                if (!hashSet.contains(Integer.valueOf(parseInt))) {
                    linkedList.add(Integer.valueOf(parseInt));
                }
            }
            obtainTypedArray.recycle();
            this.f9495h.append(i4 + 1, linkedList);
        }
    }

    public void m11439d() {
        this.f9492c.m17857b();
    }

    public void m11433a(int i, int i2) {
        Resources resources = this.f9494g.getResources();
        int e = m11427e();
        int f = m11429f();
        int dimensionPixelSize = resources.getDimensionPixelSize(gwb.eH);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(gwb.eM);
        e = (i - (e * 2)) / dimensionPixelSize;
        f = (i2 - (f * 2)) / dimensionPixelSize2;
        this.f9498k = (i2 - (dimensionPixelSize2 * f)) / 2;
        this.f9493d = f * e;
    }

    private int m11427e() {
        Resources resources = this.f9494g.getResources();
        return Math.max(0, resources.getDimensionPixelSize(gwb.fn) - resources.getDimensionPixelSize(gwb.eJ));
    }

    private int m11429f() {
        int dimensionPixelSize;
        Resources resources = this.f9494g.getResources();
        int dimensionPixelSize2 = resources.getDimensionPixelSize(gwb.eJ);
        if (this.f9496i) {
            dimensionPixelSize = resources.getDimensionPixelSize(gwb.fn) - dimensionPixelSize2;
        } else {
            dimensionPixelSize = 0;
        }
        return Math.max(0, dimensionPixelSize);
    }

    private int m11428e(int i) {
        if (this.f9493d <= 0) {
            return 1;
        }
        return ((i - 1) / this.f9493d) + 1;
    }

    public boolean m11435a(View view, Object obj) {
        return view == obj;
    }

    public int m11430a() {
        int i = 0;
        int i2 = 0;
        while (i < 6) {
            i2 += m11431a(i);
            i++;
        }
        return i2;
    }

    public int m11436b(Object obj) {
        return -2;
    }

    public int m11431a(int i) {
        if (i == 0) {
            return 1;
        }
        return m11428e(((List) this.f9495h.get(i)).size());
    }

    public Pair<Integer, Integer> m11437b(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6) {
            int a = i3 + m11431a(i2);
            if (a > i) {
                return new Pair(Integer.valueOf(i2), Integer.valueOf(i - i3));
            }
            i2++;
            i3 = a;
        }
        return new Pair(Integer.valueOf(1), Integer.valueOf(0));
    }

    public int m11438d(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6) {
            if (i2 == i) {
                return i3;
            }
            int a = m11431a(i2) + i3;
            i2++;
            i3 = a;
        }
        glk.m17981d("Babel", "categoryId not found: " + i, new Object[0]);
        return 0;
    }

    public Object m11432a(ViewGroup viewGroup, int i) {
        View inflate;
        if (f9488e) {
            new StringBuilder(35).append("Instantiate emoji view: ").append(i);
        }
        long b = glj.m17963b();
        LayoutInflater layoutInflater = (LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater");
        Pair b2 = m11437b(i);
        int a = gwb.m1507a((Integer) b2.first);
        Object obj = a == 0 ? 1 : null;
        Object obj2 = (obj == null || this.f9490a.m11441a().size() != 0) ? null : 1;
        if (obj2 != null) {
            inflate = layoutInflater.inflate(gwb.gt, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(gwb.gs, viewGroup, false);
        }
        GridView gridView = (GridView) inflate.findViewById(ba.aX);
        gridView.setPadding(m11427e(), m11429f() + (this.f9496i ? this.f9498k : 0), m11427e(), (this.f9496i ? this.f9498k : 0) + m11429f());
        if (obj != null) {
            obj = new dch(this, this.f9494g.getResources());
        } else {
            dcb dcb = new dcb(this, this.f9494g.getResources(), (List) this.f9495h.get(a), gwb.m1507a((Integer) b2.second));
        }
        if (obj2 != null) {
            gridView.setVisibility(8);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(ba.eH);
            viewGroup2.setVisibility(0);
            View imageView = new ImageView(viewGroup2.getContext());
            imageView.setImageResource(R$drawable.bx);
            viewGroup2.addView(imageView, 0);
            ((dch) obj).m11447a(inflate);
            if (this.f9497j != null) {
                int a2 = gwb.m1507a(this.f9497j);
                imageView.setColorFilter(a2 - -1610612736, Mode.SRC_ATOP);
                ((TextView) inflate.findViewById(ba.eI)).setTextColor(a2);
            }
        }
        gridView.setOnItemClickListener(new dcc(this, a));
        gridView.setAdapter(obj);
        gridView.setTag(Integer.valueOf(i));
        viewGroup.addView(inflate);
        if (glk.m17973a("Babel", 3)) {
            long b3 = glj.m17963b();
            glk.m17970a("Babel", "Emoji: Category Adapter instantiateItem @" + b3 + " took: " + (b3 - b) + " Adapter has " + obj.getCount() + " items.", new Object[0]);
        }
        return inflate;
    }

    public void m11434a(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        ((dbz) ((GridView) view.findViewById(ba.aX)).getAdapter()).m11425a();
    }
}
