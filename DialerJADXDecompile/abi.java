import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.ContactsContract.Contacts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
final class abi extends HandlerThread implements Callback {
    Handler a;
    private final ContentResolver b;
    private final StringBuilder c;
    private final Set d;
    private final Set e;
    private final Set f;
    private final List g;
    private byte[] h;
    private int i;
    private /* synthetic */ abe j;

    public abi(abe abe, ContentResolver contentResolver) {
        this.j = abe;
        super("ContactPhotoLoader");
        this.c = new StringBuilder();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new ArrayList();
        this.i = 0;
        this.b = contentResolver;
    }

    public final void a() {
        if (this.a == null) {
            this.a = new Handler(getLooper(), this);
        }
    }

    public final void b() {
        if (this.i != 2) {
            a();
            if (!this.a.hasMessages(1)) {
                this.a.sendEmptyMessageDelayed(0, 1000);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case rl.c /*0*/:
                if (this.i != 2) {
                    if (this.i != 0) {
                        if (this.j.e.size() <= this.j.f) {
                            this.d.clear();
                            this.e.clear();
                            int size = this.g.size();
                            int i = 0;
                            while (size > 0 && this.d.size() < 25) {
                                int i2 = size - 1;
                                i++;
                                Long l = (Long) this.g.get(i2);
                                this.d.add(l);
                                this.e.add(l.toString());
                                this.g.remove(i2);
                                size = i2;
                            }
                            a(true);
                            if (size == 0) {
                                this.i = 2;
                            }
                            new StringBuilder(56).append("Preloaded ").append(i).append(" photos.  Cached bytes: ").append(this.j.e.size());
                            b();
                            break;
                        }
                        this.i = 2;
                        break;
                    }
                    c();
                    if (this.g.isEmpty()) {
                        this.i = 2;
                    } else {
                        this.i = 1;
                    }
                    b();
                    break;
                }
                break;
            case rq.b /*1*/:
                if (buf.c(this.j.d, "android.permission.READ_CONTACTS")) {
                    this.j.a(this.d, this.e, this.f);
                    a(false);
                    d();
                    b();
                    break;
                }
                break;
        }
        return true;
    }

    private final void c() {
        Cursor query;
        Throwable th;
        try {
            Uri build = Contacts.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").appendQueryParameter("limit", "100").build();
            query = this.b.query(build, new String[]{"photo_id"}, "photo_id NOT NULL AND photo_id!=0", null, "starred DESC, last_time_contacted DESC");
            if (query != null) {
                while (query.moveToNext()) {
                    try {
                        this.g.add(0, Long.valueOf(query.getLong(0)));
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(boolean r12) {
        /*
        r11 = this;
        r10 = 2;
        r2 = 1;
        r1 = 0;
        r9 = -1;
        r7 = 0;
        r0 = r11.d;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x000e;
    L_0x000d:
        return;
    L_0x000e:
        if (r12 != 0) goto L_0x0036;
    L_0x0010:
        r0 = r11.i;
        if (r0 != r2) goto L_0x0036;
    L_0x0014:
        r0 = r11.d;
        r2 = r0.iterator();
    L_0x001a:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x002c;
    L_0x0020:
        r0 = r2.next();
        r0 = (java.lang.Long) r0;
        r3 = r11.g;
        r3.remove(r0);
        goto L_0x001a;
    L_0x002c:
        r0 = r11.g;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0036;
    L_0x0034:
        r11.i = r10;
    L_0x0036:
        r0 = r11.c;
        r0.setLength(r1);
        r0 = r11.c;
        r2 = "_id IN(";
        r0.append(r2);
        r0 = r1;
    L_0x0043:
        r1 = r11.d;
        r1 = r1.size();
        if (r0 >= r1) goto L_0x005e;
    L_0x004b:
        if (r0 == 0) goto L_0x0054;
    L_0x004d:
        r1 = r11.c;
        r2 = 44;
        r1.append(r2);
    L_0x0054:
        r1 = r11.c;
        r2 = 63;
        r1.append(r2);
        r0 = r0 + 1;
        goto L_0x0043;
    L_0x005e:
        r0 = r11.c;
        r1 = 41;
        r0.append(r1);
        r0 = r11.b;	 Catch:{ all -> 0x0123 }
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;	 Catch:{ all -> 0x0123 }
        r2 = abe.c;	 Catch:{ all -> 0x0123 }
        r3 = r11.c;	 Catch:{ all -> 0x0123 }
        r3 = r3.toString();	 Catch:{ all -> 0x0123 }
        r4 = r11.e;	 Catch:{ all -> 0x0123 }
        r5 = abe.b;	 Catch:{ all -> 0x0123 }
        r4 = r4.toArray(r5);	 Catch:{ all -> 0x0123 }
        r4 = (java.lang.String[]) r4;	 Catch:{ all -> 0x0123 }
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0123 }
        if (r1 == 0) goto L_0x00a9;
    L_0x0082:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x00a2 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0088:
        r0 = 0;
        r2 = r1.getLong(r0);	 Catch:{ all -> 0x00a2 }
        r0 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x00a2 }
        r2 = 1;
        r2 = r1.getBlob(r2);	 Catch:{ all -> 0x00a2 }
        r3 = r11.j;	 Catch:{ all -> 0x00a2 }
        r4 = -1;
        r3.a(r0, r2, r12, r4);	 Catch:{ all -> 0x00a2 }
        r2 = r11.d;	 Catch:{ all -> 0x00a2 }
        r2.remove(r0);	 Catch:{ all -> 0x00a2 }
        goto L_0x0082;
    L_0x00a2:
        r0 = move-exception;
    L_0x00a3:
        if (r1 == 0) goto L_0x00a8;
    L_0x00a5:
        r1.close();
    L_0x00a8:
        throw r0;
    L_0x00a9:
        if (r1 == 0) goto L_0x00ae;
    L_0x00ab:
        r1.close();
    L_0x00ae:
        r0 = r11.d;
        r8 = r0.iterator();
    L_0x00b4:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x0118;
    L_0x00ba:
        r0 = r8.next();
        r6 = r0;
        r6 = (java.lang.Long) r6;
        r0 = r6.longValue();
        r0 = android.provider.ContactsContract.isProfileId(r0);
        if (r0 == 0) goto L_0x0112;
    L_0x00cb:
        r0 = r11.b;	 Catch:{ all -> 0x0121 }
        r1 = android.provider.ContactsContract.Data.CONTENT_URI;	 Catch:{ all -> 0x0121 }
        r2 = r6.longValue();	 Catch:{ all -> 0x0121 }
        r1 = android.content.ContentUris.withAppendedId(r1, r2);	 Catch:{ all -> 0x0121 }
        r2 = abe.c;	 Catch:{ all -> 0x0121 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0121 }
        if (r1 == 0) goto L_0x0102;
    L_0x00e2:
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x010a }
        if (r0 == 0) goto L_0x0102;
    L_0x00e8:
        r0 = r11.j;	 Catch:{ all -> 0x010a }
        r2 = 0;
        r2 = r1.getLong(r2);	 Catch:{ all -> 0x010a }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ all -> 0x010a }
        r3 = 1;
        r3 = r1.getBlob(r3);	 Catch:{ all -> 0x010a }
        r4 = -1;
        r0.a(r2, r3, r12, r4);	 Catch:{ all -> 0x010a }
    L_0x00fc:
        if (r1 == 0) goto L_0x00b4;
    L_0x00fe:
        r1.close();
        goto L_0x00b4;
    L_0x0102:
        r0 = r11.j;	 Catch:{ all -> 0x010a }
        r2 = 0;
        r3 = -1;
        r0.a(r6, r2, r12, r3);	 Catch:{ all -> 0x010a }
        goto L_0x00fc;
    L_0x010a:
        r0 = move-exception;
        r7 = r1;
    L_0x010c:
        if (r7 == 0) goto L_0x0111;
    L_0x010e:
        r7.close();
    L_0x0111:
        throw r0;
    L_0x0112:
        r0 = r11.j;
        r0.a(r6, r7, r12, r9);
        goto L_0x00b4;
    L_0x0118:
        r0 = r11.j;
        r0 = r0.g;
        r0.sendEmptyMessage(r10);
        goto L_0x000d;
    L_0x0121:
        r0 = move-exception;
        goto L_0x010c;
    L_0x0123:
        r0 = move-exception;
        r1 = r7;
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: abi.a(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void d() {
        /*
        r11 = this;
        r3 = 0;
        r10 = 0;
        r0 = r11.f;
        r4 = r0.iterator();
    L_0x0008:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x00f8;
    L_0x000e:
        r0 = r4.next();
        r0 = (abj) r0;
        r5 = r0.b;
        r6 = aaz.a(r5);
        r1 = r11.h;
        if (r1 != 0) goto L_0x0024;
    L_0x001e:
        r1 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r1 = new byte[r1];
        r11.h = r1;
    L_0x0024:
        r1 = r6.getScheme();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = "http";
        r2 = r1.equals(r2);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        if (r2 != 0) goto L_0x0038;
    L_0x0030:
        r2 = "https";
        r1 = r1.equals(r2);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        if (r1 == 0) goto L_0x00ae;
    L_0x0038:
        r1 = 1;
        android.net.TrafficStats.setThreadStatsTag(r1);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = new java.net.URL;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = r6.toString();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = r1.openConnection();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = (java.net.HttpURLConnection) r1;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = r11.j;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = r2.h;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        if (r2 != 0) goto L_0x005e;
    L_0x0055:
        r2 = "User-Agent";
        r7 = r11.j;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r7 = r7.h;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1.setRequestProperty(r2, r7);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
    L_0x005e:
        r1 = r1.getInputStream();	 Catch:{ IOException -> 0x00a8 }
    L_0x0062:
        android.net.TrafficStats.clearThreadStatsTag();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = r1;
    L_0x0066:
        if (r2 == 0) goto L_0x00d1;
    L_0x0068:
        r1 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1.<init>();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
    L_0x006d:
        r7 = r11.h;	 Catch:{ all -> 0x007d }
        r7 = r2.read(r7);	 Catch:{ all -> 0x007d }
        r8 = -1;
        if (r7 == r8) goto L_0x00b6;
    L_0x0076:
        r8 = r11.h;	 Catch:{ all -> 0x007d }
        r9 = 0;
        r1.write(r8, r9, r7);	 Catch:{ all -> 0x007d }
        goto L_0x006d;
    L_0x007d:
        r1 = move-exception;
        r2.close();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        throw r1;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
    L_0x0082:
        r1 = move-exception;
    L_0x0083:
        r1 = java.lang.String.valueOf(r6);
        r2 = new java.lang.StringBuilder;
        r6 = java.lang.String.valueOf(r1);
        r6 = r6.length();
        r6 = r6 + 18;
        r2.<init>(r6);
        r6 = "Cannot load photo ";
        r2 = r2.append(r6);
        r2.append(r1);
        r1 = r11.j;
        r0 = r0.c;
        r1.a(r5, r3, r10, r0);
        goto L_0x0008;
    L_0x00a8:
        r2 = move-exception;
        r1.disconnect();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = r3;
        goto L_0x0062;
    L_0x00ae:
        r1 = r11.b;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = r1.openInputStream(r6);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = r1;
        goto L_0x0066;
    L_0x00b6:
        r2.close();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = r11.j;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = r1.toByteArray();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r7 = 0;
        r8 = r0.c;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2.a(r5, r1, r7, r8);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = r11.j;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = r1.g;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = 2;
        r1.sendEmptyMessage(r2);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        goto L_0x0008;
    L_0x00cf:
        r1 = move-exception;
        goto L_0x0083;
    L_0x00d1:
        r1 = java.lang.String.valueOf(r6);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r7 = java.lang.String.valueOf(r1);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r7 = r7.length();	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r7 = r7 + 18;
        r2.<init>(r7);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r7 = "Cannot load photo ";
        r2 = r2.append(r7);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2.append(r1);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1 = r11.j;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r2 = 0;
        r7 = 0;
        r8 = r0.c;	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        r1.a(r5, r2, r7, r8);	 Catch:{ Exception -> 0x0082, OutOfMemoryError -> 0x00cf }
        goto L_0x0008;
    L_0x00f8:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: abi.d():void");
    }
}
