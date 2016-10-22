package defpackage;

import android.content.AsyncQueryHandler.WorkerHandler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* renamed from: avr */
public final class avr extends WorkerHandler {
    public avr(avq avq, Looper looper) {
        super(avq, looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Throwable e) {
            Log.w("CallLogQueryHandler", "Exception on background worker thread", e);
        } catch (Throwable e2) {
            Log.w("CallLogQueryHandler", "Exception on background worker thread", e2);
        } catch (Throwable e22) {
            Log.w("CallLogQueryHandler", "Exception on background worker thread", e22);
        } catch (Throwable e222) {
            Log.w("CallLogQueryHandler", "ContactsProvider not present on device", e222);
        } catch (Throwable e2222) {
            Log.w("CallLogQueryHandler", "No permission to access ContactsProvider.", e2222);
        }
    }
}
