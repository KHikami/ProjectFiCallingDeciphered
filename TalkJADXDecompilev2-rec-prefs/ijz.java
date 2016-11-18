package p000;

final class ijz implements ioq {
    final /* synthetic */ ijt f17839a;

    ijz(ijt ijt) {
        this.f17839a = ijt;
    }

    public void mo3258a(long j, String str) {
    }

    public void mo3257a(long j) {
        if (this.f17839a.f17802a.m10345c()) {
            this.f17839a.f17802a.handleApiaryResponse(j, null);
        } else {
            itx.m23277a(5, "vclib", "LibjingleRequestListener.onRequestError: not initialized");
        }
    }

    public void mo3259a(long j, byte[] bArr) {
        if (this.f17839a.f17802a.m10345c()) {
            this.f17839a.f17802a.handleApiaryResponse(j, bArr);
        } else {
            itx.m23277a(5, "vclib", "LibjingleRequestListener.onRequestCompleted: not initialized");
        }
    }
}
