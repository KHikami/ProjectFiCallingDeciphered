import android.view.Choreographer.FrameCallback;

public abstract class iuk {
    private Runnable a;
    private FrameCallback b;

    public abstract void a(long j);

    FrameCallback a() {
        if (this.b == null) {
            this.b = new iul(this);
        }
        return this.b;
    }

    Runnable b() {
        if (this.a == null) {
            this.a = new ium(this);
        }
        return this.a;
    }
}
