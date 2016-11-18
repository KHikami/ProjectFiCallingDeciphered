package p000;

import android.util.LruCache;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;

public final class imv extends LruCache<iuc, ikz> {
    final /* synthetic */ MediaCodecSimulcastEncoder f18085a;

    public /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        m22315a(z, (iuc) obj, (ikz) obj2);
    }

    public imv(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder, int i) {
        this.f18085a = mediaCodecSimulcastEncoder;
        super(3);
    }

    private void m22315a(boolean z, iuc iuc, ikz ikz) {
        if (z) {
            this.f18085a.f8460b.m22233a(new imw(this, iuc, ikz));
        }
    }
}
