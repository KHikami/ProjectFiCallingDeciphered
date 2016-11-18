package p000;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

public final class efa implements Cursor {
    private final Cursor f11333a;
    private final long f11334b;

    public efa(Cursor cursor, long j) {
        this.f11333a = cursor;
        this.f11334b = j;
    }

    public long m13745a() {
        return this.f11334b;
    }

    public int getCount() {
        return this.f11333a.getCount();
    }

    public int getPosition() {
        return this.f11333a.getPosition();
    }

    public boolean move(int i) {
        return this.f11333a.move(i);
    }

    public boolean moveToPosition(int i) {
        return this.f11333a.moveToPosition(i);
    }

    public boolean moveToFirst() {
        return this.f11333a.moveToFirst();
    }

    public boolean moveToLast() {
        return this.f11333a.moveToLast();
    }

    public boolean moveToNext() {
        return this.f11333a.moveToNext();
    }

    public boolean moveToPrevious() {
        return this.f11333a.moveToPrevious();
    }

    public boolean isFirst() {
        return this.f11333a.isFirst();
    }

    public boolean isLast() {
        return this.f11333a.isLast();
    }

    public boolean isBeforeFirst() {
        return this.f11333a.isBeforeFirst();
    }

    public boolean isAfterLast() {
        return this.f11333a.isAfterLast();
    }

    public int getColumnIndex(String str) {
        return this.f11333a.getColumnIndex(str);
    }

    public int getColumnIndexOrThrow(String str) {
        return this.f11333a.getColumnIndexOrThrow(str);
    }

    public String getColumnName(int i) {
        return this.f11333a.getColumnName(i);
    }

    public String[] getColumnNames() {
        return this.f11333a.getColumnNames();
    }

    public int getColumnCount() {
        return this.f11333a.getColumnCount();
    }

    public byte[] getBlob(int i) {
        return this.f11333a.getBlob(i);
    }

    public String getString(int i) {
        return this.f11333a.getString(i);
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.f11333a.copyStringToBuffer(i, charArrayBuffer);
    }

    public short getShort(int i) {
        return this.f11333a.getShort(i);
    }

    public int getInt(int i) {
        return this.f11333a.getInt(i);
    }

    public long getLong(int i) {
        return this.f11333a.getLong(i);
    }

    public float getFloat(int i) {
        return this.f11333a.getFloat(i);
    }

    public double getDouble(int i) {
        return this.f11333a.getDouble(i);
    }

    public int getType(int i) {
        return this.f11333a.getType(i);
    }

    public boolean isNull(int i) {
        return this.f11333a.isNull(i);
    }

    @Deprecated
    public void deactivate() {
        this.f11333a.deactivate();
    }

    @Deprecated
    public boolean requery() {
        return this.f11333a.requery();
    }

    public void close() {
        this.f11333a.close();
    }

    public boolean isClosed() {
        return this.f11333a.isClosed();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.f11333a.registerContentObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.f11333a.unregisterContentObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f11333a.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f11333a.unregisterDataSetObserver(dataSetObserver);
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.f11333a.setNotificationUri(contentResolver, uri);
    }

    public Uri getNotificationUri() {
        return this.f11333a.getNotificationUri();
    }

    public boolean getWantsAllOnMoveCalls() {
        return this.f11333a.getWantsAllOnMoveCalls();
    }

    public Bundle getExtras() {
        return this.f11333a.getExtras();
    }

    public void setExtras(Bundle bundle) {
        this.f11333a.setExtras(bundle);
    }

    public Bundle respond(Bundle bundle) {
        return this.f11333a.respond(bundle);
    }
}
