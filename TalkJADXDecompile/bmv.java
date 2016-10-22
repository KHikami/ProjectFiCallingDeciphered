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
import java.util.regex.Pattern;

public final class bmv {
    private static bmv a;
    private static ThreadLocal<Stack<bmx>> b;
    private static final Object c;
    private static Set<Uri> d;
    private static String[] e;
    private final SQLiteDatabase f;
    private final Context g;

    static {
        b = new bmw();
        c = new Object();
        d = new HashSet();
        e = new String[]{"took %d ms to %s", "   took %d ms to %s", "      took %d ms to %s"};
    }

    public static synchronized bmv a(Context context, SQLiteDatabase sQLiteDatabase) {
        bmv bmv;
        synchronized (bmv.class) {
            if (a == null || a.f != sQLiteDatabase) {
                a = new bmv(context, sQLiteDatabase);
            }
            bmv = a;
        }
        return bmv;
    }

    public bmv(Context context, SQLiteDatabase sQLiteDatabase) {
        this.g = context;
        this.f = sQLiteDatabase;
    }

    private static void a(long j, String str) {
        int size = ((Stack) b.get()).size();
        if (glj.a() - j > 250) {
            String.format(Locale.US, e[Math.min(e.length - 1, size)], new Object[]{Long.valueOf(r2), str});
        }
    }

    public void a() {
        long a = glj.a();
        if (bmr.a) {
            a(a, ">>> beginTransaction");
        }
        bmx bmx = new bmx();
        bmx.a = a;
        ((Stack) b.get()).push(bmx);
        this.f.beginTransactionNonExclusive();
    }

    public void b() {
        ((bmx) ((Stack) b.get()).peek()).b = true;
        this.f.setTransactionSuccessful();
    }

    public void c() {
        long a;
        long j = 0;
        bmx bmx = (bmx) ((Stack) b.get()).pop();
        if (!bmx.b) {
            glk.d("Babel", "endTransaction without setting successful", new Object[0]);
            for (StackTraceElement stackTraceElement : new Exception().getStackTrace()) {
                String str = "Babel";
                String str2 = "    ";
                String valueOf = String.valueOf(stackTraceElement.toString());
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                glk.d(str, valueOf, new Object[0]);
            }
        }
        if (bmr.a) {
            j = bmx.a;
            a = glj.a();
        } else {
            a = 0;
        }
        this.f.endTransaction();
        if (bmx.b && ((Stack) b.get()).empty()) {
            synchronized (c) {
                Set<Uri> set = d;
                d = new HashSet();
            }
            for (Uri uri : set) {
                b(uri);
                this.g.getContentResolver().notifyChange(uri, null);
            }
        }
        if (bmr.a) {
            a(a, String.format(Locale.US, ">>> endTransaction (total for this transaction: %d)", new Object[]{Long.valueOf(glj.a() - j)}));
        }
    }

    private static void b(Uri uri) {
        if (EsProvider.h.getPath().equals(uri.getPath())) {
            glk.c("Babel", "notifyChange for %s", uri);
        }
    }

    public void d() {
        long j = 0;
        if (bmr.a) {
            j = glj.a();
        }
        if (this.f.yieldIfContendedSafely() && bmr.a) {
            a(j, "yieldTransaction");
        }
    }

    public void a(Uri uri) {
        if (((Stack) b.get()).empty()) {
            b(uri);
            this.g.getContentResolver().notifyChange(uri, null);
            return;
        }
        synchronized (c) {
            d.add(uri);
        }
    }

    private String f() {
        return ((biw) jyn.a(this.g, biw.class)).a("babel_query_plan_regexp", null);
    }

    private void a(SQLiteQueryBuilder sQLiteQueryBuilder, SQLiteDatabase sQLiteDatabase, String[] strArr, String str, String str2, String str3, String str4) {
        Object buildQuery = sQLiteQueryBuilder.buildQuery(strArr, str, str2, null, str3, str4);
        if (Pattern.matches(f(), buildQuery)) {
            String str5 = "explain query plan ";
            String valueOf = String.valueOf(buildQuery);
            if (valueOf.length() != 0) {
                valueOf = str5.concat(valueOf);
            } else {
                valueOf = new String(str5);
            }
            Cursor rawQuery = sQLiteDatabase.rawQuery(valueOf, null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        int columnIndex = rawQuery.getColumnIndex("detail");
                        StringBuilder stringBuilder = new StringBuilder();
                        do {
                            stringBuilder.append(rawQuery.getString(columnIndex));
                            stringBuilder.append("\n");
                        } while (rawQuery.moveToNext());
                        if (stringBuilder.length() > 0) {
                            stringBuilder.setLength(stringBuilder.length() - 1);
                        }
                        valueOf = String.valueOf(stringBuilder.toString());
                        new StringBuilder((String.valueOf(buildQuery).length() + 20) + String.valueOf(valueOf).length()).append("for query ").append(buildQuery).append("\nplan is: ").append(valueOf);
                    }
                } catch (Throwable e) {
                    glk.c("Babel", "Query plan failed ", e);
                    if (rawQuery != null) {
                        rawQuery.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        }
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        long a;
        if (f() != null) {
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            sQLiteQueryBuilder.setTables(str);
            a(sQLiteQueryBuilder, this.f, strArr, str2, str3, str5, str6);
        }
        if (bmr.a) {
            a = glj.a();
        } else {
            a = 0;
        }
        Cursor query = this.f.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        if (bmr.a) {
            a(a, String.format(Locale.US, "query %s with %s ==> %d", new Object[]{str, str2, Integer.valueOf(query.getCount())}));
        }
        return query;
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        return a(str, strArr, str2, strArr2, null, null, str5, null);
    }

    public Cursor a(SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        long a;
        if (f() != null) {
            a(sQLiteQueryBuilder, this.f, strArr, str, null, str4, str5);
        }
        if (bmr.a) {
            a = glj.a();
        } else {
            a = 0;
        }
        Cursor query = sQLiteQueryBuilder.query(this.f, strArr, str, strArr2, null, null, str4, str5);
        if (bmr.a) {
            a(a, String.format(Locale.US, "query %s with %s ==> %d", new Object[]{sQLiteQueryBuilder.getTables(), str, Integer.valueOf(query.getCount())}));
        }
        return query;
    }

    public Cursor a(String str, String[] strArr) {
        long j = 0;
        if (bmr.a) {
            j = glj.a();
        }
        Cursor rawQuery = this.f.rawQuery(str, strArr);
        if (bmr.a) {
            a(j, String.format(Locale.US, "rawQuery %s ==> %d", new Object[]{str, Integer.valueOf(rawQuery.getCount())}));
        }
        return rawQuery;
    }

    public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        long j = 0;
        if (bmr.a) {
            j = glj.a();
        }
        int update = this.f.update(str, contentValues, str2, strArr);
        if (bmr.a) {
            a(j, String.format(Locale.US, "update %s with %s ==> %d", new Object[]{str, str2, Integer.valueOf(update)}));
        }
        return update;
    }

    public int a(String str, String str2, String[] strArr) {
        long j = 0;
        if (bmr.a) {
            j = glj.a();
        }
        int delete = this.f.delete(str, str2, strArr);
        if (bmr.a) {
            a(j, String.format(Locale.US, "delete from %s with %s ==> %d", new Object[]{str, str2, Integer.valueOf(delete)}));
        }
        return delete;
    }

    public long a(String str, String str2, ContentValues contentValues) {
        long j = 0;
        if (bmr.a) {
            j = glj.a();
        }
        long insert = this.f.insert(str, null, contentValues);
        if (bmr.a) {
            a(j, String.format(Locale.US, "insert to %s", new Object[]{str}));
        }
        return insert;
    }

    public void a(Locale locale) {
        this.f.setLocale(locale);
    }

    public void a(String str) {
        long j = 0;
        if (bmr.a) {
            j = glj.a();
        }
        this.f.execSQL(str);
        if (bmr.a) {
            a(j, String.format(Locale.US, "execSQL %s", new Object[]{str}));
        }
    }

    public void a(String str, Object[] objArr) {
        long j = 0;
        if (bmr.a) {
            j = glj.a();
        }
        this.f.execSQL(str, objArr);
        if (bmr.a) {
            a(j, String.format(Locale.US, "execSQL %s", new Object[]{str}));
        }
    }

    public int a(String str, String str2) {
        long j = 0;
        if (bmr.a) {
            j = glj.a();
        }
        SQLiteStatement compileStatement = this.f.compileStatement(str);
        if (str2 != null) {
            compileStatement.bindString(1, str2);
        }
        int executeUpdateDelete = compileStatement.executeUpdateDelete();
        if (bmr.a) {
            a(j, String.format(Locale.US, "execSQLUpdateDelete %s", new Object[]{str}));
        }
        return executeUpdateDelete;
    }

    public SQLiteDatabase e() {
        return this.f;
    }
}
