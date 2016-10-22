import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import com.android.contacts.common.vcard.VCardService;

/* compiled from: PG */
public final class ajd extends ajq {
    final VCardService a;
    public final ajf b;
    private final ContentResolver c;
    private final NotificationManager d;
    private final int e;
    private final String f;
    private final Handler g;
    private volatile boolean h;
    private volatile boolean i;

    public ajd(VCardService vCardService, ajf ajf, int i, String str) {
        this.g = new aje(this);
        this.a = vCardService;
        this.c = vCardService.getContentResolver();
        this.d = (NotificationManager) this.a.getSystemService("notification");
        this.b = ajf;
        this.e = i;
        this.f = str;
    }

    public final int a() {
        return 2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r14 = this;
        r1 = 0;
        r10 = 0;
        r11 = 1;
        r12 = r14.b;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r14.isCancelled();	 Catch:{ all -> 0x0457 }
        if (r0 == 0) goto L_0x0043;
    L_0x000b:
        r0 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0.b(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
    L_0x0012:
        r0 = r14.isCancelled();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        if (r0 == 0) goto L_0x003d;
    L_0x0018:
        r0 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = buf.eW;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = 0;
        r4 = r14.b;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r4 = r4.b;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r4 = r4.getLastPathSegment();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2[r3] = r4;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r0.getString(r1, r2);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = ajp.a(r1, r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.d;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2 = "VCardServiceProgress";
        r3 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1.notify(r2, r3, r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
    L_0x003d:
        monitor-enter(r14);
        r0 = 1;
        r14.i = r0;	 Catch:{ all -> 0x0451 }
        monitor-exit(r14);	 Catch:{ all -> 0x0451 }
        return;
    L_0x0043:
        r13 = r12.b;	 Catch:{ all -> 0x0457 }
        r0 = r14.c;	 Catch:{ FileNotFoundException -> 0x00dc }
        r2 = r0.openOutputStream(r13);	 Catch:{ FileNotFoundException -> 0x00dc }
        r0 = r12.c;	 Catch:{ all -> 0x0457 }
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0457 }
        if (r3 == 0) goto L_0x010f;
    L_0x0053:
        r0 = r14.a;	 Catch:{ all -> 0x0457 }
        r3 = buf.et;	 Catch:{ all -> 0x0457 }
        r0 = r0.getString(r3);	 Catch:{ all -> 0x0457 }
        r0 = bfr.a(r0);	 Catch:{ all -> 0x0457 }
    L_0x005f:
        r9 = new bfp;	 Catch:{ all -> 0x0457 }
        r3 = r14.a;	 Catch:{ all -> 0x0457 }
        r4 = 1;
        r9.<init>(r3, r0, r4);	 Catch:{ all -> 0x0457 }
        r8 = new java.io.BufferedWriter;	 Catch:{ all -> 0x045b }
        r0 = new java.io.OutputStreamWriter;	 Catch:{ all -> 0x045b }
        r0.<init>(r2);	 Catch:{ all -> 0x045b }
        r8.<init>(r0);	 Catch:{ all -> 0x045b }
        r0 = android.provider.ContactsContract.RawContactsEntity.CONTENT_URI;	 Catch:{ all -> 0x01a2 }
        r1 = android.provider.ContactsContract.Contacts.CONTENT_URI;	 Catch:{ all -> 0x01a2 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ all -> 0x01a2 }
        r3 = 0;
        r4 = "_id";
        r2[r3] = r4;	 Catch:{ all -> 0x01a2 }
        r3 = "com.android.contacts";
        r4 = r1.getAuthority();	 Catch:{ all -> 0x01a2 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x01a2 }
        if (r3 != 0) goto L_0x0115;
    L_0x0089:
        r0 = "The Uri vCard composer received is not supported by the composer.";
        r9.i = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r10;
    L_0x008e:
        if (r0 != 0) goto L_0x01e0;
    L_0x0090:
        r1 = r9.i;	 Catch:{ all -> 0x01a2 }
        r2 = "VCardExport";
        r3 = "initialization of vCard composer failed: ";
        r0 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x01a2 }
        r4 = r0.length();	 Catch:{ all -> 0x01a2 }
        if (r4 == 0) goto L_0x019b;
    L_0x00a0:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x01a2 }
    L_0x00a4:
        android.util.Log.e(r2, r0);	 Catch:{ all -> 0x01a2 }
        r0 = r14.a(r1);	 Catch:{ all -> 0x01a2 }
        r1 = r14.a;	 Catch:{ all -> 0x01a2 }
        r2 = buf.fb;	 Catch:{ all -> 0x01a2 }
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x01a2 }
        r4 = 0;
        r3[r4] = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r1.getString(r2, r3);	 Catch:{ all -> 0x01a2 }
        r1 = 0;
        r14.a(r0, r1);	 Catch:{ all -> 0x01a2 }
        r9.a();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r8.close();	 Catch:{ IOException -> 0x01b7 }
    L_0x00c3:
        r0 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0.b(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x0012;
    L_0x00cc:
        r0 = move-exception;
        r1 = "VCardExport";
        r2 = "OutOfMemoryError thrown during import";
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x00d5 }
        throw r0;	 Catch:{ all -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        monitor-enter(r14);
        r1 = 1;
        r14.i = r1;	 Catch:{ all -> 0x0454 }
        monitor-exit(r14);	 Catch:{ all -> 0x0454 }
        throw r0;
    L_0x00dc:
        r0 = move-exception;
        r2 = "VCardExport";
        r3 = "FileNotFoundException thrown";
        android.util.Log.w(r2, r3, r0);	 Catch:{ all -> 0x0457 }
        r2 = r14.a;	 Catch:{ all -> 0x0457 }
        r3 = buf.fc;	 Catch:{ all -> 0x0457 }
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0457 }
        r5 = 0;
        r4[r5] = r13;	 Catch:{ all -> 0x0457 }
        r5 = 1;
        r0 = r0.getMessage();	 Catch:{ all -> 0x0457 }
        r4[r5] = r0;	 Catch:{ all -> 0x0457 }
        r0 = r2.getString(r3, r4);	 Catch:{ all -> 0x0457 }
        r2 = 0;
        r14.a(r0, r2);	 Catch:{ all -> 0x0457 }
        r0 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0.b(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x0012;
    L_0x0106:
        r0 = move-exception;
        r1 = "VCardExport";
        r2 = "RuntimeException thrown during export";
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x00d5 }
        throw r0;	 Catch:{ all -> 0x00d5 }
    L_0x010f:
        r0 = bfr.a(r0);	 Catch:{ all -> 0x0457 }
        goto L_0x005f;
    L_0x0115:
        if (r0 == 0) goto L_0x012a;
    L_0x0117:
        r9.g = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r9.h;	 Catch:{ all -> 0x01a2 }
        if (r0 == 0) goto L_0x012d;
    L_0x011d:
        r0 = "VCardComposer";
        r3 = "init() is already called";
        android.util.Log.e(r0, r3);	 Catch:{ all -> 0x01a2 }
        r0 = r10;
    L_0x0125:
        if (r0 != 0) goto L_0x012f;
    L_0x0127:
        r0 = r10;
        goto L_0x008e;
    L_0x012a:
        r0 = android.provider.ContactsContract.RawContactsEntity.CONTENT_URI;	 Catch:{ all -> 0x01a2 }
        goto L_0x0117;
    L_0x012d:
        r0 = r11;
        goto L_0x0125;
    L_0x012f:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0 = 0;
        r9.e = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r9.a;	 Catch:{ all -> 0x01a2 }
        r0 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x01a2 }
        r9.d = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        if (r0 != 0) goto L_0x0159;
    L_0x0141:
        r0 = "VCardComposer";
        r1 = "Cursor became null unexpectedly";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x01a2 }
        r1 = java.lang.String.format(r1, r2);	 Catch:{ all -> 0x01a2 }
        android.util.Log.e(r0, r1);	 Catch:{ all -> 0x01a2 }
        r0 = "Failed to get database information";
        r9.i = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r10;
    L_0x0154:
        if (r0 != 0) goto L_0x015b;
    L_0x0156:
        r0 = r10;
        goto L_0x008e;
    L_0x0159:
        r0 = r11;
        goto L_0x0154;
    L_0x015b:
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        r0 = r0.getCount();	 Catch:{ all -> 0x01a2 }
        if (r0 == 0) goto L_0x016b;
    L_0x0163:
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        r0 = r0.moveToFirst();	 Catch:{ all -> 0x01a2 }
        if (r0 != 0) goto L_0x0174;
    L_0x016b:
        r9.b();	 Catch:{ all -> 0x01a2 }
    L_0x016e:
        r0 = r10;
    L_0x016f:
        if (r0 != 0) goto L_0x0192;
    L_0x0171:
        r0 = r10;
        goto L_0x008e;
    L_0x0174:
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        r1 = "contact_id";
        r0 = r0.getColumnIndex(r1);	 Catch:{ all -> 0x01a2 }
        r9.f = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r9.f;	 Catch:{ all -> 0x01a2 }
        if (r0 >= 0) goto L_0x018c;
    L_0x0182:
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        r1 = "_id";
        r0 = r0.getColumnIndex(r1);	 Catch:{ all -> 0x01a2 }
        r9.f = r0;	 Catch:{ all -> 0x01a2 }
    L_0x018c:
        r0 = r9.f;	 Catch:{ all -> 0x01a2 }
        if (r0 < 0) goto L_0x016e;
    L_0x0190:
        r0 = r11;
        goto L_0x016f;
    L_0x0192:
        r0 = 1;
        r9.h = r0;	 Catch:{ all -> 0x01a2 }
        r0 = 0;
        r9.j = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r11;
        goto L_0x008e;
    L_0x019b:
        r0 = new java.lang.String;	 Catch:{ all -> 0x01a2 }
        r0.<init>(r3);	 Catch:{ all -> 0x01a2 }
        goto L_0x00a4;
    L_0x01a2:
        r0 = move-exception;
        r1 = r8;
        r2 = r9;
    L_0x01a5:
        if (r2 == 0) goto L_0x01aa;
    L_0x01a7:
        r2.a();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
    L_0x01aa:
        if (r1 == 0) goto L_0x01af;
    L_0x01ac:
        r1.close();	 Catch:{ IOException -> 0x0428 }
    L_0x01af:
        r1 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1.b(r2);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
    L_0x01b7:
        r0 = move-exception;
        r1 = "VCardExport";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3.length();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3 + 47;
        r2.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = "IOException is thrown during close(). Ignored. ";
        r2 = r2.append(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r2.append(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        android.util.Log.w(r1, r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x00c3;
    L_0x01e0:
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        if (r0 != 0) goto L_0x0209;
    L_0x01e4:
        r0 = "VCardComposer";
        r1 = "This object is not ready yet.";
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x01a2 }
        r6 = r10;
    L_0x01ec:
        if (r6 != 0) goto L_0x0238;
    L_0x01ee:
        r0 = r14.a;	 Catch:{ all -> 0x01a2 }
        r1 = buf.fg;	 Catch:{ all -> 0x01a2 }
        r0 = r0.getString(r1);	 Catch:{ all -> 0x01a2 }
        r1 = 0;
        r14.a(r0, r1);	 Catch:{ all -> 0x01a2 }
        r9.a();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r8.close();	 Catch:{ IOException -> 0x0210 }
    L_0x0200:
        r0 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0.b(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x0012;
    L_0x0209:
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        r6 = r0.getCount();	 Catch:{ all -> 0x01a2 }
        goto L_0x01ec;
    L_0x0210:
        r0 = move-exception;
        r1 = "VCardExport";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3.length();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3 + 47;
        r2.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = "IOException is thrown during close(). Ignored. ";
        r2 = r2.append(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r2.append(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        android.util.Log.w(r1, r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x0200;
    L_0x0238:
        r7 = r11;
    L_0x0239:
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        if (r0 != 0) goto L_0x025c;
    L_0x023d:
        r0 = "VCardComposer";
        r1 = "This object is not ready yet.";
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x01a2 }
        r0 = r10;
    L_0x0245:
        if (r0 != 0) goto L_0x0354;
    L_0x0247:
        r0 = r14.isCancelled();	 Catch:{ all -> 0x01a2 }
        if (r0 == 0) goto L_0x028b;
    L_0x024d:
        r9.a();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r8.close();	 Catch:{ IOException -> 0x0263 }
    L_0x0253:
        r0 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0.b(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x0012;
    L_0x025c:
        r0 = r9.d;	 Catch:{ all -> 0x01a2 }
        r0 = r0.isAfterLast();	 Catch:{ all -> 0x01a2 }
        goto L_0x0245;
    L_0x0263:
        r0 = move-exception;
        r1 = "VCardExport";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3.length();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3 + 47;
        r2.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = "IOException is thrown during close(). Ignored. ";
        r2 = r2.append(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r2.append(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        android.util.Log.w(r1, r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x0253;
    L_0x028b:
        r0 = r9.b;	 Catch:{ IOException -> 0x02e9 }
        if (r0 == 0) goto L_0x0296;
    L_0x028f:
        r0 = r9.c;	 Catch:{ IOException -> 0x02e9 }
        if (r0 != 0) goto L_0x0296;
    L_0x0293:
        r0 = 1;
        r9.c = r0;	 Catch:{ IOException -> 0x02e9 }
    L_0x0296:
        r0 = r9.d;	 Catch:{ IOException -> 0x02e9 }
        r1 = r9.f;	 Catch:{ IOException -> 0x02e9 }
        r0 = r0.getLong(r1);	 Catch:{ IOException -> 0x02e9 }
        r2 = 0;
        r0 = r9.a(r0, r2);	 Catch:{ IOException -> 0x02e9 }
        r1 = r9.d;	 Catch:{ IOException -> 0x02e9 }
        r1 = r1.moveToNext();	 Catch:{ IOException -> 0x02e9 }
        if (r1 != 0) goto L_0x02b2;
    L_0x02ab:
        r1 = "VCardComposer";
        r2 = "Cursor#moveToNext() returned false";
        android.util.Log.e(r1, r2);	 Catch:{ IOException -> 0x02e9 }
    L_0x02b2:
        r8.write(r0);	 Catch:{ IOException -> 0x02e9 }
        r0 = r7 % 100;
        if (r0 != r11) goto L_0x02e5;
    L_0x02b9:
        r5 = r13.getLastPathSegment();	 Catch:{ all -> 0x01a2 }
        r0 = r14.a;	 Catch:{ all -> 0x01a2 }
        r1 = buf.eU;	 Catch:{ all -> 0x01a2 }
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x01a2 }
        r3 = 0;
        r2[r3] = r5;	 Catch:{ all -> 0x01a2 }
        r2 = r0.getString(r1, r2);	 Catch:{ all -> 0x01a2 }
        r0 = r14.a;	 Catch:{ all -> 0x01a2 }
        r1 = buf.eV;	 Catch:{ all -> 0x01a2 }
        r3 = r0.getString(r1);	 Catch:{ all -> 0x01a2 }
        r0 = r14.a;	 Catch:{ all -> 0x01a2 }
        r1 = 2;
        r4 = r14.e;	 Catch:{ all -> 0x01a2 }
        r0 = ajp.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x01a2 }
        r1 = r14.d;	 Catch:{ all -> 0x01a2 }
        r2 = "VCardServiceProgress";
        r3 = r14.e;	 Catch:{ all -> 0x01a2 }
        r1.notify(r2, r3, r0);	 Catch:{ all -> 0x01a2 }
    L_0x02e5:
        r7 = r7 + 1;
        goto L_0x0239;
    L_0x02e9:
        r0 = move-exception;
        r1 = r9.i;	 Catch:{ all -> 0x01a2 }
        r2 = "VCardExport";
        r3 = "Failed to read a contact: ";
        r0 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x01a2 }
        r4 = r0.length();	 Catch:{ all -> 0x01a2 }
        if (r4 == 0) goto L_0x0326;
    L_0x02fa:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x01a2 }
    L_0x02fe:
        android.util.Log.e(r2, r0);	 Catch:{ all -> 0x01a2 }
        r0 = r14.a(r1);	 Catch:{ all -> 0x01a2 }
        r1 = r14.a;	 Catch:{ all -> 0x01a2 }
        r2 = buf.fd;	 Catch:{ all -> 0x01a2 }
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x01a2 }
        r4 = 0;
        r3[r4] = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r1.getString(r2, r3);	 Catch:{ all -> 0x01a2 }
        r1 = 0;
        r14.a(r0, r1);	 Catch:{ all -> 0x01a2 }
        r9.a();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r8.close();	 Catch:{ IOException -> 0x032c }
    L_0x031d:
        r0 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0.b(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x0012;
    L_0x0326:
        r0 = new java.lang.String;	 Catch:{ all -> 0x01a2 }
        r0.<init>(r3);	 Catch:{ all -> 0x01a2 }
        goto L_0x02fe;
    L_0x032c:
        r0 = move-exception;
        r1 = "VCardExport";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3.length();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3 + 47;
        r2.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = "IOException is thrown during close(). Ignored. ";
        r2 = r2.append(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r2.append(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        android.util.Log.w(r1, r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x031d;
    L_0x0354:
        r0 = r12.b;	 Catch:{ all -> 0x01a2 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x01a2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01a2 }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x01a2 }
        r2 = r2.length();	 Catch:{ all -> 0x01a2 }
        r2 = r2 + 38;
        r1.<init>(r2);	 Catch:{ all -> 0x01a2 }
        r2 = "Successfully finished exporting vCard ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x01a2 }
        r1.append(r0);	 Catch:{ all -> 0x01a2 }
        r0 = r14.a;	 Catch:{ all -> 0x01a2 }
        r1 = r12.b;	 Catch:{ all -> 0x01a2 }
        r1 = r1.getPath();	 Catch:{ all -> 0x01a2 }
        r0.a(r1);	 Catch:{ all -> 0x01a2 }
        r0 = r14.a;	 Catch:{ all -> 0x01a2 }
        r0 = com.android.contacts.common.vcard.ExportVCardActivity.a(r0, r13);	 Catch:{ all -> 0x01a2 }
        r1 = r12.a;	 Catch:{ all -> 0x01a2 }
        r2 = r13.getAuthority();	 Catch:{ all -> 0x01a2 }
        r1 = java.util.Objects.equals(r1, r2);	 Catch:{ all -> 0x01a2 }
        if (r1 == 0) goto L_0x03e2;
    L_0x038f:
        r0 = r14.g;	 Catch:{ all -> 0x01a2 }
        r0 = r0.obtainMessage();	 Catch:{ all -> 0x01a2 }
        r1 = 1;
        r0.arg1 = r1;	 Catch:{ all -> 0x01a2 }
        r1 = r14.g;	 Catch:{ all -> 0x01a2 }
        r1.sendMessage(r0);	 Catch:{ all -> 0x01a2 }
        r0 = r14.a;	 Catch:{ all -> 0x01a2 }
        r1 = buf.eZ;	 Catch:{ all -> 0x01a2 }
        r0 = r0.getString(r1);	 Catch:{ all -> 0x01a2 }
        r1 = r14.a;	 Catch:{ all -> 0x01a2 }
        r2 = buf.gO;	 Catch:{ all -> 0x01a2 }
        r1 = r1.getString(r2);	 Catch:{ all -> 0x01a2 }
        r2 = new android.content.Intent;	 Catch:{ all -> 0x01a2 }
        r3 = "android.intent.action.SEND";
        r2.<init>(r3);	 Catch:{ all -> 0x01a2 }
        r3 = "text/x-vcard";
        r2.setType(r3);	 Catch:{ all -> 0x01a2 }
        r3 = "android.intent.extra.STREAM";
        r2.putExtra(r3, r13);	 Catch:{ all -> 0x01a2 }
        r3 = 1;
        r2.setFlags(r3);	 Catch:{ all -> 0x01a2 }
        r3 = r14.a;	 Catch:{ all -> 0x01a2 }
        r4 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = ajp.a(r3, r0, r1, r2, r4);	 Catch:{ all -> 0x01a2 }
        r1 = r14.d;	 Catch:{ all -> 0x01a2 }
        r2 = "VCardServiceProgress";
        r3 = r14.e;	 Catch:{ all -> 0x01a2 }
        r1.notify(r2, r3, r0);	 Catch:{ all -> 0x01a2 }
    L_0x03d3:
        r9.a();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r8.close();	 Catch:{ IOException -> 0x0400 }
    L_0x03d9:
        r0 = r14.a;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r14.e;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0.b(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x0012;
    L_0x03e2:
        if (r0 != 0) goto L_0x03f1;
    L_0x03e4:
        r0 = r14.a;	 Catch:{ all -> 0x01a2 }
        r1 = buf.eZ;	 Catch:{ all -> 0x01a2 }
        r0 = r0.getString(r1);	 Catch:{ all -> 0x01a2 }
    L_0x03ec:
        r1 = 0;
        r14.a(r0, r1);	 Catch:{ all -> 0x01a2 }
        goto L_0x03d3;
    L_0x03f1:
        r1 = r14.a;	 Catch:{ all -> 0x01a2 }
        r2 = buf.eY;	 Catch:{ all -> 0x01a2 }
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x01a2 }
        r4 = 0;
        r3[r4] = r0;	 Catch:{ all -> 0x01a2 }
        r0 = r1.getString(r2, r3);	 Catch:{ all -> 0x01a2 }
        goto L_0x03ec;
    L_0x0400:
        r0 = move-exception;
        r1 = "VCardExport";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3.length();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = r3 + 47;
        r2.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = "IOException is thrown during close(). Ignored. ";
        r2 = r2.append(r3);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r2.append(r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        android.util.Log.w(r1, r0);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x03d9;
    L_0x0428:
        r1 = move-exception;
        r2 = "VCardExport";
        r1 = java.lang.String.valueOf(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r3 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r4 = r4.length();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r4 = r4 + 47;
        r3.<init>(r4);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r4 = "IOException is thrown during close(). Ignored. ";
        r3 = r3.append(r4);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r3.append(r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        r1 = r1.toString();	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        android.util.Log.w(r2, r1);	 Catch:{ OutOfMemoryError -> 0x00cc, RuntimeException -> 0x0106 }
        goto L_0x01af;
    L_0x0451:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x0451 }
        throw r0;
    L_0x0454:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x0454 }
        throw r0;
    L_0x0457:
        r0 = move-exception;
        r2 = r1;
        goto L_0x01a5;
    L_0x045b:
        r0 = move-exception;
        r2 = r9;
        goto L_0x01a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajd.run():void");
    }

    private final String a(String str) {
        Resources resources = this.a.getResources();
        if ("Failed to get database information".equals(str)) {
            return resources.getString(buf.eq);
        }
        if ("There's no exportable in the database".equals(str)) {
            return resources.getString(buf.er);
        }
        if ("The vCard composer object is not correctly initialized".equals(str)) {
            return resources.getString(buf.es);
        }
        return str;
    }

    private final void a(String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(this.a, this.f);
        this.d.notify("VCardServiceProgress", this.e, ajp.a(this.a, str, null, intent));
    }

    public final synchronized boolean cancel(boolean z) {
        boolean z2 = true;
        synchronized (this) {
            if (this.i || this.h) {
                z2 = false;
            } else {
                this.h = true;
            }
        }
        return z2;
    }

    public final synchronized boolean isCancelled() {
        return this.h;
    }

    public final synchronized boolean isDone() {
        return this.i;
    }
}
