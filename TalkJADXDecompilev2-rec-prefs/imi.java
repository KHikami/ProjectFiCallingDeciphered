package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;

final class imi extends Callback {
    final /* synthetic */ imh f18037a;

    imi(imh imh) {
        this.f18037a = imh;
    }

    public void onError(MediaCodec mediaCodec, CodecException codecException) {
        this.f18037a.m10374a((Exception) codecException);
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        if (mediaCodec == this.f18037a.m10379d()) {
            this.f18037a.f18035g.add(Integer.valueOf(i));
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        if (mediaCodec == this.f18037a.m10379d()) {
            this.f18037a.m10370a(i, bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (mediaCodec == this.f18037a.m10379d()) {
            this.f18037a.m10372a(mediaFormat);
        }
    }
}
