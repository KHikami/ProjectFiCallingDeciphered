import android.content.Context;
import java.util.List;

public final class goz extends eo {
    private final int a;
    private final int b;
    private final Context c;
    private final List<goy> d;

    public goz(ed edVar, Context context, int i, List<goy> list, int i2) {
        super(edVar);
        this.c = context;
        this.d = list;
        this.a = i;
        this.b = 2;
    }

    public boolean a(Class cls) {
        for (goy goy : this.d) {
            if (cls.equals(goy.e)) {
                return true;
            }
        }
        return false;
    }

    public goy d(int i) {
        return (goy) this.d.get(i);
    }

    public int a(String str) {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            if (((goy) this.d.get(size)).d.equals(str)) {
                return size;
            }
        }
        return -1;
    }

    public CharSequence c(int i) {
        return this.c.getString(d(i).a);
    }

    public dr a(int i) {
        return dr.instantiate(this.c, d(i).e.getName());
    }

    public long b(int i) {
        return (long) ((this.a * this.b) + i);
    }

    public int a() {
        return this.d.size();
    }
}
