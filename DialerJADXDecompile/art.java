import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.Cursor;
import java.util.Objects;

@TargetApi(23)
/* compiled from: PG */
public final class art {
    final ContentResolver a;
    final avm b;

    public art(ContentResolver contentResolver) {
        this.a = (ContentResolver) Objects.requireNonNull(contentResolver);
        this.b = avn.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final android.net.Uri a(android.net.Uri r10) {
        /*
        r9 = this;
        r4 = 0;
        r0 = r9.a;
        r1 = awg.a;
        r2 = 1;
        r2 = new java.lang.String[r2];
        r3 = 0;
        r5 = "_id";
        r2[r3] = r5;
        r3 = "server_id=";
        r3 = java.lang.String.valueOf(r3);
        r6 = android.content.ContentUris.parseId(r10);
        r5 = new java.lang.StringBuilder;
        r8 = java.lang.String.valueOf(r3);
        r8 = r8.length();
        r8 = r8 + 20;
        r5.<init>(r8);
        r3 = r5.append(r3);
        r3 = r3.append(r6);
        r3 = r3.toString();
        r5 = r4;
        r2 = r0.query(r1, r2, r3, r4, r5);
        r0 = a(r2);	 Catch:{ Throwable -> 0x0057, all -> 0x006d }
        if (r0 == 0) goto L_0x0051;
    L_0x003d:
        r0 = "_id";
        r0 = r2.getColumnIndex(r0);	 Catch:{ Throwable -> 0x0057, all -> 0x006d }
        r0 = r2.getInt(r0);	 Catch:{ Throwable -> 0x0057, all -> 0x006d }
        r4 = awg.a(r0);	 Catch:{ Throwable -> 0x0057, all -> 0x006d }
        if (r2 == 0) goto L_0x0050;
    L_0x004d:
        r2.close();
    L_0x0050:
        return r4;
    L_0x0051:
        if (r2 == 0) goto L_0x0050;
    L_0x0053:
        r2.close();
        goto L_0x0050;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0059 }
    L_0x0059:
        r1 = move-exception;
        r4 = r0;
        r0 = r1;
    L_0x005c:
        if (r2 == 0) goto L_0x0063;
    L_0x005e:
        if (r4 == 0) goto L_0x0069;
    L_0x0060:
        r2.close();	 Catch:{ Throwable -> 0x0064 }
    L_0x0063:
        throw r0;
    L_0x0064:
        r1 = move-exception;
        r4.addSuppressed(r1);
        goto L_0x0063;
    L_0x0069:
        r2.close();
        goto L_0x0063;
    L_0x006d:
        r0 = move-exception;
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: art.a(android.net.Uri):android.net.Uri");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final android.content.ContentValues b(android.net.Uri r12) {
        /*
        r11 = this;
        r3 = 0;
        r0 = r11.a;
        r1 = android.provider.CallLog.Calls.CONTENT_URI_WITH_VOICEMAIL;
        r4 = android.content.ContentUris.parseId(r12);
        r1 = android.content.ContentUris.withAppendedId(r1, r4);
        r2 = awr.a;
        r4 = r3;
        r5 = r3;
        r2 = r0.query(r1, r2, r3, r4, r5);
        r4 = r11.a;	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r0 = 6;
        r6 = new java.lang.String[r0];	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r0 = 0;
        r1 = "_id";
        r6[r0] = r1;	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r0 = 1;
        r1 = "number";
        r6[r0] = r1;	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r0 = 2;
        r1 = "date";
        r6[r0] = r1;	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r0 = 3;
        r1 = "duration";
        r6[r0] = r1;	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r0 = 4;
        r1 = "mime_type";
        r6[r0] = r1;	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r0 = 5;
        r1 = "transcription";
        r6[r0] = r1;	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r5 = r12;
        r4 = r4.query(r5, r6, r7, r8, r9);	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        r0 = a(r2);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        if (r0 == 0) goto L_0x0171;
    L_0x0046:
        r0 = a(r4);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        if (r0 == 0) goto L_0x0171;
    L_0x004c:
        r0 = new android.content.ContentValues;	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.<init>();	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "countryiso";
        r5 = 5;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "geocoded_location";
        r5 = 7;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "name";
        r5 = 8;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "numbertype";
        r5 = 9;
        r5 = r2.getInt(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "numberlabel";
        r5 = 10;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "lookup_uri";
        r5 = 11;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "matched_number";
        r5 = 12;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "normalized_number";
        r5 = 13;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "formatted_number";
        r5 = 15;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "presentation";
        r5 = 17;
        r5 = r2.getInt(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "subscription_component_name";
        r5 = 18;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "subscription_id";
        r5 = 19;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "features";
        r5 = 20;
        r5 = r2.getInt(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "photo_uri";
        r5 = 23;
        r5 = r2.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "server_id";
        r5 = "_id";
        r5 = r4.getColumnIndex(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = r4.getInt(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "number";
        r5 = "number";
        r5 = r4.getColumnIndex(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = r4.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "date";
        r5 = "date";
        r5 = r4.getColumnIndex(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r6 = r4.getLong(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = java.lang.Long.valueOf(r6);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "duration";
        r5 = "duration";
        r5 = r4.getColumnIndex(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r6 = r4.getLong(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = java.lang.Long.valueOf(r6);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "mime_type";
        r5 = "mime_type";
        r5 = r4.getColumnIndex(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = r4.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "transcription";
        r5 = "transcription";
        r5 = r4.getColumnIndex(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r5 = r4.getString(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r1 = "archived_by_user";
        r5 = 0;
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        r0.put(r1, r5);	 Catch:{ Throwable -> 0x017c, all -> 0x01ab }
        if (r4 == 0) goto L_0x016a;
    L_0x0167:
        r4.close();	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
    L_0x016a:
        if (r2 == 0) goto L_0x016f;
    L_0x016c:
        r2.close();
    L_0x016f:
        r3 = r0;
    L_0x0170:
        return r3;
    L_0x0171:
        if (r4 == 0) goto L_0x0176;
    L_0x0173:
        r4.close();	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
    L_0x0176:
        if (r2 == 0) goto L_0x0170;
    L_0x0178:
        r2.close();
        goto L_0x0170;
    L_0x017c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x017e }
    L_0x017e:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x0182:
        if (r4 == 0) goto L_0x0189;
    L_0x0184:
        if (r1 == 0) goto L_0x019e;
    L_0x0186:
        r4.close();	 Catch:{ Throwable -> 0x0197, all -> 0x019c }
    L_0x0189:
        throw r0;	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x018c }
    L_0x018c:
        r1 = move-exception;
        r3 = r0;
        r0 = r1;
    L_0x018f:
        if (r2 == 0) goto L_0x0196;
    L_0x0191:
        if (r3 == 0) goto L_0x01a7;
    L_0x0193:
        r2.close();	 Catch:{ Throwable -> 0x01a2 }
    L_0x0196:
        throw r0;
    L_0x0197:
        r4 = move-exception;
        r1.addSuppressed(r4);	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        goto L_0x0189;
    L_0x019c:
        r0 = move-exception;
        goto L_0x018f;
    L_0x019e:
        r4.close();	 Catch:{ Throwable -> 0x018a, all -> 0x019c }
        goto L_0x0189;
    L_0x01a2:
        r1 = move-exception;
        r3.addSuppressed(r1);
        goto L_0x0196;
    L_0x01a7:
        r2.close();
        goto L_0x0196;
    L_0x01ab:
        r0 = move-exception;
        r1 = r3;
        goto L_0x0182;
        */
        throw new UnsupportedOperationException("Method not decompiled: art.b(android.net.Uri):android.content.ContentValues");
    }

    static boolean a(Cursor cursor) {
        return cursor != null && cursor.moveToFirst();
    }
}
