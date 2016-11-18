package p000;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.provider.MediaStore.Files;
import java.util.concurrent.TimeUnit;

class ckg extends AsyncTask<Void, Void, Void> {
    private static final String[] f5485a = new String[]{"_id", "mime_type", "title", "date_added", "_data", "_size"};
    final wt<cjs> f5486b;
    private final Uri f5487c = Files.getContentUri("external");
    private final Context f5488d;
    private final boolean f5489e;
    private final long f5490f;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7837a();
    }

    public ckg(Context context, wt<cjs> wtVar, int i, boolean z) {
        this.f5488d = context;
        this.f5486b = wtVar;
        this.f5489e = z;
        this.f5490f = TimeUnit.SECONDS.toMillis(fdq.f12766H.m14371c(i));
    }

    protected Void m7837a() {
        chz b = ((cia) jyn.m25426a(this.f5488d, cjq.class)).mo986b();
        if (b != null) {
            boolean z;
            if (b.f5354a.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            iil.m21874a("Expected condition to be true", z);
            if (!((ehz) jyn.m25426a(this.f5488d, ehz.class)).mo1883a(b.f5354a)) {
                return null;
            }
        }
        Cursor query = this.f5488d.getContentResolver().query(this.f5487c, f5485a, this.f5489e ? "(media_type=1) OR (media_type=3)" : "(media_type=1)", null, "date_added DESC");
        if (query == null) {
            glk.m17981d("Babel_GalleryPicker", String.format("Could not query MediaStore for content Uri: %s and allowVideo: %s.", new Object[]{this.f5487c, Boolean.valueOf(this.f5489e)}), new Object[0]);
            return null;
        }
        int columnIndexOrThrow = query.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = query.getColumnIndexOrThrow("_data");
        int columnIndexOrThrow3 = query.getColumnIndexOrThrow("date_added");
        int columnIndex = query.getColumnIndex("mime_type");
        int columnIndex2 = query.getColumnIndex("_size");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        while (query.moveToNext() && !isCancelled()) {
            long j = query.getLong(columnIndexOrThrow);
            Uri withAppendedPath = Uri.withAppendedPath(this.f5487c, Long.toString(j));
            long j2 = query.getLong(columnIndexOrThrow3);
            String string = query.getString(columnIndex);
            String string2 = query.getString(columnIndexOrThrow2);
            long j3 = query.getLong(columnIndex2);
            long j4 = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            if (string != null) {
                int i4;
                cju cju;
                if (string.startsWith("image/")) {
                    i4 = 0;
                    cju = cju.IMAGE;
                } else {
                    if (string.startsWith("video/")) {
                        cju cju2 = cju.VIDEO;
                        try {
                            mediaMetadataRetriever.setDataSource(this.f5488d, withAppendedPath);
                            j4 = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                            i2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                            if (VERSION.SDK_INT >= 17) {
                                i3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                            }
                            cju cju3 = cju2;
                            i4 = i3;
                            cju = cju3;
                        } catch (Throwable e) {
                            glk.m17978c("Babel_GalleryPicker", "Exception getting video metadata", e);
                        } catch (Throwable th) {
                            query.close();
                        }
                    } else {
                        String str = "Babel_GalleryPicker";
                        String str2 = "Unrecognized mime type: ";
                        String valueOf = String.valueOf(string);
                        glk.m17981d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    }
                }
                if (j4 < this.f5490f) {
                    gwb.m1863a(new ckh(this, new cjt(string2, cju).m7822b(j).m7818a(j3).m7819a(withAppendedPath).m7820a(string).m7824c(j2).m7825d(j4).m7817a(i).m7821b(i2).m7823c(i4).m7816a()));
                }
            }
        }
        query.close();
        return null;
    }
}
