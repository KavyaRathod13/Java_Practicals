package Week7;

@FunctionalInterface
interface Notifier
{
    void send(String message);
}

interface Urgent
{
}

class Email implements Urgent
{
    Notifier notifier = message ->
        System.out.println("Email: " + message);
}

class SMS
{
    Notifier notifier = message ->
        System.out.println("SMS: " + message);
}

class NotificationSender
{
    public static void main(String args[])
    {
        Email e = new Email();
        SMS s = new SMS();

        Notifier[] senders = {e.notifier, s.notifier};
        String message = "Meeting at 10 AM";
        for(Notifier n : senders)
        {
            n.send(message);
        }

        if(e instanceof Urgent)
        {
            e.notifier.send(message);
            e.notifier.send(message);
        }
    }
}