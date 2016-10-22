package defpackage;

/* renamed from: apl */
final class apl {
    private boolean a;
    private boolean b;
    private boolean c;

    apl() {
    }

    synchronized boolean a(boolean z) {
        this.a = true;
        return b(z);
    }

    synchronized boolean a() {
        this.b = true;
        return b(false);
    }

    synchronized boolean b() {
        this.c = true;
        return b(false);
    }

    synchronized void c() {
        this.b = false;
        this.a = false;
        this.c = false;
    }

    private boolean b(boolean z) {
        return (this.c || z || this.b) && this.a;
    }
}
