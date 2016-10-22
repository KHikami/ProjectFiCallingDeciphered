public abstract class bul {
    Object a;
    boolean b;
    private /* synthetic */ bui c;

    public bul(bui bui, Object obj) {
        this.c = bui;
        this.a = obj;
        this.b = false;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        d();
        synchronized (this.c.c) {
            this.c.c.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
