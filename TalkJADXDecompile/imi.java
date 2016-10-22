import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;

final class imi extends Callback {
    final /* synthetic */ imh a;

    imi(imh imh) {
        this.a = imh;
    }

    public void onError(MediaCodec mediaCodec, CodecException codecException) {
        this.a.a((Exception) codecException);
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        if (mediaCodec == this.a.d()) {
            this.a.g.add(Integer.valueOf(i));
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        if (mediaCodec == this.a.d()) {
            this.a.a(i, bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (mediaCodec == this.a.d()) {
            this.a.a(mediaFormat);
        }
    }
}
