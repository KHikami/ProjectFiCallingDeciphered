import android.content.Context;

final class clf {
    private final cxd a;

    public clf() {
        this.a = new cxe().a("livecamera").b("Live camera inline with the attachment area.").a(false).a();
    }

    public cxd[] a() {
        return new cxd[]{this.a};
    }

    public ckq a(Context context) {
        return (this.a.a(context) && context.getPackageManager().hasSystemFeature("android.hardware.camera")) ? new clg(this) : null;
    }
}
