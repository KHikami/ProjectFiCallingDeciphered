final class irp extends itr {
    final /* synthetic */ iro a;

    irp(iro iro) {
        this.a = iro;
    }

    public void a(itt itt) {
        itx.a(4, "vclib", "Camera1VideoInputCallback.onCaptureTargetsChanged");
        gwb.aJ();
        synchronized (this.a.y) {
            this.a.a = itt.c;
        }
        this.a.a(this.a.x);
    }
}
