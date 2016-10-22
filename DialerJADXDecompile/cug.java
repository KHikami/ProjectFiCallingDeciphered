import android.app.Application;

/* compiled from: PG */
public final class cug {
    private static volatile cug a;
    private final Application b;
    private final cuh c;
    private final cui d;
    private int e;
    private int f;

    public static cug a(Application application) {
        if (a == null) {
            synchronized (cug.class) {
                if (a == null) {
                    a = new cug(application);
                }
            }
        }
        return a;
    }

    private cug(Application application) {
        this.c = new cuh();
        this.b = (Application) buf.B((Object) application);
        this.d = new cui(application);
    }

    public final synchronized void a(ctw ctw) {
        int add;
        int add2;
        Object obj;
        buf.B((Object) ctw);
        if (ctw instanceof ctx) {
            add = this.c.a.add((ctx) ctw) | 0;
        } else {
            add = 0;
        }
        if (ctw instanceof cuc) {
            add |= this.c.b.add((cuc) ctw);
        }
        if (ctw instanceof cua) {
            add |= this.c.c.add((cua) ctw);
        }
        if (ctw instanceof ctz) {
            add |= this.c.d.add((ctz) ctw);
        }
        if (ctw instanceof cud) {
            add |= this.c.e.add((cud) ctw);
        }
        if (ctw instanceof cub) {
            add |= this.c.f.add((cub) ctw);
        }
        if (ctw instanceof cty) {
            add |= this.c.g.add((cty) ctw);
        }
        if (ctw instanceof cuf) {
            add2 = this.d.a.add((cuf) ctw) | add;
            obj = 1;
        } else {
            add2 = add;
            obj = null;
        }
        if (ctw instanceof cue) {
            add2 |= this.d.b.add((cue) ctw);
            obj = 1;
        }
        if (obj != null) {
            add = this.f + 1;
            this.f = add;
            if (add == 1) {
                a(this.d);
            }
        }
        if (add2 != 0) {
            add2 = this.e + 1;
            this.e = add2;
            if (add2 == 1) {
                this.b.registerActivityLifecycleCallbacks(this.c);
            }
        }
    }

    public final synchronized void b(ctw ctw) {
        Object obj = null;
        int i = 1;
        synchronized (this) {
            int remove;
            Object obj2;
            buf.B((Object) ctw);
            if (ctw instanceof ctx) {
                remove = this.c.a.remove(ctw) | 0;
            } else {
                remove = 0;
            }
            if (ctw instanceof cuc) {
                remove |= this.c.b.remove(ctw);
            }
            if (ctw instanceof cua) {
                remove |= this.c.c.remove(ctw);
            }
            if (ctw instanceof ctz) {
                remove |= this.c.d.remove(ctw);
            }
            if (ctw instanceof cud) {
                remove |= this.c.e.remove(ctw);
            }
            if (ctw instanceof cub) {
                remove |= this.c.f.remove(ctw);
            }
            if (ctw instanceof cty) {
                remove |= this.c.g.remove(ctw);
            }
            if ((ctw instanceof cuf) && this.d.a.remove(ctw)) {
                remove = 1;
                obj = 1;
            }
            if ((ctw instanceof cue) && this.d.b.remove(ctw)) {
                obj2 = 1;
            } else {
                i = remove;
                obj2 = obj;
            }
            if (obj2 != null) {
                remove = this.f - 1;
                this.f = remove;
                if (remove == 0) {
                    b(this.d);
                }
            }
            if (i != 0) {
                i = this.e - 1;
                this.e = i;
                if (i == 0) {
                    this.b.unregisterActivityLifecycleCallbacks(this.c);
                }
            }
        }
    }
}
