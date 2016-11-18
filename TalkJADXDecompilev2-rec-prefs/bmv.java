package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.database.sqlite.SQLiteStatement;
import android.net.Uri;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

public final class bmv {
    private static bmv f3994a;
    private static ThreadLocal<Stack<bmx>> f3995b = new bmw();
    private static final Object f3996c = new Object();
    private static Set<Uri> f3997d = new HashSet();
    private static String[] f3998e = new String[]{"took %d ms to %s", "   took %d ms to %s", "      took %d ms to %s"};
    private final SQLiteDatabase f3999f;
    private final Context f4000g;

    private void m6191a(android.database.sqlite.SQLiteQueryBuilder r8, android.database.sqlite.SQLiteDatabase r9, java.lang.String[] r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /* JADX: method processing error */
/*
Error: java.util.NoSuchElementException
	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1439)
	at java.util.HashMap$KeyIterator.next(HashMap.java:1461)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.applyRemove(BlockFinallyExtract.java:535)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.extractFinally(BlockFinallyExtract.java:175)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.processExceptionHandler(BlockFinallyExtract.java:80)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:51)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r7 = this;
        r4 = 0;
        r0 = r8;
        r1 = r10;
        r2 = r11;
        r3 = r12;
        r5 = r13;
        r6 = r14;
        r1 = r0.buildQuery(r1, r2, r3, r4, r5, r6);
        r0 = r7.m6193f();
        r0 = java.util.regex.Pattern.matches(r0, r1);
        if (r0 != 0) goto L_0x0016;
    L_0x0015:
        return;
    L_0x0016:
        r2 = "explain query plan ";
        r0 = java.lang.String.valueOf(r1);
        r3 = r0.length();
        if (r3 == 0) goto L_0x0098;
    L_0x0022:
        r0 = r2.concat(r0);
    L_0x0026:
        r2 = r9.rawQuery(r0, r4);
        if (r2 == 0) goto L_0x0091;
    L_0x002c:
        r0 = r2.moveToFirst();	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        if (r0 == 0) goto L_0x0091;	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
    L_0x0032:
        r0 = "detail";	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r0 = r2.getColumnIndex(r0);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3.<init>();	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
    L_0x003d:
        r4 = r2.getString(r0);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3.append(r4);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r4 = "\n";	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3.append(r4);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r4 = r2.moveToNext();	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        if (r4 != 0) goto L_0x003d;	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
    L_0x004f:
        r0 = r3.length();	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        if (r0 <= 0) goto L_0x005e;	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
    L_0x0055:
        r0 = r3.length();	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r0 = r0 + -1;	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3.setLength(r0);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
    L_0x005e:
        r0 = r3.toString();	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r4 = r4.length();	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r4 = r4 + 20;	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r5 = java.lang.String.valueOf(r0);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r5 = r5.length();	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r4 = r4 + r5;	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3.<init>(r4);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r4 = "for query ";	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r1 = r3.append(r1);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3 = "\nplan is: ";	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r1 = r1.append(r3);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r1.append(r0);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
    L_0x0091:
        if (r2 == 0) goto L_0x0015;
    L_0x0093:
        r2.close();
        goto L_0x0015;
    L_0x0098:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x0026;
    L_0x009e:
        r0 = move-exception;
        r1 = "Babel";	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        r3 = "Query plan failed ";	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        p000.glk.m17978c(r1, r3, r0);	 Catch:{ Exception -> 0x009e, all -> 0x00ad }
        if (r2 == 0) goto L_0x0015;
    L_0x00a8:
        r2.close();
        goto L_0x0015;
    L_0x00ad:
        r0 = move-exception;
        if (r2 == 0) goto L_0x00b3;
    L_0x00b0:
        r2.close();
    L_0x00b3:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bmv.a(android.database.sqlite.SQLiteQueryBuilder, android.database.sqlite.SQLiteDatabase, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static synchronized bmv m6189a(Context context, SQLiteDatabase sQLiteDatabase) {
        bmv bmv;
        synchronized (bmv.class) {
            if (f3994a == null || f3994a.f3999f != sQLiteDatabase) {
                f3994a = new bmv(context, sQLiteDatabase);
            }
            bmv = f3994a;
        }
        return bmv;
    }

    public bmv(Context context, SQLiteDatabase sQLiteDatabase) {
        this.f4000g = context;
        this.f3999f = sQLiteDatabase;
    }

    private static void m6190a(long j, String str) {
        int size = ((Stack) f3995b.get()).size();
        if (glj.m17956a() - j > 250) {
            String.format(Locale.US, f3998e[Math.min(f3998e.length - 1, size)], new Object[]{Long.valueOf(r2), str});
        }
    }

    public void m6202a() {
        long a = glj.m17956a();
        if (bmr.f3983a) {
            bmv.m6190a(a, ">>> beginTransaction");
        }
        bmx bmx = new bmx();
        bmx.f4001a = a;
        ((Stack) f3995b.get()).push(bmx);
        this.f3999f.beginTransactionNonExclusive();
    }

    public void m6207b() {
        ((bmx) ((Stack) f3995b.get()).peek()).f4002b = true;
        this.f3999f.setTransactionSuccessful();
    }

    public void m6208c() {
        long a;
        long j = 0;
        bmx bmx = (bmx) ((Stack) f3995b.get()).pop();
        if (!bmx.f4002b) {
            glk.m17981d("Babel", "endTransaction without setting successful", new Object[0]);
            for (StackTraceElement stackTraceElement : new Exception().getStackTrace()) {
                String str = "Babel";
                String str2 = "    ";
                String valueOf = String.valueOf(stackTraceElement.toString());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.m17981d(str, valueOf, new Object[0]);
            }
        }
        if (bmr.f3983a) {
            j = bmx.f4001a;
            a = glj.m17956a();
        } else {
            a = 0;
        }
        this.f3999f.endTransaction();
        if (bmx.f4002b && ((Stack) f3995b.get()).empty()) {
            synchronized (f3996c) {
                Set<Uri> set = f3997d;
                f3997d = new HashSet();
            }
            for (Uri uri : set) {
                bmv.m6192b(uri);
                this.f4000g.getContentResolver().notifyChange(uri, null);
            }
        }
        if (bmr.f3983a) {
            bmv.m6190a(a, String.format(Locale.US, ">>> endTransaction (total for this transaction: %d)", new Object[]{Long.valueOf(glj.m17956a() - j)}));
        }
    }

    private static void m6192b(Uri uri) {
        if (EsProvider.f6005h.getPath().equals(uri.getPath())) {
            glk.m17979c("Babel", "notifyChange for %s", uri);
        }
    }

    public void m6209d() {
        long j = 0;
        if (bmr.f3983a) {
            j = glj.m17956a();
        }
        if (this.f3999f.yieldIfContendedSafely() && bmr.f3983a) {
            bmv.m6190a(j, "yieldTransaction");
        }
    }

    public void m6203a(Uri uri) {
        if (((Stack) f3995b.get()).empty()) {
            bmv.m6192b(uri);
            this.f4000g.getContentResolver().notifyChange(uri, null);
            return;
        }
        synchronized (f3996c) {
            f3997d.add(uri);
        }
    }

    private String m6193f() {
        return ((biw) jyn.m25426a(this.f4000g, biw.class)).mo562a("babel_query_plan_regexp", null);
    }

    public Cursor m6201a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        long a;
        if (m6193f() != null) {
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables(str);
            m6191a(sQLiteQueryBuilder, this.f3999f, strArr, str2, str3, str5, str6);
        }
        if (bmr.f3983a) {
            a = glj.m17956a();
        } else {
            a = 0;
        }
        Cursor query = this.f3999f.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        if (bmr.f3983a) {
            bmv.m6190a(a, String.format(Locale.US, "query %s with %s ==> %d", new Object[]{str, str2, Integer.valueOf(query.getCount())}));
        }
        return query;
    }

    public Cursor m6200a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return m6201a(str, strArr, str2, strArr2, null, null, str5, null);
    }

    public Cursor m6198a(SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        long a;
        if (m6193f() != null) {
            m6191a(sQLiteQueryBuilder, this.f3999f, strArr, str, null, str4, str5);
        }
        if (bmr.f3983a) {
            a = glj.m17956a();
        } else {
            a = 0;
        }
        Cursor query = sQLiteQueryBuilder.query(this.f3999f, strArr, str, strArr2, null, null, str4, str5);
        if (bmr.f3983a) {
            bmv.m6190a(a, String.format(Locale.US, "query %s with %s ==> %d", new Object[]{sQLiteQueryBuilder.getTables(), str, Integer.valueOf(query.getCount())}));
        }
        return query;
    }

    public Cursor m6199a(String str, String[] strArr) {
        long j = 0;
        if (bmr.f3983a) {
            j = glj.m17956a();
        }
        Cursor rawQuery = this.f3999f.rawQuery(str, strArr);
        if (bmr.f3983a) {
            bmv.m6190a(j, String.format(Locale.US, "rawQuery %s ==> %d", new Object[]{str, Integer.valueOf(rawQuery.getCount())}));
        }
        return rawQuery;
    }

    public int m6194a(String str, ContentValues contentValues, String str2, String[] strArr) {
        long j = 0;
        if (bmr.f3983a) {
            j = glj.m17956a();
        }
        int update = this.f3999f.update(str, contentValues, str2, strArr);
        if (bmr.f3983a) {
            bmv.m6190a(j, String.format(Locale.US, "update %s with %s ==> %d", new Object[]{str, str2, Integer.valueOf(update)}));
        }
        return update;
    }

    public int m6196a(String str, String str2, String[] strArr) {
        long j = 0;
        if (bmr.f3983a) {
            j = glj.m17956a();
        }
        int delete = this.f3999f.delete(str, str2, strArr);
        if (bmr.f3983a) {
            bmv.m6190a(j, String.format(Locale.US, "delete from %s with %s ==> %d", new Object[]{str, str2, Integer.valueOf(delete)}));
        }
        return delete;
    }

    public long m6197a(String str, String str2, ContentValues contentValues) {
        long j = 0;
        if (bmr.f3983a) {
            j = glj.m17956a();
        }
        long insert = this.f3999f.insert(str, null, contentValues);
        if (bmr.f3983a) {
            bmv.m6190a(j, String.format(Locale.US, "insert to %s", new Object[]{str}));
        }
        return insert;
    }

    public void m6206a(Locale locale) {
        this.f3999f.setLocale(locale);
    }

    public void m6204a(String str) {
        long j = 0;
        if (bmr.f3983a) {
            j = glj.m17956a();
        }
        this.f3999f.execSQL(str);
        if (bmr.f3983a) {
            bmv.m6190a(j, String.format(Locale.US, "execSQL %s", new Object[]{str}));
        }
    }

    public void m6205a(String str, Object[] objArr) {
        long j = 0;
        if (bmr.f3983a) {
            j = glj.m17956a();
        }
        this.f3999f.execSQL(str, objArr);
        if (bmr.f3983a) {
            bmv.m6190a(j, String.format(Locale.US, "execSQL %s", new Object[]{str}));
        }
    }

    public int m6195a(String str, String str2) {
        long j = 0;
        if (bmr.f3983a) {
            j = glj.m17956a();
        }
        SQLiteStatement compileStatement = this.f3999f.compileStatement(str);
        if (str2 != null) {
            compileStatement.bindString(1, str2);
        }
        int executeUpdateDelete = compileStatement.executeUpdateDelete();
        if (bmr.f3983a) {
            bmv.m6190a(j, String.format(Locale.US, "execSQLUpdateDelete %s", new Object[]{str}));
        }
        return executeUpdateDelete;
    }

    public SQLiteDatabase m6210e() {
        return this.f3999f;
    }
}
