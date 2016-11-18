package p000;

import android.content.Context;

final class clf {
    private final cxd f5544a = new cxe().m11190a("livecamera").m11192b("Live camera inline with the attachment area.").m11191a(false).m11189a();

    public cxd[] m7867a() {
        return new cxd[]{this.f5544a};
    }

    public ckq m7866a(Context context) {
        return (this.f5544a.mo1450a(context) && context.getPackageManager().hasSystemFeature("android.hardware.camera")) ? new clg(this) : null;
    }
}
