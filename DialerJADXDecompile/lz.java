import android.os.Build.VERSION;
import android.view.View;

/* compiled from: PG */
final class lz implements mg {
    private lv a;
    private boolean b;

    lz(lv lvVar) {
        this.a = lvVar;
    }

    public final void a(View view) {
        mg mgVar;
        this.b = false;
        if (this.a.d >= 0) {
            kn.a(view, 2, null);
        }
        if (this.a.b != null) {
            Runnable runnable = this.a.b;
            this.a.b = null;
            runnable.run();
        }
        Object tag = view.getTag(2113929216);
        if (tag instanceof mg) {
            mgVar = (mg) tag;
        } else {
            mgVar = null;
        }
        if (mgVar != null) {
            mgVar.a(view);
        }
    }

    public final void b(View view) {
        if (this.a.d >= 0) {
            kn.a(view, this.a.d, null);
            this.a.d = -1;
        }
        if (VERSION.SDK_INT >= 16 || !this.b) {
            mg mgVar;
            if (this.a.c != null) {
                Runnable runnable = this.a.c;
                this.a.c = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof mg) {
                mgVar = (mg) tag;
            } else {
                mgVar = null;
            }
            if (mgVar != null) {
                mgVar.b(view);
            }
            this.b = true;
        }
    }

    public final void c(View view) {
        mg mgVar;
        Object tag = view.getTag(2113929216);
        if (tag instanceof mg) {
            mgVar = (mg) tag;
        } else {
            mgVar = null;
        }
        if (mgVar != null) {
            mgVar.c(view);
        }
    }
}
