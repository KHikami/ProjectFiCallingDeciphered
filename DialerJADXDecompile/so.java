import android.os.SystemClock;
import android.view.MenuItem;

/* compiled from: PG */
final class so implements yh {
    final /* synthetic */ sm a;

    so(sm smVar) {
        this.a = smVar;
    }

    public final void a(su suVar, MenuItem menuItem) {
        this.a.a.removeCallbacksAndMessages(suVar);
    }

    public final void b(su suVar, MenuItem menuItem) {
        int i;
        this.a.a.removeCallbacksAndMessages(null);
        int size = this.a.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (suVar == ((sq) this.a.b.get(i2)).b) {
                i = i2;
                break;
            }
        }
        i = -1;
        if (i != -1) {
            sq sqVar;
            i++;
            if (i < this.a.b.size()) {
                sqVar = (sq) this.a.b.get(i);
            } else {
                sqVar = null;
            }
            this.a.a.postAtTime(new sp(this, sqVar, menuItem, suVar), suVar, SystemClock.uptimeMillis() + 200);
        }
    }
}
