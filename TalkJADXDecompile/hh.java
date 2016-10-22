import android.os.Bundle;

public final class hh {
    private final String a;
    private CharSequence b;
    private CharSequence[] c;
    private boolean d;
    private Bundle e;

    public hh(String str) {
        this.d = true;
        this.e = new Bundle();
        this.a = str;
    }

    public hh a(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public hh a(CharSequence[] charSequenceArr) {
        this.c = charSequenceArr;
        return this;
    }

    public hh a(boolean z) {
        this.d = false;
        return this;
    }

    public hg a() {
        return new hg(this.a, this.b, this.c, this.d, this.e);
    }
}
