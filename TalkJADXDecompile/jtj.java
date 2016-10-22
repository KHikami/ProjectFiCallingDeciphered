final class jtj implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ jti b;

    jtj(jti jti, int i) {
        this.b = jti;
        this.a = i;
    }

    public void run() {
        this.b.a(this.a, new String[0], new int[0]);
    }
}
