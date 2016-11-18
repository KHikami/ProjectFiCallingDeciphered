package p000;

final class irp extends itr {
    final /* synthetic */ iro f18815a;

    irp(iro iro) {
        this.f18815a = iro;
    }

    public void mo3392a(itt itt) {
        itx.m23277a(4, "vclib", "Camera1VideoInputCallback.onCaptureTargetsChanged");
        gwb.aJ();
        synchronized (this.f18815a.y) {
            this.f18815a.f18808a = itt.f19008c;
        }
        this.f18815a.m23059a(this.f18815a.x);
    }
}
