package org.example.hw;

public interface QueueBehavior {
    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
