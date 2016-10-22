final class juc implements Runnable {
    final /* synthetic */ jtv a;
    final /* synthetic */ Object b;
    final /* synthetic */ jtz c;

    juc(jtz jtz, jtv jtv, Object obj) {
        this.c = jtz;
        this.a = jtv;
        this.b = obj;
    }

    public void run() {
        this.a.a(this.b);
    }
}
