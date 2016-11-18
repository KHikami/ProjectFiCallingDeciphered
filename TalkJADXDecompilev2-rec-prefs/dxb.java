package p000;

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

public final class dxb implements fnb {
    private final String f10705a;
    private final Cursor f10706b;

    public dxb(String str, Cursor cursor) {
        this.f10705a = str;
        this.f10706b = cursor;
    }

    public bjg mo592a() {
        Object string = getString(dxa.DETAILS.m12956b());
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
                        bjf.m5369a(str);
                    }
                    if (!TextUtils.isEmpty(obj3)) {
                        bjf.m5372b(obj3);
                    }
                }
                if (parseInt == 0) {
                    boolean d = gld.m17948d(Integer.parseInt(split2[4]));
                    boolean d2 = gld.m17948d(Integer.parseInt(split2[5]));
                    bjo bjo = new bjo(split2[3], split2[1], split2[2], split2[10], d);
                    arrayList.add(bjo);
                    if (bjf != null) {
                        bjf.m5368a(bjo);
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
                        bjf.m5367a(bje);
                    }
                }
            }
        }
        bjk b = new bjk().m5446b(getString(dxa.AVATAR_URL.m12956b()));
        boolean z = obj != null || (kyVar.isEmpty() && gld.m17948d(getInt(dxa.NEEDS_GAIA_IDS_RESOLVED.m12956b())));
        bjk a = b.m5448b(z).m5445a(gld.m17948d(getInt(dxa.IS_HANGOUTS_USER.m12956b()))).m5457f(gld.m17948d(getInt(dxa.IS_FREQUENT.m12956b()))).m5441a(bjh.values()[getInt(dxa.CONTACT_SOURCE.m12956b())]).m5443a(getString(dxa.DISPLAY_NAME.m12956b())).m5444a(kyVar.values()).m5450c(arrayList).m5447b(arrayList2).m5460i(getString(dxa.PERSON_LOGGING_ID.m12956b())).m5439a(getFloat(dxa.PERSON_AFFINITY_SCORE.m12956b()));
        if (!isNull(dxa.CONTACT_LOOKUP_KEY.m12956b())) {
            a.m5452d(String.valueOf(getString(dxa.CONTACT_LOOKUP_KEY.m12956b())));
        }
        if (!isNull(dxa.CONTACT_ID.m12956b())) {
            a.m5454e(String.valueOf(getLong(dxa.CONTACT_ID.m12956b())));
        }
        if (!isNull(dxa.SEARCH_TYPE.m12956b())) {
            String string2 = getString(dxa.SEARCH_TYPE.m12956b());
            bji bji = bji.NONE;
            for (bji bji2 : bji.values()) {
                if (string2.equals(bji2.m5408a())) {
                    break;
                }
            }
            bji bji22 = bji;
            a.m5442a(bji22);
        }
        if (!isNull(dxa.SEARCH_INDEX.m12956b())) {
            a.m5456f(getString(dxa.SEARCH_INDEX.m12956b()));
        }
        return a.m5438a();
    }

    public int getCount() {
        return this.f10706b.getCount();
    }

    public int getPosition() {
        return this.f10706b.getPosition();
    }

    public boolean move(int i) {
        return this.f10706b.move(i);
    }

    public boolean moveToPosition(int i) {
        return this.f10706b.moveToPosition(i);
    }

    public boolean moveToFirst() {
        return this.f10706b.moveToFirst();
    }

    public boolean moveToLast() {
        return this.f10706b.moveToLast();
    }

    public boolean moveToNext() {
        return this.f10706b.moveToNext();
    }

    public boolean moveToPrevious() {
        return this.f10706b.moveToPrevious();
    }

    public boolean isFirst() {
        return this.f10706b.isFirst();
    }

    public boolean isLast() {
        return this.f10706b.isLast();
    }

    public boolean isBeforeFirst() {
        return this.f10706b.isBeforeFirst();
    }

    public boolean isAfterLast() {
        return this.f10706b.isAfterLast();
    }

    public int getColumnIndex(String str) {
        return this.f10706b.getColumnIndex(str);
    }

    public int getColumnIndexOrThrow(String str) {
        return this.f10706b.getColumnIndexOrThrow(str);
    }

    public String getColumnName(int i) {
        return this.f10706b.getColumnName(i);
    }

    public String[] getColumnNames() {
        return this.f10706b.getColumnNames();
    }

    public int getColumnCount() {
        return this.f10706b.getColumnCount();
    }

    public byte[] getBlob(int i) {
        return this.f10706b.getBlob(i);
    }

    public String getString(int i) {
        return this.f10706b.getString(i);
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.f10706b.copyStringToBuffer(i, charArrayBuffer);
    }

    public short getShort(int i) {
        return this.f10706b.getShort(i);
    }

    public int getInt(int i) {
        return this.f10706b.getInt(i);
    }

    public long getLong(int i) {
        return this.f10706b.getLong(i);
    }

    public float getFloat(int i) {
        return this.f10706b.getFloat(i);
    }

    public double getDouble(int i) {
        return this.f10706b.getDouble(i);
    }

    public int getType(int i) {
        return this.f10706b.getType(i);
    }

    public boolean isNull(int i) {
        return this.f10706b.isNull(i);
    }

    @Deprecated
    public void deactivate() {
        this.f10706b.deactivate();
    }

    @Deprecated
    public boolean requery() {
        return this.f10706b.requery();
    }

    public void close() {
        this.f10706b.close();
    }

    public boolean isClosed() {
        return this.f10706b.isClosed();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.f10706b.registerContentObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.f10706b.unregisterContentObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f10706b.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f10706b.unregisterDataSetObserver(dataSetObserver);
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.f10706b.setNotificationUri(contentResolver, uri);
    }

    public Uri getNotificationUri() {
        return this.f10706b.getNotificationUri();
    }

    public boolean getWantsAllOnMoveCalls() {
        return this.f10706b.getWantsAllOnMoveCalls();
    }

    public Bundle getExtras() {
        return this.f10706b.getExtras();
    }

    public void setExtras(Bundle bundle) {
        this.f10706b.setExtras(bundle);
    }

    public Bundle respond(Bundle bundle) {
        return this.f10706b.respond(bundle);
    }
}
