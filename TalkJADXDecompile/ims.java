import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder;
import com.google.android.libraries.hangouts.video.internal.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams;
import java.util.Comparator;

public final class ims implements Comparator<EncoderConfigurationOutputParams> {
    final /* synthetic */ MediaCodecSimulcastEncoder a;

    public ims(MediaCodecSimulcastEncoder mediaCodecSimulcastEncoder) {
        this.a = mediaCodecSimulcastEncoder;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        EncoderConfigurationOutputParams encoderConfigurationOutputParams = (EncoderConfigurationOutputParams) obj;
        EncoderConfigurationOutputParams encoderConfigurationOutputParams2 = (EncoderConfigurationOutputParams) obj2;
        return (encoderConfigurationOutputParams.width * encoderConfigurationOutputParams.height) - (encoderConfigurationOutputParams2.width * encoderConfigurationOutputParams2.height);
    }
}
