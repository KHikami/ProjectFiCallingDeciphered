package defpackage;

import android.app.Application;

public final class iwj {
    static volatile iwj a;
    final iwk b = new iwk();

    public static iwj a(Application application) {
        if (a == null) {
            synchronized (iwj.class) {
                if (a == null) {
                    iwj iwj = new iwj();
                    iwj.b.a(application);
                    a = iwj;
                }
            }
        }
        return a;
    }

    private iwj() {
    }

    public void a(ivz ivz) {
        this.b.a(ivz);
    }

    public void b(ivz ivz) {
        this.b.b(ivz);
    }
}
