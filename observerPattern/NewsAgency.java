public class NewsAgency implements NewsAgencySubject{

    private List<Subscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber)
    }

    @Override
    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber)
    }

    @Override
    public void notifySubscribers(){
        String output = new String();

        for(Subscriber subscriber : subscriberList){
            output +=  "Hey, " + subscriber.getSubscriberName() + "!\n";
            output += "Flash News! Kathniel broke up! Fans are mad!\n\n";
        }

        return output;
    }

}
