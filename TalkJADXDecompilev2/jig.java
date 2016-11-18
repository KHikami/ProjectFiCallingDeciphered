package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class jig implements jia {
    static final jig a = new jig();

    private jig() {
    }

    public String a() {
        return "__master_partition__";
    }

    public String[] b() {
        return new String[]{"partition_versions", "partition_tables", "partition_views"};
    }

    public String[] c() {
        return new String[0];
    }

    public void a(SQLiteDatabase sQLiteDatabase, String str) {
        if (TextUtils.equals(str, a())) {
            throw new IllegalArgumentException("Cannot delete the master partition");
        }
        String[] strArr = new String[]{str};
        sQLiteDatabase.delete("partition_versions", "partition_name=?", strArr);
        sQLiteDatabase.delete("partition_tables", "partition_name=?", strArr);
    }

    private void b(SQLiteDatabase sQLiteDatabase, jia jia) {
        Collection asList = Arrays.asList(jig.b(sQLiteDatabase, jia.a()));
        Collection asList2 = Arrays.asList(jia.b());
        Set<String> hashSet = new HashSet(asList);
        hashSet.removeAll(asList2);
        Set<String> hashSet2 = new HashSet(asList2);
        hashSet2.removeAll(asList);
        String[] strArr = new String[2];
        strArr[0] = jia.a();
        for (String str : hashSet) {
            strArr[1] = str;
            sQLiteDatabase.delete("partition_tables", "partition_name=? AND table_name=?", strArr);
        }
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("partition_name", jia.a());
        for (String str2 : hashSet2) {
            contentValues.put("table_name", str2);
            sQLiteDatabase.insert("partition_tables", null, contentValues);
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase, jia jia) {
        Collection asList = Arrays.asList(jig.c(sQLiteDatabase, jia.a()));
        Collection asList2 = Arrays.asList(jia.c());
        Set<String> hashSet = new HashSet(asList);
        hashSet.removeAll(asList2);
        Set<String> hashSet2 = new HashSet(asList2);
        hashSet2.removeAll(asList);
        String[] strArr = new String[2];
        strArr[0] = jia.a();
        for (String str : hashSet) {
            strArr[1] = str;
            sQLiteDatabase.delete("partition_views", "partition_name=? AND view_name=?", strArr);
        }
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("partition_name", jia.a());
        for (String str2 : hashSet2) {
            contentValues.put("view_name", str2);
            sQLiteDatabase.insert("partition_views", null, contentValues);
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        if (Log.isLoggable("PartitionedDatabase", 3)) {
            String str = "onCreate: ";
            String valueOf = String.valueOf(a());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        sQLiteDatabase.execSQL("CREATE TABLE partition_versions (partition_name TEXT NOT NULL PRIMARY KEY,version INT NOT NULL DEFAULT(0));");
        sQLiteDatabase.execSQL("CREATE TABLE partition_tables (partition_name TEXT NOT NULL,table_name TEXT NOT NULL,UNIQUE (partition_name,table_name));");
        sQLiteDatabase.execSQL("CREATE TABLE partition_views (partition_name TEXT NOT NULL,view_name TEXT NOT NULL,UNIQUE (partition_name,view_name));");
    }

    public boolean a(int i, int i2) {
        if (Log.isLoggable("PartitionedDatabase", 4)) {
            new StringBuilder(53).append("Upgrade master partition: ").append(i).append(" --> ").append(i2);
        }
        return true;
    }

    static Map<String, Integer> b(SQLiteDatabase sQLiteDatabase) {
        Map<String, Integer> hashMap = new HashMap();
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("partition_versions", new String[]{"partition_name", "version"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                hashMap.put(query.getString(0), Integer.valueOf(query.getInt(1)));
            } finally {
                query.close();
            }
        }
        return hashMap;
    }

    static String[] b(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("partition_tables", new String[]{"table_name"}, "partition_name=?", new String[]{str}, null, null, null);
        String[] strArr = new String[query.getCount()];
        int i = 0;
        while (query.moveToNext()) {
            try {
                int i2 = i + 1;
                strArr[i] = query.getString(0);
                i = i2;
            } finally {
                query.close();
            }
        }
        return strArr;
    }

    static String[] c(SQLiteDatabase sQLiteDatabase, String str) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query("partition_views", new String[]{"view_name"}, "partition_name=?", new String[]{str}, null, null, null);
        String[] strArr = new String[query.getCount()];
        int i = 0;
        while (query.moveToNext()) {
            try {
                int i2 = i + 1;
                strArr[i] = query.getString(0);
                i = i2;
            } finally {
                query.close();
            }
        }
        return strArr;
    }

    void a(SQLiteDatabase sQLiteDatabase, jia jia) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("partition_name", jia.a());
        contentValues.put("version", Integer.valueOf(1));
        sQLiteDatabase.replace("partition_versions", null, contentValues);
        b(sQLiteDatabase, jia);
        c(sQLiteDatabase, jia);
    }
}
