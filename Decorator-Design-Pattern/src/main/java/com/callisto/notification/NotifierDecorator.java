package com.callisto.notification;

/**
 * EN: The abstract base decorator class. It maintains a reference to a Notifier
 *     component and delegates the operations to it.
 * SI: ප්‍රධාන ආවරණ පන්තිය (Abstract Base Decorator). මෙය මගින් Notifier object එකක
 *     reference එකක් තබා ගන්නා අතර, මූලික ක්‍රියාවලිය එම object එක වෙත පවරයි.
 */
public abstract class NotifierDecorator implements Notifier {

    /**
     * EN: The reference to the wrapped Notifier component.
     * SI: ආවරණය කර ඇති මූලික Notifier object එක සඳහා වන reference එක.
     */
    protected Notifier wrappedNotifier;

    /**
     * EN: Constructs the decorator with the given Notifier instance.
     * SI: ලබා දෙන Notifier object එක හරහා මෙම ආවරණය (decorator) නිර්මාණය කරයි.
     *
     * @param notifier EN: The Notifier object to be wrapped / SI: ආවරණය කළ යුතු මූලික object එක
     */
    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    /**
     * EN: Forwards the send request to the wrapped Notifier component.
     * SI: දැනුම්දීම යැවීමේ විධානය, ආවරණය කර ඇති object එක වෙත යොමු කරයි.
     *
     * @param message EN: The message to be sent / SI: යැවිය යුතු පණිවිඩය
     */
    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}