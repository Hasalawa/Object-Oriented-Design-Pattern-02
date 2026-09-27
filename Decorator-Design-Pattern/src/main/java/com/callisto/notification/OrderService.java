package com.callisto.notification;

/**
 * EN: The main client class demonstrating the runtime dynamic composition of Decorators.
 * SI: ධාවන කාලයේදී (Runtime) Decorator පන්ති එකට සම්බන්ධ වී ක්‍රියාත්මක වන ආකාරය පෙන්වන ප්‍රධාන පන්තිය.
 */
public class OrderService {

    /**
     * EN: The main entry point of the application.
     * SI: මෘදුකාංගය ක්‍රියාත්මක වීම ආරම්භ වන ප්‍රධාන ස්ථානය.
     *
     * @param args EN: Command line arguments / SI: විධාන රේඛා ආදානයන්
     */
    public static void main(String[] args) {
        String message = "Your order #8956 has been confirmed!";

        System.out.println("--- Basic Customer (Email Only) ---");
        /*
         * EN: Creates a basic email notifier.
         * SI: මූලික ඊමේල් දැනුම්දීම පමණක් සිදු කරන object එකක් සාදයි.
         */
        Notifier basic = new EmailNotifier();
        basic.send(message);

        System.out.println("\n--- VIP Customer (Email + SMS + Logging) ---");
        /*
         * EN: Wraps the EmailNotifier with an SmsDecorator, and then wraps the result
         *     with a LoggingDecorator. Features are layered at runtime.
         * SI: EmailNotifier එක වටා SmsDecorator එක දවටා, ඒ සියල්ල වටා LoggingDecorator
         *     එක දැවටීම මෙහිදී සිදු වේ. සියලුම ක්‍රියාවන් ධාවන කාලයේදී සම්බන්ධ වේ.
         */
        Notifier vip = new LoggingDecorator(new SmsDecorator(new EmailNotifier()));
        vip.send(message);
    }
}