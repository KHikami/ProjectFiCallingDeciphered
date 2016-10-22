import com.google.android.libraries.hangouts.video.internal.VideoViewRequest;

final class inr implements Runnable {
    final /* synthetic */ inj a;
    private VideoViewRequest b;

    inr(inj inj) {
        this.a = inj;
    }

    public void run() {
        iqo c = this.a.l.c();
        if (this.a.f == 0) {
            itx.a(4, "vclib", "No ssrc for renderer; not sending ViewRequest");
            return;
        }
        int i;
        int i2;
        int i3;
        if (c.o() || this.a.p == null) {
            String valueOf = String.valueOf(this.a.l.a());
            boolean o = c.o();
            String valueOf2 = String.valueOf(this.a.p);
            itx.a(4, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 42) + String.valueOf(valueOf2).length()).append("No view request for ").append(valueOf).append(" muted=").append(o).append(", surface=").append(valueOf2).toString());
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            int i4;
            iud a;
            if (this.a.g == 0) {
                i4 = 1;
            } else {
                i4 = this.a.g;
            }
            switch (i4) {
                case wi.l /*2*/:
                case wi.z /*3*/:
                    a = iks.a(this.a.k());
                    break;
                case wi.h /*4*/:
                    a = null;
                    break;
                default:
                    a = iks.b(this.a.k());
                    break;
            }
            i2 = a == null ? 0 : a.a().a;
            if (a == null) {
                i = 0;
                i3 = i2;
            } else {
                i = a.c();
                i3 = i2;
            }
        }
        VideoViewRequest videoViewRequest = new VideoViewRequest(this.a.f, this.a.e, i3, i2, i);
        if (videoViewRequest.equals(this.b)) {
            itx.a(3, "vclib", "Not sending duplicate request %s", videoViewRequest);
            return;
        }
        this.b = videoViewRequest;
        itx.a(3, "vclib", "Sending view request %s", videoViewRequest);
        this.a.a.a(new VideoViewRequest[]{videoViewRequest});
    }
}
