package com.google.android.apps.hangouts.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import bkb;
import bko;
import bmr;
import bmu;
import bnk;
import bnl;
import bnm;
import bnr;
import com.google.api.client.http.HttpStatusCodes;
import edq;
import fde;
import fwx;
import fwy;
import gkd;
import glk;
import gma;
import iil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kae;
import ky;

public class EsProvider extends ContentProvider {
    private static final String A;
    private static final String B;
    private static final String C;
    private static final Uri D;
    private static final Uri E;
    private static final UriMatcher F;
    private static final Map<String, String> G;
    private static final Map<String, String> H;
    private static final Map<String, String> I;
    private static final Map<String, String> J;
    private static final Pattern K;
    private static final StringBuilder L;
    public static final String a;
    public static final String b;
    static final String c;
    static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final Uri h;
    public static final Uri i;
    public static final Uri j;
    public static final Uri k;
    public static final Uri l;
    public static final Uri m;
    public static final Uri n;
    public static final Uri o;
    public static final Uri p;
    public static final Uri q;
    public static final Uri r;
    public static final Uri s;
    public static final Uri t;
    public static final Uri u;
    public static final String v;
    public static final String w;
    private static final boolean x;
    private static final gma y;
    private static final String z;

    static {
        String str;
        kae kae = glk.d;
        x = false;
        y = gma.a("EsProvider");
        try {
            Class.forName("com.google.android.apps.hangouts.defaultbuild.EsProvider");
            str = "com.google.android.apps.hangouts.content.EsProvider";
        } catch (ClassNotFoundException e) {
            str = "com.google.android.apps.hangouts.content.EsProviderAltBuild";
        }
        a = str;
        z = new StringBuilder(String.valueOf(str).length() + 11).append("content://").append(str).append("/").toString();
        str = String.valueOf("CREATE TABLE participants (_id INTEGER PRIMARY KEY, participant_type INT DEFAULT ");
        int ordinal = edq.PERSON.ordinal();
        String valueOf = String.valueOf("gaia_id");
        String valueOf2 = String.valueOf("chat_id");
        String valueOf3 = String.valueOf("phone_id");
        String valueOf4 = String.valueOf("circle_id");
        String valueOf5 = String.valueOf("first_name");
        String valueOf6 = String.valueOf("full_name");
        String valueOf7 = String.valueOf("fallback_name");
        String valueOf8 = String.valueOf("profile_photo_url");
        String valueOf9 = String.valueOf("batch_gebi_tag");
        String valueOf10 = String.valueOf("blocked");
        String valueOf11 = String.valueOf("circle_id");
        String valueOf12 = String.valueOf("chat_id");
        String valueOf13 = String.valueOf("gaia_id");
        b = new StringBuilder((((((((((((((String.valueOf(str).length() + 202) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()) + String.valueOf(valueOf10).length()) + String.valueOf(valueOf11).length()) + String.valueOf(valueOf12).length()) + String.valueOf(valueOf13).length()).append(str).append(ordinal).append(", ").append(valueOf).append(" TEXT, ").append(valueOf2).append(" TEXT, ").append(valueOf3).append(" TEXT, ").append(valueOf4).append(" TEXT, ").append(valueOf5).append(" TEXT, ").append(valueOf6).append(" TEXT, ").append(valueOf7).append(" TEXT, ").append(valueOf8).append(" TEXT, ").append(valueOf9).append(" STRING DEFAULT('-1'), ").append(valueOf10).append(" INT DEFAULT(0), UNIQUE (").append(valueOf11).append(") ON CONFLICT REPLACE, UNIQUE (").append(valueOf12).append(") ON CONFLICT REPLACE, UNIQUE (").append(valueOf13).append(") ON CONFLICT REPLACE);").toString();
        str = String.valueOf("CREATE TABLE participants (_id INTEGER PRIMARY KEY, participant_type INT DEFAULT ");
        ordinal = edq.PERSON.ordinal();
        valueOf = String.valueOf("gaia_id");
        valueOf2 = String.valueOf("chat_id");
        valueOf3 = String.valueOf("phone_id");
        valueOf4 = String.valueOf("circle_id");
        valueOf5 = String.valueOf("first_name");
        valueOf6 = String.valueOf("full_name");
        valueOf7 = String.valueOf("fallback_name");
        valueOf8 = String.valueOf("profile_photo_url");
        valueOf9 = String.valueOf("batch_gebi_tag");
        valueOf10 = String.valueOf("blocked");
        valueOf11 = String.valueOf("in_users_domain");
        valueOf12 = String.valueOf("circle_id");
        valueOf13 = String.valueOf("chat_id");
        String valueOf14 = String.valueOf("gaia_id");
        c = new StringBuilder(((((((((((((((String.valueOf(str).length() + 212) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()) + String.valueOf(valueOf10).length()) + String.valueOf(valueOf11).length()) + String.valueOf(valueOf12).length()) + String.valueOf(valueOf13).length()) + String.valueOf(valueOf14).length()).append(str).append(ordinal).append(", ").append(valueOf).append(" TEXT, ").append(valueOf2).append(" TEXT, ").append(valueOf3).append(" TEXT, ").append(valueOf4).append(" TEXT, ").append(valueOf5).append(" TEXT, ").append(valueOf6).append(" TEXT, ").append(valueOf7).append(" TEXT, ").append(valueOf8).append(" TEXT, ").append(valueOf9).append(" STRING DEFAULT('-1'), ").append(valueOf10).append(" INT DEFAULT(0), ").append(valueOf11).append(" BOOLEAN, UNIQUE (").append(valueOf12).append(") ON CONFLICT REPLACE, UNIQUE (").append(valueOf13).append(") ON CONFLICT REPLACE, UNIQUE (").append(valueOf14).append(") ON CONFLICT REPLACE);").toString();
        str = String.valueOf(" SELECT conversations._id as _id, ");
        String valueOf15 = String.valueOf(b("conversations.conversation_id"));
        valueOf = String.valueOf(" as ");
        valueOf2 = String.valueOf("conversation_id");
        valueOf3 = String.valueOf("conversations");
        valueOf4 = String.valueOf("notification_level");
        valueOf5 = String.valueOf(" as ");
        valueOf6 = String.valueOf("notification_level");
        valueOf7 = String.valueOf("latest_message_timestamp");
        valueOf8 = String.valueOf(" as ");
        valueOf9 = String.valueOf("latest_message_timestamp");
        valueOf10 = String.valueOf("conversations");
        valueOf11 = String.valueOf("latest_message_expiration_timestamp");
        valueOf12 = String.valueOf(" as ");
        valueOf13 = String.valueOf("latest_message_expiration_timestamp");
        valueOf14 = String.valueOf("conversations");
        String valueOf16 = String.valueOf("metadata_present");
        String valueOf17 = String.valueOf(" as ");
        String valueOf18 = String.valueOf("metadata_present");
        String valueOf19 = String.valueOf("conversations");
        String valueOf20 = String.valueOf("name");
        String valueOf21 = String.valueOf(" as ");
        String valueOf22 = String.valueOf("name");
        String valueOf23 = String.valueOf(b(a("conversations.generated_name")));
        String valueOf24 = String.valueOf(" as ");
        String valueOf25 = String.valueOf("generated_name");
        String valueOf26 = String.valueOf("conversations");
        String valueOf27 = String.valueOf("conversation_type");
        String valueOf28 = String.valueOf(" as ");
        String valueOf29 = String.valueOf("conversation_type");
        String valueOf30 = String.valueOf(b("conversations.transport_type"));
        String valueOf31 = String.valueOf(" as ");
        String valueOf32 = String.valueOf("transport_type");
        String valueOf33 = String.valueOf("conversations");
        String valueOf34 = String.valueOf("default_transport_phone");
        String valueOf35 = String.valueOf(" as ");
        String valueOf36 = String.valueOf("default_transport_phone");
        String valueOf37 = String.valueOf("conversations");
        String valueOf38 = String.valueOf("sms_service_center");
        String valueOf39 = String.valueOf(" as ");
        String valueOf40 = String.valueOf("sms_service_center");
        String valueOf41 = String.valueOf("conversations");
        String valueOf42 = String.valueOf("sms_thread_id");
        String valueOf43 = String.valueOf(" as ");
        String valueOf44 = String.valueOf("sms_thread_id");
        String valueOf45 = String.valueOf("merge_keys");
        String valueOf46 = String.valueOf("merge_keys");
        String valueOf47 = String.valueOf("conversation_id");
        String valueOf48 = String.valueOf("conversations");
        String valueOf49 = String.valueOf("conversation_id");
        String valueOf50 = String.valueOf(" as ");
        String valueOf51 = String.valueOf("merge_key");
        String valueOf52 = String.valueOf(b("conversations.snippet_type", "7"));
        String valueOf53 = String.valueOf(" as ");
        String valueOf54 = String.valueOf("snippet_type");
        String valueOf55 = String.valueOf(d(a("conversations.snippet_text")));
        String valueOf56 = String.valueOf(" as ");
        String valueOf57 = String.valueOf("snippet_text");
        String valueOf58 = String.valueOf(d(a("conversations.snippet_voicemail_duration")));
        String valueOf59 = String.valueOf(" as ");
        String valueOf60 = String.valueOf("snippet_voicemail_duration");
        String valueOf61 = String.valueOf(d(a("conversations.snippet_image_url")));
        String valueOf62 = String.valueOf(" as ");
        String valueOf63 = String.valueOf("snippet_image_url");
        String valueOf64 = String.valueOf(d("conversations.snippet_author_gaia_id"));
        String valueOf65 = String.valueOf(" as ");
        String valueOf66 = String.valueOf("snippet_author_gaia_id");
        String valueOf67 = String.valueOf(d("conversations.snippet_author_chat_id"));
        String valueOf68 = String.valueOf(" as ");
        String valueOf69 = String.valueOf("snippet_author_chat_id");
        String valueOf70 = String.valueOf(d("conversations.snippet_status"));
        String valueOf71 = String.valueOf(" as ");
        String valueOf72 = String.valueOf("snippet_status");
        String valueOf73 = String.valueOf(d(a("IFNULL(author_alias.full_name, author_alias.fallback_name)")));
        String valueOf74 = String.valueOf(" as ");
        String valueOf75 = String.valueOf("latest_message_author_full_name");
        String valueOf76 = String.valueOf(d(a("IFNULL(IFNULL(author_alias.first_name, author_alias.full_name), author_alias.fallback_name)")));
        String valueOf77 = String.valueOf(" as ");
        String valueOf78 = String.valueOf("latest_message_author_first_name");
        String valueOf79 = String.valueOf(d(a("author_alias.profile_photo_url")));
        String valueOf80 = String.valueOf(" as ");
        String valueOf81 = String.valueOf("latest_message_author_profile_photo_url");
        String valueOf82 = String.valueOf(d("conversations.latest_message_timestamp"));
        String valueOf83 = String.valueOf(" as ");
        String valueOf84 = String.valueOf("snippet_selector");
        String valueOf85 = String.valueOf(d("conversations.snippet_participant_keys"));
        String valueOf86 = String.valueOf(" as ");
        String valueOf87 = String.valueOf("snippet_participant_keys");
        String valueOf88 = String.valueOf(d("conversations.snippet_sms_type"));
        String valueOf89 = String.valueOf(" as ");
        String valueOf90 = String.valueOf("snippet_sms_type");
        String valueOf91 = String.valueOf(d("conversations.latest_message_expiration_timestamp"));
        String valueOf92 = String.valueOf(" as ");
        String valueOf93 = String.valueOf("latest_message_expiration_timestamp");
        String valueOf94 = String.valueOf(d("conversations.previous_latest_timestamp"));
        String valueOf95 = String.valueOf(" as ");
        String valueOf96 = String.valueOf("previous_latest_timestamp");
        String valueOf97 = String.valueOf(d(a("conversations.snippet_new_conversation_name")));
        String valueOf98 = String.valueOf(" as ");
        String valueOf99 = String.valueOf("snippet_new_conversation_name");
        String valueOf100 = String.valueOf("conversations");
        String valueOf101 = String.valueOf("status");
        String valueOf102 = String.valueOf(" as ");
        String valueOf103 = String.valueOf("status");
        String valueOf104 = String.valueOf("conversations");
        String valueOf105 = String.valueOf("view");
        String valueOf106 = String.valueOf(" as ");
        String valueOf107 = String.valueOf("view");
        String valueOf108 = String.valueOf("conversations");
        String valueOf109 = String.valueOf("inviter_gaia_id");
        String valueOf110 = String.valueOf(" as ");
        String valueOf111 = String.valueOf("inviter_gaia_id");
        String valueOf112 = String.valueOf("conversations");
        String valueOf113 = String.valueOf("inviter_chat_id");
        String valueOf114 = String.valueOf(" as ");
        String valueOf115 = String.valueOf("inviter_chat_id");
        String valueOf116 = String.valueOf("conversations");
        String valueOf117 = String.valueOf("inviter_affinity");
        String valueOf118 = String.valueOf(" as ");
        String valueOf119 = String.valueOf("inviter_affinity");
        String valueOf120 = String.valueOf("conversations");
        String valueOf121 = String.valueOf("disposition");
        String valueOf122 = String.valueOf(" as ");
        String valueOf123 = String.valueOf("disposition");
        String valueOf124 = String.valueOf("conversations");
        String valueOf125 = String.valueOf("is_pending_leave");
        String valueOf126 = String.valueOf(" as ");
        String valueOf127 = String.valueOf("is_pending_leave");
        String valueOf128 = String.valueOf(b(a("conversations.packed_avatar_urls")));
        String valueOf129 = String.valueOf(" as ");
        String valueOf130 = String.valueOf("packed_avatar_urls");
        String valueOf131 = String.valueOf("conversations");
        String valueOf132 = String.valueOf("self_avatar_url");
        String valueOf133 = String.valueOf(" as ");
        String valueOf134 = String.valueOf("self_avatar_url");
        String valueOf135 = String.valueOf("conversations");
        String valueOf136 = String.valueOf("self_watermark");
        String valueOf137 = String.valueOf(" as ");
        String valueOf138 = String.valueOf("self_watermark");
        String valueOf139 = String.valueOf("conversations");
        String valueOf140 = String.valueOf("chat_watermark");
        String valueOf141 = String.valueOf(" as ");
        String valueOf142 = String.valueOf("chat_watermark");
        String valueOf143 = String.valueOf("conversations");
        String valueOf144 = String.valueOf("hangout_watermark");
        String valueOf145 = String.valueOf(" as ");
        String valueOf146 = String.valueOf("hangout_watermark");
        String valueOf147 = String.valueOf("conversations");
        String valueOf148 = String.valueOf("is_draft");
        String valueOf149 = String.valueOf(" as ");
        String valueOf150 = String.valueOf("is_draft");
        String valueOf151 = String.valueOf("conversations");
        String valueOf152 = String.valueOf("sequence_number");
        String valueOf153 = String.valueOf(" as ");
        String valueOf154 = String.valueOf("sequence_number");
        String valueOf155 = String.valueOf(e("conversations.call_media_type"));
        String valueOf156 = String.valueOf(" as ");
        String valueOf157 = String.valueOf("call_media_type");
        String valueOf158 = String.valueOf("conversations");
        String valueOf159 = String.valueOf("has_joined_hangout");
        String valueOf160 = String.valueOf(" as ");
        String valueOf161 = String.valueOf("has_joined_hangout");
        String valueOf162 = String.valueOf("conversations");
        String valueOf163 = String.valueOf("last_hangout_event_time");
        String valueOf164 = String.valueOf(" as ");
        String valueOf165 = String.valueOf("last_hangout_event_time");
        String valueOf166 = String.valueOf("conversations");
        String valueOf167 = String.valueOf("draft");
        String valueOf168 = String.valueOf(" as ");
        String valueOf169 = String.valueOf("draft");
        String valueOf170 = String.valueOf("conversations");
        String valueOf171 = String.valueOf("otr_status");
        String valueOf172 = String.valueOf(" as ");
        String valueOf173 = String.valueOf("otr_status");
        String valueOf174 = String.valueOf("conversations");
        String valueOf175 = String.valueOf("otr_toggle");
        String valueOf176 = String.valueOf(" as ");
        String valueOf177 = String.valueOf("otr_toggle");
        String valueOf178 = String.valueOf("conversations");
        String valueOf179 = String.valueOf("last_otr_modification_time");
        String valueOf180 = String.valueOf(" as ");
        String valueOf181 = String.valueOf("last_otr_modification_time");
        String valueOf182 = String.valueOf("conversations");
        String valueOf183 = String.valueOf("continuation_token");
        String valueOf184 = String.valueOf(" as ");
        String valueOf185 = String.valueOf("continuation_token");
        String valueOf186 = String.valueOf("conversations");
        String valueOf187 = String.valueOf("continuation_event_timestamp");
        String valueOf188 = String.valueOf(" as ");
        String valueOf189 = String.valueOf("continuation_event_timestamp");
        String valueOf190 = String.valueOf("conversations");
        String valueOf191 = String.valueOf("has_oldest_message");
        String valueOf192 = String.valueOf(" as ");
        String valueOf193 = String.valueOf("has_oldest_message");
        String valueOf194 = String.valueOf("conversations");
        String valueOf195 = String.valueOf("chat_ringtone_uri");
        String valueOf196 = String.valueOf(" as ");
        String valueOf197 = String.valueOf("chat_ringtone_uri");
        String valueOf198 = String.valueOf("conversations");
        String valueOf199 = String.valueOf("hangout_ringtone_uri");
        String valueOf200 = String.valueOf(" as ");
        String valueOf201 = String.valueOf("hangout_ringtone_uri");
        String valueOf202 = String.valueOf("conversations");
        String valueOf203 = String.valueOf("gls_status");
        String valueOf204 = String.valueOf(" as ");
        String valueOf205 = String.valueOf("gls_status");
        String valueOf206 = String.valueOf("conversations");
        String valueOf207 = String.valueOf("gls_link");
        String valueOf208 = String.valueOf(" as ");
        String valueOf209 = String.valueOf("gls_link");
        String valueOf210 = String.valueOf("conversations");
        String valueOf211 = String.valueOf("is_guest");
        String valueOf212 = String.valueOf(" as ");
        String valueOf213 = String.valueOf("is_guest");
        String valueOf214 = String.valueOf("messages");
        String valueOf215 = String.valueOf("alert_in_conversation_list");
        String valueOf216 = String.valueOf(" as ");
        String valueOf217 = String.valueOf("failed_message_count");
        String valueOf218 = String.valueOf(" as ");
        String valueOf219 = String.valueOf("sort_timestamp");
        String valueOf220 = String.valueOf(" as ");
        String valueOf221 = String.valueOf("blocked");
        String valueOf222 = String.valueOf("inviter_alias");
        String valueOf223 = String.valueOf("full_name");
        String valueOf224 = String.valueOf("inviter_alias");
        String valueOf225 = String.valueOf("fallback_name");
        String valueOf226 = String.valueOf(" as ");
        String valueOf227 = String.valueOf("inviter_full_name");
        String valueOf228 = String.valueOf("inviter_alias");
        String valueOf229 = String.valueOf("first_name");
        String valueOf230 = String.valueOf("inviter_alias");
        String valueOf231 = String.valueOf("fallback_name");
        String valueOf232 = String.valueOf(" as ");
        String valueOf233 = String.valueOf("inviter_first_name");
        String valueOf234 = String.valueOf("inviter_alias");
        String valueOf235 = String.valueOf("profile_photo_url");
        String valueOf236 = String.valueOf(" as ");
        String valueOf237 = String.valueOf("inviter_profile_photo_url");
        String valueOf238 = String.valueOf("inviter_alias");
        String valueOf239 = String.valueOf("participant_type");
        String valueOf240 = String.valueOf(" as ");
        String valueOf241 = String.valueOf("inviter_type");
        String valueOf242 = String.valueOf(b("conversations.self_watermark < conversations.latest_message_timestamp"));
        String valueOf243 = String.valueOf(" as ");
        String valueOf244 = String.valueOf("has_unread");
        String valueOf245 = String.valueOf("(SELECT count(*)>0 FROM messages WHERE messages.conversation_id=conversations.conversation_id AND (messages.observed_status!=");
        String valueOf246 = String.valueOf("1");
        valueOf245 = String.valueOf(b(new StringBuilder((String.valueOf(valueOf245).length() + 4) + String.valueOf(valueOf246).length()).append(valueOf245).append(valueOf246).append(") ) ").toString()));
        valueOf246 = String.valueOf(" as ");
        String valueOf247 = String.valueOf("has_unobserved");
        String valueOf248 = String.valueOf(d(a("IFNULL(inviter_alias.full_name, inviter_alias.fallback_name) ")));
        String valueOf249 = String.valueOf(" as ");
        String valueOf250 = String.valueOf("inviter_full_name");
        String valueOf251 = String.valueOf(d(a("IFNULL(inviter_alias.first_name, inviter_alias.fallback_name) ")));
        String valueOf252 = String.valueOf(" as ");
        String valueOf253 = String.valueOf("inviter_first_name");
        String valueOf254 = String.valueOf(d(a("inviter_alias.profile_photo_url")));
        String valueOf255 = String.valueOf(" as ");
        String valueOf256 = String.valueOf("inviter_profile_photo_url");
        String valueOf257 = String.valueOf(d(a("inviter_alias.participant_type")));
        String valueOf258 = String.valueOf(" as ");
        String valueOf259 = String.valueOf("inviter_type");
        String valueOf260 = String.valueOf("row_count");
        String valueOf261 = String.valueOf("inviter_aggregate");
        String valueOf262 = String.valueOf("invite_time_aggregate");
        String valueOf263 = String.valueOf("participants");
        String valueOf264 = String.valueOf("author_alias");
        String valueOf265 = String.valueOf("conversations");
        String valueOf266 = String.valueOf("snippet_author_chat_id");
        String valueOf267 = String.valueOf("author_alias");
        String valueOf268 = String.valueOf("chat_id");
        String valueOf269 = String.valueOf("conversations");
        String valueOf270 = String.valueOf("snippet_author_chat_id");
        String valueOf271 = String.valueOf("author_alias");
        String valueOf272 = String.valueOf("gaia_id");
        String valueOf273 = String.valueOf("participants");
        String valueOf274 = String.valueOf("inviter_alias");
        String valueOf275 = String.valueOf("conversations");
        String valueOf276 = String.valueOf("inviter_chat_id");
        String valueOf277 = String.valueOf("inviter_alias");
        String valueOf278 = String.valueOf("chat_id");
        String valueOf279 = String.valueOf("time_alias");
        A = new StringBuilder((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((String.valueOf(str).length() + 525) + String.valueOf(valueOf15).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()) + String.valueOf(valueOf10).length()) + String.valueOf(valueOf11).length()) + String.valueOf(valueOf12).length()) + String.valueOf(valueOf13).length()) + String.valueOf(valueOf14).length()) + String.valueOf(valueOf16).length()) + String.valueOf(valueOf17).length()) + String.valueOf(valueOf18).length()) + String.valueOf(valueOf19).length()) + String.valueOf(valueOf20).length()) + String.valueOf(valueOf21).length()) + String.valueOf(valueOf22).length()) + String.valueOf(valueOf23).length()) + String.valueOf(valueOf24).length()) + String.valueOf(valueOf25).length()) + String.valueOf(valueOf26).length()) + String.valueOf(valueOf27).length()) + String.valueOf(valueOf28).length()) + String.valueOf(valueOf29).length()) + String.valueOf(valueOf30).length()) + String.valueOf(valueOf31).length()) + String.valueOf(valueOf32).length()) + String.valueOf(valueOf33).length()) + String.valueOf(valueOf34).length()) + String.valueOf(valueOf35).length()) + String.valueOf(valueOf36).length()) + String.valueOf(valueOf37).length()) + String.valueOf(valueOf38).length()) + String.valueOf(valueOf39).length()) + String.valueOf(valueOf40).length()) + String.valueOf(valueOf41).length()) + String.valueOf(valueOf42).length()) + String.valueOf(valueOf43).length()) + String.valueOf(valueOf44).length()) + String.valueOf(valueOf45).length()) + String.valueOf(valueOf46).length()) + String.valueOf(valueOf47).length()) + String.valueOf(valueOf48).length()) + String.valueOf(valueOf49).length()) + String.valueOf(valueOf50).length()) + String.valueOf(valueOf51).length()) + String.valueOf(valueOf52).length()) + String.valueOf(valueOf53).length()) + String.valueOf(valueOf54).length()) + String.valueOf(valueOf55).length()) + String.valueOf(valueOf56).length()) + String.valueOf(valueOf57).length()) + String.valueOf(valueOf58).length()) + String.valueOf(valueOf59).length()) + String.valueOf(valueOf60).length()) + String.valueOf(valueOf61).length()) + String.valueOf(valueOf62).length()) + String.valueOf(valueOf63).length()) + String.valueOf(valueOf64).length()) + String.valueOf(valueOf65).length()) + String.valueOf(valueOf66).length()) + String.valueOf(valueOf67).length()) + String.valueOf(valueOf68).length()) + String.valueOf(valueOf69).length()) + String.valueOf(valueOf70).length()) + String.valueOf(valueOf71).length()) + String.valueOf(valueOf72).length()) + String.valueOf(valueOf73).length()) + String.valueOf(valueOf74).length()) + String.valueOf(valueOf75).length()) + String.valueOf(valueOf76).length()) + String.valueOf(valueOf77).length()) + String.valueOf(valueOf78).length()) + String.valueOf(valueOf79).length()) + String.valueOf(valueOf80).length()) + String.valueOf(valueOf81).length()) + String.valueOf(valueOf82).length()) + String.valueOf(valueOf83).length()) + String.valueOf(valueOf84).length()) + String.valueOf(valueOf85).length()) + String.valueOf(valueOf86).length()) + String.valueOf(valueOf87).length()) + String.valueOf(valueOf88).length()) + String.valueOf(valueOf89).length()) + String.valueOf(valueOf90).length()) + String.valueOf(valueOf91).length()) + String.valueOf(valueOf92).length()) + String.valueOf(valueOf93).length()) + String.valueOf(valueOf94).length()) + String.valueOf(valueOf95).length()) + String.valueOf(valueOf96).length()) + String.valueOf(valueOf97).length()) + String.valueOf(valueOf98).length()) + String.valueOf(valueOf99).length()) + String.valueOf(valueOf100).length()) + String.valueOf(valueOf101).length()) + String.valueOf(valueOf102).length()) + String.valueOf(valueOf103).length()) + String.valueOf(valueOf104).length()) + String.valueOf(valueOf105).length()) + String.valueOf(valueOf106).length()) + String.valueOf(valueOf107).length()) + String.valueOf(valueOf108).length()) + String.valueOf(valueOf109).length()) + String.valueOf(valueOf110).length()) + String.valueOf(valueOf111).length()) + String.valueOf(valueOf112).length()) + String.valueOf(valueOf113).length()) + String.valueOf(valueOf114).length()) + String.valueOf(valueOf115).length()) + String.valueOf(valueOf116).length()) + String.valueOf(valueOf117).length()) + String.valueOf(valueOf118).length()) + String.valueOf(valueOf119).length()) + String.valueOf(valueOf120).length()) + String.valueOf(valueOf121).length()) + String.valueOf(valueOf122).length()) + String.valueOf(valueOf123).length()) + String.valueOf(valueOf124).length()) + String.valueOf(valueOf125).length()) + String.valueOf(valueOf126).length()) + String.valueOf(valueOf127).length()) + String.valueOf(valueOf128).length()) + String.valueOf(valueOf129).length()) + String.valueOf(valueOf130).length()) + String.valueOf(valueOf131).length()) + String.valueOf(valueOf132).length()) + String.valueOf(valueOf133).length()) + String.valueOf(valueOf134).length()) + String.valueOf(valueOf135).length()) + String.valueOf(valueOf136).length()) + String.valueOf(valueOf137).length()) + String.valueOf(valueOf138).length()) + String.valueOf(valueOf139).length()) + String.valueOf(valueOf140).length()) + String.valueOf(valueOf141).length()) + String.valueOf(valueOf142).length()) + String.valueOf(valueOf143).length()) + String.valueOf(valueOf144).length()) + String.valueOf(valueOf145).length()) + String.valueOf(valueOf146).length()) + String.valueOf(valueOf147).length()) + String.valueOf(valueOf148).length()) + String.valueOf(valueOf149).length()) + String.valueOf(valueOf150).length()) + String.valueOf(valueOf151).length()) + String.valueOf(valueOf152).length()) + String.valueOf(valueOf153).length()) + String.valueOf(valueOf154).length()) + String.valueOf(valueOf155).length()) + String.valueOf(valueOf156).length()) + String.valueOf(valueOf157).length()) + String.valueOf(valueOf158).length()) + String.valueOf(valueOf159).length()) + String.valueOf(valueOf160).length()) + String.valueOf(valueOf161).length()) + String.valueOf(valueOf162).length()) + String.valueOf(valueOf163).length()) + String.valueOf(valueOf164).length()) + String.valueOf(valueOf165).length()) + String.valueOf(valueOf166).length()) + String.valueOf(valueOf167).length()) + String.valueOf(valueOf168).length()) + String.valueOf(valueOf169).length()) + String.valueOf(valueOf170).length()) + String.valueOf(valueOf171).length()) + String.valueOf(valueOf172).length()) + String.valueOf(valueOf173).length()) + String.valueOf(valueOf174).length()) + String.valueOf(valueOf175).length()) + String.valueOf(valueOf176).length()) + String.valueOf(valueOf177).length()) + String.valueOf(valueOf178).length()) + String.valueOf(valueOf179).length()) + String.valueOf(valueOf180).length()) + String.valueOf(valueOf181).length()) + String.valueOf(valueOf182).length()) + String.valueOf(valueOf183).length()) + String.valueOf(valueOf184).length()) + String.valueOf(valueOf185).length()) + String.valueOf(valueOf186).length()) + String.valueOf(valueOf187).length()) + String.valueOf(valueOf188).length()) + String.valueOf(valueOf189).length()) + String.valueOf(valueOf190).length()) + String.valueOf(valueOf191).length()) + String.valueOf(valueOf192).length()) + String.valueOf(valueOf193).length()) + String.valueOf(valueOf194).length()) + String.valueOf(valueOf195).length()) + String.valueOf(valueOf196).length()) + String.valueOf(valueOf197).length()) + String.valueOf(valueOf198).length()) + String.valueOf(valueOf199).length()) + String.valueOf(valueOf200).length()) + String.valueOf(valueOf201).length()) + String.valueOf(valueOf202).length()) + String.valueOf(valueOf203).length()) + String.valueOf(valueOf204).length()) + String.valueOf(valueOf205).length()) + String.valueOf(valueOf206).length()) + String.valueOf(valueOf207).length()) + String.valueOf(valueOf208).length()) + String.valueOf(valueOf209).length()) + String.valueOf(valueOf210).length()) + String.valueOf(valueOf211).length()) + String.valueOf(valueOf212).length()) + String.valueOf(valueOf213).length()) + String.valueOf(valueOf214).length()) + String.valueOf(valueOf215).length()) + String.valueOf(valueOf216).length()) + String.valueOf(valueOf217).length()) + String.valueOf(valueOf218).length()) + String.valueOf(valueOf219).length()) + String.valueOf(valueOf220).length()) + String.valueOf(valueOf221).length()) + String.valueOf(valueOf222).length()) + String.valueOf(valueOf223).length()) + String.valueOf(valueOf224).length()) + String.valueOf(valueOf225).length()) + String.valueOf(valueOf226).length()) + String.valueOf(valueOf227).length()) + String.valueOf(valueOf228).length()) + String.valueOf(valueOf229).length()) + String.valueOf(valueOf230).length()) + String.valueOf(valueOf231).length()) + String.valueOf(valueOf232).length()) + String.valueOf(valueOf233).length()) + String.valueOf(valueOf234).length()) + String.valueOf(valueOf235).length()) + String.valueOf(valueOf236).length()) + String.valueOf(valueOf237).length()) + String.valueOf(valueOf238).length()) + String.valueOf(valueOf239).length()) + String.valueOf(valueOf240).length()) + String.valueOf(valueOf241).length()) + String.valueOf(valueOf242).length()) + String.valueOf(valueOf243).length()) + String.valueOf(valueOf244).length()) + String.valueOf(valueOf245).length()) + String.valueOf(valueOf246).length()) + String.valueOf(valueOf247).length()) + String.valueOf(valueOf248).length()) + String.valueOf(valueOf249).length()) + String.valueOf(valueOf250).length()) + String.valueOf(valueOf251).length()) + String.valueOf(valueOf252).length()) + String.valueOf(valueOf253).length()) + String.valueOf(valueOf254).length()) + String.valueOf(valueOf255).length()) + String.valueOf(valueOf256).length()) + String.valueOf(valueOf257).length()) + String.valueOf(valueOf258).length()) + String.valueOf(valueOf259).length()) + String.valueOf(valueOf260).length()) + String.valueOf(valueOf261).length()) + String.valueOf(valueOf262).length()) + String.valueOf(valueOf263).length()) + String.valueOf(valueOf264).length()) + String.valueOf(valueOf265).length()) + String.valueOf(valueOf266).length()) + String.valueOf(valueOf267).length()) + String.valueOf(valueOf268).length()) + String.valueOf(valueOf269).length()) + String.valueOf(valueOf270).length()) + String.valueOf(valueOf271).length()) + String.valueOf(valueOf272).length()) + String.valueOf(valueOf273).length()) + String.valueOf(valueOf274).length()) + String.valueOf(valueOf275).length()) + String.valueOf(valueOf276).length()) + String.valueOf(valueOf277).length()) + String.valueOf(valueOf278).length()) + String.valueOf(valueOf279).length()).append(str).append(valueOf15).append(valueOf).append(valueOf2).append(", ").append(valueOf3).append(".").append(valueOf4).append(valueOf5).append(valueOf6).append(", ").append(valueOf7).append(valueOf8).append(valueOf9).append(", ").append(valueOf10).append(".").append(valueOf11).append(valueOf12).append(valueOf13).append(", ").append(valueOf14).append(".").append(valueOf16).append(valueOf17).append(valueOf18).append(", ").append(valueOf19).append(".").append(valueOf20).append(valueOf21).append(valueOf22).append(", ").append(valueOf23).append(valueOf24).append(valueOf25).append(", ").append(valueOf26).append(".").append(valueOf27).append(valueOf28).append(valueOf29).append(", ").append(valueOf30).append(valueOf31).append(valueOf32).append(", ").append(valueOf33).append(".").append(valueOf34).append(valueOf35).append(valueOf36).append(", ").append(valueOf37).append(".").append(valueOf38).append(valueOf39).append(valueOf40).append(", ").append(valueOf41).append(".").append(valueOf42).append(valueOf43).append(valueOf44).append(", (select merge_key from ").append(valueOf45).append(" where ").append(valueOf46).append(".").append(valueOf47).append("=").append(valueOf48).append(".").append(valueOf49).append(") ").append(valueOf50).append(valueOf51).append(", ").append(valueOf52).append(valueOf53).append(valueOf54).append(", ").append(valueOf55).append(valueOf56).append(valueOf57).append(", ").append(valueOf58).append(valueOf59).append(valueOf60).append(", ").append(valueOf61).append(valueOf62).append(valueOf63).append(", ").append(valueOf64).append(valueOf65).append(valueOf66).append(", ").append(valueOf67).append(valueOf68).append(valueOf69).append(", ").append(valueOf70).append(valueOf71).append(valueOf72).append(", ").append(valueOf73).append(valueOf74).append(valueOf75).append(", ").append(valueOf76).append(valueOf77).append(valueOf78).append(", ").append(valueOf79).append(valueOf80).append(valueOf81).append(", ").append(valueOf82).append(valueOf83).append(valueOf84).append(", ").append(valueOf85).append(valueOf86).append(valueOf87).append(", ").append(valueOf88).append(valueOf89).append(valueOf90).append(", ").append(valueOf91).append(valueOf92).append(valueOf93).append(", ").append(valueOf94).append(valueOf95).append(valueOf96).append(", ").append(valueOf97).append(valueOf98).append(valueOf99).append(", ").append(valueOf100).append(".").append(valueOf101).append(valueOf102).append(valueOf103).append(", ").append(valueOf104).append(".").append(valueOf105).append(valueOf106).append(valueOf107).append(", ").append(valueOf108).append(".").append(valueOf109).append(valueOf110).append(valueOf111).append(", ").append(valueOf112).append(".").append(valueOf113).append(valueOf114).append(valueOf115).append(", ").append(valueOf116).append(".").append(valueOf117).append(valueOf118).append(valueOf119).append(", ").append(valueOf120).append(".").append(valueOf121).append(valueOf122).append(valueOf123).append(", ").append(valueOf124).append(".").append(valueOf125).append(valueOf126).append(valueOf127).append(", ").append(valueOf128).append(valueOf129).append(valueOf130).append(", ").append(valueOf131).append(".").append(valueOf132).append(valueOf133).append(valueOf134).append(", ").append(valueOf135).append(".").append(valueOf136).append(valueOf137).append(valueOf138).append(", ").append(valueOf139).append(".").append(valueOf140).append(valueOf141).append(valueOf142).append(", ").append(valueOf143).append(".").append(valueOf144).append(valueOf145).append(valueOf146).append(", ").append(valueOf147).append(".").append(valueOf148).append(valueOf149).append(valueOf150).append(", ").append(valueOf151).append(".").append(valueOf152).append(valueOf153).append(valueOf154).append(", ").append(valueOf155).append(valueOf156).append(valueOf157).append(", ").append(valueOf158).append(".").append(valueOf159).append(valueOf160).append(valueOf161).append(", ").append(valueOf162).append(".").append(valueOf163).append(valueOf164).append(valueOf165).append(", ").append(valueOf166).append(".").append(valueOf167).append(valueOf168).append(valueOf169).append(", ").append(valueOf170).append(".").append(valueOf171).append(valueOf172).append(valueOf173).append(", ").append(valueOf174).append(".").append(valueOf175).append(valueOf176).append(valueOf177).append(", ").append(valueOf178).append(".").append(valueOf179).append(valueOf180).append(valueOf181).append(", ").append(valueOf182).append(".").append(valueOf183).append(valueOf184).append(valueOf185).append(", ").append(valueOf186).append(".").append(valueOf187).append(valueOf188).append(valueOf189).append(", ").append(valueOf190).append(".").append(valueOf191).append(valueOf192).append(valueOf193).append(", ").append(valueOf194).append(".").append(valueOf195).append(valueOf196).append(valueOf197).append(",").append(valueOf198).append(".").append(valueOf199).append(valueOf200).append(valueOf201).append(",").append(valueOf202).append(".").append(valueOf203).append(valueOf204).append(valueOf205).append(",").append(valueOf206).append(".").append(valueOf207).append(valueOf208).append(valueOf209).append(",").append(valueOf210).append(".").append(valueOf211).append(valueOf212).append(valueOf213).append(",(SELECT count() FROM messages WHERE messages.conversation_id=conversations.conversation_id AND (").append(valueOf214).append(".").append(valueOf215).append("=1").append(") ) ").append(valueOf216).append(valueOf217).append(", max(%s) ").append(valueOf218).append(valueOf219).append(",  %s ").append(valueOf220).append(valueOf221).append(", IFNULL(").append(valueOf222).append(".").append(valueOf223).append(", ").append(valueOf224).append(".").append(valueOf225).append(") ").append(valueOf226).append(valueOf227).append(", IFNULL(").append(valueOf228).append(".").append(valueOf229).append(", ").append(valueOf230).append(".").append(valueOf231).append(") ").append(valueOf232).append(valueOf233).append(", ").append(valueOf234).append(".").append(valueOf235).append(valueOf236).append(valueOf237).append(", ").append(valueOf238).append(".").append(valueOf239).append(valueOf240).append(valueOf241).append(", ").append(valueOf242).append(valueOf243).append(valueOf244).append(", ").append(valueOf245).append(valueOf246).append(valueOf247).append(", ").append(valueOf248).append(valueOf249).append(valueOf250).append(", ").append(valueOf251).append(valueOf252).append(valueOf253).append(", ").append(valueOf254).append(valueOf255).append(valueOf256).append(", ").append(valueOf257).append(valueOf258).append(valueOf259).append(",  %s AS ").append(valueOf260).append(",  %s AS ").append(valueOf261).append(",  %s AS ").append(valueOf262).append(" FROM %s %s  LEFT JOIN ").append(valueOf263).append(" ").append(valueOf264).append(" ON (").append(valueOf265).append(".").append(valueOf266).append("=").append(valueOf267).append(".").append(valueOf268).append(" OR ").append(valueOf269).append(".").append(valueOf270).append("=").append(valueOf271).append(".").append(valueOf272).append(")  LEFT JOIN ").append(valueOf273).append(" ").append(valueOf274).append(" ON (").append(valueOf275).append(".").append(valueOf276).append("=").append(valueOf277).append(".").append(valueOf278).append(") , (SELECT (julianday('now') - 2440587.5) * 86400000000 AS CURRENT_TIMESTAMP) ").append(valueOf279).toString();
        B = String.format(Locale.US, "group_concat(IFNULL(%s, %s), %s)", new Object[]{"inviter_alias.full_name", "inviter_alias.fallback_name", "\"|\""});
        C = String.format(Locale.US, "group_concat(%s, %s)", new Object[]{"conversations.sort_timestamp", "\"|\""});
        str = String.valueOf("CREATE VIEW conversations_view AS ");
        Locale locale = Locale.US;
        valueOf = A;
        r5 = new Object[7];
        valueOf4 = String.valueOf("9223372036854775807");
        r5[0] = new StringBuilder(String.valueOf(valueOf4).length() + 2).append("\"").append(valueOf4).append("\"").toString();
        r5[1] = "0";
        r5[2] = "sum(1)";
        r5[3] = B;
        r5[4] = C;
        r5[5] = "(select conversations.* from conversations order by sort_timestamp asc) as conversations ";
        r5[6] = "";
        valueOf15 = String.valueOf(String.format(locale, valueOf, r5));
        valueOf = String.valueOf("conversations");
        valueOf2 = String.valueOf("status");
        valueOf3 = String.valueOf("inviter_affinity");
        valueOf4 = String.valueOf("conversations");
        valueOf5 = String.valueOf("status");
        valueOf6 = String.valueOf(String.format(Locale.US, A, new Object[]{"conversations.sort_timestamp", "CASE WHEN conversations.conversation_type == 1 AND blocked_alias.conversation_id ==conversations.conversation_id THEN 1 ELSE 0 END", "1", "\"\"", "\"\"", "conversations", " LEFT JOIN (SELECT DISTINCT conversation_participants.conversation_id AS conversation_id FROM conversation_participants LEFT JOIN participants ON (participants._id=participant_row_id) WHERE participants.blocked==1) AS blocked_alias ON conversations.conversation_id=blocked_alias.conversation_id"}));
        valueOf7 = String.valueOf("conversations");
        valueOf8 = String.valueOf("status");
        valueOf9 = String.valueOf("merge_key");
        d = new StringBuilder(((((((((((String.valueOf(str).length() + 85) + String.valueOf(valueOf15).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(valueOf7).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()).append(str).append(valueOf15).append(" WHERE ").append(valueOf).append(".").append(valueOf2).append("=1").append(" AND ").append(valueOf3).append("=1").append(" GROUP BY ").append(valueOf4).append(".").append(valueOf5).append(" UNION ").append(valueOf6).append(" WHERE ").append(valueOf7).append(".").append(valueOf8).append("=2").append(" GROUP BY ").append(valueOf9).toString();
        str = String.valueOf("CREATE VIEW invites_view AS ");
        valueOf15 = String.valueOf(String.format(Locale.US, A, new Object[]{"conversations.sort_timestamp", "0", "1", "\"\"", "\"\"", "conversations", ""}));
        valueOf = String.valueOf("conversations");
        valueOf2 = String.valueOf("status");
        valueOf3 = String.valueOf("conversations");
        valueOf4 = String.valueOf("view");
        valueOf5 = String.valueOf("conversations");
        valueOf6 = String.valueOf("conversation_id");
        e = new StringBuilder((((((((String.valueOf(str).length() + 49) + String.valueOf(valueOf15).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append(str).append(valueOf15).append(" WHERE ").append(valueOf).append(".").append(valueOf2).append("=1").append(" AND ").append(valueOf3).append(".").append(valueOf4).append("=1").append(" GROUP BY ").append(valueOf5).append(".").append(valueOf6).toString();
        str = String.valueOf("CREATE TRIGGER MESSAGE_ERROR_TRIGGER  AFTER UPDATE OF status ON messages WHEN  NEW.status!=OLD.status BEGIN  UPDATE messages SET alert_in_conversation_list = ( CASE  WHEN NEW.status=");
        ordinal = fwx.FAILED_TO_SEND.ordinal();
        valueOf = String.valueOf("messages");
        valueOf2 = String.valueOf("message_id");
        valueOf3 = String.valueOf("message_id");
        f = new StringBuilder((((String.valueOf(str).length() + 69) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(str).append(ordinal).append(" THEN 1").append(" ELSE 0").append(" END) WHERE ").append(valueOf).append(".").append(valueOf2).append("=NEW.").append(valueOf3).append("; END ").toString();
        str = String.valueOf("CREATE TRIGGER CONVERSATION_MERGE_KEY_TRIGGER  AFTER INSERT ON conversations FOR EACH ROW  BEGIN  INSERT INTO merge_keys ( conversation_id, merge_key)  VALUES (NEW.conversation_id, \"");
        valueOf15 = bnr.CONVERSATION.f;
        valueOf = String.valueOf("conversation_id");
        g = new StringBuilder(((String.valueOf(str).length() + 15) + String.valueOf(valueOf15).length()) + String.valueOf(valueOf).length()).append(str).append(valueOf15).append("\"||NEW.").append(valueOf).append("); END; ").toString();
        valueOf15 = String.valueOf(z);
        str = String.valueOf("conversations");
        h = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        valueOf15 = String.valueOf(z);
        str = String.valueOf("conversation");
        i = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        valueOf15 = String.valueOf(z);
        str = String.valueOf("invites_view");
        j = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        valueOf15 = String.valueOf(z);
        str = String.valueOf("suggested_contacts");
        k = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        valueOf15 = String.valueOf(z);
        str = String.valueOf("message_notifications_view");
        l = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        valueOf15 = String.valueOf(z);
        str = String.valueOf("blocked_people");
        m = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        valueOf15 = String.valueOf(z);
        str = String.valueOf("dismissed_contacts");
        n = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        str = z;
        valueOf15 = String.valueOf("event_suggestions");
        o = Uri.parse(new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf15).length()).append(str).append(valueOf15).append("/conversation").toString());
        valueOf15 = String.valueOf(z);
        str = String.valueOf("recent_calls");
        p = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        str = z;
        valueOf15 = String.valueOf("messages");
        q = Uri.parse(new StringBuilder((String.valueOf(str).length() + 14) + String.valueOf(valueOf15).length()).append(str).append(valueOf15).append("/conversations").toString());
        str = z;
        valueOf15 = String.valueOf("conversation_images_view");
        D = Uri.parse(new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf15).length()).append(str).append(valueOf15).append("/conversation").toString());
        valueOf15 = String.valueOf(z);
        str = String.valueOf("imagescratchspace");
        E = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        valueOf15 = String.valueOf(z);
        str = String.valueOf("conversation_participants");
        r = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        valueOf15 = String.valueOf(z);
        str = String.valueOf("sms_phone_numbers");
        s = Uri.parse(str.length() != 0 ? valueOf15.concat(str) : new String(valueOf15));
        str = String.valueOf(k);
        t = Uri.parse(new StringBuilder(String.valueOf(str).length() + 6).append(str).append("/query").toString());
        valueOf15 = String.valueOf(z);
        str = String.valueOf("presence");
        if (str.length() != 0) {
            str = valueOf15.concat(str);
        } else {
            str = new String(valueOf15);
        }
        u = Uri.parse(str);
        UriMatcher uriMatcher = new UriMatcher(-1);
        F = uriMatcher;
        uriMatcher.addURI(a, "conversations", 100);
        F.addURI(a, "conversation", 102);
        F.addURI(a, "invites_view", 101);
        F.addURI(a, "conversation_participants/conversation/*", 110);
        F.addURI(a, "sms_phone_numbers", 220);
        F.addURI(a, "blocked_people", 190);
        F.addURI(a, "dismissed_contacts", 230);
        F.addURI(a, "message_notifications_view", 160);
        F.addURI(a, "messages/conversation/*", 120);
        F.addURI(a, "messages/conversations/*", 121);
        F.addURI(a, "imagescratchspace/*", 140);
        F.addURI(a, "conversation_images_view/conversation/*", 130);
        F.addURI(a, "suggested_contacts", 180);
        F.addURI(a, "suggested_contacts/query/*", 181);
        F.addURI(a, "suggested_contacts/query", 181);
        F.addURI(a, "event_suggestions/conversation/*", HttpStatusCodes.STATUS_CODE_OK);
        F.addURI(a, "recent_calls", 210);
        F.addURI(a, "presence", 240);
        Map kyVar = new ky();
        G = kyVar;
        kyVar.put("_id", "_id");
        G.put("gaia_id", "gaia_id");
        G.put("chat_id", "chat_id");
        G.put("name", "name");
        G.put("profile_photo_url", "profile_photo_url");
        kyVar = new ky();
        H = kyVar;
        kyVar.put("_id", "_id");
        H.put("gaia_id", "gaia_id");
        H.put("chat_id", "chat_id");
        H.put("name", "name");
        H.put("profile_photo_url", "profile_photo_url");
        kyVar = new ky();
        I = kyVar;
        kyVar.put("chat_id", "conversation_participants_view.chat_id");
        I.put("latest_message_timestamp", "conversations.latest_message_timestamp");
        kyVar = new ky();
        J = kyVar;
        kyVar.put("_id", "recent_calls._id");
        J.put("contact_id", "contact_id");
        J.put("phone_number", "phone_number");
        J.put("call_timestamp", "call_timestamp");
        J.put("call_type", "call_type");
        J.put("contact_type", "contact_type");
        J.put("call_rate", "call_rate");
        J.put("is_free_call", "is_free_call");
        K = Pattern.compile(".*\"(?!CONV:)(?!\\|).+\".*");
        str = String.valueOf("UPDATE messages SET expiration_timestamp = timestamp + 86400000000 WHERE type = ");
        ordinal = fwy.INCOMING_USER_MESSAGE.ordinal();
        valueOf = String.valueOf("off_the_record");
        valueOf2 = String.valueOf("expiration_timestamp");
        v = new StringBuilder(((String.valueOf(str).length() + 49) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append(str).append(ordinal).append(" AND ").append(valueOf).append(" = 1 AND ").append(valueOf2).append(" = 9223372036854775807").append(";").toString();
        str = String.valueOf("UPDATE messages SET expiration_timestamp = timestamp + 86400000000 WHERE type = ");
        ordinal = fwy.OUTGOING_USER_MESSAGE.ordinal();
        valueOf = String.valueOf("status");
        int ordinal2 = fwx.ON_SERVER.ordinal();
        valueOf3 = String.valueOf("off_the_record");
        valueOf4 = String.valueOf("expiration_timestamp");
        w = new StringBuilder((((String.valueOf(str).length() + 68) + String.valueOf(valueOf).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append(str).append(ordinal).append(" AND ").append(valueOf).append(" = ").append(ordinal2).append(" AND ").append(valueOf3).append(" = 1 AND ").append(valueOf4).append(" = 9223372036854775807").append(";").toString();
        L = new StringBuilder();
    }

    private static String b(String str, String str2) {
        String valueOf = String.valueOf("group_concat(CASE WHEN conversations.latest_message_expiration_timestamp < time_alias.current_timestamp THEN ");
        return new StringBuilder(((((String.valueOf(valueOf).length() + 37) + String.valueOf(str2).length()) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str).length()).append(valueOf).append(str2).append(" WHEN ").append(str).append(" IS NULL THEN ").append(str2).append(" ELSE ").append(str).append(" END, \"|\") ").toString();
    }

    private static String d(String str) {
        return b(str, "\"\"");
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String queryParameter = uri.getQueryParameter("account_id");
        String valueOf;
        if (queryParameter == null) {
            valueOf = String.valueOf("Every URI must have the 'account_id' parameter specified.\nURI: ");
            String valueOf2 = String.valueOf(uri);
            glk.e("Babel_db", new StringBuilder((String.valueOf(valueOf).length() + 0) + String.valueOf(valueOf2).length()).append(valueOf).append(valueOf2).toString(), new Object[0]);
            throw new IllegalArgumentException("Missing 'account_id' parameter");
        } else if (str == null || !K.matcher(str).matches()) {
            Object obj;
            String[] strArr3;
            String str3;
            String str4 = "";
            String queryParameter2 = uri.getQueryParameter("limit");
            List queryParameters = uri.getQueryParameters("suggestion_type");
            SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
            Object obj2;
            int ordinal;
            int i;
            switch (F.match(uri)) {
                case 100:
                    sQLiteQueryBuilder.setTables("conversations_view");
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 101:
                    sQLiteQueryBuilder.setTables("invites_view");
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 102:
                    sQLiteQueryBuilder.setTables("conversations");
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 110:
                    sQLiteQueryBuilder.setTables("conversation_participants_view");
                    sQLiteQueryBuilder.appendWhere("conversation_id");
                    sQLiteQueryBuilder.appendWhere(" in (");
                    obj2 = 1;
                    for (CharSequence charSequence : TextUtils.split((String) uri.getPathSegments().get(2), "\\+")) {
                        if (obj2 != null) {
                            obj2 = null;
                        } else {
                            sQLiteQueryBuilder.appendWhere(",");
                        }
                        sQLiteQueryBuilder.appendWhere("'");
                        sQLiteQueryBuilder.appendWhere(charSequence);
                        sQLiteQueryBuilder.appendWhere("'");
                    }
                    sQLiteQueryBuilder.appendWhere(")");
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 120:
                    sQLiteQueryBuilder.setTables("messages_view");
                    sQLiteQueryBuilder.appendWhere("status");
                    sQLiteQueryBuilder.appendWhere(" != " + fwx.PENDING_DELETE.ordinal() + " AND ");
                    sQLiteQueryBuilder.appendWhere("conversation_id");
                    sQLiteQueryBuilder.appendWhere("=?");
                    i = 1;
                    strArr3 = a(strArr2, (String) uri.getPathSegments().get(2));
                    valueOf = str2;
                    break;
                case 121:
                    sQLiteQueryBuilder.setTables("messages_view");
                    valueOf = String.valueOf("status != ");
                    ordinal = fwx.PENDING_DELETE.ordinal();
                    String valueOf3 = String.valueOf("conversation_id");
                    sQLiteQueryBuilder.appendWhere(new StringBuilder((String.valueOf(valueOf).length() + 228) + String.valueOf(valueOf3).length()).append(valueOf).append(ordinal).append(" AND ").append(valueOf3).append(" IN (SELECT conversation_id FROM conversations WHERE conversation_id=? OR conversation_id IN (SELECT conversation_id FROM merge_keys WHERE merge_key IN (SELECT merge_key FROM merge_keys WHERE conversation_id=?)))").toString());
                    valueOf = (String) uri.getPathSegments().get(2);
                    i = 1;
                    strArr3 = a(strArr2, valueOf, valueOf);
                    valueOf = str2;
                    break;
                case 130:
                    sQLiteQueryBuilder.setTables("conversation_images_view");
                    sQLiteQueryBuilder.appendWhere("conversation_id IN (SELECT conversation_id FROM merge_keys WHERE merge_key=(SELECT merge_key FROM merge_keys WHERE conversation_id=?))");
                    if (!gkd.a(getContext())) {
                        sQLiteQueryBuilder.appendWhere(" AND ");
                        sQLiteQueryBuilder.appendWhere("realContentType");
                        sQLiteQueryBuilder.appendWhere(" != 'image/gif'");
                    }
                    valueOf = "date ASC";
                    obj = null;
                    strArr3 = a(strArr2, (String) uri.getPathSegments().get(2));
                    break;
                case 140:
                    return null;
                case 160:
                    sQLiteQueryBuilder.setTables("message_notifications_view");
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 180:
                    sQLiteQueryBuilder.setTables("suggested_contacts");
                    if (!queryParameters.isEmpty()) {
                        strArr2 = a(sQLiteQueryBuilder, strArr2, "suggestion_type", queryParameters);
                    }
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 181:
                    List pathSegments = uri.getPathSegments();
                    if (pathSegments.size() <= 2) {
                        obj2 = "";
                    } else {
                        obj2 = ((String) pathSegments.get(2)).trim();
                    }
                    if (TextUtils.isEmpty(obj2)) {
                        glk.d("Babel_db", "prepareSuggestedPeopleSearchQuery: query is empty", new Object[0]);
                    } else {
                        CharSequence concat;
                        sQLiteQueryBuilder.setTables("suggested_contacts");
                        sQLiteQueryBuilder.appendWhere("(");
                        str4 = DatabaseUtils.sqlEscapeString(String.valueOf(obj2).concat("%"));
                        String sqlEscapeString = DatabaseUtils.sqlEscapeString(new StringBuilder(String.valueOf(obj2).length() + 3).append("% ").append(obj2).append("%").toString());
                        String valueOf4 = String.valueOf("name LIKE ");
                        valueOf = String.valueOf(str4);
                        sQLiteQueryBuilder.appendWhere(valueOf.length() != 0 ? valueOf4.concat(valueOf) : new String(valueOf4));
                        sQLiteQueryBuilder.appendWhere(" OR ");
                        str4 = String.valueOf("name LIKE ");
                        valueOf = String.valueOf(sqlEscapeString);
                        if (valueOf.length() != 0) {
                            concat = str4.concat(valueOf);
                        } else {
                            concat = new String(str4);
                        }
                        sQLiteQueryBuilder.appendWhere(concat);
                        sQLiteQueryBuilder.appendWhere(")");
                    }
                    if (!queryParameters.isEmpty()) {
                        sQLiteQueryBuilder.appendWhere(" AND ");
                        strArr2 = a(sQLiteQueryBuilder, strArr2, "suggestion_type", queryParameters);
                    }
                    valueOf = "UPPER(name)";
                    obj = null;
                    strArr3 = strArr2;
                    break;
                case 190:
                    sQLiteQueryBuilder.setTables("blocked_people");
                    sQLiteQueryBuilder.setProjectionMap(G);
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    sQLiteQueryBuilder.setTables("event_suggestions");
                    sQLiteQueryBuilder.appendWhere("conversation_id");
                    sQLiteQueryBuilder.appendWhere("=? AND (");
                    sQLiteQueryBuilder.appendWhere("expiration_time_usec");
                    sQLiteQueryBuilder.appendWhere("<= 0 OR ");
                    sQLiteQueryBuilder.appendWhere("expiration_time_usec");
                    sQLiteQueryBuilder.appendWhere("> (julianday('now') - 2440587.5) * 86400000000)");
                    obj = null;
                    strArr3 = a(strArr2, (String) uri.getPathSegments().get(2));
                    valueOf = str4;
                    break;
                case 210:
                    sQLiteQueryBuilder.setTables("recent_calls");
                    sQLiteQueryBuilder.setProjectionMap(J);
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 220:
                    sQLiteQueryBuilder.setTables("conversation_participants_view JOIN conversations ON (conversation_participants_view.conversation_id=conversations.conversation_id)");
                    sQLiteQueryBuilder.appendWhere("conversation_type");
                    sQLiteQueryBuilder.appendWhere("=1");
                    sQLiteQueryBuilder.appendWhere(" AND ");
                    sQLiteQueryBuilder.appendWhere("participant_type");
                    sQLiteQueryBuilder.appendWhere("=" + edq.PHONE.ordinal());
                    sQLiteQueryBuilder.appendWhere(" AND ");
                    sQLiteQueryBuilder.appendWhere("latest_message_timestamp");
                    sQLiteQueryBuilder.appendWhere("!= 0");
                    sQLiteQueryBuilder.setProjectionMap(I);
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 230:
                    sQLiteQueryBuilder.setTables("dismissed_contacts");
                    sQLiteQueryBuilder.setProjectionMap(H);
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                case 240:
                    sQLiteQueryBuilder.setTables("presence");
                    obj = null;
                    strArr3 = strArr2;
                    valueOf = str2;
                    break;
                default:
                    valueOf = String.valueOf(uri);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 12).append("Unknown URI ").append(valueOf).toString());
            }
            if (TextUtils.isEmpty(str2)) {
                str3 = valueOf;
            } else {
                str3 = str2;
            }
            try {
                y.b("query");
                if (x) {
                    String valueOf5 = String.valueOf(uri);
                    int match = F.match(uri);
                    valueOf = String.valueOf(sQLiteQueryBuilder.buildQuery(strArr, str, null, null, str2, queryParameter2));
                    glk.a("Babel_db", new StringBuilder((String.valueOf(valueOf5).length() + 46) + String.valueOf(valueOf).length()).append("[EsProvider] URI:").append(valueOf5).append(", match: ").append(match).append(", QUERY: ").append(valueOf).toString(), new Object[0]);
                }
                try {
                    Cursor bkb;
                    Cursor a = bmr.a(getContext(), Integer.parseInt(queryParameter)).a().a(sQLiteQueryBuilder, strArr, str, strArr3, null, null, str3, queryParameter2);
                    if (obj != null) {
                        bkb = new bkb(a);
                    } else {
                        bkb = a;
                    }
                    if (x) {
                        glk.a("Babel_db", "[EsProvider] QUERY results: " + bkb.getCount(), new Object[0]);
                    }
                    bkb.setNotificationUri(getContext().getContentResolver(), uri);
                    return bkb;
                } catch (bmu e) {
                    y.c("query");
                    return null;
                }
            } finally {
                y.c("query");
            }
        } else {
            valueOf = String.valueOf(uri);
            glk.e("Babel_db", new StringBuilder((String.valueOf(str).length() + 75) + String.valueOf(valueOf).length()).append("Queries must use parameter bindings, illegal selection detected: ").append(str).append(" for URI: ").append(valueOf).toString(), new Object[0]);
            throw new IllegalArgumentException("Queries must use parameter bindings");
        }
    }

    private String[] a(SQLiteQueryBuilder sQLiteQueryBuilder, String[] strArr, String str, List<String> list) {
        if (list.size() == 1) {
            sQLiteQueryBuilder.appendWhere(str);
            sQLiteQueryBuilder.appendWhere("=?");
            return a(strArr, (String) list.get(0));
        } else if (list.isEmpty()) {
            return strArr;
        } else {
            sQLiteQueryBuilder.appendWhere(str);
            sQLiteQueryBuilder.appendWhere(" in (");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                strArr = a(strArr, (String) it.next());
                if (it.hasNext()) {
                    sQLiteQueryBuilder.appendWhere("?,");
                } else {
                    sQLiteQueryBuilder.appendWhere("?");
                }
            }
            sQLiteQueryBuilder.appendWhere(")");
            return strArr;
        }
    }

    private static String[] a(String[] strArr, String... strArr2) {
        if (strArr2.length == 0) {
            return strArr;
        }
        int length = strArr == null ? 0 : strArr.length;
        int length2 = strArr2.length;
        Object obj = new String[(length + length2)];
        System.arraycopy(strArr2, 0, obj, 0, length2);
        if (length > 0) {
            System.arraycopy(strArr, 0, obj, length2, length);
        }
        return obj;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        String valueOf = String.valueOf(uri);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Insert not supported ").append(valueOf).toString());
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String valueOf = String.valueOf(uri);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Update not supported: ").append(valueOf).toString());
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (x) {
            String valueOf = String.valueOf(uri);
            new StringBuilder(String.valueOf(valueOf).length() + 7).append("delete ").append(valueOf);
        }
        switch (F.match(uri)) {
            case 140:
                valueOf = (String) uri.getPathSegments().get(1);
                String str2;
                String str3;
                try {
                    if (new File(a(getContext(), valueOf)).delete()) {
                        return 1;
                    }
                    str2 = "Babel_db";
                    str3 = "delete: error deleting ";
                    String valueOf2 = String.valueOf(valueOf);
                    glk.d(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3), new Object[0]);
                    return 0;
                } catch (Throwable e) {
                    str2 = "Babel_db";
                    str3 = "delete: error deleting ";
                    valueOf = String.valueOf(valueOf);
                    if (valueOf.length() != 0) {
                        valueOf = str3.concat(valueOf);
                    } else {
                        valueOf = new String(str3);
                    }
                    glk.d(str2, valueOf, e);
                    return 0;
                }
            default:
                throw new IllegalArgumentException();
        }
    }

    public String getType(Uri uri) {
        switch (F.match(uri)) {
            case 100:
                return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.conversations";
            case 110:
                return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.participants";
            case 120:
                return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.messages";
            case 160:
                return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.message_notifications";
            case 190:
                return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.blocked_people";
            case 230:
                return "vnd.android.cursor.dir/vnd.google.android.apps.hangouts.dismissed_contacts";
            default:
                String valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Unknown URI: ").append(valueOf).toString());
        }
    }

    public static void a(Context context) {
        for (int a : fde.f()) {
            bmr.a(context, a).b().a(Locale.getDefault());
        }
    }

    public static String a(int i) {
        String valueOf = String.valueOf("continuation_end_timestamp");
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(i).toString();
    }

    private static Builder a(Builder builder, int i) {
        return builder.appendQueryParameter("account_id", Integer.toString(i));
    }

    public static Uri a(Uri uri, int i) {
        return a(uri.buildUpon(), i).build();
    }

    public static Uri b(Uri uri, int i) {
        return uri.buildUpon().appendQueryParameter("suggestion_type", Integer.toString(i)).build();
    }

    @Deprecated
    public static Uri a(bko bko, String str) {
        return a(bko.g(), str);
    }

    public static Uri a(int i, String str) {
        Builder buildUpon = q.buildUpon();
        buildUpon.appendPath(str);
        buildUpon.appendQueryParameter("account_id", Integer.toString(i));
        return buildUpon.build();
    }

    public static Uri b(int i, String str) {
        return q.buildUpon().appendPath(str).appendPath("messageRowId").appendQueryParameter("account_id", Integer.toString(i)).build();
    }

    public static Uri a(int i, String str, long j, long j2) {
        return b(i, str).buildUpon().appendPath(String.format("%s-%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)})).build();
    }

    public static Uri b(bko bko, String str) {
        Builder buildUpon = D.buildUpon();
        buildUpon.appendPath(str);
        buildUpon.appendQueryParameter("account_id", Integer.toString(bko.g()));
        return buildUpon.build();
    }

    public static Uri a(int i, long j) {
        Builder buildUpon = E.buildUpon();
        buildUpon.appendPath(String.valueOf(j));
        buildUpon.appendQueryParameter("account_id", Integer.toString(i));
        return buildUpon.build();
    }

    public static Uri c(int i, String str) {
        Builder buildUpon = o.buildUpon();
        buildUpon.appendPath(str);
        return a(buildUpon, i).build();
    }

    public static Uri c(bko bko, String str) {
        Builder buildUpon = r.buildUpon();
        buildUpon.appendPath("conversation").appendPath(str);
        buildUpon.appendQueryParameter("account_id", Integer.toString(bko.g()));
        return buildUpon.build();
    }

    public static Uri a(bko bko, ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (stringBuilder.length() > 0) {
                stringBuilder.append("+");
            }
            stringBuilder.append(str);
        }
        return c(bko, stringBuilder.toString());
    }

    public static Uri a(bko bko, int i) {
        Builder buildUpon = p.buildUpon();
        buildUpon.appendQueryParameter("account_id", Integer.toString(bko.g()));
        if (i > 0) {
            buildUpon.appendQueryParameter("limit", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public static String[] a() {
        return new String[]{"CREATE TABLE conversations (_id INTEGER PRIMARY KEY, conversation_id TEXT, conversation_type INT, latest_message_timestamp INT DEFAULT(0), latest_message_expiration_timestamp INT, metadata_present INT,notification_level INT, name TEXT, generated_name TEXT, snippet_type INT, snippet_text TEXT, snippet_image_url TEXT, snippet_author_gaia_id TEXT, snippet_author_chat_id TEXT, snippet_message_row_id INT, snippet_selector INT, snippet_status INT, snippet_new_conversation_name TEXT, snippet_participant_keys TEXT, snippet_sms_type TEXT, previous_latest_timestamp INT, status INT, view INT, inviter_gaia_id TEXT, inviter_chat_id TEXT, inviter_affinity INT, is_pending_leave INT, account_id INT, is_otr INT, packed_avatar_urls TEXT, self_avatar_url TEXT, self_watermark INT DEFAULT(0), chat_watermark INT DEFAULT(0), hangout_watermark INT DEFAULT(0), is_draft INT, sequence_number INT, call_media_type INT DEFAULT(0), has_joined_hangout INT, has_chat_notifications DEFAULT(0),has_video_notifications DEFAULT(0),last_hangout_event_time INT, draft TEXT, otr_status INT, otr_toggle INT, last_otr_modification_time INT, continuation_token BLOB, continuation_event_timestamp INT, has_oldest_message INT DEFAULT(0), sort_timestamp INT, first_peak_scroll_time INT, first_peak_scroll_to_message_timestamp INT, second_peak_scroll_time INT, second_peak_scroll_to_message_timestamp INT, conversation_hash BLOB, disposition INT DEFAULT(0), has_persistent_events INT DEFAULT(-1), transport_type INT DEFAULT(1), default_transport_phone TEXT, sms_service_center TEXT, is_temporary INT DEFAULT (0), sms_thread_id INT DEFAULT (-1), chat_ringtone_uri TEXT, hangout_ringtone_uri TEXT, snippet_voicemail_duration INT DEFAULT (0), share_count INT DEFAULT (0), has_unobserved TEXT, last_share_timestamp INT DEFAULT (0), gls_status INT DEFAULT (0), gls_link TEXT, is_guest INT DEFAULT (0), UNIQUE (conversation_id ));", "CREATE TABLE conversation_participants (_id INTEGER PRIMARY KEY, participant_row_id INT, participant_type INT, conversation_id TEXT, sequence INT, active INT, invitation_status INT DEFAULT(0), UNIQUE (conversation_id,participant_row_id) ON CONFLICT REPLACE, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (participant_row_id) REFERENCES participants(_id));", c, "CREATE TABLE presence (_id INTEGER PRIMARY KEY, gaia_id TEXT NOT NULL, reachable INT DEFAULT(0), reachable_time INT DEFAULT(0), available INT DEFAULT(0), available_time INT DEFAULT(0), status_message TEXT, status_message_time INT DEFAULT(0), call_type INT DEFAULT(0), call_type_time INT DEFAULT(0), device_status INT DEFAULT(0), device_status_time INT DEFAULT(0), last_seen INT DEFAULT(0), last_seen_time INT DEFAULT(0), location BLOB, location_time INT DEFAULT(0), UNIQUE (gaia_id) ON CONFLICT REPLACE);", "CREATE TABLE suggested_contacts (_id INTEGER PRIMARY KEY, gaia_id TEXT, chat_id TEXT, name TEXT, first_name TEXT, packed_circle_ids TEXT, profile_photo_url TEXT, sequence INT, suggestion_type INT, logging_id TEXT, affinity_score REAL DEFAULT (0.0), is_in_same_domain INT DEFAULT (0));", "CREATE TABLE messages (_id INTEGER PRIMARY KEY, message_id TEXT, message_type INT, conversation_id TEXT, author_chat_id TEXT, author_gaia_id TEXT, text TEXT, timestamp INT, delete_after_read_timetamp INT, status INT, type INT, local_url TEXT, remote_url TEXT, attachment_content_type TEXT, width_pixels INT, height_pixels INT, stream_id TEXT, image_id TEXT, album_id TEXT, latitude DOUBLE, longitude DOUBLE, address ADDRESS, notification_level INT, expiration_timestamp INT, notified_for_failure INT DEFAULT(0), off_the_record INT DEFAULT(0), transport_type INT NOT NULL DEFAULT(1), transport_phone TEXT, external_ids TEXT, sms_timestamp_sent INT DEFAULT(0), sms_priority INT DEFAULT(0), sms_message_size INT DEFAULT(0), mms_subject TEXT, sms_raw_sender TEXT, sms_raw_recipients TEXT, persisted INT DEFAULT(1), sms_message_status INT DEFAULT(-1), sms_type INT DEFAULT(-1), stream_url TEXT, attachment_target_url TEXT, attachment_name TEXT, image_rotation INT DEFAULT (0), new_conversation_name TEXT, participant_keys TEXT, forwarded_mms_url TEXT, forwarded_mms_count INT DEFAULT(0), attachment_description TEXT, attachment_target_url_description TEXT, attachment_target_url_name TEXT, attachment_blob_data BLOB,attachment_uploading_progress INT DEFAULT(0), sending_error INT DEFAULT(0), stream_expiration INT, voicemail_length INT DEFAULT (0), call_media_type INT DEFAULT(0), last_seen_timestamp INT DEFAULT(0), observed_status INT DEFAULT(2), receive_type INT DEFAULT(0), init_timestamp INT DEFAULT(0), in_app_msg_latency INT DEFAULT(0), notified INT DEFAULT(0), alert_in_conversation_list INT DEFAULT(0), attachments BLOB, is_user_mentioned INT DEFAULT(0), FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE,UNIQUE (conversation_id,message_id) ON CONFLICT REPLACE);", "CREATE TABLE event_suggestions (_id INTEGER PRIMARY KEY, conversation_id TEXT, event_id TEXT, suggestion_id TEXT, timestamp INT, expiration_time_usec INT, type INT, gem_asset_url STRING, gem_horizontal_alignment INT, matched_message_substring TEXT, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE, UNIQUE (conversation_id,suggestion_id) ON CONFLICT REPLACE);", "CREATE TABLE multipart_attachments (_id INTEGER PRIMARY KEY, message_id TEXT, conversation_id TEXT, url TEXT, content_type TEXT, width INT, height INT, FOREIGN KEY (message_id, conversation_id) REFERENCES messages(message_id, conversation_id) ON DELETE CASCADE ON UPDATE CASCADE);", "CREATE TABLE blocked_people (_id INTEGER PRIMARY KEY, gaia_id TEXT, chat_id TEXT, name TEXT, profile_photo_url TEXT, UNIQUE (chat_id) ON CONFLICT REPLACE, UNIQUE (gaia_id) ON CONFLICT REPLACE);", "CREATE TABLE dismissed_contacts (_id INTEGER PRIMARY KEY, gaia_id TEXT, chat_id TEXT, name TEXT, profile_photo_url TEXT, UNIQUE (chat_id) ON CONFLICT REPLACE, UNIQUE (gaia_id) ON CONFLICT REPLACE);", "CREATE TABLE search (search_key TEXT NOT NULL,continuation_token TEXT,PRIMARY KEY (search_key));", "CREATE TABLE mms_notification_inds (_id INTEGER PRIMARY KEY, content_location TEXT, transaction_id TEXT, from_address TEXT, message_size INT DEFAULT(0), expiry INT);", "CREATE TABLE merge_keys (_id INTEGER PRIMARY KEY, conversation_id TEXT, merge_key TEXT, UNIQUE (conversation_id) ON CONFLICT REPLACE, FOREIGN KEY (conversation_id) REFERENCES conversations(conversation_id) ON DELETE CASCADE ON UPDATE CASCADE  );", "CREATE TABLE recent_calls (_id INTEGER PRIMARY KEY, normalized_number TEXT NOT NULL, phone_number TEXT, contact_id TEXT, call_timestamp INT, call_type INT, contact_type INT, call_rate TEXT, is_free_call BOOLEAN);", "CREATE TABLE sticker_albums (album_id TEXT NOT NULL, title TEXT, cover_photo_id TEXT, last_used INT DEFAULT(0), PRIMARY KEY (album_id));", "CREATE TABLE sticker_photos (photo_id TEXT NOT NULL, album_id TEXT NOT NULL, url TEXT NOT NULL, file_name TEXT, last_used INT DEFAULT(0), PRIMARY KEY (photo_id), FOREIGN KEY (album_id) REFERENCES sticker_albums(album_id) ON DELETE CASCADE)", "CREATE VIRTUAL TABLE participants_fts USING fts4(content=\"participants\",gaia_id,full_name);", "CREATE VIRTUAL TABLE participant_email_fts USING fts4(content=\"merged_contact_details\", gaia_id,lookup_data);"};
    }

    public static String[] b() {
        return new String[]{"CREATE INDEX index_conversations_status ON conversations(status)", "CREATE INDEX index_merge_keys_merge_key_NEW ON merge_keys(merge_key)", "CREATE INDEX index_merge_keys_merge_conversation_id ON merge_keys(conversation_id); ", "CREATE INDEX index_conversation_participants_view_conversation_id ON conversation_participants(conversation_id)", "CREATE INDEX index_conversations_view ON conversations(view)", "CREATE INDEX index_conversations_sort_timestamp ON conversations(sort_timestamp)", "CREATE INDEX index_conversations_chat_notifications ON conversations(has_chat_notifications)", "CREATE INDEX index_conversations_video_notifications ON conversations(has_video_notifications)", "CREATE INDEX index_dismissed_contacts_gaia_id ON dismissed_contacts(gaia_id)", "CREATE INDEX index_participants_chat_id ON participants(chat_id)", "CREATE INDEX index_participants_blocked ON participants(blocked)", "CREATE INDEX index_messages_conversation_id_alert_status ON messages(conversation_id, alert_in_conversation_list)", "CREATE INDEX index_messages_conversation_id_timestamp ON messages(conversation_id, timestamp)", "CREATE INDEX index_event_suggestions_conversation_id_expiration_time_timestamp  ON event_suggestions(conversation_id, expiration_time_usec, timestamp)", "CREATE INDEX index_multipart_attachments_conversation_id_message_id ON multipart_attachments(conversation_id, message_id)", "CREATE INDEX index_conversation_participants_sequence ON conversation_participants(sequence)", "CREATE INDEX index_recent_calls_sequence ON recent_calls(call_timestamp)"};
    }

    public static String[] c() {
        return new String[]{"conversation_participants_view", "participants_view", "conversations_view", "invites_view", "messages_view", "message_notifications_view", "conversation_images_view"};
    }

    public static String[] d() {
        return new String[]{"CREATE VIEW conversation_participants_view AS SELECT participants._id as _id, conversation_participants.conversation_id as conversation_id, conversation_participants.sequence as sequence, conversation_participants.active as active, conversation_participants.invitation_status as invitation_status, participants.circle_id as circle_id, participants.gaia_id as gaia_id, participants.chat_id as chat_id, participants.phone_id as phone_id, participants.fallback_name as fallback_name,  IFNULL(participants.full_name, participants.fallback_name)  as full_name,  IFNULL(IFNULL(participants.first_name, participants.full_name), participants.fallback_name)  as first_name, participants.profile_photo_url as profile_photo_url, participants.batch_gebi_tag as batch_gebi_tag, participants.participant_type as participant_type, participants.blocked as blocked, participants.in_users_domain as in_users_domain  FROM conversation_participants LEFT JOIN participants ON (conversation_participants.participant_row_id=participants._id)", "CREATE VIEW participants_view AS SELECT participants._id, participants.circle_id, participants.gaia_id, participants.chat_id, participants.phone_id,  IFNULL(participants.full_name, participants.fallback_name)  as full_name,  IFNULL(participants.first_name, participants.fallback_name)  as first_name, participants.fallback_name, participants.profile_photo_url, participants.batch_gebi_tag, participants.participant_type, participants.blocked  FROM participants", d, e, "CREATE VIEW messages_view AS SELECT messages._id as _id, messages.message_id as message_id, messages.conversation_id as conversation_id, messages.author_chat_id as author_chat_id, messages.author_gaia_id as author_gaia_id, messages.text as text, messages.timestamp as timestamp, messages.status as status, messages.type as type, messages.local_url as local_url, messages.remote_url as remote_url, messages.attachment_content_type as attachment_content_type, messages.width_pixels as width_pixels, messages.height_pixels as height_pixels, messages.stream_id as stream_id, messages.image_id as image_id, messages.album_id as album_id,messages.attachment_name as attachment_name, messages.attachment_description as attachment_description, messages.latitude as latitude, messages.longitude as longitude,messages.address as address,messages.attachment_target_url as attachment_target_url,messages.attachment_target_url_name as attachment_target_url_name,messages.attachment_target_url_description as attachment_target_url_description,messages.attachment_blob_data as attachment_blob_data,messages.attachment_uploading_progress as attachment_uploading_progress, messages.expiration_timestamp as expiration_timestamp, messages.off_the_record as off_the_record, messages.external_ids as external_ids, messages.sms_message_size as sms_message_size, messages.sms_priority as sms_priority, messages.sms_timestamp_sent as sms_timestamp_sent, messages.mms_subject as mms_subject, messages.sms_raw_sender as sms_raw_sender, messages.sms_raw_recipients as sms_raw_recipients, messages.persisted as persisted, messages.transport_type as transport_type, messages.transport_phone as transport_phone, messages.sms_message_status as sms_message_status, messages.sms_type as sms_type, messages.stream_url as stream_url, messages.stream_expiration as stream_expiration, messages.voicemail_length as voicemail_length, messages.image_rotation as image_rotation, messages.new_conversation_name as new_conversation_name, messages.participant_keys as participant_keys, messages.forwarded_mms_url as forwarded_mms_url, messages.forwarded_mms_count as forwarded_mms_count, messages.sending_error as sending_error, messages.call_media_type as call_media_type, messages.last_seen_timestamp as last_seen_timestamp, messages.observed_status as observed_status, messages.receive_type as receive_type, messages.init_timestamp as init_timestamp, messages.in_app_msg_latency as in_app_msg_latency, messages.notified as notified, messages.observed_status as observed_status, messages.attachments as attachments FROM messages WHERE expiration_timestamp IS NULL OR expiration_timestamp >= (julianday('now') - 2440587.5) * 86400000000", "CREATE VIEW message_notifications_view AS SELECT messages._id as _id, messages.message_id as message_id, messages.conversation_id as conversation_id, messages.author_chat_id as author_chat_id, messages.author_gaia_id as author_gaia_id, messages.text as text, messages.local_url as local_url, messages.remote_url as remote_url, messages.attachment_content_type as attachment_content_type, messages.width_pixels as width_pixels, messages.height_pixels as height_pixels, messages.stream_id as stream_id, messages.image_id as image_id, messages.album_id as album_id, messages.attachment_name as attachment_name, messages.latitude as latitude, messages.longitude as longitude,messages.address as address,messages.attachment_target_url as attachment_target_url,messages.timestamp as timestamp, messages.status as status, messages.type as type, messages.transport_type as transport_type, messages.transport_phone as transport_phone, messages.notification_level as notification_level, messages.notified_for_failure as notified_for_failure, messages.new_conversation_name as new_conversation_name, messages.participant_keys as participant_keys, messages.sms_type as sms_type, messages.last_seen_timestamp as last_seen_timestamp, messages.observed_status as observed_status, messages.is_user_mentioned as is_user_mentioned, (select merge_key from merge_keys where merge_keys.conversation_id=messages.conversation_id)  as merge_key, author_alias.full_name as author_full_name, author_alias.first_name as author_first_name, author_alias.profile_photo_url as author_profile_photo_url, conversations.notification_level as conversation_notification_level, conversations.status as conversation_status, conversations.view as conversation_view, conversations.is_pending_leave as conversation_pending_leave, conversations.has_chat_notifications as conversation_has_chat_notifications, conversations.has_video_notifications as conversation_has_video_notifications, conversations.name as conversation_name, conversations.generated_name as generated_name, conversations.conversation_type as conversation_type, conversations.chat_watermark as chat_watermark, conversations.hangout_watermark as hangout_watermark, conversations.self_watermark as self_watermark ,conversations.chat_ringtone_uri as chat_ringtone_uri, conversations.hangout_ringtone_uri as hangout_ringtone_uri, conversations.otr_status as otr_status, conversations.call_media_type as call_media_type FROM messages LEFT JOIN conversation_participants_view author_alias ON ((messages.author_chat_id=author_alias.chat_id OR author_chat_id=author_alias.gaia_id) AND messages.conversation_id=author_alias.conversation_id) LEFT JOIN conversations ON messages.conversation_id=conversations.conversation_id", "CREATE VIEW conversation_images_view AS SELECT  CASE WHEN multipart_attachments.url NOT NULL THEN multipart_attachments.url WHEN messages.remote_url NOT NULL THEN messages.remote_url ELSE messages.local_url END  as uri, messages.text as _display_name,  CASE WHEN multipart_attachments.url NOT NULL THEN multipart_attachments.url WHEN messages.remote_url NOT NULL THEN messages.remote_url ELSE messages.local_url END  as contentUri,  CASE WHEN messages.remote_url NOT NULL THEN messages.remote_url ELSE messages.local_url END  as thumbnailUri, 'image/jpeg' as contentType, messages.attachment_content_type as realContentType, messages.conversation_id as conversation_id, messages.timestamp as date, conversation_participants_view.full_name as author, conversation_participants_view.profile_photo_url as iconUri, messages.attachment_target_url as sourceUrl, messages.attachment_target_url_name as sourceName, messages.attachment_target_url_description as sourceDescription, messages.attachment_description as hashtag  FROM messages LEFT JOIN conversation_participants_view ON ((messages.author_chat_id=conversation_participants_view.chat_id OR messages.author_gaia_id=conversation_participants_view.gaia_id) AND messages.conversation_id=conversation_participants_view.conversation_id) LEFT OUTER JOIN multipart_attachments USING (conversation_id, message_id)  WHERE (expiration_timestamp IS NULL OR expiration_timestamp >= (julianday('now') - 2440587.5) * 86400000000) AND (remote_url NOT NULL OR local_url NOT NULL OR multipart_attachments.url NOT NULL) AND (attachment_content_type LIKE 'image/%' OR attachment_content_type='multipart/mixed') AND (local_url IS NULL OR (local_url NOT LIKE '%/sticker_cache/%' AND local_url NOT LIKE 'sticker://%'))"};
    }

    public static String[] e() {
        return new String[]{f, g, " CREATE TRIGGER participants_bd  BEFORE DELETE ON participants BEGIN  DELETE FROM participants_fts WHERE docid=old.rowid;  END;", " CREATE TRIGGER participants_bu  BEFORE UPDATE OF full_name ON participants BEGIN  DELETE FROM participants_fts WHERE docid=old.rowid;  END;", " CREATE TRIGGER participants_ai AFTER INSERT ON participants BEGIN  INSERT INTO participants_fts(docid, gaia_id, full_name)  VALUES(new.rowid, new.gaia_id, new.full_name);  END;", " CREATE TRIGGER participants_au  AFTER UPDATE OF full_name ON participants BEGIN  INSERT INTO participants_fts(docid, gaia_id, full_name)  VALUES(new.rowid, new.gaia_id, new.full_name); END;", " CREATE TRIGGER mcd_bd  BEFORE DELETE ON merged_contact_details BEGIN  DELETE FROM participant_email_fts WHERE docid=old.rowid;  END;", " CREATE TRIGGER mcd_bu  BEFORE UPDATE OF lookup_data ON merged_contact_details BEGIN  DELETE FROM participant_email_fts WHERE docid=old.rowid;  END;", " CREATE TRIGGER mcd_ai  AFTER INSERT ON merged_contact_details BEGIN  INSERT INTO participant_email_fts(docid, gaia_id, lookup_data)  VALUES(new.rowid, new.gaia_id, new.lookup_data);  END;", " CREATE TRIGGER mcd_au  AFTER UPDATE OF lookup_data ON merged_contact_details BEGIN  INSERT INTO participant_email_fts(docid, gaia_id, lookup_data)  VALUES(new.rowid, new.gaia_id, new.lookup_data); END;"};
    }

    private static String a(Context context, String str) {
        String valueOf = String.valueOf(context.getCacheDir().getAbsolutePath());
        return new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(str).length()).append(valueOf).append("/scratch/").append(str).append(".temp.jpg").toString();
    }

    private ParcelFileDescriptor c(String str, String str2) {
        String a = a(getContext(), str);
        ParcelFileDescriptor open;
        String valueOf;
        try {
            File file = new File(a);
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                int i;
                if (str2.equals("r")) {
                    i = 268435456;
                } else {
                    i = 1006632960;
                }
                open = ParcelFileDescriptor.open(file, i);
                return open;
            }
            valueOf = String.valueOf(parentFile.getPath());
            glk.e("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 47).append("[TempFileProvider] tempStoreFd: ").append(valueOf).append("does not exist!").toString(), new Object[0]);
            return null;
        } catch (Throwable e) {
            Throwable th = e;
            String str3 = "Babel_db";
            String str4 = "getTempStoreFd: error creating pfd for ";
            valueOf = String.valueOf(a);
            glk.d(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), th);
            open = null;
        }
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        if (glk.a("Babel_db", 3)) {
            String valueOf = String.valueOf(uri);
            glk.a("Babel_db", new StringBuilder(String.valueOf(valueOf).length() + 9).append("openFile ").append(valueOf).toString(), new Object[0]);
        }
        switch (F.match(uri)) {
            case 140:
                return c((String) uri.getPathSegments().get(1), str);
            default:
                return null;
        }
    }

    public static int a(String str, int i) {
        int i2 = 0;
        if (str != null) {
            Object b = b(str, i);
            if (!TextUtils.isEmpty(b)) {
                try {
                    i2 = Integer.parseInt(b);
                } catch (NumberFormatException e) {
                }
            }
        }
        return i2;
    }

    public static String a(String str) {
        return new StringBuilder(String.valueOf(str).length() + 7).append("quote(").append(str).append(")").toString();
    }

    public static String b(String str) {
        return new StringBuilder(String.valueOf(str).length() + 20).append("group_concat(").append(str).append(", \"|\") ").toString();
    }

    public static String a(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 28) + String.valueOf(str2).length()).append("('|' || ").append(str).append(" || '|') LIKE '%|").append(str2).append("|%'").toString();
    }

    private static String e(String str) {
        return String.format(Locale.US, "max(%s)", new Object[]{str});
    }

    private static String c(String str, int i) {
        bnm bnl = new bnl(i);
        a(str, bnl);
        return bnl.a;
    }

    private static void a(String str, bnm bnm) {
        if (str != null) {
            synchronized (L) {
                int length = str.length();
                int i = -1;
                int i2 = 0;
                Object obj = 1;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    char charAt = str.charAt(i2);
                    if (obj != null) {
                        i++;
                        L.setLength(0);
                        if (charAt != '\'') {
                            L.append(charAt);
                            int i4 = i3;
                            while (i4 < length && str.charAt(i4) != '|') {
                                L.append(str.charAt(i4));
                                i4++;
                            }
                            if (TextUtils.equals(L, "NULL")) {
                                L.setLength(0);
                            }
                            bnm.a(i, L);
                            if (i4 == length) {
                                break;
                            }
                            i2 = i4 + 1;
                            obj = 1;
                        } else {
                            obj = null;
                        }
                    } else if (charAt != '\'') {
                        L.append(charAt);
                        if (i3 == length) {
                            if (x) {
                                glk.a("Babel_db", new StringBuilder(String.valueOf(str).length() + 75).append("[EsProvider] splitQuotedString called with: ").append(str).append(", which does not escape quotes.").toString(), new Object[0]);
                            }
                            bnm.a(i, L);
                        }
                    } else if (i3 == length) {
                        bnm.a(i, L);
                        break;
                    } else if (str.charAt(i3) == '\'') {
                        L.append(charAt);
                        i2 = i3 + 1;
                    } else {
                        iil.a(Character.valueOf(str.charAt(i3)), Character.valueOf('|'));
                        bnm.a(i, L);
                        i2 = i3 + 1;
                        obj = 1;
                    }
                    i2 = i3;
                }
            }
        }
    }

    public static List<String> c(String str) {
        List<String> arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            if (str.charAt(0) == '\'' || str.startsWith("NULL")) {
                a(str, new bnk(arrayList));
            } else {
                Collections.addAll(arrayList, str.split("\\|"));
            }
        }
        return arrayList;
    }

    public static String b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.charAt(0) == '\'' || str.startsWith("NULL")) {
            return c(str, i);
        }
        String[] split = str.split("\\|");
        if (i >= split.length) {
            return "";
        }
        return split[i];
    }
}
