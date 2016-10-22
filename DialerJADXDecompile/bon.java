import android.util.DisplayMetrics;
import java.util.Locale;

public final class bon extends bpb {
    bon(bnp bnp) {
        super(bnp);
    }

    protected final void a() {
    }

    public final cqw b() {
        o();
        DisplayMetrics displayMetrics = this.f.b().a.getResources().getDisplayMetrics();
        cqw cqw = new cqw();
        cqw.a = bpq.a(Locale.getDefault());
        cqw.c = displayMetrics.widthPixels;
        cqw.d = displayMetrics.heightPixels;
        return cqw;
    }
}
