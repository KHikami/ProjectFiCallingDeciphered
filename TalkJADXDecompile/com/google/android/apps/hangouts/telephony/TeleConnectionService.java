package com.google.android.apps.hangouts.telephony;

import android.app.Notification.Builder;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;
import android.telecom.RemoteConference;
import gcq;
import gcv;
import gdj;
import gdk;
import gdo;
import gec;
import gee;
import gef;
import ger;
import get;
import ggc;
import ggk;
import glk;
import gwb;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import jyn;

public class TeleConnectionService extends ConnectionService {
    private final ggk a;
    private WakeLock b;

    public TeleConnectionService() {
        this.a = new ggk(this);
    }

    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        String valueOf = String.valueOf(connectionRequest);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 59).append("TeleConnectionService.onCreateOutgoingConnection, request: ").append(valueOf).toString(), new Object[0]);
        Context applicationContext = getApplicationContext();
        Connection gcq = new gcq(new gef(this, connectionRequest, new gec(this, get.a(this)), false));//new connection
        new gee(applicationContext, gcq).a();//new teleOutgoingCallRequest
        return gcq;
    }

    public void onConference(Connection connection, Connection connection2) {
        String valueOf = String.valueOf(connection);
        String valueOf2 = String.valueOf(connection2);
        glk.c("Babel_telephony", new StringBuilder((String.valueOf(valueOf).length() + 63) + String.valueOf(valueOf2).length()).append("TeleConnectionService.onConference, connection1: ").append(valueOf).append(" connection2: ").append(valueOf2).toString(), new Object[0]);
        if ((connection instanceof gcq) && (connection2 instanceof gcq)) {
            gcq gcq = (gcq) connection;
            if (gcq.j() != null) {
                gcq.j().a(((gcq) connection2).j());
            }
        }
    }

    private void b() {
        if (this.b != null) {
            this.b.release();
        }
    }

    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        boolean z = true;
        String valueOf = String.valueOf(connectionRequest);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 59).append("TeleConnectionService.onCreateIncomingConnection, request: ").append(valueOf).toString(), new Object[0]);
        if (gwb.a((Context) this, "babel_should_use_wake_lock", true) && this.b == null) {
            this.b = ((PowerManager) getSystemService("power")).newWakeLock(1, "Babel_telephony");
        }
        if (this.b != null) {
            this.b.acquire();
        }
        try {
            gcv gcv;
            Connection a;
            int b = ggc.a((Context) this).b();
            if (b != -1) {
                gcv = new gcv(this, b);
            } else {
                gcv = null;
            }
            gdk gdk = (gdk) jyn.a((Context) this, gdk.class);
            if (gdo.a(connectionRequest.getExtras()) == null) {
                z = false;
            }
            if (z) {
                a = gdk.a(this, connectionRequest, gcv, this.b);
            } else {
                a = new gdj(this, this, connectionRequest, gcv).a();
                b();
            }
            return a;
        } finally {
            b();
        }
    }

    public void onRemoteConferenceAdded(RemoteConference remoteConference) {
        String valueOf = String.valueOf(remoteConference);
        glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 59).append("TeleConnectionService.onRemoteConferenceAdded, conference: ").append(valueOf).toString(), new Object[0]);
        addConference(ger.a(remoteConference, this));
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.a.a(printWriter);
    }

    public ggk a() {
        return this.a;
    }

    public void onCreate() {
        if (gwb.a((Context) this, "babel_make_foreground_service", false)) {
            glk.c("Babel_telephony", "TeleConnectionService.onCreate, making this a foreground service.", new Object[0]);
            startForeground(1, new Builder(this).setContentTitle(getText(gwb.vA)).setContentText(getText(gwb.vA)).setSmallIcon(gwb.vb).setAutoCancel(false).setLocalOnly(true).setOngoing(true).build());
        }
    }
}
