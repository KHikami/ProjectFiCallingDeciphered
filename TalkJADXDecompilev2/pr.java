package defpackage;

import android.os.Build.VERSION;
import android.view.View;

final class pr implements py {
    pn a;
    boolean b;

    pr(pn pnVar) {
        this.a = pnVar;
    }

    public void a(View view) {
        py pyVar;
        this.b = false;
        if (this.a.c >= 0) {
            oa.a(view, 2, null);
        }
        if (this.a.a != null) {
            Runnable runnable = this.a.a;
            this.a.a = null;
            runnable.run();
        }
        Object tag = view.getTag(2113929216);
        if (tag instanceof py) {
            pyVar = (py) tag;
        } else {
            pyVar = null;
        }
        if (pyVar != null) {
            pyVar.a(view);
        }
    }

    public void b(View view) {
        if (this.a.c >= 0) {
            oa.a(view, this.a.c, null);
            this.a.c = -1;
        }
        if (VERSION.SDK_INT >= 16 || !this.b) {
            py pyVar;
            if (this.a.b != null) {
                Runnable runnable = this.a.b;
                this.a.b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof py) {
                pyVar = (py) tag;
            } else {
                pyVar = null;
            }
            if (pyVar != null) {
                pyVar.b(view);
            }
            this.b = true;
        }
    }

    public void c(View view) {
        py pyVar;
        Object tag = view.getTag(2113929216);
        if (tag instanceof py) {
            pyVar = (py) tag;
        } else {
            pyVar = null;
        }
        if (pyVar != null) {
            pyVar.c(view);
        }
    }
}
