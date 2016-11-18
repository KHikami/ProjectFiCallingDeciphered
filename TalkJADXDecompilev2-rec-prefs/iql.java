package p000;

final class iql implements ijl<RemoveResponse> {
    final /* synthetic */ nzf f18705a;
    final /* synthetic */ ijl f18706b;
    final /* synthetic */ iqh f18707c;

    iql(iqh iqh, nzf nzf, ijl ijl) {
        this.f18707c = iqh;
        this.f18705a = nzf;
        this.f18706b = ijl;
    }

    public void mo1431a(RemoveResponse removeResponse) {
        ipu ipu = this.f18707c.a_;
        iqh iqh = this.f18707c;
        new mbd().f27204b = this.f18707c.f18685b.mo3370a(this.f18705a, removeResponse);
        mbc mbc = new mbc();
        mbc.f27201a = new mbd[]{r2};
        ipu.m22885a(mbc);
        this.f18706b.mo1431a(removeResponse);
    }

    public void mo1432b(RemoveResponse removeResponse) {
        this.f18706b.mo1432b(removeResponse);
    }
}
