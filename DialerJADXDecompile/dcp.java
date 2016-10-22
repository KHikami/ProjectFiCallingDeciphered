/* compiled from: PG */
final class dcp {
    static final dcp a;
    volatile dcp next;
    volatile Thread thread;

    static {
        a = new dcp();
    }

    dcp() {
    }

    dcp(byte b) {
        dcd.a.a(this, Thread.currentThread());
    }

    final void a(dcp dcp) {
        dcd.a.a(this, dcp);
    }
}
