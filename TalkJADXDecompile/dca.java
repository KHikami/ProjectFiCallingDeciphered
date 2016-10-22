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
    private static final boolean e;
    private static final Integer[] f;
    final dcd a;
    final dbx b;
    final gjs c;
    int d;
    private final Context g;
    private final SparseArray<List<Integer>> h;
    private final boolean i;
    private final Integer j;
    private int k;

    static {
        kae kae = glk.f;
        e = false;
        f = new Integer[]{Integer.valueOf(gwb.dl), Integer.valueOf(gwb.dn), Integer.valueOf(gwb.dm), Integer.valueOf(gwb.do), Integer.valueOf(gwb.dp)};
    }

    public dca(Context context, dbx dbx, int i, int i2, int i3, boolean z, Integer num) {
        boolean z2 = true;
        this.d = 0;
        this.k = 0;
        this.g = context;
        a(i, i2);
        this.a = new dcd(this.g);
        this.b = dbx;
        this.c = new gjs(context, i3);
        this.h = new SparseArray(6);
        this.i = z;
        this.j = num;
        Set hashSet = new HashSet();
        if (VERSION.SDK_INT < 19 || !gwb.a(gwb.H(), "babel_prefer_emoji_system_font_rendering", true)) {
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
        for (int i4 = 0; i4 < f.length; i4++) {
            TypedArray obtainTypedArray = this.g.getResources().obtainTypedArray(gwb.a(f[i4]));
            List linkedList = new LinkedList();
            for (int i5 = 0; i5 < obtainTypedArray.length(); i5++) {
                int parseInt = Integer.parseInt(obtainTypedArray.getString(i5), 16);
                if (!hashSet.contains(Integer.valueOf(parseInt))) {
                    linkedList.add(Integer.valueOf(parseInt));
                }
            }
            obtainTypedArray.recycle();
            this.h.append(i4 + 1, linkedList);
        }
    }

    public void d() {
        this.c.b();
    }

    public void a(int i, int i2) {
        Resources resources = this.g.getResources();
        int e = e();
        int f = f();
        int dimensionPixelSize = resources.getDimensionPixelSize(gwb.eH);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(gwb.eM);
        e = (i - (e * 2)) / dimensionPixelSize;
        f = (i2 - (f * 2)) / dimensionPixelSize2;
        this.k = (i2 - (dimensionPixelSize2 * f)) / 2;
        this.d = f * e;
    }

    private int e() {
        Resources resources = this.g.getResources();
        return Math.max(0, resources.getDimensionPixelSize(gwb.fn) - resources.getDimensionPixelSize(gwb.eJ));
    }

    private int f() {
        int dimensionPixelSize;
        Resources resources = this.g.getResources();
        int dimensionPixelSize2 = resources.getDimensionPixelSize(gwb.eJ);
        if (this.i) {
            dimensionPixelSize = resources.getDimensionPixelSize(gwb.fn) - dimensionPixelSize2;
        } else {
            dimensionPixelSize = 0;
        }
        return Math.max(0, dimensionPixelSize);
    }

    private int e(int i) {
        if (this.d <= 0) {
            return 1;
        }
        return ((i - 1) / this.d) + 1;
    }

    public boolean a(View view, Object obj) {
        return view == obj;
    }

    public int a() {
        int i = 0;
        int i2 = 0;
        while (i < 6) {
            i2 += a(i);
            i++;
        }
        return i2;
    }

    public int b(Object obj) {
        return -2;
    }

    public int a(int i) {
        if (i == 0) {
            return 1;
        }
        return e(((List) this.h.get(i)).size());
    }

    public Pair<Integer, Integer> b(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6) {
            int a = i3 + a(i2);
            if (a > i) {
                return new Pair(Integer.valueOf(i2), Integer.valueOf(i - i3));
            }
            i2++;
            i3 = a;
        }
        return new Pair(Integer.valueOf(1), Integer.valueOf(0));
    }

    public int d(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6) {
            if (i2 == i) {
                return i3;
            }
            int a = a(i2) + i3;
            i2++;
            i3 = a;
        }
        glk.d("Babel", "categoryId not found: " + i, new Object[0]);
        return 0;
    }

    public Object a(ViewGroup viewGroup, int i) {
        View inflate;
        if (e) {
            new StringBuilder(35).append("Instantiate emoji view: ").append(i);
        }
        long b = glj.b();
        LayoutInflater layoutInflater = (LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater");
        Pair b2 = b(i);
        int a = gwb.a((Integer) b2.first);
        Object obj = a == 0 ? 1 : null;
        Object obj2 = (obj == null || this.a.a().size() != 0) ? null : 1;
        if (obj2 != null) {
            inflate = layoutInflater.inflate(gwb.gt, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(gwb.gs, viewGroup, false);
        }
        GridView gridView = (GridView) inflate.findViewById(ba.aX);
        gridView.setPadding(e(), f() + (this.i ? this.k : 0), e(), (this.i ? this.k : 0) + f());
        if (obj != null) {
            obj = new dch(this, this.g.getResources());
        } else {
            dcb dcb = new dcb(this, this.g.getResources(), (List) this.h.get(a), gwb.a((Integer) b2.second));
        }
        if (obj2 != null) {
            gridView.setVisibility(8);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(ba.eH);
            viewGroup2.setVisibility(0);
            View imageView = new ImageView(viewGroup2.getContext());
            imageView.setImageResource(R$drawable.bx);
            viewGroup2.addView(imageView, 0);
            ((dch) obj).a(inflate);
            if (this.j != null) {
                int a2 = gwb.a(this.j);
                imageView.setColorFilter(a2 - -1610612736, Mode.SRC_ATOP);
                ((TextView) inflate.findViewById(ba.eI)).setTextColor(a2);
            }
        }
        gridView.setOnItemClickListener(new dcc(this, a));
        gridView.setAdapter(obj);
        gridView.setTag(Integer.valueOf(i));
        viewGroup.addView(inflate);
        if (glk.a("Babel", 3)) {
            long b3 = glj.b();
            glk.a("Babel", "Emoji: Category Adapter instantiateItem @" + b3 + " took: " + (b3 - b) + " Adapter has " + obj.getCount() + " items.", new Object[0]);
        }
        return inflate;
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        ((dbz) ((GridView) view.findViewById(ba.aX)).getAdapter()).a();
    }
}
