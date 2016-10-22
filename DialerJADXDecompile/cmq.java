final class cmq extends cmn {
    final /* synthetic */ cmo a;
    private /* synthetic */ cjy b;

    cmq(cmo cmo, cjy cjy) {
        this.a = cmo;
        this.b = cjy;
    }

    public final void a(byte[] bArr) {
        cmr cmr = new cmr(this, this.b, bArr);
        bui bui = this.a;
        synchronized (bui.c) {
            bui.c.add(cmr);
        }
        bui.b.sendMessage(bui.b.obtainMessage(2, bui.d.get(), -1, cmr));
    }
}
