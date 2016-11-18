package p000;

public class gpk {
    public boolean f15861a;
    public int f15862b;
    public final /* synthetic */ cdr f15863c;

    public void m18265a() {
        this.f15861a = true;
        this.f15862b++;
        if (this.f15863c.getActivity() != null) {
            boj boj = (boj) this.f15863c.getLoaderManager().mo1997b(2);
            if (boj != null) {
                boolean z = cdr.f5098a;
                boj.m6293a(true);
            }
        }
    }

    public void m18266b() {
        this.f15862b--;
        if (this.f15862b <= 0) {
            this.f15861a = false;
            if (this.f15863c.getActivity() != null) {
                boj boj = (boj) this.f15863c.getLoaderManager().mo1997b(2);
                if (boj != null) {
                    boolean z = cdr.f5098a;
                    boj.m6293a(false);
                }
            }
        }
    }

    public boolean m18267c() {
        return this.f15861a;
    }

    public gpk(cdr cdr) {
        this.f15863c = cdr;
        this.f15861a = false;
        this.f15862b = 0;
    }
}
