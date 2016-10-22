package android.support.rastermill;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;

public class FrameSequenceDrawable extends Drawable implements Animatable, Runnable {
    private static final long DEFAULT_DELAY_MS = 100;
    public static final int LOOP_DEFAULT = 3;
    public static final int LOOP_FINITE = 1;
    public static final int LOOP_INF = 2;
    @Deprecated
    public static final int LOOP_ONCE = 1;
    private static final long MIN_DELAY_MS = 20;
    private static final int STATE_DECODING = 2;
    private static final int STATE_READY_TO_SWAP = 4;
    private static final int STATE_SCHEDULED = 1;
    private static final int STATE_WAITING_TO_SWAP = 3;
    private static final String TAG = "FrameSequence";
    private static BitmapProvider sAllocatingBitmapProvider;
    private static HandlerThread sDecodingThread;
    private static Handler sDecodingThreadHandler;
    private static final Object sLock;
    private Bitmap mBackBitmap;
    private BitmapShader mBackBitmapShader;
    private final BitmapProvider mBitmapProvider;
    private boolean mCircleMaskEnabled;
    private int mCurrentLoop;
    private Runnable mDecodeRunnable;
    private boolean mDestroyed;
    private Runnable mFinishedCallbackRunnable;
    private final FrameSequence mFrameSequence;
    private final State mFrameSequenceState;
    private Bitmap mFrontBitmap;
    private BitmapShader mFrontBitmapShader;
    private long mLastSwap;
    private final Object mLock;
    private int mLoopBehavior;
    private int mLoopCount;
    private int mNextFrameToDecode;
    private long mNextSwap;
    private OnFinishedListener mOnFinishedListener;
    private final Paint mPaint;
    private final Rect mSrcRect;
    private int mState;
    private RectF mTempRectF;

    public interface BitmapProvider {
        Bitmap acquireBitmap(int i, int i2);

        void releaseBitmap(Bitmap bitmap);
    }

    final class 1 implements BitmapProvider {
        1() {
        }

        public Bitmap acquireBitmap(int i, int i2) {
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }

        public void releaseBitmap(Bitmap bitmap) {
        }
    }

    class 2 implements Runnable {
        2() {
        }

        public void run() {
            synchronized (FrameSequenceDrawable.this.mLock) {
                if (FrameSequenceDrawable.this.mDestroyed) {
                    return;
                }
                int access$200 = FrameSequenceDrawable.this.mNextFrameToDecode;
                if (access$200 < 0) {
                    return;
                }
                long frame;
                Object obj;
                Bitmap access$300;
                Object obj2;
                Bitmap access$3002 = FrameSequenceDrawable.this.mBackBitmap;
                FrameSequenceDrawable.this.mState = FrameSequenceDrawable.STATE_DECODING;
                try {
                    frame = FrameSequenceDrawable.this.mFrameSequenceState.getFrame(access$200, access$3002, access$200 - 2);
                    obj = null;
                } catch (Exception e) {
                    String str = FrameSequenceDrawable.TAG;
                    String valueOf = String.valueOf(e);
                    Log.e(str, new StringBuilder(String.valueOf(valueOf).length() + 25).append("exception during decode: ").append(valueOf).toString());
                    frame = 0;
                    obj = FrameSequenceDrawable.STATE_SCHEDULED;
                }
                if (frame < FrameSequenceDrawable.MIN_DELAY_MS) {
                    frame = FrameSequenceDrawable.DEFAULT_DELAY_MS;
                }
                synchronized (FrameSequenceDrawable.this.mLock) {
                    if (FrameSequenceDrawable.this.mDestroyed) {
                        access$300 = FrameSequenceDrawable.this.mBackBitmap;
                        FrameSequenceDrawable.this.mBackBitmap = null;
                        obj2 = null;
                    } else if (FrameSequenceDrawable.this.mNextFrameToDecode < 0 || FrameSequenceDrawable.this.mState != FrameSequenceDrawable.STATE_DECODING) {
                        access$300 = null;
                        obj2 = null;
                    } else {
                        FrameSequenceDrawable.this.mNextSwap = obj != null ? Long.MAX_VALUE : frame + FrameSequenceDrawable.this.mLastSwap;
                        FrameSequenceDrawable.this.mState = FrameSequenceDrawable.STATE_WAITING_TO_SWAP;
                        access$300 = null;
                        obj2 = FrameSequenceDrawable.STATE_SCHEDULED;
                    }
                }
                if (obj2 != null) {
                    FrameSequenceDrawable.this.scheduleSelf(FrameSequenceDrawable.this, FrameSequenceDrawable.this.mNextSwap);
                }
                if (access$300 != null) {
                    FrameSequenceDrawable.this.mBitmapProvider.releaseBitmap(access$300);
                }
            }
        }
    }

    class 3 implements Runnable {
        3() {
        }

        public void run() {
            synchronized (FrameSequenceDrawable.this.mLock) {
                FrameSequenceDrawable.this.mNextFrameToDecode = -1;
                FrameSequenceDrawable.this.mState = 0;
            }
            if (FrameSequenceDrawable.this.mOnFinishedListener != null) {
                FrameSequenceDrawable.this.mOnFinishedListener.onFinished(FrameSequenceDrawable.this);
            }
        }
    }

    public interface OnFinishedListener {
        void onFinished(FrameSequenceDrawable frameSequenceDrawable);
    }

    static {
        sLock = new Object();
        sAllocatingBitmapProvider = new 1();
    }

    private static void initializeDecodingThread() {
        synchronized (sLock) {
            if (sDecodingThread != null) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("FrameSequence decoding thread", 10);
            sDecodingThread = handlerThread;
            handlerThread.start();
            sDecodingThreadHandler = new Handler(sDecodingThread.getLooper());
        }
    }

    public void setOnFinishedListener(OnFinishedListener onFinishedListener) {
        this.mOnFinishedListener = onFinishedListener;
    }

    public void setLoopBehavior(int i) {
        this.mLoopBehavior = i;
    }

    public void setLoopCount(int i) {
        this.mLoopCount = i;
    }

    private static Bitmap acquireAndValidateBitmap(BitmapProvider bitmapProvider, int i, int i2) {
        Bitmap acquireBitmap = bitmapProvider.acquireBitmap(i, i2);
        if (acquireBitmap.getWidth() >= i && acquireBitmap.getHeight() >= i2 && acquireBitmap.getConfig() == Config.ARGB_8888) {
            return acquireBitmap;
        }
        throw new IllegalArgumentException("Invalid bitmap provided");
    }

    public FrameSequenceDrawable(FrameSequence frameSequence) {
        this(frameSequence, sAllocatingBitmapProvider);
    }

    public FrameSequenceDrawable(FrameSequence frameSequence, BitmapProvider bitmapProvider) {
        this.mLock = new Object();
        this.mDestroyed = false;
        this.mLoopBehavior = STATE_WAITING_TO_SWAP;
        this.mLoopCount = STATE_SCHEDULED;
        this.mTempRectF = new RectF();
        this.mDecodeRunnable = new 2();
        this.mFinishedCallbackRunnable = new 3();
        if (frameSequence == null || bitmapProvider == null) {
            throw new IllegalArgumentException();
        }
        this.mFrameSequence = frameSequence;
        this.mFrameSequenceState = frameSequence.createState();
        int width = frameSequence.getWidth();
        int height = frameSequence.getHeight();
        this.mBitmapProvider = bitmapProvider;
        this.mFrontBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mBackBitmap = acquireAndValidateBitmap(bitmapProvider, width, height);
        this.mSrcRect = new Rect(0, 0, width, height);
        this.mPaint = new Paint();
        this.mPaint.setFilterBitmap(true);
        this.mFrontBitmapShader = new BitmapShader(this.mFrontBitmap, TileMode.CLAMP, TileMode.CLAMP);
        this.mBackBitmapShader = new BitmapShader(this.mBackBitmap, TileMode.CLAMP, TileMode.CLAMP);
        this.mLastSwap = 0;
        this.mNextFrameToDecode = -1;
        this.mFrameSequenceState.getFrame(0, this.mFrontBitmap, -1);
        initializeDecodingThread();
    }

    public final void setCircleMaskEnabled(boolean z) {
        if (this.mCircleMaskEnabled != z) {
            this.mCircleMaskEnabled = z;
            this.mPaint.setAntiAlias(z);
            invalidateSelf();
        }
    }

    public final boolean getCircleMaskEnabled() {
        return this.mCircleMaskEnabled;
    }

    private void checkDestroyedLocked() {
        if (this.mDestroyed) {
            throw new IllegalStateException("Cannot perform operation on recycled drawable");
        }
    }

    public boolean isDestroyed() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mDestroyed;
        }
        return z;
    }

    public void destroy() {
        Bitmap bitmap = null;
        if (this.mBitmapProvider == null) {
            throw new IllegalStateException("BitmapProvider must be non-null");
        }
        Bitmap bitmap2;
        synchronized (this.mLock) {
            checkDestroyedLocked();
            bitmap2 = this.mFrontBitmap;
            this.mFrontBitmap = null;
            if (this.mState != STATE_DECODING) {
                bitmap = this.mBackBitmap;
                this.mBackBitmap = null;
            }
            this.mDestroyed = true;
        }
        this.mBitmapProvider.releaseBitmap(bitmap2);
        if (bitmap != null) {
            this.mBitmapProvider.releaseBitmap(bitmap);
        }
    }

    protected void finalize() {
        try {
            this.mFrameSequenceState.destroy();
        } finally {
            super.finalize();
        }
    }

    public void draw(Canvas canvas) {
        Object obj = STATE_SCHEDULED;
        synchronized (this.mLock) {
            checkDestroyedLocked();
            if (this.mState == STATE_WAITING_TO_SWAP && this.mNextSwap - SystemClock.uptimeMillis() <= 0) {
                this.mState = STATE_READY_TO_SWAP;
            }
            if (isRunning() && this.mState == STATE_READY_TO_SWAP) {
                Bitmap bitmap = this.mBackBitmap;
                this.mBackBitmap = this.mFrontBitmap;
                this.mFrontBitmap = bitmap;
                BitmapShader bitmapShader = this.mBackBitmapShader;
                this.mBackBitmapShader = this.mFrontBitmapShader;
                this.mFrontBitmapShader = bitmapShader;
                this.mLastSwap = SystemClock.uptimeMillis();
                if (this.mNextFrameToDecode == this.mFrameSequence.getFrameCount() - 1) {
                    this.mCurrentLoop += STATE_SCHEDULED;
                    if ((this.mLoopBehavior == STATE_SCHEDULED && this.mCurrentLoop >= this.mLoopCount) || (this.mLoopBehavior == STATE_WAITING_TO_SWAP && this.mCurrentLoop >= this.mFrameSequence.getDefaultLoopCount())) {
                        obj = null;
                    }
                }
                if (obj != null) {
                    scheduleDecodeLocked();
                } else {
                    scheduleSelf(this.mFinishedCallbackRunnable, 0);
                }
            }
        }
        if (this.mCircleMaskEnabled) {
            Rect bounds = getBounds();
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            float width = (((float) bounds.width()) * 1.0f) / ((float) intrinsicWidth);
            float height = (((float) bounds.height()) * 1.0f) / ((float) intrinsicHeight);
            canvas.save();
            canvas.translate((float) bounds.left, (float) bounds.top);
            canvas.scale(width, height);
            float min = (float) Math.min(bounds.width(), bounds.height());
            width = min / width;
            min /= height;
            this.mTempRectF.set((((float) intrinsicWidth) - width) / 2.0f, (((float) intrinsicHeight) - min) / 2.0f, (((float) intrinsicWidth) + width) / 2.0f, (min + ((float) intrinsicHeight)) / 2.0f);
            this.mPaint.setShader(this.mFrontBitmapShader);
            canvas.drawOval(this.mTempRectF, this.mPaint);
            canvas.restore();
            return;
        }
        this.mPaint.setShader(null);
        canvas.drawBitmap(this.mFrontBitmap, this.mSrcRect, getBounds(), this.mPaint);
    }

    private void scheduleDecodeLocked() {
        this.mState = STATE_SCHEDULED;
        this.mNextFrameToDecode = (this.mNextFrameToDecode + STATE_SCHEDULED) % this.mFrameSequence.getFrameCount();
        sDecodingThreadHandler.post(this.mDecodeRunnable);
    }

    public void run() {
        Object obj = null;
        synchronized (this.mLock) {
            if (this.mNextFrameToDecode >= 0 && this.mState == STATE_WAITING_TO_SWAP) {
                this.mState = STATE_READY_TO_SWAP;
                obj = STATE_SCHEDULED;
            }
        }
        if (obj != null) {
            invalidateSelf();
        }
    }

    public void start() {
        if (!isRunning()) {
            synchronized (this.mLock) {
                checkDestroyedLocked();
                if (this.mState == STATE_SCHEDULED) {
                    return;
                }
                this.mCurrentLoop = 0;
                scheduleDecodeLocked();
            }
        }
    }

    public void stop() {
        if (isRunning()) {
            unscheduleSelf(this);
        }
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mNextFrameToDecode >= 0 && !this.mDestroyed;
        }
        return z;
    }

    public void unscheduleSelf(Runnable runnable) {
        synchronized (this.mLock) {
            this.mNextFrameToDecode = -1;
            this.mState = 0;
        }
        super.unscheduleSelf(runnable);
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!z) {
            stop();
        } else if (z2 || visible) {
            stop();
            start();
        }
        return visible;
    }

    public void setFilterBitmap(boolean z) {
        this.mPaint.setFilterBitmap(z);
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    public int getIntrinsicWidth() {
        return this.mFrameSequence.getWidth();
    }

    public int getIntrinsicHeight() {
        return this.mFrameSequence.getHeight();
    }

    public int getOpacity() {
        return this.mFrameSequence.isOpaque() ? -1 : -2;
    }
}
