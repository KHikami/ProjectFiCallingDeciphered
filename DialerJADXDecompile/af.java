import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
public final class af {
    private static af e;
    public final Object a;
    public final Handler b;
    public ai c;
    public ai d;

    public static af a() {
        if (e == null) {
            e = new af();
        }
        return e;
    }

    private af() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), new ag(this));
    }

    public final void a(ah ahVar) {
        synchronized (this.a) {
            if (d(ahVar)) {
                this.b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public final void b(ah ahVar) {
        synchronized (this.a) {
            if (d(ahVar)) {
                a(this.c);
            }
        }
    }

    public final boolean c(ah ahVar) {
        boolean z;
        synchronized (this.a) {
            z = d(ahVar) || e(ahVar);
        }
        return z;
    }

    public final void b() {
        if (this.d != null) {
            this.c = this.d;
            this.d = null;
            ah ahVar = (ah) this.c.a.get();
            if (ahVar != null) {
                ahVar.a();
            } else {
                this.c = null;
            }
        }
    }

    public final boolean d(ah ahVar) {
        return this.c != null && this.c.a(ahVar);
    }

    public final boolean e(ah ahVar) {
        return this.d != null && this.d.a(ahVar);
    }

    final void b(ai aiVar) {
        synchronized (this.a) {
            if (this.c == aiVar || this.d == aiVar) {
                a(aiVar, 2);
            }
        }
    }

    public final boolean a(ai aiVar, int i) {
        ah ahVar = (ah) aiVar.a.get();
        if (ahVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(aiVar);
        ahVar.a(i);
        return true;
    }

    public final void a(ai aiVar) {
        if (aiVar.b != -2) {
            int i = 2750;
            if (aiVar.b > 0) {
                i = aiVar.b;
            } else if (aiVar.b == -1) {
                i = 1500;
            }
            this.b.removeCallbacksAndMessages(aiVar);
            this.b.sendMessageDelayed(Message.obtain(this.b, 0, aiVar), (long) i);
        }
    }
}
