import android.view.TextureView;

public class cvt {
    final /* synthetic */ cvo a;

    public void a(isy isy, TextureView textureView) {
        if (this.a.c != isy) {
            TextureView textureView2 = this.a.d;
            if (this.a.c != null) {
                this.a.d = null;
                this.a.c.a(null);
            }
            this.a.c = isy;
            this.a.d = textureView;
            this.a.g = false;
            this.a.b.a(false);
            if (this.a.c != null) {
                this.a.c.a(this.a.e);
                this.a.c.a(this.a.f);
                this.a.c.a(this.a.a);
            }
            this.a.b.a(textureView2, this.a.d);
            if (this.a.c != null) {
                this.a.c.b();
            }
        }
    }

    cvt(cvo cvo) {
        this.a = cvo;
    }
}
