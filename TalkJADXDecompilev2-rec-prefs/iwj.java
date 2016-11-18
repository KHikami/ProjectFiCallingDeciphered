package p000;

import android.app.Application;

public final class iwj {
    static volatile iwj f19256a;
    final iwk f19257b = new iwk();

    public static iwj m23388a(Application application) {
        if (f19256a == null) {
            synchronized (iwj.class) {
                if (f19256a == null) {
                    iwj iwj = new iwj();
                    iwj.f19257b.m23391a(application);
                    f19256a = iwj;
                }
            }
        }
        return f19256a;
    }

    private iwj() {
    }

    public void m23389a(ivz ivz) {
        this.f19257b.m23392a(ivz);
    }

    public void m23390b(ivz ivz) {
        this.f19257b.m23394b(ivz);
    }
}
