package p000;

import android.content.Context;

public final class ffu extends fjy<ffv> {
    public ffu(ffv ffv) {
        super(ffv);
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new esv(context, i, i2, (ffv) this.a);
    }

    protected void mo1014a(Context context, int i, fdo fdo) {
        fde.m14998a(fde.m15018e(i), (Exception) fdo);
    }

    public String K_() {
        return "background_queue";
    }

    public long mo1017b() {
        if (((ffv) this.a).m15222c()) {
            return fde.m15012c();
        }
        return 0;
    }

    public boolean mo1018c() {
        return false;
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return ((ffv) this.a).m15222c() && super.mo1008a(context, eaf, fdo);
    }

    public boolean mo1015a(ead ead) {
        boolean c;
        iil.m21869a(getClass(), ead.getClass());
        ffv ffv = (ffv) ((ffu) ead).a;
        if (((ffv) this.a).m15222c() != ffv.m15222c()) {
            c = ((ffv) this.a).m15222c();
        } else {
            c = true;
        }
        if (c) {
            boolean c2 = ffv.m15222c();
            new StringBuilder(76).append("Replacing a GetSelfInfoRequest. Old shouldRetry=").append(c2).append(". New shouldRetry=").append(((ffv) this.a).m15222c());
        }
        return c;
    }

    public boolean mo1019d() {
        return true;
    }

    public boolean mo1016a(String str) {
        return false;
    }
}
