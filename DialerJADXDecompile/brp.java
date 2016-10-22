import android.app.Dialog;

final class brp extends btd {
    private /* synthetic */ Dialog a;
    private /* synthetic */ bro b;

    brp(bro bro, Dialog dialog) {
        this.b = bro;
        this.a = dialog;
    }

    protected final void a() {
        this.b.r();
        this.a.dismiss();
    }
}
