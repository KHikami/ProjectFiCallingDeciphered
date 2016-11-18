package p000;

final class apl {
    private boolean f2054a;
    private boolean f2055b;
    private boolean f2056c;

    apl() {
    }

    synchronized boolean m3664a(boolean z) {
        this.f2054a = true;
        return m3662b(z);
    }

    synchronized boolean m3663a() {
        this.f2055b = true;
        return m3662b(false);
    }

    synchronized boolean m3665b() {
        this.f2056c = true;
        return m3662b(false);
    }

    synchronized void m3666c() {
        this.f2055b = false;
        this.f2054a = false;
        this.f2056c = false;
    }

    private boolean m3662b(boolean z) {
        return (this.f2056c || z || this.f2055b) && this.f2054a;
    }
}
