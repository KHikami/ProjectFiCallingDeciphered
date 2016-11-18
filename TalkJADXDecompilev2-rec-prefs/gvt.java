package p000;

public abstract class gvt<TListener> {
    private TListener f16242a;
    private boolean f16243b = false;
    final /* synthetic */ gvo f16244d;

    public gvt(gvo gvo, TListener tListener) {
        this.f16244d = gvo;
        this.f16242a = tListener;
    }

    protected abstract void mo2349a(TListener tListener);

    public void m18725b() {
        synchronized (this) {
            Object obj = this.f16242a;
            if (this.f16243b) {
                String valueOf = String.valueOf(this);
                new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo2349a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f16243b = true;
        }
        m18726c();
    }

    public void m18726c() {
        m18727d();
        synchronized (this.f16244d.f16231r) {
            this.f16244d.f16231r.remove(this);
        }
    }

    public void m18727d() {
        synchronized (this) {
            this.f16242a = null;
        }
    }
}
