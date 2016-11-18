package defpackage;

public abstract class gvt<TListener> {
    private TListener a;
    private boolean b = false;
    final /* synthetic */ gvo d;

    public gvt(gvo gvo, TListener tListener) {
        this.d = gvo;
        this.a = tListener;
    }

    protected abstract void a(TListener tListener);

    public void b() {
        synchronized (this) {
            Object obj = this.a;
            if (this.b) {
                String valueOf = String.valueOf(this);
                new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.b = true;
        }
        c();
    }

    public void c() {
        d();
        synchronized (this.d.r) {
            this.d.r.remove(this);
        }
    }

    public void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
