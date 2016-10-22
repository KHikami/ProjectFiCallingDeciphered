import com.google.android.gms.common.api.Status;

public final class hil extends heb {
    final /* synthetic */ hry a;
    final /* synthetic */ hrv b;

    public hil(hrv hrv, gui gui, hry hry) {
        this.b = hrv;
        this.a = hry;
        super(gui, '\u0000');
    }

    private hrz a(Status status) {
        return new him(this, status);
    }

    private void a(hvm hvm) {
        hvm.a(this, false, this.a.a(), null, null, this.a.b());
    }

    protected /* synthetic */ gup b(Status status) {
        return a(status);
    }
}
