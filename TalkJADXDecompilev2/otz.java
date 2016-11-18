package defpackage;

import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class otz implements oub {
    private Method a;

    otz() {
        try {
            this.a = Class.forName("android.os.Message").getMethod("setAsynchronous", new Class[]{Boolean.TYPE});
        } catch (ClassNotFoundException e) {
            ots.d("cr.SysMessageHandler", "Failed to find android.os.Message class", e);
        } catch (NoSuchMethodException e2) {
            ots.d("cr.SysMessageHandler", "Failed to load Message.setAsynchronous method", e2);
        } catch (RuntimeException e3) {
            ots.d("cr.SysMessageHandler", "Exception while loading Message.setAsynchronous method", e3);
        }
    }

    public void a(Message message, boolean z) {
        if (this.a != null) {
            try {
                this.a.invoke(message, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e) {
                ots.d("cr.SysMessageHandler", "Illegal access to async message creation, disabling.", new Object[0]);
                this.a = null;
            } catch (IllegalArgumentException e2) {
                ots.d("cr.SysMessageHandler", "Illegal argument for async message creation, disabling.", new Object[0]);
                this.a = null;
            } catch (InvocationTargetException e3) {
                ots.d("cr.SysMessageHandler", "Invocation exception during async message creation, disabling.", new Object[0]);
                this.a = null;
            } catch (RuntimeException e4) {
                ots.d("cr.SysMessageHandler", "Runtime exception during async message creation, disabling.", new Object[0]);
                this.a = null;
            }
        }
    }
}
