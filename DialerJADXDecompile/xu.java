import android.view.View;
import java.util.List;

/* compiled from: PG */
final class xu {
    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    List j;
    boolean k;

    xu() {
        this.a = true;
        this.h = 0;
        this.j = null;
    }

    public final void a(View view) {
        View view2;
        int size = this.j.size();
        View view3 = null;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            int c;
            View view4;
            view2 = ((zk) this.j.get(i2)).a;
            za zaVar = (za) view2.getLayoutParams();
            if (!(view2 == view || zaVar.a.m())) {
                c = (zaVar.a.c() - this.d) * this.e;
                if (c >= 0 && c < i) {
                    if (c == 0) {
                        break;
                    }
                    view4 = view2;
                    i2++;
                    view3 = view4;
                    i = c;
                }
            }
            c = i;
            view4 = view3;
            i2++;
            view3 = view4;
            i = c;
        }
        view2 = view3;
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((za) view2.getLayoutParams()).a.c();
        }
    }
}
