package p000;

import android.os.SystemClock;
import android.view.MenuItem;

final class xs implements adn {
    final /* synthetic */ xq f35734a;

    xs(xq xqVar) {
        this.f35734a = xqVar;
    }

    public void m41381a(xy xyVar, MenuItem menuItem) {
        this.f35734a.f35708a.removeCallbacksAndMessages(xyVar);
    }

    public void m41382b(xy xyVar, MenuItem menuItem) {
        int i;
        this.f35734a.f35708a.removeCallbacksAndMessages(null);
        int size = this.f35734a.f35709b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (xyVar == ((xu) this.f35734a.f35709b.get(i2)).f35740b) {
                i = i2;
                break;
            }
        }
        i = -1;
        if (i != -1) {
            xu xuVar;
            i++;
            if (i < this.f35734a.f35709b.size()) {
                xuVar = (xu) this.f35734a.f35709b.get(i);
            } else {
                xuVar = null;
            }
            this.f35734a.f35708a.postAtTime(new xt(this, xuVar, menuItem, xyVar), xyVar, SystemClock.uptimeMillis() + 200);
        }
    }
}
