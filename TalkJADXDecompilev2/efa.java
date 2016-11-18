package defpackage;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

public final class efa implements Cursor {
    private final Cursor a;
    private final long b;

    public efa(Cursor cursor, long j) {
        this.a = cursor;
        this.b = j;
    }

    public long a() {
        return this.b;
    }

    public int getCount() {
        return this.a.getCount();
    }

    public int getPosition() {
        return this.a.getPosition();
    }

    public boolean move(int i) {
        return this.a.move(i);
    }

    public boolean moveToPosition(int i) {
        return this.a.moveToPosition(i);
    }

    public boolean moveToFirst() {
        return this.a.moveToFirst();
    }

    public boolean moveToLast() {
        return this.a.moveToLast();
    }

    public boolean moveToNext() {
        return this.a.moveToNext();
    }

    public boolean moveToPrevious() {
        return this.a.moveToPrevious();
    }

    public boolean isFirst() {
        return this.a.isFirst();
    }

    public boolean isLast() {
        return this.a.isLast();
    }

    public boolean isBeforeFirst() {
        return this.a.isBeforeFirst();
    }

    public boolean isAfterLast() {
        return this.a.isAfterLast();
    }

    public int getColumnIndex(String str) {
        return this.a.getColumnIndex(str);
    }

    public int getColumnIndexOrThrow(String str) {
        return this.a.getColumnIndexOrThrow(str);
    }

    public String getColumnName(int i) {
        return this.a.getColumnName(i);
    }

    public String[] getColumnNames() {
        return this.a.getColumnNames();
    }

    public int getColumnCount() {
        return this.a.getColumnCount();
    }

    public byte[] getBlob(int i) {
        return this.a.getBlob(i);
    }

    public String getString(int i) {
        return this.a.getString(i);
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.a.copyStringToBuffer(i, charArrayBuffer);
    }

    public short getShort(int i) {
        return this.a.getShort(i);
    }

    public int getInt(int i) {
        return this.a.getInt(i);
    }

    public long getLong(int i) {
        return this.a.getLong(i);
    }

    public float getFloat(int i) {
        return this.a.getFloat(i);
    }

    public double getDouble(int i) {
        return this.a.getDouble(i);
    }

    public int getType(int i) {
        return this.a.getType(i);
    }

    public boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Deprecated
    public void deactivate() {
        this.a.deactivate();
    }

    @Deprecated
    public boolean requery() {
        return this.a.requery();
    }

    public void close() {
        this.a.close();
    }

    public boolean isClosed() {
        return this.a.isClosed();
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.a.registerContentObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        this.a.unregisterContentObserver(contentObserver);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.registerDataSetObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.a.unregisterDataSetObserver(dataSetObserver);
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.a.setNotificationUri(contentResolver, uri);
    }

    public Uri getNotificationUri() {
        return this.a.getNotificationUri();
    }

    public boolean getWantsAllOnMoveCalls() {
        return this.a.getWantsAllOnMoveCalls();
    }

    public Bundle getExtras() {
        return this.a.getExtras();
    }

    public void setExtras(Bundle bundle) {
        this.a.setExtras(bundle);
    }

    public Bundle respond(Bundle bundle) {
        return this.a.respond(bundle);
    }
}
