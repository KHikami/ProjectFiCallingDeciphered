package defpackage;

import android.content.Context;

/* renamed from: fgl */
public final class fgl extends fjy<fgm> {
    public fgl(fgm fgm) {
        super(fgm);
    }

    protected euj a(Context context, int i, int i2) {
        return new eti(context, i, (fgm) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
    }

    public String K_() {
        return "ui_queue";
    }

    public long b() {
        return gwb.a(gwb.H(), "babel_pending_message_failure_duration", 1200000);
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    public boolean a(String str) {
        return false;
    }

    public boolean a(ead ead) {
        return false;
    }
}
