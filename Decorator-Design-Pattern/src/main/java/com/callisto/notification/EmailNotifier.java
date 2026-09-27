package com.callisto.notification;

/**
 * EN: The concrete component that provides the core email notification functionality.
 *     It acts as the base object that can be wrapped by other decorators.
 * SI: මූලික ඊමේල් දැනුම්දීමේ පහසුකම සපයන ප්‍රධාන පන්තිය (Concrete Component).
 *     වෙනත් ආවරණ (decorators) මගින් මෙය වටා අලුත් විශේෂාංග එකතු කළ හැක.
 */
public class EmailNotifier implements Notifier {

    /**
     * EN: Sends the basic email notification to the user.
     * SI: පරිශීලකයා වෙත මූලික ඊමේල් දැනුම්දීම යවයි.
     *
     * @param message EN: The email content / SI: ඊමේල් පණිවිඩයේ අන්තර්ගතය
     */
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}