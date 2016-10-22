package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.provider.MediaStore.Files;
import java.util.concurrent.TimeUnit;
import wt;

/* renamed from: ckg */
class ckg extends AsyncTask<Void, Void, Void> {
    private static final String[] a;
    final wt<cjs> b;
    private final Uri c;
    private final Context d;
    private final boolean e;
    private final long f;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    static {
        a = new String[]{"_id", "mime_type", "title", "date_added", "_data", "_size"};
    }

    public ckg(Context context, wt<cjs> wtVar, int i, boolean z) {
        this.c = Files.getContentUri("external");
        this.d = context;
        this.b = wtVar;
        this.e = z;
        this.f = TimeUnit.SECONDS.toMillis(fdq.H.c(i));
    }

    protected Void a() {
        chz b = ((cia) jyn.a(this.d, cjq.class)).b();
        if (b != null) {
            boolean z;
            if (b.a.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            iil.a("Expected condition to be true", z);
            if (!((ehz) jyn.a(this.d, ehz.class)).a(b.a)) {
                return null;
            }
        }
        Cursor query = this.d.getContentResolver().query(this.c, a, this.e ? "(media_type=1) OR (media_type=3)" : "(media_type=1)", null, "date_added DESC");
        if (query == null) {
            glk.d("Babel_GalleryPicker", String.format("Could not query MediaStore for content Uri: %s and allowVideo: %s.", new Object[]{this.c, Boolean.valueOf(this.e)}), new Object[0]);
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
            Uri withAppendedPath = Uri.withAppendedPath(this.c, Long.toString(j));
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
                            mediaMetadataRetriever.setDataSource(this.d, withAppendedPath);
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
                            glk.c("Babel_GalleryPicker", "Exception getting video metadata", e);
                        } catch (Throwable th) {
                            query.close();
                        }
                    } else {
                        String str = "Babel_GalleryPicker";
                        String str2 = "Unrecognized mime type: ";
                        String valueOf = String.valueOf(string);
                        glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                    }
                }
                if (j4 < this.f) {
                    gwb.a(new ckh(this, new cjt(string2, cju).b(j).a(j3).a(withAppendedPath).a(string).c(j2).d(j4).a(i).b(i2).c(i4).a()));
                }
            }
        }
        query.close();
        return null;
    }
}
