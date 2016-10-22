import java.util.Locale;

public final class kf {
    private boolean a;
    private int b;
    private ko c;

    public kf() {
        this.a = ke.a(Locale.getDefault());
        this.c = ke.a;
        this.b = 2;
    }

    public ke a() {
        if (this.b != 2 || this.c != ke.a) {
            return new ke(this.a, this.b, this.c);
        }
        if (this.a) {
            return ke.c;
        }
        return ke.b;
    }
}
