package com.google.android.apps.hangouts.mergedcontacts.impl;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import bmr;
import bxt;
import dwz;
import dxa;
import dxu;
import glj;
import glk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import jyn;
import wi;

public class MergedContactProviderImpl extends dwz {
    private static final UriMatcher k;

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String queryParameter = uri.getQueryParameter("account_id");
        if (queryParameter == null) {
            String valueOf = String.valueOf("Every URI must have the 'account_id' parameter specified.\nURI: ");
            String valueOf2 = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString());
        }
        Collection arrayList;
        int parseInt = Integer.parseInt(queryParameter);
        if (strArr2 == null) {
            arrayList = new ArrayList();
        } else {
            Object asList = Arrays.asList(strArr2);
        }
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        String[] strArr3 = (String[]) strArr.clone();
        switch (k.match(uri)) {
            case wi.w /*0*/:
                sQLiteQueryBuilder.setTables("merged_contacts");
                break;
            case wi.j /*1*/:
                CharSequence queryParameter2 = uri.getQueryParameter("gaia_id");
                CharSequence queryParameter3 = uri.getQueryParameter("phone_number");
                CharSequence queryParameter4 = uri.getQueryParameter("contact_lookup_key");
                Object queryParameter5 = uri.getQueryParameter("conversation_type");
                CharSequence queryParameter6 = uri.getQueryParameter("query");
                String queryParameter7 = uri.getQueryParameter("is_frequent");
                Object obj = uri.getQueryParameter("wait_for_contact_merger") != null ? 1 : null;
                Object obj2 = queryParameter7 != null ? 1 : null;
                Object obj3 = null;
                int a = a(strArr, dxa.SEARCH_TYPE);
                int a2 = a(strArr, dxa.SEARCH_INDEX);
                if (TextUtils.isEmpty(queryParameter6)) {
                    sQLiteQueryBuilder.setTables("merged_contacts_with_details");
                    if (a != -1) {
                        strArr3[a] = String.format(Locale.getDefault(), "NULL AS %s", new Object[]{"search_type"});
                    }
                    if (a2 != -1) {
                        strArr3[a2] = String.format(Locale.getDefault(), "NULL AS %s", new Object[]{"search_index"});
                    }
                } else {
                    queryParameter7 = String.format(Locale.getDefault(), "%1$s LEFT OUTER JOIN %2$s ON (%1$s.%5$s = %2$s.%6$s AND (%2$s.%7$s like ? || '%%' OR %2$s.%7$s like '%% ' || ? || '%%')) LEFT OUTER JOIN %3$s ON (%1$s.%5$s = %3$s.%6$s AND %3$s.%7$s like ? || '%%') LEFT OUTER JOIN %4$s ON (%1$s.%5$s = %4$s.%6$s AND %4$s.%7$s like '%%' || ? || '%%')", new Object[]{"merged_contacts_with_details", "search_merged_contacts_with_details_by_display_name", "search_merged_contacts_with_details_by_email", "search_merged_contacts_with_details_by_phone_number", "_id", "merged_contact_id", "search_index"});
                    Collections.addAll(arrayList, new String[]{queryParameter6, queryParameter6, queryParameter6, queryParameter6});
                    sQLiteQueryBuilder.setTables(queryParameter7);
                    sQLiteQueryBuilder.appendWhere(String.format(Locale.getDefault(), "(%s.%s NOTNULL OR %s.%2$s NOTNULL OR %s.%2$s NOTNULL)", new Object[]{"search_merged_contacts_with_details_by_display_name", "search_type", "search_merged_contacts_with_details_by_email", "search_merged_contacts_with_details_by_phone_number"}));
                    obj3 = 1;
                    if (a != -1) {
                        strArr3[a] = String.format(Locale.getDefault(), "CASE WHEN %1$s.%4$s NOTNULL THEN %1$s.%4$s ELSE CASE WHEN %2$s.%4$s NOTNULL THEN %2$s.%4$s ELSE CASE WHEN %3$s.%4$s NOTNULL THEN %3$s.%4$s ELSE NULL END END END AS %4$s", new Object[]{"search_merged_contacts_with_details_by_display_name", "search_merged_contacts_with_details_by_email", "search_merged_contacts_with_details_by_phone_number", "search_type"});
                    }
                    if (a2 != -1) {
                        strArr3[a2] = String.format(Locale.getDefault(), "CASE WHEN %1$s.%4$s NOTNULL THEN %1$s.%4$s ELSE CASE WHEN %2$s.%4$s NOTNULL THEN %2$s.%4$s ELSE CASE WHEN %3$s.%4$s NOTNULL THEN %3$s.%4$s ELSE NULL END END END AS %4$s", new Object[]{"search_merged_contacts_with_details_by_display_name", "search_merged_contacts_with_details_by_email", "search_merged_contacts_with_details_by_phone_number", "search_index"});
                    }
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    sQLiteQueryBuilder.appendWhere("_id in (select merged_contact_id from merged_contact_details where gaia_id = ?)");
                    Collections.addAll(arrayList, new String[]{queryParameter2});
                    obj3 = 1;
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    sQLiteQueryBuilder.appendWhere("_id in (select merged_contact_id from merged_contact_details where lookup_data_standardized = ? OR lookup_data = ?)");
                    Collections.addAll(arrayList, new String[]{queryParameter3, queryParameter3});
                    obj3 = 1;
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    if (obj3 != null) {
                        sQLiteQueryBuilder.appendWhere(" AND ");
                    }
                    sQLiteQueryBuilder.appendWhere("contact_lookup_key = ?");
                    Collections.addAll(arrayList, new String[]{queryParameter4});
                    obj3 = 1;
                }
                if (!TextUtils.isEmpty(queryParameter5) && Integer.parseInt(queryParameter5) == bxt.SMS_MESSAGE.ordinal()) {
                    if (obj3 != null) {
                        sQLiteQueryBuilder.appendWhere(" AND ");
                    }
                    sQLiteQueryBuilder.appendWhere("has_phone_number");
                    obj3 = 1;
                }
                if (obj2 != null) {
                    if (obj3 != null) {
                        sQLiteQueryBuilder.appendWhere(" AND ");
                    }
                    sQLiteQueryBuilder.appendWhere("is_frequent");
                }
                if (obj != null) {
                    ((dxu) jyn.a(getContext(), dxu.class)).a(parseInt);
                    break;
                }
                break;
            case wi.l /*2*/:
                sQLiteQueryBuilder.setTables("merged_contact_details");
                break;
        }
        long b = glj.b();
        Cursor a3 = bmr.a(getContext(), parseInt).a().a(sQLiteQueryBuilder, strArr3, str, (String[]) arrayList.toArray(new String[arrayList.size()]), null, null, str2, null);
        long b2 = glj.b() - b;
        valueOf = String.valueOf(sQLiteQueryBuilder.getTables());
        glk.a("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 38).append("querying ").append(valueOf).append(" took ").append(b2).append(" ms").toString(), new Object[0]);
        a3.setNotificationUri(getContext().getContentResolver(), uri);
        return a3;
    }

    public boolean onCreate() {
        return true;
    }

    public String getType(Uri uri) {
        String str = "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.";
        String valueOf;
        switch (k.match(uri)) {
            case wi.w /*0*/:
                valueOf = String.valueOf(str);
                str = String.valueOf("merged_contacts");
                return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            case wi.j /*1*/:
                valueOf = String.valueOf(str);
                str = String.valueOf("merged_contacts_with_details");
                return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            case wi.l /*2*/:
                valueOf = String.valueOf(str);
                str = String.valueOf("merged_contact_details");
                return str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
            default:
                valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Unknown URI: ").append(valueOf).toString());
        }
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    private static int a(String[] strArr, dxa dxa) {
        for (int i = 0; i < strArr.length; i++) {
            if (dxa.a().equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI(a, "merged_contacts", 0);
        uriMatcher.addURI(a, "merged_contacts_with_details", 1);
        uriMatcher.addURI(a, "merged_contact_details", 2);
        k = uriMatcher;
    }
}
