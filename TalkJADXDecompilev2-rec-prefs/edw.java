package p000;

import android.app.Activity;

final class edw implements bpu {
    final /* synthetic */ edv f11255a;

    edw(edv edv) {
        this.f11255a = edv;
    }

    public void mo903a(bjg bjg, boolean z, int i) {
        iil.m21873a("Unexpected model count", Integer.valueOf(this.f11255a.ap.m4867b()), Integer.valueOf(z ? 1 : 0));
        if (z) {
            this.f11255a.ao.mo654a(boy.LOCAL_AND_SERVER, false, null, null, 2567);
        } else {
            this.f11255a.m7002a();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo904a(String str) {
        switch (eed.f11296a[this.f11255a.at.ordinal()]) {
            case 1:
            case 2:
                this.f11255a.startActivity(gwb.m1537a(this.f11255a.an.m5638g(), str, 1));
                break;
            case 3:
                break;
            case 4:
                int i;
                Activity activity = this.f11255a.getActivity();
                bko bko = this.f11255a.an;
                if (this.f11255a.at == bxt.AUDIO_CALL) {
                    i = 1;
                } else {
                    i = 2;
                }
                new epi(activity, bko, str, true, i, true, 117, 0, false, false).m4950b(new Void[0]);
                break;
            default:
                String valueOf = String.valueOf(this.f11255a.at);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
        }
        this.f11255a.m7002a();
    }

    public void mo902a() {
        this.f11255a.m7002a();
    }
}
