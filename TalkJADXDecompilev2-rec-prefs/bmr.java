package p000;

import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.api.client.http.HttpStatusCodes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class bmr extends SQLiteOpenHelper {
    static final boolean f3983a = false;
    private static final String[] f3984c = new String[]{"name"};
    private static final Map<Integer, bmr> f3985d = new ky();
    private static final String[] f3986e = new String[]{"_id"};
    private static final String[] f3987f = new String[]{"circle_id"};
    public final Context f3988b;
    private boolean f3989g;
    private final int f3990h;
    private final String f3991i;

    static {
        kae kae = glk.f15557d;
    }

    public static bmr m6166a(Context context, int i) {
        gwb.aK();
        try {
            bmr bmr;
            jch a = ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i);
            synchronized (f3985d) {
                bmr = (bmr) f3985d.get(Integer.valueOf(i));
                if (bmr == null) {
                    if (a.mo3448c("sms_only") || a.mo3437a()) {
                        bmr = new bmr(context, i);
                        f3985d.put(Integer.valueOf(i), bmr);
                    } else {
                        String valueOf = String.valueOf(glk.m17974b(a.mo3440b("account_name")));
                        glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 22).append("Account ").append(valueOf).append(" not logged in").toString(), new Object[0]);
                        throw new bmu();
                    }
                }
            }
            return bmr;
        } catch (Throwable e) {
            throw new bmu(e);
        }
    }

    public static void m6176b(Context context, int i) {
        jcf jcf = (jcf) jyn.m25426a(context, jcf.class);
        try {
            boolean z;
            jch a = jcf.mo3456a(i);
            String str = "Babel";
            boolean c = jcf.mo3467c(i);
            boolean a2 = a.mo3437a();
            String str2 = " Plus page: ";
            String valueOf = String.valueOf(a.mo3440b("effective_gaia_id"));
            glk.m17979c(str, "Valid account: " + c + " Logged in: " + a2 + ((valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)) != null), new Object[0]);
            if (jcf.mo3467c(i) && a.mo3437a() && a.mo3440b("effective_gaia_id") == null) {
                z = false;
            } else {
                z = true;
            }
            ba.m4609b(z);
        } catch (jcj e) {
        }
        String valueOf2 = String.valueOf("babel");
        String valueOf3 = String.valueOf(".db");
        glk.m17979c("Babel", "deleted: " + context.deleteDatabase(new StringBuilder((String.valueOf(valueOf2).length() + 11) + String.valueOf(valueOf3).length()).append(valueOf2).append(i).append(valueOf3).toString()) + " for " + i, new Object[0]);
        synchronized (f3985d) {
            f3985d.remove(Integer.valueOf(i));
        }
    }

    private bmr(Context context, int i) {
        String valueOf = String.valueOf("babel");
        String valueOf2 = String.valueOf(".db");
        super(context, new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append(i).append(valueOf2).toString(), null, 1310);
        this.f3988b = context;
        this.f3990h = i;
        valueOf = String.valueOf("babel");
        valueOf2 = String.valueOf(".db");
        this.f3991i = new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append(i).append(valueOf2).toString();
        setWriteAheadLoggingEnabled(false);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = 0;
        for (String execSQL : EsProvider.m8261a()) {
            sQLiteDatabase.execSQL(execSQL);
        }
        for (String execSQL2 : dwz.m8736b()) {
            sQLiteDatabase.execSQL(execSQL2);
        }
        for (String execSQL22 : EsProvider.m8270b()) {
            sQLiteDatabase.execSQL(execSQL22);
        }
        for (String execSQL222 : EsProvider.m8278d()) {
            sQLiteDatabase.execSQL(execSQL222);
        }
        for (String execSQL2222 : dwz.m8737c()) {
            sQLiteDatabase.execSQL(execSQL2222);
        }
        String[] e = EsProvider.m8280e();
        int length = e.length;
        while (i < length) {
            sQLiteDatabase.execSQL(e[i]);
            i++;
        }
        gwb.m1863a(new bms(this));
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mco a = bmr.m6172a(i, i2);
        glk.m17982e("Babel", "Downgrading from:" + i + " to:" + i2, new Object[0]);
        m6179d().mo1704a(a).mo1714c(3411);
        m6183g(sQLiteDatabase);
        m6179d().mo1704a(a).mo1714c(3412);
        if (VERSION.SDK_INT >= 19) {
            ActivityManager activityManager = (ActivityManager) this.f3988b.getSystemService("activity");
            glk.m17982e("Babel", "Clearing app data, service will be restarted!", new Object[0]);
            activityManager.clearApplicationUserData();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String[] split;
        int i3 = 1;
        int i4 = 0;
        mco a = bmr.m6172a(i, i2);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f3988b);
        if (defaultSharedPreferences.contains("last_database_upgrade_failure_state")) {
            try {
                String string = defaultSharedPreferences.getString("last_database_upgrade_failure_state", "");
                if (!(string == null || string.trim().isEmpty())) {
                    split = string.split("#");
                    if (split.length == 2) {
                        mco a2 = bmr.m6172a(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                        if (glk.m17973a("Babel", 3)) {
                            glk.m17970a("Babel", "Database upgrade failed in the last attempt.", new Object[0]);
                        }
                        m6179d().mo1704a(a2).mo1714c(3410);
                    }
                }
                defaultSharedPreferences.edit().remove("last_database_upgrade_failure_state").commit();
            } catch (Throwable e) {
                String str = "Babel";
                String valueOf = String.valueOf("Unable to read shared preference for key: last_database_upgrade_failure_state. ");
                String valueOf2 = String.valueOf(e.getMessage());
                if (valueOf2.length() != 0) {
                    valueOf2 = valueOf.concat(valueOf2);
                } else {
                    valueOf2 = new String(valueOf);
                }
                glk.m17980d(str, valueOf2, e);
            } catch (Throwable th) {
                i4 = "last_database_upgrade_failure_state";
                defaultSharedPreferences.edit().remove(i4).commit();
            }
        }
        m6179d().mo1704a(a).mo1714c(3407);
        if (glk.m17973a("Babel", 3)) {
            glk.m17970a("Babel", "Upgrade database: " + i + " --> " + i2, new Object[i4]);
        }
        int i5 = 242;
        if ("hammerhead".equals(Build.HARDWARE)) {
            i5 = 234;
        }
        if (i < 138 || ((i > 138 && i < r0) || ((i > 219 && i < 225) || (i > 402 && i < 430)))) {
            glk.m17981d("Babel", "upgrade from " + i + " not supported; recreating", new Object[i4]);
            m6183g(sQLiteDatabase);
            return;
        }
        switch (i) {
            case 138:
                sQLiteDatabase.execSQL("PRAGMA foreign_keys=OFF;");
                sQLiteDatabase.execSQL("ALTER TABLE messages ADD COLUMN attachment_content_type TEXT");
                sQLiteDatabase.execSQL("alter table participants rename to temp");
                sQLiteDatabase.execSQL(EsProvider.f5999b);
                sQLiteDatabase.execSQL("insert into participants(_id, participant_type, gaia_id, chat_id, circle_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked) select _id, participant_type, gaia_id, chat_id, circle_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked from temp;");
                sQLiteDatabase.execSQL("drop table temp");
                sQLiteDatabase.execSQL("CREATE INDEX index_participants_chat_id ON participants(chat_id)");
                sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
                sQLiteDatabase.execSQL("update conversations set otr_status = otr_status + 1;");
                split = new String[]{"_id", "text"};
                str = String.valueOf("type=");
                bmr.m6175a(sQLiteDatabase, split, "messages", new StringBuilder(String.valueOf(str).length() + 11).append(str).append(fwy.MEMBERSHIP_CHANGE_DEPRECATED.ordinal()).toString(), "_id=?");
                bmr.m6175a(sQLiteDatabase, new String[]{"_id", "snippet_text"}, "conversations", "snippet_type=4", "_id=?");
                sQLiteDatabase.execSQL("update conversations set conversation_type = conversation_type - 1;");
                break;
            case HttpStatusCodes.STATUS_CODE_OK /*200*/:
            case 203:
                break;
            case HttpStatusCodes.STATUS_CODE_NO_CONTENT /*204*/:
            case 205:
            case 206:
            case 207:
                break;
            case 208:
            case 209:
                break;
            case 210:
                break;
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
                break;
            case 216:
                break;
            case 217:
                break;
            case 218:
                break;
            case 220:
            case 222:
                break;
            case 223:
                break;
            case 224:
            case 225:
                break;
            case 227:
                break;
            case 228:
                break;
            case 229:
            case 230:
            case 232:
            case 233:
            case 234:
                break;
            case 235:
            case 236:
                break;
            case 237:
            case 238:
                break;
            case 239:
                break;
            case 240:
            case 241:
            case 242:
                break;
            case 271:
                break;
            case 400:
            case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                break;
            case 402:
                break;
            case HttpStatusCodes.STATUS_CODE_FORBIDDEN /*403*/:
                break;
            case HttpStatusCodes.STATUS_CODE_NOT_FOUND /*404*/:
                break;
            case HttpStatusCodes.STATUS_CODE_METHOD_NOT_ALLOWED /*405*/:
            case 406:
                break;
            case 407:
            case 408:
                break;
            case HttpStatusCodes.STATUS_CODE_CONFLICT /*409*/:
            case 410:
            case 411:
            case 412:
                break;
            case 413:
                break;
            case 414:
                break;
            case 415:
            case 416:
            case 417:
                break;
            case 418:
                break;
            case 419:
            case 420:
                break;
            case 422:
            case 423:
            case 424:
            case 425:
                break;
            case 426:
            case 427:
            case 428:
            case 429:
                break;
            case 430:
            case 431:
            case 432:
            case 433:
            case 434:
            case 435:
                break;
            case 436:
            case 437:
                break;
            case 438:
                break;
            case 439:
            case 440:
            case 450:
            case 460:
            case 470:
            case 480:
            case 490:
                break;
            case 500:
            case 510:
                break;
            case 520:
                break;
            case 530:
                break;
            case 540:
                break;
            case 541:
                break;
            case 550:
            case 560:
                break;
            case 570:
                break;
            case 580:
                break;
            case 590:
                break;
            case 600:
            case 610:
                break;
            case 620:
                break;
            case 630:
            case 640:
            case 650:
            case 770:
                break;
            case 780:
                break;
            case 790:
                break;
            case 800:
                break;
            case 810:
                break;
            case 820:
                break;
            case 830:
                break;
            case 840:
                break;
            case 850:
                break;
            case 860:
                break;
            case 870:
            case 880:
                break;
            case 890:
                break;
            case 900:
                break;
            case 910:
            case 920:
                break;
            case 930:
                break;
            case 940:
                break;
            case 950:
            case 960:
                break;
            case 970:
                break;
            case 980:
                break;
            case 990:
            case 1000:
            case 1010:
            case 1020:
                break;
            case 1030:
                break;
            case 1040:
                break;
            case 1050:
            case 1060:
                break;
            case 1070:
                break;
            case 1080:
                break;
            case 1090:
                break;
            case 1100:
                break;
            case 1110:
                break;
            case 1120:
                break;
            case 1130:
                break;
            case 1140:
                break;
            case 1150:
            case 1160:
                break;
            case 1170:
                break;
            case 1180:
            case 1190:
                break;
            case 1200:
                break;
            case 1210:
                break;
            case 1220:
                break;
            case 1230:
                break;
            case 1240:
                break;
            case 1250:
                break;
            case 1260:
                break;
            case 1270:
                break;
            case 1280:
                break;
            case 1290:
                break;
            case 1300:
                break;
            case 1310:
            case Integer.MAX_VALUE:
                break;
            default:
                try {
                    throw new IllegalStateException("Must support upgrade from " + i + " to " + i2);
                } catch (Throwable e2) {
                    Throwable th2 = e2;
                    str = String.valueOf(th2.getMessage());
                    glk.m17980d("Babel", new StringBuilder(String.valueOf(str).length() + 53).append("Upgrade database failed: ").append(i).append(" --> ").append(i2).append(" ").append(str).toString(), th2);
                    if (!((gmp) jyn.m25426a(this.f3988b, gmp.class)).mo2298a()) {
                        if (defaultSharedPreferences.getInt("last_database_upgrade_version", 0) == i2) {
                            i3 = i4;
                        }
                    }
                    if (i3 != 0) {
                        defaultSharedPreferences.edit().putString("last_database_upgrade_failure_state", TextUtils.join("#", new Integer[]{Integer.valueOf(i), Integer.valueOf(i2)})).commit();
                        RuntimeException runtimeException = new RuntimeException("Unable to upgrade from " + i + " to " + i2, th2);
                    } else {
                        i5 = i4;
                        if (i5 != 0) {
                            glk.m17979c("Babel", "db upgrade from " + i + " to " + i2 + " succeeded", new Object[i4]);
                            m6179d().mo1704a(a).mo1714c(3408);
                            return;
                        }
                        glk.m17981d("Babel", "db upgrade failed; recreating: " + i + " -> " + i2, new Object[i4]);
                        m6179d().mo1704a(a).mo1714c(3409);
                        m6183g(sQLiteDatabase);
                        return;
                    }
                } finally {
                    i4 = "last_database_upgrade_version";
                    defaultSharedPreferences.edit().putInt(i4, i2).commit();
                }
        }
    }

    private static void m6173a(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("conversations", new String[]{"conversation_id", "generated_name"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(1);
                if (string.matches("^\\+?[0-9]+$")) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("generated_name", glq.m18038i(gwb.m1400H(), string));
                    sQLiteDatabase.update("conversations", contentValues, "conversation_id=?", new String[]{query.getString(0)});
                }
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }

    private void m6177b(SQLiteDatabase sQLiteDatabase) {
        Set hashSet = new HashSet();
        hashSet.add("dnd_expiration");
        hashSet.add(EsProvider.m8255a(3));
        hashSet.add(EsProvider.m8255a(2));
        hashSet.add(EsProvider.m8255a(1));
        hashSet.add(EsProvider.m8255a(5));
        hashSet.add(EsProvider.m8255a(4));
        hashSet.add("last_invite_seen_timestamp");
        hashSet.add("last_suggested_contacts_time");
        hashSet.add("sms_last_full_sync_time_millis");
        hashSet.add("refresh_participants_time");
        hashSet.add("last_warm_sync_localtime");
        hashSet.add("second_peak_scroll_time");
        hashSet.add("second_peak_scroll_to_conversation_timestamp");
        hashSet.add("sms_last_sync_time_millis");
        hashSet.add("last_successful_sync_time");
        Set hashSet2 = new HashSet();
        hashSet2.add("hash_pinned");
        hashSet2.add("hash_favorites");
        hashSet2.add("hash_people_you_hangout_with");
        hashSet2.add("hash_other_people_on_hangout");
        hashSet2.add("hash_dismissed_contacts");
        Cursor query = sQLiteDatabase.query("realtimechat_metadata", new String[]{"key", "value"}, null, null, null, null, null);
        jci b = ((jcf) jyn.m25426a(this.f3988b, jcf.class)).mo3464b(this.f3990h);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (hashSet.contains(string)) {
                    b.m23878b(string, Long.parseLong(string2));
                } else if (hashSet2.contains(string)) {
                    b.m23879b(string, string2);
                } else {
                    string2 = "Babel";
                    String str = "Dropping metadata key ";
                    string = String.valueOf(string);
                    glk.m17981d(string2, string.length() != 0 ? str.concat(string) : new String(str), new Object[0]);
                }
            } finally {
                query.close();
            }
        }
        b.m23891d();
        sQLiteDatabase.execSQL("drop table if exists realtimechat_metadata;");
    }

    private void m6174a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sQLiteDatabase.execSQL("alter table conversations rename to temp");
        sQLiteDatabase.execSQL(str2);
        String valueOf = String.valueOf("insert into conversations(");
        sQLiteDatabase.execSQL(new StringBuilder(((String.valueOf(valueOf).length() + 20) + String.valueOf(str).length()) + String.valueOf(str).length()).append(valueOf).append(str).append(") select ").append(str).append(" from temp;").toString());
        sQLiteDatabase.execSQL("drop table temp");
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }

    private static Map<String, Object> m6171a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (Map) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
                } catch (Throwable e) {
                    glk.m17980d("Babel", "error decoding", e);
                    return null;
                }
            }
        } catch (Throwable e2) {
            glk.m17980d("Babel", "decode object failure", e2);
        }
        return null;
    }

    private static String m6170a(Map<String, Object> map) {
        String str = null;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable e) {
            glk.m17980d("Babel", "got exception serializing strings array", e);
        }
        return str;
    }

    private static void m6175a(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String str2, String str3) {
        Throwable th;
        Cursor query;
        try {
            ContentValues contentValues = new ContentValues();
            String[] strArr2 = new String[1];
            query = sQLiteDatabase.query(str, strArr, str2, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    Map a = bmr.m6171a(query.getString(1));
                    if (a != null) {
                        Integer num = (Integer) a.get("type");
                        if (num != null) {
                            a.put("type", Integer.valueOf(gwb.m1507a(num) + 1));
                            contentValues.put(strArr[1], bmr.m6170a(a));
                            strArr2[0] = query.getString(0);
                            sQLiteDatabase.update(str, contentValues, str3, strArr2);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
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

    private static int m6165a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4, String str5) {
        Cursor query;
        SQLiteDatabase sQLiteDatabase2;
        if (str != null) {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                query = sQLiteDatabase2.query("participants", f3986e, "gaia_id=?", new String[]{str}, null, null, null);
            } catch (Throwable th) {
                Throwable th2 = th;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th2;
            }
        } else if (str2 != null) {
            sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("participants", f3986e, "chat_id=?", new String[]{str2}, null, null, null);
        } else if (str3 != null) {
            sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("participants", f3986e, "phone_id=?", new String[]{str3}, null, null, null);
        } else if (str4 != null) {
            sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("participants", f3986e, "circle_id=?", new String[]{str4}, null, null, null);
        } else if (str5 == null) {
            return -1;
        } else {
            sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("participants", f3986e, "( chat_id=? AND fallback_name=? )", new String[]{str5, str5}, null, null, null);
        }
        try {
            if (query.moveToFirst()) {
                int i = query.getInt(0);
                if (query == null) {
                    return i;
                }
                query.close();
                return i;
            }
            if (query != null) {
                query.close();
            }
            ContentValues contentValues = new ContentValues();
            if (str2 != null) {
                contentValues.put("chat_id", str2);
            }
            if (str != null) {
                contentValues.put("gaia_id", str);
            }
            if (str3 != null) {
                contentValues.put("phone_id", str3);
            }
            if (str4 != null) {
                contentValues.put("circle_id", str4);
            }
            if (str5 != null) {
                contentValues.put("fallback_name", str5);
                if (str2 == null && str == null && str3 == null && str4 == null) {
                    contentValues.put("chat_id", str5);
                }
            }
            if (str == null) {
                contentValues.put("batch_gebi_tag", "blocked");
            }
            return (int) sQLiteDatabase.insert("participants", null, contentValues);
        } catch (Throwable th3) {
            th2 = th3;
            if (query != null) {
                query.close();
            }
            throw th2;
        }
    }

    private static edo m6167a(Context context, SQLiteDatabase sQLiteDatabase) {
        String substring;
        String path = sQLiteDatabase.getPath();
        int lastIndexOf = path.lastIndexOf(File.separator);
        if (lastIndexOf >= 0) {
            substring = path.substring(lastIndexOf + 1);
        } else {
            substring = path;
        }
        try {
            return bkq.m5661a(context, Integer.parseInt(substring.substring(5, substring.length() - 3)));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Babel";
            String str2 = "unable to parse database file name to determine index: ";
            substring = String.valueOf(path);
            glk.m17982e(str, substring.length() != 0 ? str2.concat(substring) : new String(str2), new Object[0]);
            throw new RuntimeException("unable to parse database file name to determine index", th);
        }
    }

    private void m6178c(SQLiteDatabase sQLiteDatabase) {
        Cursor query;
        Throwable th;
        String[] strArr = new String[]{"_id", "type", "text"};
        edo a = bmr.m6167a(this.f3988b, sQLiteDatabase);
        try {
            ContentValues contentValues = new ContentValues();
            String[] strArr2 = new String[1];
            String valueOf = String.valueOf("( type != ");
            int ordinal = fwy.OUTGOING_USER_MESSAGE.ordinal();
            String valueOf2 = String.valueOf("type");
            query = sQLiteDatabase.query("messages", strArr, new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append(valueOf).append(ordinal).append(" AND ").append(valueOf2).append(" != ").append(fwy.INCOMING_USER_MESSAGE.ordinal()).append(" )").toString(), null, null, null, null);
            while (query.moveToNext()) {
                try {
                    fwy fwy = fwy.values()[query.getInt(1)];
                    contentValues.clear();
                    Map a2 = bmr.m6171a(query.getString(2));
                    if (a2 == null || a2.size() == 0) {
                        iil.m21878b("No system message parameters for a membership change event", fwy, fwy.MEMBERSHIP_CHANGE_DEPRECATED);
                    } else {
                        boolean z;
                        Object obj;
                        switch (bmt.f3993a[fwy.ordinal()]) {
                            case 1:
                                obj = a2.get("new_name");
                                if (obj != null && (obj instanceof String)) {
                                    contentValues.put("new_conversation_name", (String) obj);
                                    break;
                                }
                            case 2:
                                fwy fwy2;
                                fwy fwy3 = fwy.MEMBERSHIP_CHANGE_JOIN;
                                obj = a2.get("type");
                                if (obj == null || !(obj instanceof Integer)) {
                                    z = false;
                                    fwy2 = fwy3;
                                } else {
                                    int a3 = gwb.m1507a((Integer) obj);
                                    if (a3 == 2) {
                                        fwy2 = fwy.MEMBERSHIP_CHANGE_LEAVE;
                                    } else {
                                        fwy2 = fwy.MEMBERSHIP_CHANGE_JOIN;
                                    }
                                    z = a3 == 1;
                                }
                                contentValues.put("type", Integer.valueOf(fwy2.ordinal()));
                                break;
                            case 3:
                            case 4:
                            case 5:
                                z = false;
                                break;
                            case 6:
                            case 7:
                                break;
                            case 8:
                                valueOf = m6168a(sQLiteDatabase, a, a2);
                                if (valueOf != null) {
                                    contentValues.put("participant_keys", valueOf);
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        valueOf = m6169a(sQLiteDatabase, a2, z);
                        if (valueOf != null) {
                            contentValues.put("participant_keys", valueOf);
                        }
                    }
                    if (contentValues.size() > 0) {
                        contentValues.putNull("text");
                        strArr2[0] = query.getString(0);
                        if (sQLiteDatabase.update("messages", contentValues, "_id=?", strArr2) != 1) {
                            sQLiteDatabase.update("messages", contentValues, "_id=?", strArr2);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (query != null) {
                query.close();
            }
            query = null;
            try {
                ContentValues contentValues2 = new ContentValues();
                strArr = new String[1];
                query = sQLiteDatabase.rawQuery("SELECT conversations._id, conversations.snippet_type, messages.author_chat_id, messages.author_gaia_id, messages.new_conversation_name, messages.participant_keys FROM conversations LEFT JOIN messages ON ( conversations.snippet_message_row_id = messages._id ) WHERE ( conversations.snippet_type = 4 OR conversations.snippet_type = 5 )", null);
                while (query.moveToNext()) {
                    String string;
                    ordinal = query.getInt(1);
                    contentValues2.clear();
                    switch (ordinal) {
                        case 4:
                            string = query.getString(5);
                            if (string != null) {
                                contentValues2.put("snippet_participant_keys", string);
                                break;
                            }
                            break;
                        case 5:
                            string = query.getString(4);
                            if (string != null) {
                                contentValues2.put("snippet_new_conversation_name", string);
                                break;
                            }
                            break;
                    }
                    string = query.getString(2);
                    if (string != null) {
                        contentValues2.put("snippet_author_chat_id", string);
                    }
                    string = query.getString(3);
                    if (string != null) {
                        contentValues2.put("snippet_author_gaia_id", string);
                    }
                    if (contentValues2.size() > 0) {
                        contentValues2.putNull("snippet_text");
                        strArr[0] = query.getString(0);
                        sQLiteDatabase.update("conversations", contentValues2, "_id=?", strArr);
                    }
                }
            } finally {
                if (query != null) {
                    query.close();
                }
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

    private String m6169a(SQLiteDatabase sQLiteDatabase, Map<String, Object> map, boolean z) {
        Object obj = map.get("participant_ids");
        StringBuilder stringBuilder;
        int i;
        if (z && obj != null && (obj instanceof List)) {
            String stringBuilder2;
            stringBuilder = new StringBuilder();
            for (Object obj2 : (List) obj2) {
                if (obj2 == null || !(obj2 instanceof fbw)) {
                    i = -1;
                } else {
                    fbw fbw = (fbw) obj2;
                    i = bmr.m6165a(sQLiteDatabase, fbw.f12666a, fbw.f12667b, fbw.f12669d, fbw.f12668c, fbw.f12670e);
                }
                if (i >= 0) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append('|');
                    }
                    stringBuilder.append(i);
                }
            }
            if (stringBuilder.length() > 0) {
                stringBuilder2 = stringBuilder.toString();
            } else {
                stringBuilder2 = null;
            }
            return stringBuilder2;
        }
        obj2 = map.get("participants");
        if (obj2 == null || !(obj2 instanceof List)) {
            return null;
        }
        stringBuilder = new StringBuilder();
        for (Object next : (List) obj2) {
            if (next instanceof String) {
                i = bmr.m6165a(sQLiteDatabase, null, null, null, null, (String) next);
            } else if (next instanceof edo) {
                edo edo = (edo) next;
                i = bmr.m6165a(sQLiteDatabase, edo.f11244a, edo.f11245b, null, null, null);
            } else {
                i = -1;
            }
            if (i >= 0) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append('|');
                }
                stringBuilder.append(i);
            }
        }
        if (stringBuilder.length() > 0) {
            return stringBuilder.toString();
        }
        return null;
    }

    private String m6168a(SQLiteDatabase sQLiteDatabase, edo edo, Map<String, Object> map) {
        Object obj = map.get("participant_ids");
        Object obj2 = map.get("participants");
        Object obj3 = map.get("1on1_participant_first_name");
        if (obj == null || obj2 == null || !(obj instanceof List) || !(obj2 instanceof gkq)) {
            return null;
        }
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        List list = (List) obj;
        gkq gkq = (gkq) obj2;
        for (Object obj4 : list) {
            if (obj4 instanceof edo) {
                edo edo2 = (edo) obj4;
                Object obj5 = gkq.get(edo2);
                if (obj5 != null && (obj5 instanceof String)) {
                    int a = bmr.m6165a(sQLiteDatabase, edo2.f11244a, edo2.f11245b, null, null, (String) obj5);
                    if (a >= 0) {
                        if (stringBuilder2.length() > 0) {
                            stringBuilder2.append('|');
                        }
                        stringBuilder2.append(a);
                    }
                }
            }
        }
        if (edo != null && obj3 != null && (obj3 instanceof String) && list.size() == 1) {
            obj4 = list.get(0);
            if ((obj4 instanceof edo) && edo.m13608a((edo) obj4)) {
                int a2 = bmr.m6165a(sQLiteDatabase, null, null, null, null, (String) obj3);
                if (a2 >= 0) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(a2);
                    if (stringBuilder.length() <= 0) {
                        return stringBuilder.toString();
                    }
                    return null;
                }
            }
        }
        stringBuilder = stringBuilder2;
        if (stringBuilder.length() <= 0) {
            return null;
        }
        return stringBuilder.toString();
    }

    private void m6180d(android.database.sqlite.SQLiteDatabase r17) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r16 = this;
        r1 = 2;
        r3 = new java.lang.String[r1];
        r1 = 0;
        r2 = "conversation_id";
        r3[r1] = r2;
        r1 = 1;
        r2 = "participant_keys";
        r3[r1] = r2;
        r9 = 0;
        r2 = "messages";	 Catch:{ all -> 0x0133 }
        r4 = "participant_keys IS NOT NULL";	 Catch:{ all -> 0x0133 }
        r5 = 0;	 Catch:{ all -> 0x0133 }
        r6 = 0;	 Catch:{ all -> 0x0133 }
        r7 = 0;	 Catch:{ all -> 0x0133 }
        r8 = 0;	 Catch:{ all -> 0x0133 }
        r1 = r17;	 Catch:{ all -> 0x0133 }
        r11 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0133 }
    L_0x001c:
        r1 = r11.moveToNext();	 Catch:{ all -> 0x010d }
        if (r1 == 0) goto L_0x012d;	 Catch:{ all -> 0x010d }
    L_0x0022:
        r1 = 0;	 Catch:{ all -> 0x010d }
        r14 = r11.getString(r1);	 Catch:{ all -> 0x010d }
        r1 = 1;	 Catch:{ all -> 0x010d }
        r1 = r11.getString(r1);	 Catch:{ all -> 0x010d }
        r2 = new android.text.TextUtils$SimpleStringSplitter;	 Catch:{ all -> 0x010d }
        r3 = 124; // 0x7c float:1.74E-43 double:6.13E-322;	 Catch:{ all -> 0x010d }
        r2.<init>(r3);	 Catch:{ all -> 0x010d }
        r2.setString(r1);	 Catch:{ all -> 0x010d }
        r15 = r2.iterator();	 Catch:{ all -> 0x010d }
    L_0x003a:
        r1 = r15.hasNext();	 Catch:{ all -> 0x010d }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x010d }
    L_0x0040:
        r1 = r15.next();	 Catch:{ all -> 0x010d }
        r0 = r1;	 Catch:{ all -> 0x010d }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x010d }
        r9 = r0;	 Catch:{ all -> 0x010d }
        r12 = 0;
        r10 = 0;
        r2 = "participants";	 Catch:{ all -> 0x0115 }
        r3 = f3987f;	 Catch:{ all -> 0x0115 }
        r4 = "_id=?";	 Catch:{ all -> 0x0115 }
        r1 = 1;	 Catch:{ all -> 0x0115 }
        r5 = new java.lang.String[r1];	 Catch:{ all -> 0x0115 }
        r1 = 0;	 Catch:{ all -> 0x0115 }
        r5[r1] = r9;	 Catch:{ all -> 0x0115 }
        r6 = 0;	 Catch:{ all -> 0x0115 }
        r7 = 0;	 Catch:{ all -> 0x0115 }
        r8 = 0;	 Catch:{ all -> 0x0115 }
        r1 = r17;	 Catch:{ all -> 0x0115 }
        r2 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0115 }
        r1 = r2.moveToFirst();	 Catch:{ all -> 0x013a }
        if (r1 == 0) goto L_0x0141;	 Catch:{ all -> 0x013a }
    L_0x0065:
        r1 = 0;	 Catch:{ all -> 0x013a }
        r1 = r2.getString(r1);	 Catch:{ all -> 0x013a }
        if (r1 == 0) goto L_0x0141;
    L_0x006c:
        r1 = 1;
        r13 = r1;
    L_0x006e:
        if (r2 == 0) goto L_0x0073;
    L_0x0070:
        r2.close();	 Catch:{ all -> 0x010d }
    L_0x0073:
        r12 = 0;
        r10 = 0;
        r2 = "conversation_participants";	 Catch:{ all -> 0x011d }
        r1 = 1;	 Catch:{ all -> 0x011d }
        r3 = new java.lang.String[r1];	 Catch:{ all -> 0x011d }
        r1 = 0;	 Catch:{ all -> 0x011d }
        r4 = "_id";	 Catch:{ all -> 0x011d }
        r3[r1] = r4;	 Catch:{ all -> 0x011d }
        r4 = "participant_row_id=? AND conversation_id=?";	 Catch:{ all -> 0x011d }
        r1 = 2;	 Catch:{ all -> 0x011d }
        r5 = new java.lang.String[r1];	 Catch:{ all -> 0x011d }
        r1 = 0;	 Catch:{ all -> 0x011d }
        r5[r1] = r9;	 Catch:{ all -> 0x011d }
        r1 = 1;	 Catch:{ all -> 0x011d }
        r5[r1] = r14;	 Catch:{ all -> 0x011d }
        r6 = 0;	 Catch:{ all -> 0x011d }
        r7 = 0;	 Catch:{ all -> 0x011d }
        r8 = 0;	 Catch:{ all -> 0x011d }
        r1 = r17;	 Catch:{ all -> 0x011d }
        r2 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x011d }
        r1 = r2.moveToFirst();	 Catch:{ all -> 0x0138 }
        if (r1 == 0) goto L_0x013e;
    L_0x0099:
        r1 = 1;
    L_0x009a:
        if (r2 == 0) goto L_0x009f;
    L_0x009c:
        r2.close();	 Catch:{ all -> 0x010d }
    L_0x009f:
        if (r1 != 0) goto L_0x003a;
    L_0x00a1:
        r10 = 0;
        r12 = 0;
        r2 = "conversation_participants";	 Catch:{ all -> 0x0125 }
        r1 = 1;	 Catch:{ all -> 0x0125 }
        r3 = new java.lang.String[r1];	 Catch:{ all -> 0x0125 }
        r1 = 0;	 Catch:{ all -> 0x0125 }
        r4 = "MAX(sequence)";	 Catch:{ all -> 0x0125 }
        r3[r1] = r4;	 Catch:{ all -> 0x0125 }
        r4 = "conversation_id=?";	 Catch:{ all -> 0x0125 }
        r1 = 1;	 Catch:{ all -> 0x0125 }
        r5 = new java.lang.String[r1];	 Catch:{ all -> 0x0125 }
        r1 = 0;	 Catch:{ all -> 0x0125 }
        r5[r1] = r14;	 Catch:{ all -> 0x0125 }
        r6 = 0;	 Catch:{ all -> 0x0125 }
        r7 = 0;	 Catch:{ all -> 0x0125 }
        r8 = 0;	 Catch:{ all -> 0x0125 }
        r1 = r17;	 Catch:{ all -> 0x0125 }
        r2 = r1.query(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0125 }
        r1 = r2.moveToFirst();	 Catch:{ all -> 0x0136 }
        if (r1 == 0) goto L_0x013c;	 Catch:{ all -> 0x0136 }
    L_0x00c4:
        r1 = 0;	 Catch:{ all -> 0x0136 }
        r1 = r2.getInt(r1);	 Catch:{ all -> 0x0136 }
    L_0x00c9:
        if (r2 == 0) goto L_0x00ce;
    L_0x00cb:
        r2.close();	 Catch:{ all -> 0x010d }
    L_0x00ce:
        r2 = new android.content.ContentValues;	 Catch:{ all -> 0x010d }
        r2.<init>();	 Catch:{ all -> 0x010d }
        r3 = "conversation_id";	 Catch:{ all -> 0x010d }
        r2.put(r3, r14);	 Catch:{ all -> 0x010d }
        if (r13 == 0) goto L_0x00e9;	 Catch:{ all -> 0x010d }
    L_0x00da:
        r3 = "participant_type";	 Catch:{ all -> 0x010d }
        r4 = p000.edq.CIRCLE;	 Catch:{ all -> 0x010d }
        r4 = r4.ordinal();	 Catch:{ all -> 0x010d }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x010d }
        r2.put(r3, r4);	 Catch:{ all -> 0x010d }
    L_0x00e9:
        r3 = "participant_row_id";	 Catch:{ all -> 0x010d }
        r2.put(r3, r9);	 Catch:{ all -> 0x010d }
        r3 = "sequence";	 Catch:{ all -> 0x010d }
        r1 = r1 + 1;	 Catch:{ all -> 0x010d }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x010d }
        r2.put(r3, r1);	 Catch:{ all -> 0x010d }
        r1 = "active";	 Catch:{ all -> 0x010d }
        r3 = 0;	 Catch:{ all -> 0x010d }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x010d }
        r2.put(r1, r3);	 Catch:{ all -> 0x010d }
        r1 = "conversation_participants";	 Catch:{ all -> 0x010d }
        r3 = 0;	 Catch:{ all -> 0x010d }
        r0 = r17;	 Catch:{ all -> 0x010d }
        r0.insert(r1, r3, r2);	 Catch:{ all -> 0x010d }
        goto L_0x003a;
    L_0x010d:
        r1 = move-exception;
        r2 = r11;
    L_0x010f:
        if (r2 == 0) goto L_0x0114;
    L_0x0111:
        r2.close();
    L_0x0114:
        throw r1;
    L_0x0115:
        r1 = move-exception;
        r2 = r10;
    L_0x0117:
        if (r2 == 0) goto L_0x011c;
    L_0x0119:
        r2.close();	 Catch:{ all -> 0x010d }
    L_0x011c:
        throw r1;	 Catch:{ all -> 0x010d }
    L_0x011d:
        r1 = move-exception;	 Catch:{ all -> 0x010d }
        r2 = r10;	 Catch:{ all -> 0x010d }
    L_0x011f:
        if (r2 == 0) goto L_0x0124;	 Catch:{ all -> 0x010d }
    L_0x0121:
        r2.close();	 Catch:{ all -> 0x010d }
    L_0x0124:
        throw r1;	 Catch:{ all -> 0x010d }
    L_0x0125:
        r1 = move-exception;	 Catch:{ all -> 0x010d }
        r2 = r10;	 Catch:{ all -> 0x010d }
    L_0x0127:
        if (r2 == 0) goto L_0x012c;	 Catch:{ all -> 0x010d }
    L_0x0129:
        r2.close();	 Catch:{ all -> 0x010d }
    L_0x012c:
        throw r1;	 Catch:{ all -> 0x010d }
    L_0x012d:
        if (r11 == 0) goto L_0x0132;
    L_0x012f:
        r11.close();
    L_0x0132:
        return;
    L_0x0133:
        r1 = move-exception;
        r2 = r9;
        goto L_0x010f;
    L_0x0136:
        r1 = move-exception;
        goto L_0x0127;
    L_0x0138:
        r1 = move-exception;
        goto L_0x011f;
    L_0x013a:
        r1 = move-exception;
        goto L_0x0117;
    L_0x013c:
        r1 = r12;
        goto L_0x00c9;
    L_0x013e:
        r1 = r12;
        goto L_0x009a;
    L_0x0141:
        r13 = r12;
        goto L_0x006e;
        */
        throw new UnsupportedOperationException("Method not decompiled: bmr.d(android.database.sqlite.SQLiteDatabase):void");
    }

    private void m6181e(SQLiteDatabase sQLiteDatabase) {
        blo blo = new blo(this.f3988b, new bmv(this.f3988b, sQLiteDatabase), this.f3990h);
        ArrayList k = blo.m6075k();
        int size = k.size();
        int i = 0;
        while (i < size) {
            Object obj = k.get(i);
            i++;
            String str = (String) obj;
            if (blo.m6065h(str)) {
                blo.m6077k(str, -2147483648L);
            } else {
                blo.m6035c(str, 0);
            }
        }
    }

    private static void m6182f(SQLiteDatabase sQLiteDatabase) {
        int i = 0;
        for (String str : EsProvider.m8276c()) {
            sQLiteDatabase.execSQL(new StringBuilder(String.valueOf(str).length() + 21).append("drop view if exists ").append(str).append(";").toString());
        }
        for (String str2 : dwz.m8738d()) {
            sQLiteDatabase.execSQL(new StringBuilder(String.valueOf(str2).length() + 21).append("drop view if exists ").append(str2).append(";").toString());
        }
        for (String str22 : EsProvider.m8278d()) {
            sQLiteDatabase.execSQL(str22);
        }
        String[] c = dwz.m8737c();
        int length = c.length;
        while (i < length) {
            sQLiteDatabase.execSQL(c[i]);
            i++;
        }
    }

    private static void m6184h(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", f3984c, "type='view'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                String string;
                String valueOf;
                try {
                    string = query.getString(0);
                    String valueOf2 = String.valueOf("DROP VIEW IF EXISTS ");
                    valueOf = String.valueOf(string);
                    sQLiteDatabase.execSQL(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                } catch (SQLException e) {
                    if (glk.m17973a("Babel", 3)) {
                        valueOf = String.valueOf(e);
                        glk.m17970a("Babel", new StringBuilder((String.valueOf(string).length() + 21) + String.valueOf(valueOf).length()).append("unable to drop view ").append(string).append(" ").append(valueOf).toString(), new Object[0]);
                    }
                } catch (Throwable th) {
                    query.close();
                }
            }
            query.close();
        }
    }

    private static void m6185i(SQLiteDatabase sQLiteDatabase) {
        String string;
        String valueOf;
        Cursor query = sQLiteDatabase.query("sqlite_master", f3984c, "type='index'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    string = query.getString(0);
                    String valueOf2 = String.valueOf("DROP INDEX IF EXISTS ");
                    valueOf = String.valueOf(string);
                    sQLiteDatabase.execSQL(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                } catch (SQLException e) {
                    if (glk.m17973a("Babel", 3)) {
                        valueOf = String.valueOf(e);
                        glk.m17970a("Babel", new StringBuilder((String.valueOf(string).length() + 22) + String.valueOf(valueOf).length()).append("unable to drop index ").append(string).append(" ").append(valueOf).toString(), new Object[0]);
                    }
                } catch (Throwable th) {
                    query.close();
                }
            }
            query.close();
        }
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase;
        if (this.f3989g) {
            throw new SQLiteException("Database deleted");
        }
        try {
            readableDatabase = super.getReadableDatabase();
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e);
            glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 56).append("[EsDatabaseHelper] getWritableDatabase threw exception: ").append(valueOf).toString(), new Object[0]);
            if (e instanceof SQLiteCantOpenDatabaseException) {
                this.f3988b.deleteDatabase(this.f3991i);
                readableDatabase = super.getReadableDatabase();
            } else {
                throw e;
            }
        }
        return readableDatabase;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        if (this.f3989g) {
            throw new SQLiteException("Database deleted");
        }
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e);
            glk.m17981d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 56).append("[EsDatabaseHelper] getWritableDatabase threw exception: ").append(valueOf).toString(), new Object[0]);
            if (e instanceof SQLiteCantOpenDatabaseException) {
                this.f3988b.deleteDatabase(this.f3991i);
                writableDatabase = super.getWritableDatabase();
            } else {
                throw e;
            }
        }
        return writableDatabase;
    }

    public synchronized bmv m6186a() {
        return bmv.m6189a(this.f3988b, getReadableDatabase());
    }

    public synchronized bmv m6187b() {
        return bmv.m6189a(this.f3988b, getWritableDatabase());
    }

    public void m6188c() {
        this.f3989g = false;
    }

    public String toString() {
        int i = this.f3990h;
        String str = this.f3991i;
        return new StringBuilder(String.valueOf(str).length() + 25).append("index: ").append(i).append(" name: ").append(str).toString();
    }

    private iie m6179d() {
        return ((iih) jyn.m25426a(this.f3988b, iih.class)).mo1979a(fde.m15011c(this.f3988b)).mo1693b();
    }

    private static mco m6172a(int i, int i2) {
        mco mco = new mco();
        mco.f27344a = Integer.valueOf(i);
        mco.f27345b = Integer.valueOf(i2);
        return mco;
    }

    private void m6183g(SQLiteDatabase sQLiteDatabase) {
        int i = 0;
        Object obj = 1;
        while (obj != null) {
            int i2 = i + 1;
            if (i >= 5) {
                break;
            }
            Cursor query = sQLiteDatabase.query("sqlite_master", f3984c, "type='table'", null, null, null, null);
            if (query != null) {
                obj = null;
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    if (!(string.startsWith("android_") || string.startsWith("sqlite_"))) {
                        String valueOf;
                        try {
                            String valueOf2 = String.valueOf("DROP TABLE IF EXISTS ");
                            valueOf = String.valueOf(string);
                            sQLiteDatabase.execSQL(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                            obj = 1;
                        } catch (SQLException e) {
                            valueOf = String.valueOf(e);
                            glk.m17970a("Babel", new StringBuilder((String.valueOf(string).length() + 22) + String.valueOf(valueOf).length()).append("unable to drop table ").append(string).append(" ").append(valueOf).toString(), new Object[0]);
                        } catch (Throwable th) {
                            query.close();
                        }
                    }
                }
                query.close();
                i = i2;
            } else {
                i = i2;
                obj = null;
            }
        }
        bmr.m6184h(sQLiteDatabase);
        bmr.m6185i(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }
}
