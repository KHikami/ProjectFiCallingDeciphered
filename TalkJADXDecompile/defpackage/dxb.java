package defpackage;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: dxb */
public final class dxb implements fnb {
    private final String a;
    private final Cursor b;

    public dxb(String str, Cursor cursor) {
        this.a = str;
        this.b = cursor;
    }

    public bjg a() {
        Object string = getString(dxa.DETAILS.b());
        Collection arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        Map kyVar = new ky();
        Object obj = null;
        if (!TextUtils.isEmpty(string)) {
            for (String split : string.split("#DELIM1#")) {
                bjf bjf;
                String[] split2 = split.split("#DELIM2#", -1);
                int parseInt = Integer.parseInt(split2[0]);
                Object obj2 = split2[6];
                String str = split2[7];
                Object obj3 = split2[8];
                if (TextUtils.isEmpty(obj2)) {
                    bjf = null;
                } else {
                    bjf bjf2 = (bjf) kyVar.get(obj2);
                    if (bjf2 == null) {
                        bjf2 = new bjf(obj2);
                        kyVar.put(obj2, bjf2);
                        bjf = bjf2;
                    } else {
                        bjf = bjf2;
                    }
                }
                if (bjf != null) {
                    if (!TextUtils.isEmpty(str)) {
                        bjf.a(str);
                    }
                    if (!TextUtils.isEmpty(obj3)) {
                        bjf.b(obj3);
                    }
                }
                if (parseInt == 0) {
                    boolean d = gld.d(Integer.parseInt(split2[4]));
                    boolean d2 = gld.d(Integer.parseInt(split2[5]));
                    bjo bjo = new bjo(split2[3], split2[1], split2[2], split2[10], d);
                    arrayList.add(bjo);
                    if (bjf != null) {
                        bjf.a(bjo);
                    }
                    if (d && d2) {
                        string = 1;
                    } else {
                        string = obj;
                    }
                    obj = string;
                } else if (parseInt == 1) {
                    bje bje = new bje(split2[3], split2[1]);
                    arrayList2.add(bje);
                    if (bjf != null) {
                        bjf.a(bje);
                    }
                }
            }
        }
        bjk b = new bjk().b(getString(dxa.AVATAR_URL.b()));
        boolean z = obj != null || (kyVar.isEmpty() && gld.d(getInt(dxa.NEEDS_GAIA_IDS_RESOLVED.b())));
        bjk a = b.b(z).a(gld.d(getInt(dxa.IS_HANGOUTS_USER.b()))).f(gld.d(getInt(dxa.IS_FREQUENT.b()))).a(bjh.values()[getInt(dxa.CONTACT_SOURCE.b())]).a(getString(dxa.DISPLAY_NAME.b())).a(kyVar.values()).c(arrayList).b(arrayList2).i(getString(dxa.PERSON_LOGGING_ID.b())).a(getFloat(dxa.PERSON_AFFINITY_SCORE.b()));
        if (!isNull(dxa.CONTACT_LOOKUP_KEY.b())) {
            a.d(String.valueOf(getString(dxa.CONTACT_LOOKUP_KEY.b())));
        }
        if (!isNull(dxa.CONTACT_ID.b())) {
            a.e(String.valueOf(getLong(dxa.CONTACT_ID.b())));
        }
        if (!isNull(dxa.SEARCH_TYPE.b())) {
            String string2 = getString(dxa.SEARCH_TYPE.b());
            bji bji = bji.NONE;
            for (bji bji2 : bji.values()) {
                if (string2.equals(bji2.a())) {
                    break;
                }
            }
            bji bji22 = bji;
            a.a(bji22);
        }
        if (!isNull(dxa.SEARCH_INDEX.b())) {
            a.f(getString(dxa.SEARCH_INDEX.b()));
        }
        return a.a();
    }

    public int getCount() {
        return this.b.getCount();
    }

    public int getPosition() {
        return this.b.getPosition();
    }

    public boolean move(int i) {
        return this.b.move(i);
    }

    public boolean moveToPosition(int i) {
        return this.b.moveToPosition(i);
    }

    public boolean moveToFirst() {
        return this.b.moveToFirst();
    }

    public boolean moveToLast() {
        return this.b.moveToLast();
    }

    public boolean moveToNext() {
        return this.b.moveToNext();
    }

    public boolean moveToPrevious() {
        return this.b.moveToPrevious();
    }

    public boolean isFirst() {
        return this.b.isFirst();
    }

    public boolean isLast() {
        return this.b.isLast();
    }

    public boolean isBeforeFirst() {
        return this.b.isBeforeFirst();
    }

    public boolean isAfterLast() {
        return this.b.isAfterLast();
    }

    public int getColumnIndex(String str) {
        return this.b.getColumnIndex(str);
    }

    public int getColumnIndexOrThrow(String str) {
        return this.b.getColumnIndexOrThrow(str);
    }

    public String getColumnName(int i) {
        return this.b.getColumnName(i);
    }

    public String[] getColumnNames() {
        return this.b.getColumnNames();
    }

    public int getColumnCount() {
        return this.b.getColumnCount();
    }

    public byte[] getBlob(int i) {
        return this.b.getBlob(i);
    }

    public String getString(int i) {
        return this.b.getString(i);
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.b.copyStringToBuffer(i, charArrayBuffer);
    }

    public short getShort(int i) {
        return this.b.getShort(i);
    }

    public int getInt(int i) {
        return this.b.getInt(i);
    }

    public long getLong(int i) {
        return this.b.getLong(i);
    }

    public float getFloat(int i) {
        return this.b.getFloat(i);
    }

    public double getDouble(int i) {
        return this.b.getDouble(i);
    }

    public int getType(int i) {
        return this.b.getType(i);
    }

    public boolean isNull(int i) {
        return this.b.isNull(i);
    }

    @Deprecated
    public void deactivate() {
        this.b.deactivate();
    }

    @Deprecated
    public boolean requery() {
        return this.b.requery();
    }

    public void close() {
        this.b.close();
    }

    public boolean isClosed() {
        return this.b.isClosed();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.b.registerContentObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.b.unregisterContentObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.unregisterDataSetObserver(dataSetObserver);
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.b.setNotificationUri(contentResolver, uri);
    }

    public Uri getNotificationUri() {
        return this.b.getNotificationUri();
    }

    public boolean getWantsAllOnMoveCalls() {
        return this.b.getWantsAllOnMoveCalls();
    }

    public Bundle getExtras() {
        return this.b.getExtras();
    }

    public void setExtras(Bundle bundle) {
        this.b.setExtras(bundle);
    }

    public Bundle respond(Bundle bundle) {
        return this.b.respond(bundle);
    }
}
