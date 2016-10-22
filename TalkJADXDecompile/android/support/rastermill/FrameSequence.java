package android.support.rastermill;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class FrameSequence {
    private final int mDefaultLoopCount;
    private final int mFrameCount;
    private final int mHeight;
    private final long mNativeFrameSequence;
    private final boolean mOpaque;
    private final int mWidth;

    class State {
        private long mNativeState;

        public State(long j) {
            this.mNativeState = j;
        }

        public void destroy() {
            if (this.mNativeState != 0) {
                FrameSequence.nativeDestroyState(this.mNativeState);
                this.mNativeState = 0;
            }
        }

        public long getFrame(int i, Bitmap bitmap, int i2) {
            if (bitmap == null || bitmap.getConfig() != Config.ARGB_8888) {
                throw new IllegalArgumentException("Bitmap passed must be non-null and ARGB_8888");
            } else if (this.mNativeState != 0) {
                return FrameSequence.nativeGetFrame(this.mNativeState, i, bitmap, i2);
            } else {
                throw new IllegalStateException("attempted to draw destroyed FrameSequenceState");
            }
        }
    }

    private static native long nativeCreateState(long j);

    private static native FrameSequence nativeDecodeByteArray(byte[] bArr, int i, int i2);

    private static native FrameSequence nativeDecodeByteBuffer(ByteBuffer byteBuffer, int i, int i2);

    private static native FrameSequence nativeDecodeStream(InputStream inputStream, byte[] bArr);

    private static native void nativeDestroyFrameSequence(long j);

    private static native void nativeDestroyState(long j);

    private static native long nativeGetFrame(long j, int i, Bitmap bitmap, int i2);

    static {
        System.loadLibrary("framesequence");
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public boolean isOpaque() {
        return this.mOpaque;
    }

    public int getFrameCount() {
        return this.mFrameCount;
    }

    public int getDefaultLoopCount() {
        return this.mDefaultLoopCount;
    }

    private FrameSequence(long j, int i, int i2, boolean z, int i3, int i4) {
        this.mNativeFrameSequence = j;
        this.mWidth = i;
        this.mHeight = i2;
        this.mOpaque = z;
        this.mFrameCount = i3;
        this.mDefaultLoopCount = i4;
    }

    public static FrameSequence decodeByteArray(byte[] bArr) {
        return decodeByteArray(bArr, 0, bArr.length);
    }

    public static FrameSequence decodeByteArray(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException();
        } else if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            return nativeDecodeByteArray(bArr, i, i2);
        } else {
            throw new IllegalArgumentException("invalid offset/length parameters");
        }
    }

    public static FrameSequence decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        } else if (byteBuffer.isDirect()) {
            return nativeDecodeByteBuffer(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
        } else {
            if (byteBuffer.hasArray()) {
                return decodeByteArray(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Cannot have non-direct ByteBuffer with no byte array");
        }
    }

    public static FrameSequence decodeStream(InputStream inputStream) {
        if (inputStream != null) {
            return nativeDecodeStream(inputStream, new byte[16384]);
        }
        throw new IllegalArgumentException();
    }

    State createState() {
        if (this.mNativeFrameSequence == 0) {
            throw new IllegalStateException("attempted to use incorrectly built FrameSequence");
        }
        long nativeCreateState = nativeCreateState(this.mNativeFrameSequence);
        if (nativeCreateState == 0) {
            return null;
        }
        return new State(nativeCreateState);
    }

    protected void finalize() {
        try {
            if (this.mNativeFrameSequence != 0) {
                nativeDestroyFrameSequence(this.mNativeFrameSequence);
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }
}
