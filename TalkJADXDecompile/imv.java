import android.util.LruCache;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;

public final class imv extends LruCache<iuc, ikz> {
    final /* synthetic */ MediaCodecSimulcastEncoder a;

    public /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        a(z, (iuc) obj, (ikz) obj2);
    }

    public imv(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder, int i) {
        this.a = mediaCodecSimulcastEncoder;
        super(3);
    }

    private void a(boolean z, iuc iuc, ikz ikz) {
        if (z) {
            this.a.b.a(new imw(this, iuc, ikz));
        }
    }
}
