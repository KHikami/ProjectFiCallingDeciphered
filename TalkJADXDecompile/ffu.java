import android.content.Context;

public final class ffu extends fjy<ffv> {
    public ffu(ffv ffv) {
        super(ffv);
    }

    protected euj a(Context context, int i, int i2) {
        return new esv(context, i, i2, (ffv) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
        fde.a(fde.e(i), (Exception) fdo);
    }

    public String K_() {
        return "background_queue";
    }

    public long b() {
        if (((ffv) this.a).c()) {
            return fde.c();
        }
        return 0;
    }

    public boolean c() {
        return false;
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return ((ffv) this.a).c() && super.a(context, eaf, fdo);
    }

    public boolean a(ead ead) {
        boolean c;
        iil.a(getClass(), ead.getClass());
        ffv ffv = (ffv) ((ffu) ead).a;
        if (((ffv) this.a).c() != ffv.c()) {
            c = ((ffv) this.a).c();
        } else {
            c = true;
        }
        if (c) {
            boolean c2 = ffv.c();
            new StringBuilder(76).append("Replacing a GetSelfInfoRequest. Old shouldRetry=").append(c2).append(". New shouldRetry=").append(((ffv) this.a).c());
        }
        return c;
    }

    public boolean d() {
        return true;
    }

    public boolean a(String str) {
        return false;
    }
}
