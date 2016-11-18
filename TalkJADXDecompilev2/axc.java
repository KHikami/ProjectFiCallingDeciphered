package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

public final class axc implements aoa<ParcelFileDescriptor, Bitmap> {
    public static final anw<Long> a = anw.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new axd());
    public static final anw<Integer> b = anw.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", null, new axe());
    private static final axf c = new axf();
    private final ard d;
    private final axf e;

    public /* bridge */ /* synthetic */ aqr a(Object obj, int i, int i2, anz anz) {
        return a((ParcelFileDescriptor) obj, anz);
    }

    public axc(ard ard) {
        this(ard, c);
    }

    private axc(ard ard, axf axf) {
        this.d = ard;
        this.e = axf;
    }

    private aqr<Bitmap> a(int i, anz anz) {
        long longValue = ((Long) anz.a(a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) anz.a(b);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                Bitmap frameAtTime;
                mediaMetadataRetriever.setDataSource(i.getFileDescriptor());
                if (longValue == -1) {
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                } else if (num == null) {
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(longValue);
                } else {
                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(longValue, num.intValue());
                }
                mediaMetadataRetriever.release();
                i.close();
                return avz.a(frameAtTime, this.d);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    private boolean a(ParcelFileDescriptor parcelFileDescriptor) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
            return true;
        } catch (RuntimeException e) {
            return false;
        } finally {
            mediaMetadataRetriever.release();
        }
    }
}
