package p000;

import android.graphics.SurfaceTexture;

public class itu {
    public final iok f19009a;

    public void m23272a() {
        this.f19009a.mo3275b();
    }

    public void m23273a(int i) {
        if (this.f19009a instanceof inj) {
            ((inj) this.f19009a).m22378c(i);
        }
    }

    public itp m23274b() {
        return this.f19009a.m22366r();
    }

    public void m23275c() {
        if (this.f19009a instanceof inj) {
            ((inj) this.f19009a).m22385j();
        }
    }

    public itu(ijn ijn, String str, Object obj) {
        this.f19009a = (iok) iil.m21875b("Trying to create a renderer for a participant that doesn't exist!", ijn.m21972j().m22770a(str));
        this.f19009a.mo3273a(obj);
    }

    public itu(ijn ijn, SurfaceTexture surfaceTexture, String str) {
        this(ijn, str, (Object) surfaceTexture);
    }
}
