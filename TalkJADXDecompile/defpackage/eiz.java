package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: eiz */
public final class eiz extends Handler {
    private Handler a;
    private SQLiteDatabase b;

    public eiz(SQLiteDatabase sQLiteDatabase, Looper looper, Handler handler) {
        super(looper);
        this.a = handler;
        this.b = sQLiteDatabase;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case wi.j /*1*/:
                bjs.b(this.b);
                this.a.sendEmptyMessage(2);
            default:
        }
    }
}
