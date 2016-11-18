package p000;

import android.content.Context;
import java.util.ArrayList;

public class esm {
    private final ArrayList<esc> f12165a = new ArrayList();

    public void m14359a(Context context) {
        Class[] clsArr = new Class[]{ene.class, bdv.class, dvh.class, epx.class, ede.class, cqj.class, bgr.class, bep.class, bgt.class};
        this.f12165a.clear();
        for (int i = 0; i < 9; i++) {
            esc esc = (esc) jyn.m25433b(context, clsArr[i]);
            if (esc != null) {
                this.f12165a.add(esc);
            }
        }
    }

    public int m14360b(Context context) {
        int i = 0;
        for (int i2 = 0; i2 < this.f12165a.size(); i2++) {
            if (((esc) this.f12165a.get(i2)).mo498a(context)) {
                i++;
            }
        }
        return i;
    }

    public esc m14358a(int i) {
        return (esc) this.f12165a.get(i);
    }

    public int m14357a(Context context, int i) {
        do {
            i++;
            if (i >= this.f12165a.size()) {
                return -1;
            }
        } while (!((esc) this.f12165a.get(i)).mo498a(context));
        return i;
    }

    public boolean m14361b(int i) {
        this.f12165a.get(i);
        return false;
    }
}
