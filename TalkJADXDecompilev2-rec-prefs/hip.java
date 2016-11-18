package p000;

import com.google.android.gms.common.api.Status;

public final class hip extends heb {
    final /* synthetic */ String f17002a;
    final /* synthetic */ String f17003b;
    final /* synthetic */ hrw f17004c;
    final /* synthetic */ hrv f17005d;

    public hip(hrv hrv, gui gui, String str, String str2, hrw hrw) {
        this.f17005d = hrv;
        this.f17002a = str;
        this.f17003b = str2;
        this.f17004c = hrw;
        super(gui, '\u0000');
    }

    private hrx m19864a(Status status) {
        return new hiq(this, status);
    }

    private void m19865a(hvm hvm) {
        hvm.m21085a(this, this.f17002a, this.f17003b, this.f17004c.m20738a(), this.f17004c.m20739b(), this.f17004c.m20740c(), this.f17004c.m20741d(), this.f17004c.m20742e(), this.f17004c.m20743f(), this.f17004c.m20744g(), this.f17004c.m20745h());
    }

    protected /* synthetic */ gup mo2424b(Status status) {
        return m19864a(status);
    }
}
