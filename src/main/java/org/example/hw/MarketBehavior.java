package org.example.hw;

public interface MarketBehavior {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actor);
    void update();
}
