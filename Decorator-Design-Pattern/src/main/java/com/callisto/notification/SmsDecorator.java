package com.callisto.notification;

/**
 * EN: A concrete decorator that adds SMS notification capability to the wrapped base notifier.
 * SI: ආවරණය කරන ලද මූලික දැනුම්දීමට අමතරව SMS යැවීමේ හැකියාව එක් කරන පන්තිය (Concrete Decorator).
 */
public class SmsDecorator extends NotifierDecorator {

    /**
     * EN: Initializes the SMS decorator by wrapping the provided notifier.
     * SI: ලබා දෙන මූලික object එක ආවරණය කරමින් SMS යැවීමේ පහසුකම සකස් කරයි.
     *
     * @param notifier EN: The base notifier / SI: මූලික දැනුම්දීමේ object එක
     */
    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    /**
     * EN: Sends the base notification first, and then executes the SMS sending logic.
     * SI: මුලින්ම පෙර තිබූ පණිවිඩය යවා, ඉන්පසුව SMS එක යැවීමේ ක්‍රියාවලිය සිදු කරයි.
     *
     * @param message EN: The message text / SI: යැවිය යුතු පණිවිඩය
     */
    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sending SMS: " + message);
    }
}