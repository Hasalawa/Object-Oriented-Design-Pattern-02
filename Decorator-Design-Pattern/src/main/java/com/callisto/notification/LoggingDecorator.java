package com.callisto.notification;

/**
 * EN: A concrete decorator that adds system logging capabilities to the notification process.
 * SI: දැනුම්දීමේ ක්‍රියාවලිය පද්ධතිය තුළ ලොග් (Logging) කිරීමේ හැකියාව එක් කරන පන්තිය (Concrete Decorator).
 */
public class LoggingDecorator extends NotifierDecorator {

    /**
     * EN: Initializes the logging decorator by wrapping the provided notifier.
     * SI: ලබා දෙන මූලික object එක ආවරණය කරමින් Logging පහසුකම සකස් කරයි.
     *
     * @param notifier EN: The base notifier / SI: මූලික දැනුම්දීමේ object එක
     */
    public LoggingDecorator(Notifier notifier) {
        super(notifier);
    }

    /**
     * EN: Sends the base notification and subsequently logs the action.
     * SI: මූලික පණිවිඩය යැවීමේ ක්‍රියාවලිය සිදු කර, ඉන්පසු එම ක්‍රියාව පද්ධතියේ ලොග් (Log) කරයි.
     *
     * @param message EN: The message text / SI: යැවිය යුතු පණිවිඩය
     */
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Logging the notification details to the system.");
    }
}