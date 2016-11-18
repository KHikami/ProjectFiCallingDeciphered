package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class eiz extends Handler {
    private Handler f11632a;
    private SQLiteDatabase f11633b;

    public eiz(SQLiteDatabase sQLiteDatabase, Looper looper, Handler handler) {
        super(looper);
        this.f11632a = handler;
        this.f11633b = sQLiteDatabase;
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                bjs.m5485b(this.f11633b);
                this.f11632a.sendEmptyMessage(2);
                return;
            default:
                return;
        }
    }
}
