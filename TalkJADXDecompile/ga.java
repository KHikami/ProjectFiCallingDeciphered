import java.util.ArrayList;

public final class ga extends gl {
    ArrayList<CharSequence> a;

    public ga() {
        this.a = new ArrayList();
    }

    public ga(fx fxVar) {
        this.a = new ArrayList();
        a(fxVar);
    }

    public ga a(CharSequence charSequence) {
        this.f = fx.d(charSequence);
        this.g = true;
        return this;
    }

    public ga b(CharSequence charSequence) {
        this.a.add(fx.d(charSequence));
        return this;
    }
}
