package p000;

import android.view.TextureView;

public class cvt {
    final /* synthetic */ cvo f9196a;

    public void m11139a(isy isy, TextureView textureView) {
        if (this.f9196a.f9178c != isy) {
            TextureView textureView2 = this.f9196a.f9179d;
            if (this.f9196a.f9178c != null) {
                this.f9196a.f9179d = null;
                this.f9196a.f9178c.m23147a(null);
            }
            this.f9196a.f9178c = isy;
            this.f9196a.f9179d = textureView;
            this.f9196a.f9182g = false;
            this.f9196a.f9177b.mo1088a(false);
            if (this.f9196a.f9178c != null) {
                this.f9196a.f9178c.m23145a(this.f9196a.f9180e);
                this.f9196a.f9178c.m23146a(this.f9196a.f9181f);
                this.f9196a.f9178c.m23147a(this.f9196a.f9176a);
            }
            this.f9196a.f9177b.mo1087a(textureView2, this.f9196a.f9179d);
            if (this.f9196a.f9178c != null) {
                this.f9196a.f9178c.m23149b();
            }
        }
    }

    cvt(cvo cvo) {
        this.f9196a = cvo;
    }
}
