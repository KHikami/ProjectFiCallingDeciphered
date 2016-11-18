package defpackage;

import android.os.SystemClock;
import android.view.MenuItem;

final class xs implements adn {
    final /* synthetic */ xq a;

    xs(xq xqVar) {
        this.a = xqVar;
    }

    public void a(xy xyVar, MenuItem menuItem) {
        this.a.a.removeCallbacksAndMessages(xyVar);
    }

    public void b(xy xyVar, MenuItem menuItem) {
        int i;
        this.a.a.removeCallbacksAndMessages(null);
        int size = this.a.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (xyVar == ((xu) this.a.b.get(i2)).b) {
                i = i2;
                break;
            }
        }
        i = -1;
        if (i != -1) {
            xu xuVar;
            i++;
            if (i < this.a.b.size()) {
                xuVar = (xu) this.a.b.get(i);
            } else {
                xuVar = null;
            }
            this.a.a.postAtTime(new xt(this, xuVar, menuItem, xyVar), xyVar, SystemClock.uptimeMillis() + 200);
        }
    }
}
