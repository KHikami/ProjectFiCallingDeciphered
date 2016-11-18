package p000;

import android.os.Build.VERSION;
import android.view.View;

final class pr implements py {
    pn f35000a;
    boolean f35001b;

    pr(pn pnVar) {
        this.f35000a = pnVar;
    }

    public void m40316a(View view) {
        py pyVar;
        this.f35001b = false;
        if (this.f35000a.f34993c >= 0) {
            oa.m37335a(view, 2, null);
        }
        if (this.f35000a.f34991a != null) {
            Runnable runnable = this.f35000a.f34991a;
            this.f35000a.f34991a = null;
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

    public void m40317b(View view) {
        if (this.f35000a.f34993c >= 0) {
            oa.m37335a(view, this.f35000a.f34993c, null);
            this.f35000a.f34993c = -1;
        }
        if (VERSION.SDK_INT >= 16 || !this.f35001b) {
            py pyVar;
            if (this.f35000a.f34992b != null) {
                Runnable runnable = this.f35000a.f34992b;
                this.f35000a.f34992b = null;
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
            this.f35001b = true;
        }
    }

    public void m40318c(View view) {
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
