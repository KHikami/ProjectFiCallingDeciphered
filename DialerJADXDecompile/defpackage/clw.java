package defpackage;

/* renamed from: clw */
public final class clw {
    private int a;

    clw() {
        this.a = 0;
    }

    public final synchronized void a() {
        this.a++;
    }

    public final synchronized void b() {
        if (this.a == 0) {
            throw new RuntimeException("too many decrements");
        }
        this.a--;
        if (this.a == 0) {
            notifyAll();
        }
    }
}
