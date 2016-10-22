import android.view.Choreographer;

final class iuo extends iui {
    private Choreographer a;

    public iuo() {
        this.a = Choreographer.getInstance();
    }

    public void a(iuk iuk) {
        this.a.postFrameCallback(iuk.a());
    }

    public void b(iuk iuk) {
        this.a.removeFrameCallback(iuk.a());
    }
}
