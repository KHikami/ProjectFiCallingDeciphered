package p000;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;

final class imn extends Callback {
    final /* synthetic */ imm f18075a;

    imn(imm imm) {
        this.f18075a = imm;
    }

    public void onError(MediaCodec mediaCodec, CodecException codecException) {
        this.f18075a.m22286a((IllegalStateException) codecException);
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        itx.m23277a(5, "vclib", "Ignoring unexpected onInputBufferAvailable from encoder MediaCodec.");
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, BufferInfo bufferInfo) {
        this.f18075a.m22283a(i, bufferInfo);
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f18075a.m22285a(mediaFormat);
    }
}
