package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.util.Log;

/* compiled from: PG */
/* renamed from: awb */
public final class awb extends AsyncTask {
    private /* synthetic */ avw a;

    public awb(avw avw) {
        this.a = avw;
    }

    protected final Object doInBackground(Object... objArr) {
        avw avw = this.a;
        SQLiteDatabase writableDatabase = avw.getWritableDatabase();
        synchronized (avw.c) {
            Cursor moveToNext;
            String valueOf;
            SharedPreferences sharedPreferences = avw.b.getSharedPreferences("com.android.dialer", 0);
            String valueOf2 = String.valueOf(sharedPreferences.getLong("last_updated_millis", 0));
            Long valueOf3 = Long.valueOf(System.currentTimeMillis());
            avw.d.getAndSet(true);
            Cursor query = avw.b.getContentResolver().query(avz.a, avz.b, "contact_deleted_timestamp > ?", new String[]{valueOf2}, null);
            if (query != null) {
                writableDatabase.beginTransaction();
                while (true) {
                    try {
                        moveToNext = query.moveToNext();
                        if (moveToNext == null) {
                            break;
                        }
                        Long valueOf4 = Long.valueOf(query.getLong(0));
                        String valueOf5 = String.valueOf("contact_id=");
                        String valueOf6 = String.valueOf(valueOf4);
                        writableDatabase.delete("smartdial_table", new StringBuilder((String.valueOf(valueOf5).length() + 0) + String.valueOf(valueOf6).length()).append(valueOf5).append(valueOf6).toString(), null);
                        valueOf5 = String.valueOf("contact_id=");
                        valueOf = String.valueOf(valueOf4);
                        writableDatabase.delete("prefix_table", new StringBuilder((String.valueOf(valueOf5).length() + 0) + String.valueOf(valueOf).length()).append(valueOf5).append(valueOf).toString(), null);
                    } catch (Throwable th) {
                        moveToNext = th;
                        writableDatabase.endTransaction();
                    } finally {
                        moveToNext.close();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            String valueOf7 = String.valueOf("contact_id IN (SELECT contact_id FROM smartdial_table WHERE last_smartdial_update_time > ");
            writableDatabase.delete("prefix_table", new StringBuilder((String.valueOf(valueOf7).length() + 1) + String.valueOf(valueOf2).length()).append(valueOf7).append(valueOf2).append(")").toString(), null);
            valueOf7 = "smartdial_table";
            String valueOf8 = String.valueOf("last_smartdial_update_time > ");
            valueOf = String.valueOf(valueOf2);
            if (valueOf.length() != 0) {
                valueOf = valueOf8.concat(valueOf);
            } else {
                valueOf = new String(valueOf8);
            }
            writableDatabase.delete(valueOf7, valueOf, null);
            if (!valueOf2.equals("0")) {
                moveToNext = avw.b.getContentResolver().query(awc.a, awc.b, "contact_last_updated_timestamp > ?", new String[]{valueOf2}, null);
                if (moveToNext == null) {
                    Log.e("DialerDatabaseHelper", "SmartDial query received null for cursor");
                } else {
                    avw.a(writableDatabase, moveToNext);
                }
            }
            moveToNext = avw.b.getContentResolver().query(awa.a, awa.b, "contact_last_updated_timestamp > ? AND length(lookup) < 1000", new String[]{valueOf2}, null);
            if (moveToNext == null) {
                Log.e("DialerDatabaseHelper", "SmartDial query received null for cursor");
            } else {
                avw.a(writableDatabase, moveToNext, valueOf3);
                valueOf7 = String.valueOf("SELECT DISTINCT display_name, contact_id FROM smartdial_table WHERE last_smartdial_update_time = ");
                valueOf = String.valueOf(Long.toString(valueOf3.longValue()));
                if (valueOf.length() != 0) {
                    valueOf = valueOf7.concat(valueOf);
                } else {
                    valueOf = new String(valueOf7);
                }
                moveToNext = writableDatabase.rawQuery(valueOf, new String[0]);
                if (moveToNext != null) {
                    avw.b(writableDatabase, moveToNext);
                }
                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS smartdial_contact_id_index ON smartdial_table (contact_id);");
                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS smartdial_last_update_index ON smartdial_table (last_smartdial_update_time);");
                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS smartdial_sort_index ON smartdial_table (starred, is_super_primary, last_time_used, times_used, in_visible_group, display_name, contact_id, is_primary);");
                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS nameprefix_index ON prefix_table (prefix);");
                writableDatabase.execSQL("CREATE INDEX IF NOT EXISTS nameprefix_contact_id_index ON prefix_table (contact_id);");
                writableDatabase.execSQL("ANALYZE smartdial_table");
                writableDatabase.execSQL("ANALYZE prefix_table");
                writableDatabase.execSQL("ANALYZE smartdial_contact_id_index");
                writableDatabase.execSQL("ANALYZE smartdial_last_update_index");
                writableDatabase.execSQL("ANALYZE nameprefix_index");
                writableDatabase.execSQL("ANALYZE nameprefix_contact_id_index");
                avw.d.getAndSet(false);
                Editor edit = sharedPreferences.edit();
                edit.putLong("last_updated_millis", valueOf3.longValue());
                edit.apply();
                avw.b.getContentResolver().notifyChange(avw.a, null, false);
            }
        }
        return null;
    }

    protected final void onCancelled() {
        super.onCancelled();
    }

    protected final void onPostExecute(Object obj) {
        super.onPostExecute(obj);
    }
}
