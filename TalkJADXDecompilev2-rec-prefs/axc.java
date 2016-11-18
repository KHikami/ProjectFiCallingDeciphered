package p000;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

public final class axc implements aoa<ParcelFileDescriptor, Bitmap> {
    public static final anw<Long> f2469a = anw.m3522a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new axd());
    public static final anw<Integer> f2470b = anw.m3522a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", null, new axe());
    private static final axf f2471c = new axf();
    private final ard f2472d;
    private final axf f2473e;

    public /* bridge */ /* synthetic */ aqr mo394a(Object obj, int i, int i2, anz anz) {
        return m4250a((ParcelFileDescriptor) obj, anz);
    }

    public axc(ard ard) {
        this(ard, f2471c);
    }

    private axc(ard ard, axf axf) {
        this.f2472d = ard;
        this.f2473e = axf;
    }

    private aqr<Bitmap> m4250a(int i, anz anz) {
        long longValue = ((Long) anz.m3528a(f2469a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) anz.m3528a(f2470b);
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
                return avz.m4152a(frameAtTime, this.f2472d);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    private boolean m4251a(ParcelFileDescriptor parcelFileDescriptor) {
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
