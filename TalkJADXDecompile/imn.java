import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;

final class imn extends Callback {
    final /* synthetic */ imm a;

    imn(imm imm) {
        this.a = imm;
    }

    public void onError(MediaCodec mediaCodec, CodecException codecException) {
        this.a.a((IllegalStateException) codecException);
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        itx.a(5, "vclib", "Ignoring unexpected onInputBufferAvailable from encoder MediaCodec.");
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        this.a.a(i, bufferInfo);
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.a.a(mediaFormat);
    }
}
