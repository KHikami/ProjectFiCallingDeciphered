package com.google.android.apps.hangouts.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import fqm;
import glk;
import iil;
import java.io.IOException;
import kae;
import wi;

public class AudioPlayerService extends Service {
    public static final boolean a;
    public fqm b;

    static {
        kae kae = glk.a;
        a = false;
    }

    public AudioPlayerService() {
        this.b = null;
    }

    private void a() {
        this.b.g();
        this.b = null;
    }

    public static Intent a(String str, String str2) {
        Intent intent = new Intent(str);
        intent.putExtra("play_id", str2);
        return intent;
    }

    private static String a(int i) {
        switch (i) {
            case wi.j /*1*/:
                return "PREPARE";
            case wi.l /*2*/:
                return "PLAY";
            case wi.z /*3*/:
                return "PAUSE";
            case wi.h /*4*/:
                return "SEEK";
            case wi.p /*5*/:
                return "STOP";
            case wi.s /*6*/:
                return "REGISTER";
            case wi.q /*7*/:
                return "UNREGISTER";
            default:
                return "UNKNOWN:" + i;
        }
    }

    protected void a(Intent intent) {
        int intExtra = intent.getIntExtra("op", 0);
        String stringExtra = intent.getStringExtra("play_id");
        if (TextUtils.isEmpty(stringExtra)) {
            glk.d("Babel", "No EXTRA_PLAY_ID in intent sent to AudioPlayerService.", new Object[0]);
        } else if (intExtra == 1 || (this.b != null && stringExtra.equals(this.b.a()))) {
            if (a) {
                String str = "AudioPlayerService received op: ";
                String valueOf = String.valueOf(a(intExtra));
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    valueOf = new String(str);
                }
            }
            switch (intExtra) {
                case wi.j /*1*/:
                    if (this.b != null) {
                        a();
                    }
                    Object stringExtra2 = intent.getStringExtra("audio_stream_url");
                    iil.b("Expected condition to be false", TextUtils.isEmpty(stringExtra2));
                    try {
                        this.b = new fqm(this, this, stringExtra2, stringExtra);
                    } catch (IOException e) {
                        sendBroadcast(a("play_stopped", stringExtra));
                        this.b = null;
                    }
                case wi.l /*2*/:
                    this.b.b();
                case wi.z /*3*/:
                    this.b.c();
                case wi.h /*4*/:
                    this.b.a(intent.getIntExtra("position_in_milliseconds", 0));
                case wi.p /*5*/:
                    a();
                case wi.s /*6*/:
                    this.b.d();
                case wi.q /*7*/:
                    this.b.e();
                default:
                    glk.d("Babel", "Unrecognized EXTRA_OP value: " + intExtra, new Object[0]);
            }
        } else {
            String valueOf2 = String.valueOf(a(intExtra));
            glk.d("Babel", new StringBuilder((String.valueOf(valueOf2).length() + 51) + String.valueOf(stringExtra).length()).append("Ignoring ").append(valueOf2).append(" message because playId \"").append(stringExtra).append("\" is not current.").toString(), new Object[0]);
            sendBroadcast(a("play_stopped", stringExtra));
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            a(intent);
            if (this.b == null) {
                stopSelf();
            }
        }
        return 2;
    }

    public void onDestroy() {
        if (this.b != null) {
            a();
        }
    }
}
