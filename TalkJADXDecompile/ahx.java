import android.widget.ProgressBar;

public final class ahx {
    private final ProgressBar a;
    private final ProgressBar b;
    private boolean c;

    public ahx(ProgressBar progressBar, ProgressBar progressBar2, boolean z) {
        this.a = progressBar;
        this.b = progressBar2;
        a(true);
    }

    private void a(boolean z) {
        this.c = z;
        b(this.c);
    }

    public void a(int i) {
        if (i == 4 || i == 8) {
            this.b.setVisibility(i);
            this.a.setVisibility(i);
            return;
        }
        b(this.c);
    }

    private void b(boolean z) {
        int i;
        int i2 = 8;
        ProgressBar progressBar = this.b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        ProgressBar progressBar2 = this.a;
        if (!z) {
            i2 = 0;
        }
        progressBar2.setVisibility(i2);
    }
}
