public class gpk {
    public boolean a;
    public int b;
    public final /* synthetic */ cdr c;

    public void a() {
        this.a = true;
        this.b++;
        if (this.c.getActivity() != null) {
            boj boj = (boj) this.c.getLoaderManager().b(2);
            if (boj != null) {
                boolean z = cdr.a;
                boj.a(true);
            }
        }
    }

    public void b() {
        this.b--;
        if (this.b <= 0) {
            this.a = false;
            if (this.c.getActivity() != null) {
                boj boj = (boj) this.c.getLoaderManager().b(2);
                if (boj != null) {
                    boolean z = cdr.a;
                    boj.a(false);
                }
            }
        }
    }

    public boolean c() {
        return this.a;
    }

    public gpk(cdr cdr) {
        this.c = cdr;
        this.a = false;
        this.b = 0;
    }
}
