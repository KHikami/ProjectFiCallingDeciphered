package defpackage;

import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.hangouts.content.EsProvider;
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
    static final boolean a = false;
    private static final String[] c = new String[]{"name"};
    private static final Map<Integer, bmr> d = new ky();
    private static final String[] e = new String[]{"_id"};
    private static final String[] f = new String[]{"circle_id"};
    public final Context b;
    private boolean g;
    private final int h;
    private final String i;

    static {
        kae kae = glk.d;
    }

    public static bmr a(Context context, int i) {
        gwb.aK();
        try {
            bmr bmr;
            jch a = ((jcf) jyn.a(context, jcf.class)).a(i);
            synchronized (d) {
                bmr = (bmr) d.get(Integer.valueOf(i));
                if (bmr == null) {
                    if (a.c("sms_only") || a.a()) {
                        bmr = new bmr(context, i);
                        d.put(Integer.valueOf(i), bmr);
                    } else {
                        String valueOf = String.valueOf(glk.b(a.b("account_name")));
                        glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 22).append("Account ").append(valueOf).append(" not logged in").toString(), new Object[0]);
                        throw new bmu();
                    }
                }
            }
            return bmr;
        } catch (Throwable e) {
            throw new bmu(e);
        }
    }

    public static void b(Context context, int i) {
        jcf jcf = (jcf) jyn.a(context, jcf.class);
        try {
            boolean z;
            jch a = jcf.a(i);
            String str = "Babel";
            boolean c = jcf.c(i);
            boolean a2 = a.a();
            String str2 = " Plus page: ";
            String valueOf = String.valueOf(a.b("effective_gaia_id"));
            glk.c(str, "Valid account: " + c + " Logged in: " + a2 + ((valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)) != null), new Object[0]);
            if (jcf.c(i) && a.a() && a.b("effective_gaia_id") == null) {
                z = false;
            } else {
                z = true;
            }
            ba.b(z);
        } catch (jcj e) {
        }
        String valueOf2 = String.valueOf("babel");
        String valueOf3 = String.valueOf(".db");
        glk.c("Babel", "deleted: " + context.deleteDatabase(new StringBuilder((String.valueOf(valueOf2).length() + 11) + String.valueOf(valueOf3).length()).append(valueOf2).append(i).append(valueOf3).toString()) + " for " + i, new Object[0]);
        synchronized (d) {
            d.remove(Integer.valueOf(i));
        }
    }

    private bmr(Context context, int i) {
        String valueOf = String.valueOf("babel");
        String valueOf2 = String.valueOf(".db");
        super(context, new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append(i).append(valueOf2).toString(), null, 1310);
        this.b = context;
        this.h = i;
        valueOf = String.valueOf("babel");
        valueOf2 = String.valueOf(".db");
        this.i = new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append(i).append(valueOf2).toString();
        setWriteAheadLoggingEnabled(false);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = 0;
        for (String execSQL : EsProvider.a()) {
            sQLiteDatabase.execSQL(execSQL);
        }
        for (String execSQL2 : dwz.b()) {
            sQLiteDatabase.execSQL(execSQL2);
        }
        for (String execSQL22 : EsProvider.b()) {
            sQLiteDatabase.execSQL(execSQL22);
        }
        for (String execSQL222 : EsProvider.d()) {
            sQLiteDatabase.execSQL(execSQL222);
        }
        for (String execSQL2222 : dwz.c()) {
            sQLiteDatabase.execSQL(execSQL2222);
        }
        String[] e = EsProvider.e();
        int length = e.length;
        while (i < length) {
            sQLiteDatabase.execSQL(e[i]);
            i++;
        }
        gwb.a(new bms(this));
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        mco a = bmr.a(i, i2);
        glk.e("Babel", "Downgrading from:" + i + " to:" + i2, new Object[0]);
        d().a(a).c(3411);
        g(sQLiteDatabase);
        d().a(a).c(3412);
        if (VERSION.SDK_INT >= 19) {
            ActivityManager activityManager = (ActivityManager) this.b.getSystemService("activity");
            glk.e("Babel", "Clearing app data, service will be restarted!", new Object[0]);
            activityManager.clearApplicationUserData();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r12, int r13, int r14) {
        /*
        r11 = this;
        r10 = 52;
        r9 = 3;
        r6 = 2;
        r3 = 1;
        r2 = 0;
        r4 = defpackage.bmr.a(r13, r14);
        r0 = r11.b;
        r5 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0);
        r0 = "last_database_upgrade_failure_state";
        r0 = r5.contains(r0);
        if (r0 == 0) goto L_0x0074;
    L_0x0018:
        r0 = "last_database_upgrade_failure_state";
        r1 = "";
        r0 = r5.getString(r0, r1);	 Catch:{ Exception -> 0x00fd }
        if (r0 == 0) goto L_0x0067;
    L_0x0022:
        r1 = r0.trim();	 Catch:{ Exception -> 0x00fd }
        r1 = r1.isEmpty();	 Catch:{ Exception -> 0x00fd }
        if (r1 != 0) goto L_0x0067;
    L_0x002c:
        r1 = "#";
        r0 = r0.split(r1);	 Catch:{ Exception -> 0x00fd }
        r1 = r0.length;	 Catch:{ Exception -> 0x00fd }
        if (r1 != r6) goto L_0x0067;
    L_0x0035:
        r1 = 0;
        r1 = r0[r1];	 Catch:{ Exception -> 0x00fd }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x00fd }
        r6 = 1;
        r0 = r0[r6];	 Catch:{ Exception -> 0x00fd }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x00fd }
        r0 = defpackage.bmr.a(r1, r0);	 Catch:{ Exception -> 0x00fd }
        r1 = "Babel";
        r6 = 3;
        r1 = defpackage.glk.a(r1, r6);	 Catch:{ Exception -> 0x00fd }
        if (r1 == 0) goto L_0x005a;
    L_0x0050:
        r1 = "Babel";
        r6 = "Database upgrade failed in the last attempt.";
        r7 = 0;
        r7 = new java.lang.Object[r7];	 Catch:{ Exception -> 0x00fd }
        defpackage.glk.a(r1, r6, r7);	 Catch:{ Exception -> 0x00fd }
    L_0x005a:
        r1 = r11.d();	 Catch:{ Exception -> 0x00fd }
        r0 = r1.a(r0);	 Catch:{ Exception -> 0x00fd }
        r1 = 3410; // 0xd52 float:4.778E-42 double:1.685E-320;
        r0.c(r1);	 Catch:{ Exception -> 0x00fd }
    L_0x0067:
        r0 = r5.edit();
        r1 = "last_database_upgrade_failure_state";
        r0 = r0.remove(r1);
        r0.commit();
    L_0x0074:
        r0 = r11.d();
        r0 = r0.a(r4);
        r1 = 3407; // 0xd4f float:4.774E-42 double:1.6833E-320;
        r0.c(r1);
        r0 = "Babel";
        r0 = defpackage.glk.a(r0, r9);
        if (r0 == 0) goto L_0x00af;
    L_0x0089:
        r0 = "Babel";
        r1 = new java.lang.StringBuilder;
        r6 = 45;
        r1.<init>(r6);
        r6 = "Upgrade database: ";
        r1 = r1.append(r6);
        r1 = r1.append(r13);
        r6 = " --> ";
        r1 = r1.append(r6);
        r1 = r1.append(r14);
        r1 = r1.toString();
        r6 = new java.lang.Object[r2];
        defpackage.glk.a(r0, r1, r6);
    L_0x00af:
        r0 = 242; // 0xf2 float:3.39E-43 double:1.196E-321;
        r1 = "hammerhead";
        r6 = android.os.Build.HARDWARE;
        r1 = r1.equals(r6);
        if (r1 == 0) goto L_0x00bd;
    L_0x00bb:
        r0 = 234; // 0xea float:3.28E-43 double:1.156E-321;
    L_0x00bd:
        r1 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        if (r13 < r1) goto L_0x00d7;
    L_0x00c1:
        r1 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        if (r13 <= r1) goto L_0x00c7;
    L_0x00c5:
        if (r13 < r0) goto L_0x00d7;
    L_0x00c7:
        r0 = 219; // 0xdb float:3.07E-43 double:1.08E-321;
        if (r13 <= r0) goto L_0x00cf;
    L_0x00cb:
        r0 = 225; // 0xe1 float:3.15E-43 double:1.11E-321;
        if (r13 < r0) goto L_0x00d7;
    L_0x00cf:
        r0 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        if (r13 <= r0) goto L_0x013f;
    L_0x00d3:
        r0 = 430; // 0x1ae float:6.03E-43 double:2.124E-321;
        if (r13 >= r0) goto L_0x013f;
    L_0x00d7:
        r0 = "Babel";
        r1 = new java.lang.StringBuilder;
        r3 = 50;
        r1.<init>(r3);
        r3 = "upgrade from ";
        r1 = r1.append(r3);
        r1 = r1.append(r13);
        r3 = " not supported; recreating";
        r1 = r1.append(r3);
        r1 = r1.toString();
        r2 = new java.lang.Object[r2];
        defpackage.glk.d(r0, r1, r2);
        r11.g(r12);
    L_0x00fc:
        return;
    L_0x00fd:
        r0 = move-exception;
        r6 = "Babel";
        r1 = "Unable to read shared preference for key: last_database_upgrade_failure_state. ";
        r7 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0130 }
        r1 = r0.getMessage();	 Catch:{ all -> 0x0130 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0130 }
        r8 = r1.length();	 Catch:{ all -> 0x0130 }
        if (r8 == 0) goto L_0x012a;
    L_0x0114:
        r1 = r7.concat(r1);	 Catch:{ all -> 0x0130 }
    L_0x0118:
        defpackage.glk.d(r6, r1, r0);	 Catch:{ all -> 0x0130 }
        r0 = r5.edit();
        r1 = "last_database_upgrade_failure_state";
        r0 = r0.remove(r1);
        r0.commit();
        goto L_0x0074;
    L_0x012a:
        r1 = new java.lang.String;	 Catch:{ all -> 0x0130 }
        r1.<init>(r7);	 Catch:{ all -> 0x0130 }
        goto L_0x0118;
    L_0x0130:
        r0 = move-exception;
        r1 = r5.edit();
        r2 = "last_database_upgrade_failure_state";
        r1 = r1.remove(r2);
        r1.commit();
        throw r0;
    L_0x013f:
        switch(r13) {
            case 138: goto L_0x0211;
            case 200: goto L_0x0294;
            case 203: goto L_0x0294;
            case 204: goto L_0x0299;
            case 205: goto L_0x0299;
            case 206: goto L_0x0299;
            case 207: goto L_0x0299;
            case 208: goto L_0x029e;
            case 209: goto L_0x029e;
            case 210: goto L_0x02ad;
            case 211: goto L_0x02bc;
            case 212: goto L_0x02bc;
            case 213: goto L_0x02bc;
            case 214: goto L_0x02bc;
            case 215: goto L_0x02bc;
            case 216: goto L_0x02c1;
            case 217: goto L_0x02c6;
            case 218: goto L_0x02cb;
            case 220: goto L_0x02d0;
            case 222: goto L_0x02d0;
            case 223: goto L_0x02d5;
            case 224: goto L_0x02ee;
            case 225: goto L_0x02ee;
            case 227: goto L_0x02f8;
            case 228: goto L_0x02fd;
            case 229: goto L_0x0302;
            case 230: goto L_0x0302;
            case 232: goto L_0x0302;
            case 233: goto L_0x0302;
            case 234: goto L_0x0302;
            case 235: goto L_0x030c;
            case 236: goto L_0x030c;
            case 237: goto L_0x032f;
            case 238: goto L_0x032f;
            case 239: goto L_0x0334;
            case 240: goto L_0x0339;
            case 241: goto L_0x0339;
            case 242: goto L_0x0339;
            case 271: goto L_0x0348;
            case 400: goto L_0x035c;
            case 401: goto L_0x035c;
            case 402: goto L_0x0361;
            case 403: goto L_0x039d;
            case 404: goto L_0x03a7;
            case 405: goto L_0x03ac;
            case 406: goto L_0x03ac;
            case 407: goto L_0x03d4;
            case 408: goto L_0x03d4;
            case 409: goto L_0x03f0;
            case 410: goto L_0x03f0;
            case 411: goto L_0x03f0;
            case 412: goto L_0x03f0;
            case 413: goto L_0x040e;
            case 414: goto L_0x0418;
            case 415: goto L_0x0424;
            case 416: goto L_0x0424;
            case 417: goto L_0x0424;
            case 418: goto L_0x0427;
            case 419: goto L_0x0431;
            case 420: goto L_0x0431;
            case 422: goto L_0x043b;
            case 423: goto L_0x043b;
            case 424: goto L_0x043b;
            case 425: goto L_0x043b;
            case 426: goto L_0x044a;
            case 427: goto L_0x044a;
            case 428: goto L_0x044a;
            case 429: goto L_0x044a;
            case 430: goto L_0x044f;
            case 431: goto L_0x044f;
            case 432: goto L_0x044f;
            case 433: goto L_0x044f;
            case 434: goto L_0x044f;
            case 435: goto L_0x044f;
            case 436: goto L_0x0456;
            case 437: goto L_0x0456;
            case 438: goto L_0x045b;
            case 439: goto L_0x0487;
            case 440: goto L_0x0487;
            case 450: goto L_0x0487;
            case 460: goto L_0x0487;
            case 470: goto L_0x0487;
            case 480: goto L_0x0487;
            case 490: goto L_0x0487;
            case 500: goto L_0x04a5;
            case 510: goto L_0x04a5;
            case 520: goto L_0x04aa;
            case 530: goto L_0x04b9;
            case 540: goto L_0x04be;
            case 541: goto L_0x04d7;
            case 550: goto L_0x04e1;
            case 560: goto L_0x04e1;
            case 570: goto L_0x04eb;
            case 580: goto L_0x04f0;
            case 590: goto L_0x04fa;
            case 600: goto L_0x0518;
            case 610: goto L_0x0518;
            case 620: goto L_0x051d;
            case 630: goto L_0x0536;
            case 640: goto L_0x0536;
            case 650: goto L_0x0536;
            case 770: goto L_0x0536;
            case 780: goto L_0x055d;
            case 790: goto L_0x0560;
            case 800: goto L_0x0565;
            case 810: goto L_0x056f;
            case 820: goto L_0x0579;
            case 830: goto L_0x057e;
            case 840: goto L_0x0583;
            case 850: goto L_0x0588;
            case 860: goto L_0x0592;
            case 870: goto L_0x0597;
            case 880: goto L_0x0597;
            case 890: goto L_0x059c;
            case 900: goto L_0x05a8;
            case 910: goto L_0x05b2;
            case 920: goto L_0x05b2;
            case 930: goto L_0x0644;
            case 940: goto L_0x0649;
            case 950: goto L_0x064e;
            case 960: goto L_0x064e;
            case 970: goto L_0x0651;
            case 980: goto L_0x0656;
            case 990: goto L_0x0665;
            case 1000: goto L_0x0665;
            case 1010: goto L_0x0665;
            case 1020: goto L_0x0665;
            case 1030: goto L_0x067f;
            case 1040: goto L_0x0684;
            case 1050: goto L_0x0693;
            case 1060: goto L_0x0693;
            case 1070: goto L_0x0698;
            case 1080: goto L_0x06a2;
            case 1090: goto L_0x06a7;
            case 1100: goto L_0x06ac;
            case 1110: goto L_0x06b1;
            case 1120: goto L_0x06b6;
            case 1130: goto L_0x06d4;
            case 1140: goto L_0x06d9;
            case 1150: goto L_0x06ed;
            case 1160: goto L_0x06ed;
            case 1170: goto L_0x06f7;
            case 1180: goto L_0x0701;
            case 1190: goto L_0x0701;
            case 1200: goto L_0x073d;
            case 1210: goto L_0x0742;
            case 1220: goto L_0x0747;
            case 1230: goto L_0x074c;
            case 1240: goto L_0x0751;
            case 1250: goto L_0x0765;
            case 1260: goto L_0x076f;
            case 1270: goto L_0x0774;
            case 1280: goto L_0x0777;
            case 1290: goto L_0x077c;
            case 1300: goto L_0x0781;
            case 1310: goto L_0x0786;
            case 2147483647: goto L_0x0786;
            default: goto L_0x0142;
        };
    L_0x0142:
        r0 = new java.lang.IllegalStateException;	 Catch:{ Throwable -> 0x0167 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0167 }
        r6 = 52;
        r1.<init>(r6);	 Catch:{ Throwable -> 0x0167 }
        r6 = "Must support upgrade from ";
        r1 = r1.append(r6);	 Catch:{ Throwable -> 0x0167 }
        r1 = r1.append(r13);	 Catch:{ Throwable -> 0x0167 }
        r6 = " to ";
        r1 = r1.append(r6);	 Catch:{ Throwable -> 0x0167 }
        r1 = r1.append(r14);	 Catch:{ Throwable -> 0x0167 }
        r1 = r1.toString();	 Catch:{ Throwable -> 0x0167 }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0167 }
        throw r0;	 Catch:{ Throwable -> 0x0167 }
    L_0x0167:
        r0 = move-exception;
        r1 = r0;
        r0 = "Babel";
        r6 = r1.getMessage();	 Catch:{ all -> 0x0202 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0202 }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0202 }
        r8 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0202 }
        r8 = r8.length();	 Catch:{ all -> 0x0202 }
        r8 = r8 + 53;
        r7.<init>(r8);	 Catch:{ all -> 0x0202 }
        r8 = "Upgrade database failed: ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x0202 }
        r7 = r7.append(r13);	 Catch:{ all -> 0x0202 }
        r8 = " --> ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x0202 }
        r7 = r7.append(r14);	 Catch:{ all -> 0x0202 }
        r8 = " ";
        r7 = r7.append(r8);	 Catch:{ all -> 0x0202 }
        r6 = r7.append(r6);	 Catch:{ all -> 0x0202 }
        r6 = r6.toString();	 Catch:{ all -> 0x0202 }
        defpackage.glk.d(r0, r6, r1);	 Catch:{ all -> 0x0202 }
        r0 = r11.b;	 Catch:{ all -> 0x0202 }
        r6 = defpackage.gmp.class;
        r0 = defpackage.jyn.a(r0, r6);	 Catch:{ all -> 0x0202 }
        r0 = (defpackage.gmp) r0;	 Catch:{ all -> 0x0202 }
        r0 = r0.a();	 Catch:{ all -> 0x0202 }
        if (r0 == 0) goto L_0x07e6;
    L_0x01b7:
        if (r3 == 0) goto L_0x07f2;
    L_0x01b9:
        r0 = "#";
        r2 = 2;
        r2 = new java.lang.Integer[r2];	 Catch:{ all -> 0x0202 }
        r3 = 0;
        r4 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0202 }
        r2[r3] = r4;	 Catch:{ all -> 0x0202 }
        r3 = 1;
        r4 = java.lang.Integer.valueOf(r14);	 Catch:{ all -> 0x0202 }
        r2[r3] = r4;	 Catch:{ all -> 0x0202 }
        r0 = android.text.TextUtils.join(r0, r2);	 Catch:{ all -> 0x0202 }
        r2 = r5.edit();	 Catch:{ all -> 0x0202 }
        r3 = "last_database_upgrade_failure_state";
        r0 = r2.putString(r3, r0);	 Catch:{ all -> 0x0202 }
        r0.commit();	 Catch:{ all -> 0x0202 }
        r0 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0202 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0202 }
        r3 = 49;
        r2.<init>(r3);	 Catch:{ all -> 0x0202 }
        r3 = "Unable to upgrade from ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0202 }
        r2 = r2.append(r13);	 Catch:{ all -> 0x0202 }
        r3 = " to ";
        r2 = r2.append(r3);	 Catch:{ all -> 0x0202 }
        r2 = r2.append(r14);	 Catch:{ all -> 0x0202 }
        r2 = r2.toString();	 Catch:{ all -> 0x0202 }
        r0.<init>(r2, r1);	 Catch:{ all -> 0x0202 }
        throw r0;	 Catch:{ all -> 0x0202 }
    L_0x0202:
        r0 = move-exception;
        r1 = r5.edit();
        r2 = "last_database_upgrade_version";
        r1 = r1.putInt(r2, r14);
        r1.commit();
        throw r0;
    L_0x0211:
        r0 = "PRAGMA foreign_keys=OFF;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "ALTER TABLE messages ADD COLUMN attachment_content_type TEXT";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table participants rename to temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = com.google.android.apps.hangouts.content.EsProvider.b;	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "insert into participants(_id, participant_type, gaia_id, chat_id, circle_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked) select _id, participant_type, gaia_id, chat_id, circle_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked from temp;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop table temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_participants_chat_id ON participants(chat_id)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "PRAGMA foreign_keys=ON;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "update conversations set otr_status = otr_status + 1;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = 2;
        r0 = new java.lang.String[r0];	 Catch:{ Throwable -> 0x0167 }
        r1 = 0;
        r6 = "_id";
        r0[r1] = r6;	 Catch:{ Throwable -> 0x0167 }
        r1 = 1;
        r6 = "text";
        r0[r1] = r6;	 Catch:{ Throwable -> 0x0167 }
        r1 = "messages";
        r6 = "type=";
        r6 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0167 }
        r7 = defpackage.fwy.MEMBERSHIP_CHANGE_DEPRECATED;	 Catch:{ Throwable -> 0x0167 }
        r7 = r7.ordinal();	 Catch:{ Throwable -> 0x0167 }
        r8 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0167 }
        r9 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0167 }
        r9 = r9.length();	 Catch:{ Throwable -> 0x0167 }
        r9 = r9 + 11;
        r8.<init>(r9);	 Catch:{ Throwable -> 0x0167 }
        r6 = r8.append(r6);	 Catch:{ Throwable -> 0x0167 }
        r6 = r6.append(r7);	 Catch:{ Throwable -> 0x0167 }
        r6 = r6.toString();	 Catch:{ Throwable -> 0x0167 }
        r7 = "_id=?";
        defpackage.bmr.a(r12, r0, r1, r6, r7);	 Catch:{ Throwable -> 0x0167 }
        r0 = 2;
        r0 = new java.lang.String[r0];	 Catch:{ Throwable -> 0x0167 }
        r1 = 0;
        r6 = "_id";
        r0[r1] = r6;	 Catch:{ Throwable -> 0x0167 }
        r1 = 1;
        r6 = "snippet_text";
        r0[r1] = r6;	 Catch:{ Throwable -> 0x0167 }
        r1 = "conversations";
        r6 = "snippet_type=4";
        r7 = "_id=?";
        defpackage.bmr.a(r12, r0, r1, r6, r7);	 Catch:{ Throwable -> 0x0167 }
        r0 = "update conversations set conversation_type = conversation_type - 1;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0294:
        r0 = "alter table messages add column transport_type INT NOT NULL DEFAULT(1);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0299:
        r0 = "alter table messages add column external_ids TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x029e:
        r0 = "alter table messages add column sms_timestamp_sent INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column sms_priority INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column sms_message_size INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02ad:
        r0 = "alter table messages add column mms_subject TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column sms_raw_sender TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column sms_raw_recipients TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02bc:
        r0 = "alter table conversations add column transport_type INT DEFAULT(1);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02c1:
        r0 = "alter table messages add column persisted INT DEFAULT(1);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02c6:
        r0 = "alter table conversations add column sms_service_center TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02cb:
        r0 = "alter table messages add column sms_message_status INT DEFAULT(-1);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02d0:
        r0 = "alter table conversations add column is_temporary INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02d5:
        r0 = "alter table messages add column location_name TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column latitude DOUBLE;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column longitude DOUBLE;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column static_map_url TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column target_map_url TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02ee:
        r0 = "alter table messages add column sms_type INT DEFAULT(-1);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "UPDATE messages SET sms_type=(CASE WHEN external_ids LIKE 'content://sms/%' THEN 0 WHEN external_ids LIKE 'content://mms/%' THEN 1 ELSE 2 END) WHERE transport_type=1";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02f8:
        r0 = "alter table conversations add column sms_thread_id INT DEFAULT(-1);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x02fd:
        r0 = "alter table messages add column video_stream_url TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0302:
        r0 = "CREATE INDEX index_messages_conversation_id_timestamp ON messages(conversation_id, timestamp)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_conversation_participants_sequence ON conversation_participants(sequence)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x030c:
        r0 = "PRAGMA foreign_keys=OFF;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages rename to temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, location_name TEXT, latitude DOUBLE, longitude DOUBLE, static_map_url TEXT, target_map_url TEXT, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), hidden_by INT, alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), video_stream_url TEXT, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "insert into messages(_id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, location_name, latitude, longitude, static_map_url, target_map_url, notification_level, expiration_timestamp, notified_for_failure, hidden_by, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url) select _id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, location_name, latitude, longitude, static_map_url, target_map_url, notification_level, expiration_timestamp, notified_for_failure, hidden_by, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url from temp;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop table temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_messages_conversation_id_timestamp ON messages(conversation_id, timestamp)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "PRAGMA foreign_keys=ON;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x032f:
        r0 = "CREATE TABLE mms_notification_inds (_id INTEGER PRIMARY KEY, content_location TEXT, transaction_id TEXT, from_address TEXT, message_size INT DEFAULT(0), expiry INT);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0334:
        r0 = "update messages set attachment_content_type = 'image/*' where attachment_content_type isnull and (remote_url notnull or local_url notnull)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0339:
        r0 = "CREATE TABLE multipart_attachments (_id INTEGER PRIMARY KEY, message_id TEXT, conversation_id TEXT, url TEXT, content_type TEXT, width INT, height INT, FOREIGN KEY (message_id, conversation_id) REFERENCES messages(message_id, conversation_id) ON DELETE CASCADE ON UPDATE CASCADE);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_multipart_attachments_conversation_id_message_id ON multipart_attachments(conversation_id, message_id)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "DROP TABLE account_status;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0348:
        r0 = "alter table messages add column attachment_name TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column attachment_target_url TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "UPDATE messages SET attachment_name = location_name, attachment_content_type = 'hangouts/location', attachment_target_url = target_map_url, remote_url = static_map_url WHERE location_name IS NOT NULL OR static_map_url IS NOT NULL OR target_map_url IS NOT NULL";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "UPDATE messages SET location_name= NULL, target_map_url = NULL, static_map_url = NULL";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x035c:
        r0 = "alter table messages add column image_rotation INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0361:
        r0 = "UPDATE messages SET transport_type=(CASE WHEN transport_type=1 THEN 0 WHEN transport_type=2 THEN 1 WHEN transport_type=4 THEN 3 ELSE 0 END)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "UPDATE conversations SET transport_type=(CASE WHEN transport_type=1 THEN 0 WHEN transport_type=2 THEN 1 WHEN transport_type=4 THEN 3 ELSE 0 END)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "PRAGMA foreign_keys=OFF;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations rename to temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_status INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT, has_joined_hangout INT, last_hangout_event_time INT, draft TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), UNIQUE (conversation_id ));";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "insert into conversations(_id, conversation_id, conversation_type, latest_message_timestamp, latest_message_expiration_timestamp, metadata_present, notification_level, name, generated_name, snippet_type, snippet_text, snippet_image_url, snippet_author_gaia_id, snippet_author_chat_id, snippet_message_row_id, snippet_status, status, view, inviter_gaia_id, inviter_chat_id, inviter_affinity, is_pending_leave, account_id, is_otr, packed_avatar_urls, self_avatar_url, self_watermark, chat_watermark, hangout_watermark, is_draft, sequence_number, has_joined_hangout, last_hangout_event_time, draft, otr_status, otr_toggle, last_otr_modification_time, continuation_token, continuation_event_timestamp, has_oldest_message, sort_timestamp, first_peak_scroll_time, first_peak_scroll_to_message_timestamp, second_peak_scroll_time, second_peak_scroll_to_message_timestamp, conversation_hash, disposition, has_persistent_events, transport_type, sms_service_center, is_temporary, sms_thread_id) select _id, conversation_id, conversation_type, latest_message_timestamp, latest_message_expiration_timestamp, metadata_present, notification_level, name, generated_name, snippet_type, snippet_text, snippet_image_url, snippet_author_gaia_id, snippet_author_chat_id, snippet_message_row_id, snippet_status, status, view, inviter_gaia_id, inviter_chat_id, inviter_affinity, is_pending_leave, account_id, is_otr, packed_avatar_urls, self_avatar_url, self_watermark, chat_watermark, hangout_watermark, is_draft, sequence_number, has_joined_hangout, last_hangout_event_time, draft, otr_status, otr_toggle, last_otr_modification_time, continuation_token, continuation_event_timestamp, has_oldest_message, sort_timestamp, first_peak_scroll_time, first_peak_scroll_to_message_timestamp, second_peak_scroll_time, second_peak_scroll_to_message_timestamp, conversation_hash, disposition, has_persistent_events, transport_type, sms_service_center, is_temporary, sms_thread_id from temp;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop table temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages rename to temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, location_name TEXT, latitude DOUBLE, longitude DOUBLE, static_map_url TEXT, target_map_url TEXT, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), video_stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "insert into messages(_id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, width_pixels, height_pixels, local_url, stream_id, image_id, album_id, image_rotation, attachment_content_type, remote_url, attachment_name, attachment_target_url, location_name, static_map_url, target_map_url, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url) select _id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, width_pixels, height_pixels, local_url, stream_id, image_id, album_id, image_rotation, attachment_content_type, remote_url, attachment_name, attachment_target_url, location_name, static_map_url, target_map_url, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url from temp;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop table temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "PRAGMA foreign_keys=ON;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x039d:
        r0 = "CREATE TABLE event_suggestions (_id INTEGER PRIMARY KEY, conversation_id TEXT, suggestion_id TEXT, timestamp INT, expiration_time_usec INT, type INT, gem_asset_url STRING, gem_horizontal_alignment INT, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE, UNIQUE (conversation_id,suggestion_id) ON CONFLICT REPLACE);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_event_suggestions_conversation_id_expiration_time_timestamp  ON event_suggestions(conversation_id, expiration_time_usec, timestamp)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x03a7:
        r0 = "CREATE INDEX index_participants_blocked ON participants(blocked)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x03ac:
        r0 = "PRAGMA foreign_keys=OFF;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table participants rename to temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = com.google.android.apps.hangouts.content.EsProvider.b;	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "insert into participants(_id, participant_type, gaia_id, chat_id, circle_id, phone_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked) select _id, participant_type, gaia_id, chat_id, circle_id, phone_id, first_name, full_name, fallback_name, profile_photo_url, batch_gebi_tag, blocked from temp;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop table temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_participants_chat_id ON participants(chat_id)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_participants_blocked ON participants(blocked)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "PRAGMA foreign_keys=ON;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x03d4:
        r0 = "alter table messages add column new_conversation_name TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column participant_keys TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations add column previous_latest_timestamp INT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations add column snippet_new_conversation_name TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations add column snippet_participant_keys TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r11.c(r12);	 Catch:{ Throwable -> 0x0167 }
    L_0x03f0:
        r0 = "PRAGMA foreign_keys=OFF;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages rename to temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, latitude DOUBLE, longitude DOUBLE, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), video_stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), new_conversation_name TEXT, participant_keys TEXT, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "insert into messages(_id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys) select _id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, video_stream_url, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys from temp;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop table temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "PRAGMA foreign_keys=ON;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x040e:
        r0 = "alter table messages add column transport_phone TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations add column default_transport_phone TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0418:
        r0 = "_id, conversation_id, conversation_type, latest_message_timestamp, latest_message_expiration_timestamp, metadata_present,notification_level, name, generated_name, snippet_type, snippet_text, snippet_image_url, snippet_author_gaia_id, snippet_author_chat_id, snippet_message_row_id, snippet_status, snippet_new_conversation_name, snippet_participant_keys, previous_latest_timestamp, status, view, inviter_gaia_id, inviter_chat_id, inviter_affinity, is_pending_leave, account_id, is_otr, packed_avatar_urls, self_avatar_url, self_watermark, chat_watermark, hangout_watermark, is_draft, sequence_number, call_media_type, has_joined_hangout, last_hangout_event_time, draft, otr_status, otr_toggle, last_otr_modification_time, continuation_token, continuation_event_timestamp, has_oldest_message, sort_timestamp, first_peak_scroll_time, first_peak_scroll_to_message_timestamp, second_peak_scroll_time, second_peak_scroll_to_message_timestamp, conversation_hash, disposition, has_persistent_events, transport_type, default_transport_phone, sms_service_center, is_temporary, sms_thread_id";
        r1 = "CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_status INT, snippet_new_conversation_name TEXT, snippet_participant_keys TEXT, previous_latest_timestamp INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT DEFAULT(0), has_joined_hangout INT, last_hangout_event_time INT, draft TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), default_transport_phone TEXT, sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), UNIQUE (conversation_id ));";
        r11.a(r12, r0, r1);	 Catch:{ Throwable -> 0x0167 }
        r0 = "update conversations set call_media_type =  ( select case when conversations.call_media_type is null then 0 else conversations.call_media_type end );";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0424:
        r11.d(r12);	 Catch:{ Throwable -> 0x0167 }
    L_0x0427:
        r0 = "CREATE TABLE transport_events (_id INTEGER PRIMARY KEY, upload_key TEXT, message_row_id INT, request_trace_id INT, event_id TEXT, notified INT, was_newest INT, past_watermark INT, dnd INT, in_focused_conversation INT, active_client_state INT, notification_level INT, local_timestamp INT);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_transport_events_upload_key ON transport_events(upload_key)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0431:
        r0 = "alter table messages add column forwarded_mms_url TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column forwarded_mms_count INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x043b:
        r0 = "alter table messages add column attachment_description TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column attachment_target_url_description TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column attachment_target_url_name TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x044a:
        r0 = "CREATE TABLE merge_keys (_id INTEGER PRIMARY KEY, conversation_id TEXT, merge_key TEXT, UNIQUE (conversation_id) ON CONFLICT REPLACE, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE  );";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x044f:
        r0 = "_id, conversation_id, conversation_type, latest_message_timestamp, latest_message_expiration_timestamp, metadata_present,notification_level, name, generated_name, snippet_type, snippet_text, snippet_image_url, snippet_author_gaia_id, snippet_author_chat_id, snippet_message_row_id, snippet_status, snippet_new_conversation_name, snippet_participant_keys, previous_latest_timestamp, status, view, inviter_gaia_id, inviter_chat_id, inviter_affinity, is_pending_leave, account_id, is_otr, packed_avatar_urls, self_avatar_url, self_watermark, chat_watermark, hangout_watermark, is_draft, sequence_number, has_joined_hangout, last_hangout_event_time, draft, otr_status, otr_toggle, last_otr_modification_time, continuation_token, continuation_event_timestamp, has_oldest_message, sort_timestamp, first_peak_scroll_time, first_peak_scroll_to_message_timestamp, second_peak_scroll_time, second_peak_scroll_to_message_timestamp, conversation_hash, disposition, has_persistent_events, transport_type, default_transport_phone, sms_service_center, is_temporary, sms_thread_id";
        r1 = "CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_selector INT, snippet_status INT, snippet_new_conversation_name TEXT, snippet_participant_keys TEXT, previous_latest_timestamp INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT DEFAULT(0), has_joined_hangout INT, last_hangout_event_time INT, draft TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), default_transport_phone TEXT, sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), UNIQUE (conversation_id ));";
        r11.a(r12, r0, r1);	 Catch:{ Throwable -> 0x0167 }
    L_0x0456:
        r0 = com.google.android.apps.hangouts.content.EsProvider.g;	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x045b:
        r0 = java.util.Locale.US;	 Catch:{ Throwable -> 0x0167 }
        r1 = "INSERT INTO %s (%s, %s) SELECT %s, 'CONV:'||%s FROM %s;";
        r6 = 6;
        r6 = new java.lang.Object[r6];	 Catch:{ Throwable -> 0x0167 }
        r7 = 0;
        r8 = "merge_keys";
        r6[r7] = r8;	 Catch:{ Throwable -> 0x0167 }
        r7 = 1;
        r8 = "conversation_id";
        r6[r7] = r8;	 Catch:{ Throwable -> 0x0167 }
        r7 = 2;
        r8 = "merge_key";
        r6[r7] = r8;	 Catch:{ Throwable -> 0x0167 }
        r7 = 3;
        r8 = "conversation_id";
        r6[r7] = r8;	 Catch:{ Throwable -> 0x0167 }
        r7 = 4;
        r8 = "conversation_id";
        r6[r7] = r8;	 Catch:{ Throwable -> 0x0167 }
        r7 = 5;
        r8 = "conversations";
        r6[r7] = r8;	 Catch:{ Throwable -> 0x0167 }
        r0 = java.lang.String.format(r0, r1, r6);	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0487:
        r0 = "alter table conversations add column has_chat_notifications INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations add column has_video_notifications INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "update conversations SET has_chat_notifications= ( CASE WHEN latest_message_timestamp>chat_watermark THEN 1 ELSE 0 END);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "update conversations SET has_video_notifications= ( CASE WHEN latest_message_timestamp>hangout_watermark THEN 1 ELSE 0 END);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_conversations_chat_notifications ON conversations(has_chat_notifications)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_conversations_video_notifications ON conversations(has_video_notifications)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04a5:
        r0 = "alter table event_suggestions add column event_id TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04aa:
        r0 = "alter table transport_events add column client_generated_id INT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table transport_events add column event_type INT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table transport_events add column chat_action INT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04b9:
        r0 = "UPDATE conversations SET has_oldest_message=0 WHERE continuation_event_timestamp=0;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04be:
        r0 = "DROP INDEX IF EXISTS index_merge_keys_merge_key";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "DROP INDEX IF EXISTS index_merge_keys_merge_key_NEW";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "DROP INDEX IF EXISTS index_merge_keys_merge_conversation_id";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_merge_keys_merge_key_NEW ON merge_keys(merge_key)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_merge_keys_merge_conversation_id ON merge_keys(conversation_id); ";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04d7:
        r0 = "alter table conversations add column snippet_sms_type INT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "UPDATE conversations SET snippet_sms_type = ( SELECT messages.sms_type FROM messages WHERE conversations.snippet_message_row_id = messages._id)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04e1:
        r0 = "CREATE TABLE dismissed_contacts (_id INTEGER PRIMARY KEY, chat_id TEXT, gaia_id TEXT, name TEXT, profile_photo_url TEXT);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_dismissed_contacts_gaia_id ON dismissed_contacts(gaia_id)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04eb:
        r0 = "alter table messages add column sending_error INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04f0:
        r0 = "alter table conversations add column chat_ringtone_uri TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations add column hangout_ringtone_uri TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x04fa:
        r0 = "PRAGMA foreign_keys=OFF;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages rename to temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, latitude DOUBLE, longitude DOUBLE, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), alert_status INT DEfAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), transport_phone TEXT, external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), new_conversation_name TEXT, participant_keys TEXT, forwarded_mms_url TEXT, forwarded_mms_count INT DEFAULT(0), attachment_description TEXT, attachment_target_url_description TEXT, attachment_target_url_name TEXT, sending_error INT DEFAULT(0), stream_expiration INT, voicemail_length INT DEFAULT (0), FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "insert into messages(_id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, transport_phone, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys, forwarded_mms_url, forwarded_mms_count, attachment_description, attachment_target_url_description, attachment_target_url_name, sending_error) select _id, message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, notification_level, expiration_timestamp, notified_for_failure, alert_status, off_the_record, transport_type, transport_phone, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys, forwarded_mms_url, forwarded_mms_count, attachment_description, attachment_target_url_description, attachment_target_url_name, sending_error from temp;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop table temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "PRAGMA foreign_keys=ON;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0518:
        r0 = "alter table conversations add column wearable_watermark INT DEFAULT(0)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x051d:
        r0 = "drop table if exists recent_calls;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE TABLE recent_calls (_id INTEGER PRIMARY KEY, normalized_number TEXT NOT NULL, phone_number TEXT, contact_id TEXT, call_timestamp INT, call_type INT, contact_type INT);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_recent_calls_sequence ON recent_calls(call_timestamp)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column call_media_type INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations add column snippet_voicemail_duration INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0536:
        r0 = new android.content.ContentValues;	 Catch:{ Throwable -> 0x0167 }
        r0.<init>();	 Catch:{ Throwable -> 0x0167 }
        r1 = "phone_id";
        r6 = 0;
        r0.put(r1, r6);	 Catch:{ Throwable -> 0x0167 }
        r1 = "participants";
        r6 = "participant_type = ? and phone_id = ?";
        r7 = 2;
        r7 = new java.lang.String[r7];	 Catch:{ Throwable -> 0x0167 }
        r8 = 0;
        r9 = defpackage.edq.PHONE;	 Catch:{ Throwable -> 0x0167 }
        r9 = r9.ordinal();	 Catch:{ Throwable -> 0x0167 }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ Throwable -> 0x0167 }
        r7[r8] = r9;	 Catch:{ Throwable -> 0x0167 }
        r8 = 1;
        r9 = "";
        r7[r8] = r9;	 Catch:{ Throwable -> 0x0167 }
        r12.update(r1, r0, r6, r7);	 Catch:{ Throwable -> 0x0167 }
    L_0x055d:
        defpackage.bmr.a(r12);	 Catch:{ Throwable -> 0x0167 }
    L_0x0560:
        r0 = "alter table transport_events add column event_reason INT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0565:
        r0 = "CREATE TABLE sticker_albums (album_id TEXT NOT NULL, title TEXT, cover_photo_id TEXT, PRIMARY KEY (album_id));";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE TABLE sticker_photos (photo_id TEXT NOT NULL, album_id TEXT NOT NULL, url TEXT NOT NULL, file_name TEXT, PRIMARY KEY (photo_id), FOREIGN KEY (album_id) REFERENCES sticker_albums(album_id) ON DELETE CASCADE)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x056f:
        r0 = "alter table recent_calls add column call_rate TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table recent_calls add column is_free_call BOOLEAN;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0579:
        r0 = "update transport_events set notified=3 where notified=4";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x057e:
        r0 = "CREATE TABLE presence (_id INTEGER PRIMARY KEY, gaia_id TEXT NOT NULL, reachable INT DEFAULT(0), reachable_time INT DEFAULT(0), available INT DEFAULT(0), available_time INT DEFAULT(0), status_message TEXT, status_message_time INT DEFAULT(0), call_type INT DEFAULT(0), call_type_time INT DEFAULT(0), device_status INT DEFAULT(0), device_status_time INT DEFAULT(0), last_seen INT DEFAULT(0), last_seen_time INT DEFAULT(0), UNIQUE (gaia_id) ON CONFLICT REPLACE);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0583:
        r0 = "alter table messages add column address TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0588:
        r0 = "drop table if exists transport_events;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop index if exists index_transport_events_upload_key;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0592:
        r0 = "alter table messages add column delete_after_read_timetamp INT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0597:
        r0 = "alter table event_suggestions add column matched_message_substring TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x059c:
        r0 = "update conversations set chat_watermark = wearable_watermark WHERE wearable_watermark > chat_watermark";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "_id,conversation_id,conversation_type,latest_message_timestamp,latest_message_expiration_timestamp,metadata_present,notification_level,name,generated_name,snippet_type,snippet_text,snippet_image_url,snippet_author_gaia_id,snippet_author_chat_id,snippet_message_row_id,snippet_selector,snippet_status,snippet_new_conversation_name,snippet_participant_keys,snippet_sms_type,previous_latest_timestamp,status,view,inviter_gaia_id,inviter_chat_id,inviter_affinity,is_pending_leave,account_id,is_otr,packed_avatar_urls,self_avatar_url,self_watermark,chat_watermark,hangout_watermark,is_draft,sequence_number,call_media_type,has_joined_hangout,has_chat_notifications,has_video_notifications,last_hangout_event_time,draft,otr_status,otr_toggle,last_otr_modification_time,continuation_token,continuation_event_timestamp,has_oldest_message,sort_timestamp,first_peak_scroll_time,first_peak_scroll_to_message_timestamp,second_peak_scroll_time,second_peak_scroll_to_message_timestamp,conversation_hash,disposition,has_persistent_events,transport_type,default_transport_phone,sms_service_center,is_temporary,sms_thread_id,chat_ringtone_uri,hangout_ringtone_uri,snippet_voicemail_duration";
        r1 = "CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_selector INT, snippet_status INT, snippet_new_conversation_name TEXT, snippet_participant_keys TEXT, snippet_sms_type TEXT, previous_latest_timestamp INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT DEFAULT(0), has_joined_hangout INT, has_chat_notifications DEFAULT(0),has_video_notifications DEFAULT(0),last_hangout_event_time INT, draft TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), default_transport_phone TEXT, sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), chat_ringtone_uri TEXT, hangout_ringtone_uri TEXT, snippet_voicemail_duration INT DEFAULT (0), UNIQUE (conversation_id ));";
        r11.a(r12, r0, r1);	 Catch:{ Throwable -> 0x0167 }
    L_0x05a8:
        r0 = "alter table sticker_photos add column last_used INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table sticker_albums add column last_used INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x05b2:
        r0 = "update messages set status = ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ Throwable -> 0x0167 }
        r1 = defpackage.fwx.UNKNOWN;	 Catch:{ Throwable -> 0x0167 }
        r1 = r1.ordinal();	 Catch:{ Throwable -> 0x0167 }
        r6 = "status";
        r6 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0167 }
        r7 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0167 }
        r8 = java.lang.String.valueOf(r0);	 Catch:{ Throwable -> 0x0167 }
        r8 = r8.length();	 Catch:{ Throwable -> 0x0167 }
        r8 = r8 + 23;
        r9 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0167 }
        r9 = r9.length();	 Catch:{ Throwable -> 0x0167 }
        r8 = r8 + r9;
        r7.<init>(r8);	 Catch:{ Throwable -> 0x0167 }
        r0 = r7.append(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0167 }
        r1 = " WHERE ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0167 }
        r0 = r0.append(r6);	 Catch:{ Throwable -> 0x0167 }
        r1 = " = -1";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0167 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "update conversations set snippet_status = ";
        r0 = java.lang.String.valueOf(r0);	 Catch:{ Throwable -> 0x0167 }
        r1 = defpackage.fwx.UNKNOWN;	 Catch:{ Throwable -> 0x0167 }
        r1 = r1.ordinal();	 Catch:{ Throwable -> 0x0167 }
        r6 = "snippet_status";
        r6 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0167 }
        r7 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0167 }
        r8 = java.lang.String.valueOf(r0);	 Catch:{ Throwable -> 0x0167 }
        r8 = r8.length();	 Catch:{ Throwable -> 0x0167 }
        r8 = r8 + 23;
        r9 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0167 }
        r9 = r9.length();	 Catch:{ Throwable -> 0x0167 }
        r8 = r8 + r9;
        r7.<init>(r8);	 Catch:{ Throwable -> 0x0167 }
        r0 = r7.append(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0167 }
        r1 = " WHERE ";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0167 }
        r0 = r0.append(r6);	 Catch:{ Throwable -> 0x0167 }
        r1 = " = -1";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0167 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0644:
        r0 = "alter table conversation_participants add column invitation_status INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0649:
        r0 = "alter table messages add column last_seen_timestamp INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x064e:
        r11.b(r12);	 Catch:{ Throwable -> 0x0167 }
    L_0x0651:
        r0 = "alter table participants add column in_users_domain BOOLEAN;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0656:
        r0 = "drop index if exists index_dismissed_contacts_gaia_id";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_dismissed_contacts_gaia_id ON dismissed_contacts(gaia_id)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE INDEX index_conversation_participants_view_conversation_id ON conversation_participants(conversation_id)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0665:
        r0 = "DROP TABLE IF EXISTS merged_contact_details";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "DROP TABLE IF EXISTS merged_contacts";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r1 = defpackage.dwz.a();	 Catch:{ Throwable -> 0x0167 }
        r6 = r1.length;	 Catch:{ Throwable -> 0x0167 }
        r0 = r2;
    L_0x0675:
        if (r0 >= r6) goto L_0x067f;
    L_0x0677:
        r7 = r1[r0];	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r7);	 Catch:{ Throwable -> 0x0167 }
        r0 = r0 + 1;
        goto L_0x0675;
    L_0x067f:
        r0 = "CREATE INDEX index_merged_contact_details_parent_key ON merged_contact_details(merged_contact_id)";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0684:
        r0 = "alter table merged_contacts add column is_frequent INT DEFAULT (0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table merged_contacts add column is_favorite INT DEFAULT (0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table merged_contact_details add column lookup_data_display TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0693:
        r0 = "alter table messages add column observed_status INT DEFAULT(2);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0698:
        r0 = "alter table presence add column location BLOB;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table presence add column location_time INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06a2:
        r0 = "alter table messages add column attachment_blob_data BLOB;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06a7:
        r0 = "alter table conversations add column share_count INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06ac:
        r0 = "alter table messages add column attachment_uploading_progress INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06b1:
        r0 = "alter table conversations add column has_unobserved TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06b6:
        r0 = "PRAGMA foreign_keys=OFF;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages rename to temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, delete_after_read_timetamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, latitude DOUBLE, longitude DOUBLE, address ADDRESS, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), transport_phone TEXT, external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), new_conversation_name TEXT, participant_keys TEXT, forwarded_mms_url TEXT, forwarded_mms_count INT DEFAULT(0), attachment_description TEXT, attachment_target_url_description TEXT, attachment_target_url_name TEXT, attachment_blob_data BLOB,attachment_uploading_progress INT DEFAULT(0), sending_error INT DEFAULT(0), stream_expiration INT, voicemail_length INT DEFAULT (0), call_media_type INT DEFAULT(0), last_seen_timestamp INT DEFAULT(0), observed_status INT DEFAULT(2), FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "insert into messages(message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, delete_after_read_timetamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, address, notification_level, expiration_timestamp, notified_for_failure, off_the_record, transport_type, transport_phone, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, stream_url, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys, forwarded_mms_url, forwarded_mms_count, attachment_description, attachment_target_url_description, attachment_target_url_name, attachment_blob_data,attachment_uploading_progress, sending_error, stream_expiration, voicemail_length, call_media_type, last_seen_timestamp, observed_status) select message_id, message_type, conversation_id, author_chat_id, author_gaia_id, text, timestamp, delete_after_read_timetamp, status, type, local_url, remote_url, attachment_content_type, width_pixels, height_pixels, stream_id, image_id, album_id, latitude, longitude, address, notification_level, expiration_timestamp, notified_for_failure, off_the_record, transport_type, transport_phone, external_ids, sms_timestamp_sent, sms_priority, sms_message_size, mms_subject, sms_raw_sender, sms_raw_recipients, persisted, sms_message_status, sms_type, stream_url, attachment_target_url, attachment_name, image_rotation, new_conversation_name, participant_keys, forwarded_mms_url, forwarded_mms_count, attachment_description, attachment_target_url_description, attachment_target_url_name, attachment_blob_data,attachment_uploading_progress, sending_error, stream_expiration, voicemail_length, call_media_type, last_seen_timestamp, observed_status from temp;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "drop table temp";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "PRAGMA foreign_keys=ON;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06d4:
        r0 = "alter table conversations add column last_share_timestamp INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06d9:
        r0 = "alter table messages add column receive_type INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column init_timestamp INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column in_app_msg_latency INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table messages add column notified INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06ed:
        r0 = "alter table messages add column alert_in_conversation_list INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = com.google.android.apps.hangouts.content.EsProvider.f;	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x06f7:
        r0 = "alter table conversations add column gls_status INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table conversations add column gls_link TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0701:
        r0 = "CREATE VIRTUAL TABLE participants_fts USING fts4(content=\"participants\",gaia_id,full_name);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "INSERT INTO participants_fts(participants_fts) VALUES('rebuild');";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = " CREATE TRIGGER participants_bu  BEFORE UPDATE OF full_name ON participants BEGIN  DELETE FROM participants_fts WHERE docid=old.rowid;  END;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = " CREATE TRIGGER participants_bd  BEFORE DELETE ON participants BEGIN  DELETE FROM participants_fts WHERE docid=old.rowid;  END;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = " CREATE TRIGGER participants_au  AFTER UPDATE OF full_name ON participants BEGIN  INSERT INTO participants_fts(docid, gaia_id, full_name)  VALUES(new.rowid, new.gaia_id, new.full_name); END;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = " CREATE TRIGGER participants_ai AFTER INSERT ON participants BEGIN  INSERT INTO participants_fts(docid, gaia_id, full_name)  VALUES(new.rowid, new.gaia_id, new.full_name);  END;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "CREATE VIRTUAL TABLE participant_email_fts USING fts4(content=\"merged_contact_details\", gaia_id,lookup_data);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "INSERT INTO participant_email_fts(participant_email_fts) VALUES('rebuild');";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = " CREATE TRIGGER mcd_bu  BEFORE UPDATE OF lookup_data ON merged_contact_details BEGIN  DELETE FROM participant_email_fts WHERE docid=old.rowid;  END;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = " CREATE TRIGGER mcd_bd  BEFORE DELETE ON merged_contact_details BEGIN  DELETE FROM participant_email_fts WHERE docid=old.rowid;  END;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = " CREATE TRIGGER mcd_au  AFTER UPDATE OF lookup_data ON merged_contact_details BEGIN  INSERT INTO participant_email_fts(docid, gaia_id, lookup_data)  VALUES(new.rowid, new.gaia_id, new.lookup_data); END;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = " CREATE TRIGGER mcd_ai  AFTER INSERT ON merged_contact_details BEGIN  INSERT INTO participant_email_fts(docid, gaia_id, lookup_data)  VALUES(new.rowid, new.gaia_id, new.lookup_data);  END;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x073d:
        r0 = "alter table merged_contacts add column contact_source INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0742:
        r0 = "alter table messages add column attachments BLOB;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0747:
        r0 = "alter table conversations add column is_guest INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x074c:
        r0 = "alter table merged_contacts add column frequent_order INT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0751:
        r0 = "alter table merged_contacts add column person_logging_id TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table merged_contact_details add column detail_affinity_score REAL DEFAULT (0.0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table merged_contacts add column person_affinity_score REAL DEFAULT (0.0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table merged_contact_details add column detail_logging_id TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0765:
        r0 = "alter table suggested_contacts add column logging_id TEXT;";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
        r0 = "alter table suggested_contacts add column affinity_score REAL DEFAULT (0.0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x076f:
        r0 = "alter table messages add column is_user_mentioned INT DEFAULT(0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0774:
        r11.e(r12);	 Catch:{ Throwable -> 0x0167 }
    L_0x0777:
        r0 = com.google.android.apps.hangouts.content.EsProvider.v;	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x077c:
        r0 = "alter table suggested_contacts add column is_in_same_domain INT DEFAULT (0);";
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0781:
        r0 = com.google.android.apps.hangouts.content.EsProvider.w;	 Catch:{ Throwable -> 0x0167 }
        r12.execSQL(r0);	 Catch:{ Throwable -> 0x0167 }
    L_0x0786:
        defpackage.bmr.f(r12);	 Catch:{ Throwable -> 0x0167 }
        r0 = new blo;	 Catch:{ Throwable -> 0x0167 }
        r1 = r11.b;	 Catch:{ Throwable -> 0x0167 }
        r6 = new bmv;	 Catch:{ Throwable -> 0x0167 }
        r7 = r11.b;	 Catch:{ Throwable -> 0x0167 }
        r6.<init>(r7, r12);	 Catch:{ Throwable -> 0x0167 }
        r7 = r11.h;	 Catch:{ Throwable -> 0x0167 }
        r0.<init>(r1, r6, r7);	 Catch:{ Throwable -> 0x0167 }
        r1 = 0;
        defpackage.blo.a(r0, r1);	 Catch:{ Throwable -> 0x0167 }
        r0 = r5.edit();
        r1 = "last_database_upgrade_version";
        r0 = r0.putInt(r1, r14);
        r0.commit();
        r0 = r3;
    L_0x07ab:
        if (r0 == 0) goto L_0x0801;
    L_0x07ad:
        r0 = "Babel";
        r1 = new java.lang.StringBuilder;
        r1.<init>(r10);
        r3 = "db upgrade from ";
        r1 = r1.append(r3);
        r1 = r1.append(r13);
        r3 = " to ";
        r1 = r1.append(r3);
        r1 = r1.append(r14);
        r3 = " succeeded";
        r1 = r1.append(r3);
        r1 = r1.toString();
        r2 = new java.lang.Object[r2];
        defpackage.glk.c(r0, r1, r2);
        r0 = r11.d();
        r0 = r0.a(r4);
        r1 = 3408; // 0xd50 float:4.776E-42 double:1.684E-320;
        r0.c(r1);
        goto L_0x00fc;
    L_0x07e6:
        r0 = "last_database_upgrade_version";
        r6 = 0;
        r0 = r5.getInt(r0, r6);	 Catch:{ all -> 0x0202 }
        if (r0 != r14) goto L_0x01b7;
    L_0x07ef:
        r3 = r2;
        goto L_0x01b7;
    L_0x07f2:
        r0 = r5.edit();
        r1 = "last_database_upgrade_version";
        r0 = r0.putInt(r1, r14);
        r0.commit();
        r0 = r2;
        goto L_0x07ab;
    L_0x0801:
        r0 = "Babel";
        r1 = new java.lang.StringBuilder;
        r3 = 57;
        r1.<init>(r3);
        r3 = "db upgrade failed; recreating: ";
        r1 = r1.append(r3);
        r1 = r1.append(r13);
        r3 = " -> ";
        r1 = r1.append(r3);
        r1 = r1.append(r14);
        r1 = r1.toString();
        r2 = new java.lang.Object[r2];
        defpackage.glk.d(r0, r1, r2);
        r0 = r11.d();
        r0 = r0.a(r4);
        r1 = 3409; // 0xd51 float:4.777E-42 double:1.6843E-320;
        r0.c(r1);
        r11.g(r12);
        goto L_0x00fc;
        */
        throw new UnsupportedOperationException("Method not decompiled: bmr.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("conversations", new String[]{"conversation_id", "generated_name"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(1);
                if (string.matches("^\\+?[0-9]+$")) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("generated_name", glq.i(gwb.H(), string));
                    sQLiteDatabase.update("conversations", contentValues, "conversation_id=?", new String[]{query.getString(0)});
                }
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        Set hashSet = new HashSet();
        hashSet.add("dnd_expiration");
        hashSet.add(EsProvider.a(3));
        hashSet.add(EsProvider.a(2));
        hashSet.add(EsProvider.a(1));
        hashSet.add(EsProvider.a(5));
        hashSet.add(EsProvider.a(4));
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
        jci b = ((jcf) jyn.a(this.b, jcf.class)).b(this.h);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (hashSet.contains(string)) {
                    b.b(string, Long.parseLong(string2));
                } else if (hashSet2.contains(string)) {
                    b.b(string, string2);
                } else {
                    string2 = "Babel";
                    String str = "Dropping metadata key ";
                    string = String.valueOf(string);
                    glk.d(string2, string.length() != 0 ? str.concat(string) : new String(str), new Object[0]);
                }
            } finally {
                query.close();
            }
        }
        b.d();
        sQLiteDatabase.execSQL("drop table if exists realtimechat_metadata;");
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=OFF;");
        sQLiteDatabase.execSQL("alter table conversations rename to temp");
        sQLiteDatabase.execSQL(str2);
        String valueOf = String.valueOf("insert into conversations(");
        sQLiteDatabase.execSQL(new StringBuilder(((String.valueOf(valueOf).length() + 20) + String.valueOf(str).length()) + String.valueOf(str).length()).append(valueOf).append(str).append(") select ").append(str).append(" from temp;").toString());
        sQLiteDatabase.execSQL("drop table temp");
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON;");
    }

    private static Map<String, Object> a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (Map) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
                } catch (Throwable e) {
                    glk.d("Babel", "error decoding", e);
                    return null;
                }
            }
        } catch (Throwable e2) {
            glk.d("Babel", "decode object failure", e2);
        }
        return null;
    }

    private static String a(Map<String, Object> map) {
        String str = null;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable e) {
            glk.d("Babel", "got exception serializing strings array", e);
        }
        return str;
    }

    private static void a(SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String str2, String str3) {
        Throwable th;
        Cursor query;
        try {
            ContentValues contentValues = new ContentValues();
            String[] strArr2 = new String[1];
            query = sQLiteDatabase.query(str, strArr, str2, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    Map a = bmr.a(query.getString(1));
                    if (a != null) {
                        Integer num = (Integer) a.get("type");
                        if (num != null) {
                            a.put("type", Integer.valueOf(gwb.a(num) + 1));
                            contentValues.put(strArr[1], bmr.a(a));
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

    private static int a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4, String str5) {
        Cursor query;
        SQLiteDatabase sQLiteDatabase2;
        if (str != null) {
            try {
                sQLiteDatabase2 = sQLiteDatabase;
                query = sQLiteDatabase2.query("participants", e, "gaia_id=?", new String[]{str}, null, null, null);
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
            query = sQLiteDatabase2.query("participants", e, "chat_id=?", new String[]{str2}, null, null, null);
        } else if (str3 != null) {
            sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("participants", e, "phone_id=?", new String[]{str3}, null, null, null);
        } else if (str4 != null) {
            sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("participants", e, "circle_id=?", new String[]{str4}, null, null, null);
        } else if (str5 == null) {
            return -1;
        } else {
            sQLiteDatabase2 = sQLiteDatabase;
            query = sQLiteDatabase2.query("participants", e, "( chat_id=? AND fallback_name=? )", new String[]{str5, str5}, null, null, null);
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

    private static edo a(Context context, SQLiteDatabase sQLiteDatabase) {
        String substring;
        String path = sQLiteDatabase.getPath();
        int lastIndexOf = path.lastIndexOf(File.separator);
        if (lastIndexOf >= 0) {
            substring = path.substring(lastIndexOf + 1);
        } else {
            substring = path;
        }
        try {
            return bkq.a(context, Integer.parseInt(substring.substring(5, substring.length() - 3)));
        } catch (Throwable e) {
            Throwable th = e;
            String str = "Babel";
            String str2 = "unable to parse database file name to determine index: ";
            substring = String.valueOf(path);
            glk.e(str, substring.length() != 0 ? str2.concat(substring) : new String(str2), new Object[0]);
            throw new RuntimeException("unable to parse database file name to determine index", th);
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        Throwable th;
        String[] strArr = new String[]{"_id", "type", "text"};
        edo a = bmr.a(this.b, sQLiteDatabase);
        Cursor query;
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
                    Map a2 = bmr.a(query.getString(2));
                    if (a2 == null || a2.size() == 0) {
                        iil.b("No system message parameters for a membership change event", fwy, fwy.MEMBERSHIP_CHANGE_DEPRECATED);
                    } else {
                        boolean z;
                        Object obj;
                        switch (bmt.a[fwy.ordinal()]) {
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
                                    int a3 = gwb.a((Integer) obj);
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
                                valueOf = a(sQLiteDatabase, a, a2);
                                if (valueOf != null) {
                                    contentValues.put("participant_keys", valueOf);
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        valueOf = a(sQLiteDatabase, a2, z);
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

    private String a(SQLiteDatabase sQLiteDatabase, Map<String, Object> map, boolean z) {
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
                    i = bmr.a(sQLiteDatabase, fbw.a, fbw.b, fbw.d, fbw.c, fbw.e);
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
                i = bmr.a(sQLiteDatabase, null, null, null, null, (String) next);
            } else if (next instanceof edo) {
                edo edo = (edo) next;
                i = bmr.a(sQLiteDatabase, edo.a, edo.b, null, null, null);
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

    private String a(SQLiteDatabase sQLiteDatabase, edo edo, Map<String, Object> map) {
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
                    int a = bmr.a(sQLiteDatabase, edo2.a, edo2.b, null, null, (String) obj5);
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
            if ((obj4 instanceof edo) && edo.a((edo) obj4)) {
                int a2 = bmr.a(sQLiteDatabase, null, null, null, null, (String) obj3);
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

    private void d(android.database.sqlite.SQLiteDatabase r17) {
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
        r3 = f;	 Catch:{ all -> 0x0115 }
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
        r4 = defpackage.edq.CIRCLE;	 Catch:{ all -> 0x010d }
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

    private void e(SQLiteDatabase sQLiteDatabase) {
        blo blo = new blo(this.b, new bmv(this.b, sQLiteDatabase), this.h);
        ArrayList k = blo.k();
        int size = k.size();
        int i = 0;
        while (i < size) {
            Object obj = k.get(i);
            i++;
            String str = (String) obj;
            if (blo.h(str)) {
                blo.k(str, -2147483648L);
            } else {
                blo.c(str, 0);
            }
        }
    }

    private static void f(SQLiteDatabase sQLiteDatabase) {
        int i = 0;
        for (String str : EsProvider.c()) {
            sQLiteDatabase.execSQL(new StringBuilder(String.valueOf(str).length() + 21).append("drop view if exists ").append(str).append(";").toString());
        }
        for (String str2 : dwz.d()) {
            sQLiteDatabase.execSQL(new StringBuilder(String.valueOf(str2).length() + 21).append("drop view if exists ").append(str2).append(";").toString());
        }
        for (String str22 : EsProvider.d()) {
            sQLiteDatabase.execSQL(str22);
        }
        String[] c = dwz.c();
        int length = c.length;
        while (i < length) {
            sQLiteDatabase.execSQL(c[i]);
            i++;
        }
    }

    private static void h(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("sqlite_master", c, "type='view'", null, null, null, null);
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
                    if (glk.a("Babel", 3)) {
                        valueOf = String.valueOf(e);
                        glk.a("Babel", new StringBuilder((String.valueOf(string).length() + 21) + String.valueOf(valueOf).length()).append("unable to drop view ").append(string).append(" ").append(valueOf).toString(), new Object[0]);
                    }
                } catch (Throwable th) {
                    query.close();
                }
            }
            query.close();
        }
    }

    private static void i(SQLiteDatabase sQLiteDatabase) {
        String string;
        String valueOf;
        Cursor query = sQLiteDatabase.query("sqlite_master", c, "type='index'", null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    string = query.getString(0);
                    String valueOf2 = String.valueOf("DROP INDEX IF EXISTS ");
                    valueOf = String.valueOf(string);
                    sQLiteDatabase.execSQL(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                } catch (SQLException e) {
                    if (glk.a("Babel", 3)) {
                        valueOf = String.valueOf(e);
                        glk.a("Babel", new StringBuilder((String.valueOf(string).length() + 22) + String.valueOf(valueOf).length()).append("unable to drop index ").append(string).append(" ").append(valueOf).toString(), new Object[0]);
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
        if (this.g) {
            throw new SQLiteException("Database deleted");
        }
        try {
            readableDatabase = super.getReadableDatabase();
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e);
            glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 56).append("[EsDatabaseHelper] getWritableDatabase threw exception: ").append(valueOf).toString(), new Object[0]);
            if (e instanceof SQLiteCantOpenDatabaseException) {
                this.b.deleteDatabase(this.i);
                readableDatabase = super.getReadableDatabase();
            } else {
                throw e;
            }
        }
        return readableDatabase;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase writableDatabase;
        if (this.g) {
            throw new SQLiteException("Database deleted");
        }
        try {
            writableDatabase = super.getWritableDatabase();
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e);
            glk.d("Babel", new StringBuilder(String.valueOf(valueOf).length() + 56).append("[EsDatabaseHelper] getWritableDatabase threw exception: ").append(valueOf).toString(), new Object[0]);
            if (e instanceof SQLiteCantOpenDatabaseException) {
                this.b.deleteDatabase(this.i);
                writableDatabase = super.getWritableDatabase();
            } else {
                throw e;
            }
        }
        return writableDatabase;
    }

    public synchronized bmv a() {
        return bmv.a(this.b, getReadableDatabase());
    }

    public synchronized bmv b() {
        return bmv.a(this.b, getWritableDatabase());
    }

    public void c() {
        this.g = false;
    }

    public String toString() {
        int i = this.h;
        String str = this.i;
        return new StringBuilder(String.valueOf(str).length() + 25).append("index: ").append(i).append(" name: ").append(str).toString();
    }

    private iie d() {
        return ((iih) jyn.a(this.b, iih.class)).a(fde.c(this.b)).b();
    }

    private static mco a(int i, int i2) {
        mco mco = new mco();
        mco.a = Integer.valueOf(i);
        mco.b = Integer.valueOf(i2);
        return mco;
    }

    private void g(SQLiteDatabase sQLiteDatabase) {
        String valueOf;
        int i = 0;
        Object obj = 1;
        while (obj != null) {
            int i2 = i + 1;
            if (i >= 5) {
                break;
            }
            Cursor query = sQLiteDatabase.query("sqlite_master", c, "type='table'", null, null, null, null);
            if (query != null) {
                obj = null;
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    if (!(string.startsWith("android_") || string.startsWith("sqlite_"))) {
                        try {
                            String valueOf2 = String.valueOf("DROP TABLE IF EXISTS ");
                            valueOf = String.valueOf(string);
                            sQLiteDatabase.execSQL(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
                            obj = 1;
                        } catch (SQLException e) {
                            valueOf = String.valueOf(e);
                            glk.a("Babel", new StringBuilder((String.valueOf(string).length() + 22) + String.valueOf(valueOf).length()).append("unable to drop table ").append(string).append(" ").append(valueOf).toString(), new Object[0]);
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
        bmr.h(sQLiteDatabase);
        bmr.i(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }
}
