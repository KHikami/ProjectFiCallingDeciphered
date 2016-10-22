import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;
import java.util.List;

public final class imu implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ MediaCodecSimulcastEncoder b;

    public imu(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder, List list) {
        this.b = mediaCodecSimulcastEncoder;
        this.a = list;
    }

    public void run() {
        for (ikz c : this.a) {
            c.c();
        }
    }
}
