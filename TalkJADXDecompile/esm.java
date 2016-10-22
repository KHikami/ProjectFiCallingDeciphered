import android.content.Context;
import java.util.ArrayList;

public class esm {
    private final ArrayList<esc> a;

    public esm() {
        this.a = new ArrayList();
    }

    public void a(Context context) {
        Class[] clsArr = new Class[]{ene.class, bdv.class, dvh.class, epx.class, ede.class, cqj.class, bgr.class, bep.class, bgt.class};
        this.a.clear();
        for (int i = 0; i < 9; i++) {
            esc esc = (esc) jyn.b(context, clsArr[i]);
            if (esc != null) {
                this.a.add(esc);
            }
        }
    }

    public int b(Context context) {
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            if (((esc) this.a.get(i2)).a(context)) {
                i++;
            }
        }
        return i;
    }

    public esc a(int i) {
        return (esc) this.a.get(i);
    }

    public int a(Context context, int i) {
        do {
            i++;
            if (i >= this.a.size()) {
                return -1;
            }
        } while (!((esc) this.a.get(i)).a(context));
        return i;
    }

    public boolean b(int i) {
        this.a.get(i);
        return false;
    }
}
