package com.callisto.notification;

/**
 * EN: The common interface for all notification types in the system.
 * SI: පද්ධතියේ ඇති සියලුම දැනුම්දීම් (notifications) සඳහා භාවිතා කරන පොදු අතුරුමුහුණත.
 */
public interface Notifier {

    /**
     * EN: Sends a notification message.
     * SI: අදාළ දැනුම්දීමේ පණිවිඩය යැවීමේ ක්‍රියාවලිය සිදු කරයි.
     *
     * @param message EN: The text message to be sent / SI: යැවිය යුතු පණිවිඩය
     */
    void send(String message);
}